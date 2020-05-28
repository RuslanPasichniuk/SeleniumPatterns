package com.patterns.decorator.pages;

import com.patterns.decorator.basetest.BaseTest;

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