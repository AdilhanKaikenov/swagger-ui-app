package com.kaikenov.spring.swaggeruiapp.controller;

import com.kaikenov.spring.swaggeruiapp.entity.Hobby;
import com.kaikenov.spring.swaggeruiapp.service.HobbyService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/hobbies")
public class HobbyController {

    @Autowired
    private HobbyService hobbyService;

    @GetMapping("/")
    public List<Hobby> findAll() {
        return hobbyService.findAll();
    }

    @GetMapping("/{hobbyId}")
    public Hobby findOne(@PathVariable("hobbyId") Long hobbyId) {
        return hobbyService.findOne(hobbyId);
    }

    @PostMapping("/")
    public Hobby create(@RequestBody Hobby hobby) {
        return hobbyService.create(hobby);
    }

    @DeleteMapping("/{hobbyId}")
    public void delete(@PathVariable("hobbyId") Long hobbyId) {
        hobbyService.delete(hobbyId);
    }
}
