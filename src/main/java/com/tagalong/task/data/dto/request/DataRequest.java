package com.tagalong.task.data.dto.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class DataRequest {

    private String email;
    private String password;
}
