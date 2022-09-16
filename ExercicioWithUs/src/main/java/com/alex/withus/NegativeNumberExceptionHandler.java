package com.alex.withus;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class NegativeNumberExceptionHandler implements ExceptionMapper<NegativeNumberException> {

    @Override
    public Response toResponse(NegativeNumberException exception){
        return Response.status(Response.Status.BAD_REQUEST).entity(exception.getMessage()).build();
    }

}
