package com.najeeb.todomanagementtool.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}