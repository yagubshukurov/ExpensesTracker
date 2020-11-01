package com.tracker.expensestrackerapi.repositories;

import com.tracker.expensestrackerapi.domain.User;
import com.tracker.expensestrackerapi.exceptions.EtAuthException;

public interface UserRepository {

    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userID);
}
