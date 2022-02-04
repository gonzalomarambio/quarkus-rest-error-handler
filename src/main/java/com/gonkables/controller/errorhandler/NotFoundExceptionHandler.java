package com.gonkables.controller.errorhandler;

import com.gonkables.exception.NotFoundException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import static javax.ws.rs.core.Response.Status;
import static javax.ws.rs.core.Response.status;

/**
 * Clase que captura todas las exceptiones de tipo {@link NotFoundException}
 */
@Provider
public class NotFoundExceptionHandler implements ExceptionMapper<NotFoundException> {

    @Override
    public Response toResponse(NotFoundException e) {
        return status(Status.NOT_FOUND).entity(e.getMessage()).build();
    }
}
