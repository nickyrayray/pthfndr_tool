package com.nick.pfinder.server.resources;

import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by nickyrayray on 11/17/16.
 */

@Path("/api/character")
@Produces(MediaType.APPLICATION_JSON)
public class BaseCharacterInfoResource {

    @Autowired
    public Character character;

}
