package com.patterns.builder.pages;

import com.patterns.builder.basetest.BaseTest;

public class HomePage extends AbstractPage {

    /**
     * Constructor
     *
     * @param testClass
     */
    public HomePage(BaseTest testClass) {
        super(testClass);
        waitTillElementIsVisible(pageDiv);
    }
}