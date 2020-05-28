package com.patterns.pageobject.pages;

import com.patterns.pageobject.basetest.BaseTest;

public class HomePage extends AbstractPage {

    /**
     * Constructor
     *
     * @param testClass
     */
    public HomePage(BaseTest testClass) {
        super(testClass);
        waitTillElementIsVisible("//div[@id='page']");
    }
}