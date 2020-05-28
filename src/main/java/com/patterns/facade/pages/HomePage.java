package com.patterns.facade.pages;

import com.patterns.facade.basetest.BaseTest;

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