package com.patterns.factory.interfaces;

import com.patterns.factory.utils.UserData;

public interface CreateNewUserInterface {
    /**
     * Create new user method
     *
     * @param userData
     */
    void createNewUser(UserData userData);
}
