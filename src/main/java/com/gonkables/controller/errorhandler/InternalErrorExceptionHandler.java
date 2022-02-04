package com.gonkables.controller.errorhandler;

import com.gonkables.exception.ConflictException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import static javax.ws.rs.core.Response.status;

/**
 * Clase que captura todas las exceptiones de tipo {@link Exception}
 */
@Provider
public class InternalErrorExceptionHandler implements ExceptionMapper<Exception> {

    @Override
    public Response toResponse(Exception e) {
        return status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
    }
}
