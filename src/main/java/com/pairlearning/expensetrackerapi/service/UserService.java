package com.pairlearning.expensetrackerapi.service;

import com.pairlearning.expensetrackerapi.domain.User;
import com.pairlearning.expensetrackerapi.exceptions.EtAuthException;

public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;
}
