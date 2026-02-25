package com.music.musicbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MusicBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(MusicBackendApplication.class, args);
    }

    @GetMapping("/songs")
    public String[] songs() {
        return new String[]{"song1.mp3", "song2.mp3", "song3.mp3"};
    }
}
