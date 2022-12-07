package com.savvy.githubcicd;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MainController {

    @GetMapping()
    public ResponseEntity<?> get() {
        return ResponseEntity.ok("Hello word");
    }
}
