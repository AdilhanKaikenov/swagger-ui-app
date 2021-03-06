package com.kaikenov.spring.swaggeruiapp.controller;

import com.kaikenov.spring.swaggeruiapp.entity.Hobby;
import com.kaikenov.spring.swaggeruiapp.service.HobbyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/hobbies")
@Api("This is the hobby controller for my REST API")
public class HobbyController {

    @Autowired
    private HobbyService hobbyService;

    @GetMapping("/")
    @ApiOperation(value = "This method returns all the hobbies in the database", response = Iterable.class)
    public List<Hobby> findAll() {
        return hobbyService.findAll();
    }

    @GetMapping("/{hobbyId}")
    @ApiOperation(value = "This method returns a hobby by a given ID", response = Hobby.class)
    public Hobby findOne(@PathVariable("hobbyId") Long hobbyId) {
        return hobbyService.findOne(hobbyId);
    }

    @PostMapping("/")
    @ApiOperation(value = "This method creates a new hobby in the database", response = Hobby.class)
    public Hobby create(@RequestBody Hobby hobby) {
        return hobbyService.create(hobby);
    }

    @DeleteMapping("/{hobbyId}")
    @ApiOperation("This method can remove a hobby from the database using an ID")
    public void delete(@PathVariable("hobbyId") Long hobbyId) {
        hobbyService.delete(hobbyId);
    }
}
