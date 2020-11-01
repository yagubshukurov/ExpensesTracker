package com.tracker.expensestrackerapi.services;

import com.tracker.expensestrackerapi.domain.User;
import com.tracker.expensestrackerapi.exceptions.EtAuthException;

public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;
}
