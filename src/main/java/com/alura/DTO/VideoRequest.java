package com.alura.DTO;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public record VideoRequest(
        MultipartFile file,
        String name,
        List<String> text
) {
}
