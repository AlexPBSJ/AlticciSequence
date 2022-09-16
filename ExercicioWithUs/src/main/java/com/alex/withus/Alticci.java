package com.alex.withus;

import io.quarkus.runtime.Quarkus;
import org.jboss.resteasy.reactive.ResponseStatus;
import org.jboss.resteasy.reactive.server.handlers.ResponseHandler;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.HashMap;

@Path("/alticci/{n}")
public class Alticci {
    private final HashMap<Long, Long> hm = new HashMap<>();

    public void alticciAlgorithm(long n) throws NegativeNumberException {
        if(n < 0){
            throw new NegativeNumberException("Number must be equal or greater than zero");
        }
        if (n < 2)
            hm.put(n, n);
        else if (n == 2)
            hm.put(n, 1L);
        else
            hm.put(n, alticci(n - 3) + alticci(n - 2));

    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public long alticci(@PathParam(value = "n")long n) throws NegativeNumberException {

        if(hm.get(n) != null) {
            return hm.get(n);
        }else {
            alticciAlgorithm(n);
        }

        return hm.get(n);
    }

    public static void main(String[] args) {
        Quarkus.run(args);
    }

}