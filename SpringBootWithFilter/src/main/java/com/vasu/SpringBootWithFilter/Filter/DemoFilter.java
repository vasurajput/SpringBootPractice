/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vasu.SpringBootWithFilter.Filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 *
 * @author Vasu Rajput
 */
@Component
public class DemoFilter implements Filter {

    private static final Logger logger = LoggerFactory.getLogger("DemoFilter.class");

    @Override
    public void init(FilterConfig fc) throws ServletException {
        logger.info("init method call");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse response, FilterChain filter) throws IOException, ServletException {
        String remoteAddr = req.getRemoteAddr();
        logger.info("RemoteAdd= " + remoteAddr);
        filter.doFilter(req, response);
    }

    @Override
    public void destroy() {
        logger.info("destroy method call");
    }

}
