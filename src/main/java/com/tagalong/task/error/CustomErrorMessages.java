package com.tagalong.task.error;


import org.springframework.http.HttpStatus;


import java.util.HashMap;
import java.util.Map;

public class CustomErrorMessages {

    public static final Map<Integer, HttpStatus> errors = new HashMap<>() {{
        put(400, HttpStatus.BAD_REQUEST);
        put(401, HttpStatus.UNAUTHORIZED);
        put(403, HttpStatus.FORBIDDEN);
        put(404, HttpStatus.FOUND);
        put(500, HttpStatus.INTERNAL_SERVER_ERROR);
        put(501, HttpStatus.NOT_IMPLEMENTED);
        put(502, HttpStatus.BAD_GATEWAY);
        put(503, HttpStatus.SERVICE_UNAVAILABLE);
        put(504, HttpStatus.GATEWAY_TIMEOUT);
    }};

}
