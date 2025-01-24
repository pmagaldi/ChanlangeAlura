package com.alura.Controller;

import com.alura.DTO.VideoRequest;
import com.alura.DTO.VideoResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/v1/video")
public class VideoController {

    @PostMapping(consumes = {MediaType.MULTIPART_FORM_DATA_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<VideoResponse> saveVideo(@RequestBody VideoRequest request) {
        try{

            return ResponseEntity.ok(null);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}