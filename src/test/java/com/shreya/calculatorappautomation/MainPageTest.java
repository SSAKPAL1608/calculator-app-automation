package com.shreya.calculatorappautomation;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.chrome.ChromeOptions;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPageTest {
    MainPage mainPage = new MainPage();

    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeEach
    public void setUp() {
        // Fix the issue https://github.com/SeleniumHQ/selenium/issues/11750
        Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");
        open("http://localhost:54994/test_automation_project/calculator-app/index.html?_ijt=k6uhabegchtqnd7cuqladg8q0f&_ij_reload=RELOAD_ON_SAVE");
    }

    @Test
    public void add() throws InterruptedException {
        mainPage.value4.click();
        mainPage.add.click();
        mainPage.value2.click();
        mainPage.equalto.click();
        Thread.sleep(1000);
        System.out.println("The addition of 4 and 2 is " + mainPage.output.getText());


    }



}
