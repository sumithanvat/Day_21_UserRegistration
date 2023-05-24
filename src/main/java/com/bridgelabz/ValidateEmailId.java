package com.bridgelabz;

import com.bridgelabz.InvalidUserException;


@FunctionalInterface
public interface ValidateEmailId {
    public boolean validateEmailId(String emailId) throws InvalidUserException;
}