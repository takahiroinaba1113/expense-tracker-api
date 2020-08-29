package com.pairlearning.expensetrackerapi.repository;

import com.pairlearning.expensetrackerapi.domain.User;
import com.pairlearning.expensetrackerapi.exceptions.EtAuthException;

public interface UserRepository {

    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userId);
}
