package com.shreya.calculatorappautomation;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

// page_url = https://www.jetbrains.com/
public class MainPage {
    public SelenideElement value4 = $x("/html/body/div[1]/div[3]/button[5]");
    public SelenideElement value2 = $x("/html/body/div[1]/div[3]/button[10]");
    public SelenideElement add = $x("/html/body/div[1]/div[3]/button[8]");
    public SelenideElement equalto = $x("/html/body/div[1]/div[3]/button[18]");
    public SelenideElement output = $x("//*[@id=\"display\"]");



}
