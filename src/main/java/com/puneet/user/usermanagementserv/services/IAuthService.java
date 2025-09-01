package com.puneet.user.usermanagementserv.services;

import com.puneet.user.usermanagementserv.models.Token;
import com.puneet.user.usermanagementserv.models.User;

public interface IAuthService {
    User signup(String name, String email, String password) ;
    Token login(String email, String password);
    void logout(Token token);
    User validateToken(String tokenValue);
}
