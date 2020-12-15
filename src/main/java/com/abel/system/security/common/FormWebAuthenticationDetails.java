package com.abel.system.security.common;

import org.springframework.security.web.authentication.WebAuthenticationDetails;

import javax.servlet.http.HttpServletRequest;

public class FormWebAuthenticationDetails extends WebAuthenticationDetails {

    public FormWebAuthenticationDetails(HttpServletRequest request) {
        super(request);
    }
}