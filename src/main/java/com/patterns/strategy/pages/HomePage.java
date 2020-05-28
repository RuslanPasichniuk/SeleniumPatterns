package com.patterns.strategy.pages;

import com.patterns.strategy.basetest.BaseTest;

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