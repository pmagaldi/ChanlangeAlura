package com.alura.Controller;

import com.alura.DTO.VideoRequest;
import com.alura.DTO.VideoResponse;
import com.alura.services.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/v1/video")
public class VideoController {

    private final VideoService videoService;

    @Autowired
    public VideoController(VideoService videoService) {
        this.videoService = videoService;
    }

    @PostMapping(consumes = {MediaType.MULTIPART_FORM_DATA_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<VideoResponse> saveVideo(@RequestBody VideoRequest request) {
        try{
            VideoResponse response = videoService.saveDepoimento(request);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}