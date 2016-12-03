package steps;

import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Vo4ik on 03.12.2016.
 */
public class DefaultSteps {
    public static WebDriver wDriver = new ChromeDriver();

    @Когда("^Открыть страницу")
    public void открыть_страницу() throws Throwable {
        System.out.println("asd");
        wDriver.get("http://localhost:5050");
    }

    @Тогда("Проверка")
    public void тогда() {
        try {
            Thread.sleep(5000);
        } catch (Exception ex) {

        }
    }


}
