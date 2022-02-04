package com.gonkables.service.impl;

import com.gonkables.exception.ConflictException;
import com.gonkables.exception.NotFoundException;
import com.gonkables.service.TestService;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TestServiceImpl implements TestService {
    @Override
    public String hola() {
        return "Hola Mundo";
    }

    @Override
    public String conflictException() {
        throw new ConflictException("Conflict exception");
    }

    @Override
    public String notFoundException() {
        throw new NotFoundException("Not found exception");
    }

    @Override
    public String nullPointerException() {
        throw new NullPointerException("Null pointer exception");
    }

    @Override
    public String exception() throws Exception {
        throw new Exception("Exception");
    }
}
