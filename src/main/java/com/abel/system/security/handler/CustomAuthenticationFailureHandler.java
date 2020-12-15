package com.abel.system.security.handler;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

@Component
public class CustomAuthenticationFailureHandler extends SimpleUrlAuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        String errorMessage = "Invalid Username or Password";

        if(exception instanceof UsernameNotFoundException) {
            errorMessage = URLEncoder.encode("가입하지 않은 아이디 입니다.", "UTF-8");
        } else if (exception instanceof BadCredentialsException) {
            errorMessage = URLEncoder.encode("잘못된 비밀번호 입니다.", "UTF-8");
        }

        setDefaultFailureUrl("/login?error=true&errorMessage=" + errorMessage);

        super.onAuthenticationFailure(request, response, exception);
    }
}