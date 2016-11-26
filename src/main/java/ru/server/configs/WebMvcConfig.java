package ru.server.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "ru.server")
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("images/**").addResourceLocations("images/");
    }

//    @Bean
//    public FreeMarkerConfigurer getFreemarkerConfig() {
//        FreeMarkerConfigurer result = new FreeMarkerConfigurer();
//        result.setTemplateLoaderPath("/pages/");
//        return result;
//    }

    /**
     * стандартный resolver представлений, для небольших приложений избыточен, надобности нет
     * использован конечный класс InternalResourceViewResolver, но разницы в работе с UrlBasedViewResolver не замечено
     * использование JstlView позволяет делать JSTL-инъекции в динамические страницы или фрагменты страниц
     */
    @Bean
    public InternalResourceViewResolver getInternalResourceViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/pages/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);
        resolver.setOrder(2);
        return resolver;
    }

}
