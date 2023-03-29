package com.tagalong.task.error;

import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

public class CustomSuccessMessage {


    public static final Map<Integer, HttpStatus> success = new HashMap<>() {{
        put(200, HttpStatus.OK);
        put(201, HttpStatus.CREATED);
        put(202, HttpStatus.ACCEPTED);
        put(204, HttpStatus.NO_CONTENT);
        put(205, HttpStatus.PARTIAL_CONTENT);

    }};

}
