package com.gonkables.service;

public interface TestService {
    String hola();

    String conflictException();

    String notFoundException();

    String nullPointerException();

    String exception() throws Exception;
}
