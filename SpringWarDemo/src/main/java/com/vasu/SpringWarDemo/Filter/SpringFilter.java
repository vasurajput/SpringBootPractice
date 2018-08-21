/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vasu.SpringWarDemo.Filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import org.springframework.stereotype.Component;

/**
 *
 * @author Vasu Rajput
 */
@Component
public class SpringFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("inside init method");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("inside do filter");
        String remoteAddr = request.getRemoteAddr();
        System.out.println("RemoteAdd= " + remoteAddr);
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("inside destroys");
    }

}
