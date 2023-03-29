package com.tagalong.task.controller;

import com.tagalong.task.data.dto.request.DataRequest;
import com.tagalong.task.error.CustomErrorMessages;
import com.tagalong.task.error.CustomSuccessMessage;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/Data")
public class DataController {

    @GetMapping("/getData")
    public ResponseEntity<?> getData(@RequestBody DataRequest dataRequest, HttpServletRequest httpServletRequest){
        try{
            Map<String, String> data = new HashMap<>();
            return ResponseEntity.ok(data);
        }catch(Exception exception){
            return new ResponseEntity<>(CustomErrorMessages.errors.get(500));
        }

    }


    @PostMapping("/postData")
    public ResponseEntity<?> postData(@RequestBody DataRequest dataRequest, HttpServletRequest httpServletRequest){
        try{
            Map<String, String> data = new HashMap<>();
            return ResponseEntity.ok(data);
        }catch(Exception exception){
            return new ResponseEntity<>(CustomSuccessMessage.success.get(201));
        }
    }

}
