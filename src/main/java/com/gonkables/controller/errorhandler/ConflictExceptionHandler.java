package com.gonkables.controller.errorhandler;

import com.gonkables.exception.ConflictException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import static javax.ws.rs.core.Response.Status;
import static javax.ws.rs.core.Response.status;

/**
 * Clase que captura todas las exceptiones de tipo {@link ConflictException}
 */
@Provider
public class ConflictExceptionHandler implements ExceptionMapper<ConflictException> {

    @Override
    public Response toResponse(ConflictException e) {
        return status(Status.CONFLICT).entity(e.getMessage()).build();
    }
}
