package com.patterns.factory.utils;

import com.patterns.factory.interfaces.CreateNewUserInterface;

public class ApiMethods implements CreateNewUserInterface {

    /**
     * Here can be good method to create user
     * via API but it's just imitation
     *
     * @param userData
     */
    @Override
    public void createNewUser(UserData userData) {
        // Here should me some api call to create new user
        System.out.println("New user has been created via API!");
    }
}
