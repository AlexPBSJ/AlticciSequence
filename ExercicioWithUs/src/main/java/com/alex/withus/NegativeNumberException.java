package com.alex.withus;

import org.jboss.resteasy.reactive.ResponseStatus;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;

public class NegativeNumberException extends Exception implements Serializable {
    private static final long serialVersionUID = 1L;

    public NegativeNumberException(){
        super();
    }

    public NegativeNumberException(String msg) {
        super(msg);
    }
    public NegativeNumberException(String msg, Exception e)  {
        super(msg, e);
    }
}
