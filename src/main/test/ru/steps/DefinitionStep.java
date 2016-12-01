package ru.steps;

import cucumber.api.java.ru.Когда;

import static HelpUtils.BrowserDriver.loadPage;


/**
 * Created by Vo4ik on 29.11.2016.
 */
public class DefinitionStep {

    @Когда("Открыть стартовую страницу")
    public void openMainPage() throws Throwable {
        loadPage("http://localhost:5050/");
        try {
            Thread.sleep(10000);
        } catch (Exception ex) {
        }
        System.out.println("asd");

    }


}
