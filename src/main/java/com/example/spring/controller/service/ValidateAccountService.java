package com.example.spring.controller.service;


/**
 * use in Controller layer
 */
public interface ValidateAccountService {
    boolean validateUserId(String userId) throws Exception;

    boolean validateNickname(String nickname) throws Exception;
}
