package com.patterns.factory.interfaces;

public interface DriverInterface<T> {
    /**
     * Getter for WebDriver
     *
     * @return exact WebDriver
     */
    T driver();
}
