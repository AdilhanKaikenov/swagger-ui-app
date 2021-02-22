package com.kaikenov.spring.swaggeruiapp.service;

import com.kaikenov.spring.swaggeruiapp.entity.Hobby;
import com.kaikenov.spring.swaggeruiapp.repository.HobbyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class HobbyService {

    @Autowired
    private HobbyRepository hobbyRepository;

    public Hobby create(Hobby hobby) {
        return hobbyRepository.save(hobby);
    }

    public List<Hobby> findAll() {
        return hobbyRepository.findAll();
    }

    public Hobby findOne(Long hobbyId) {
        return hobbyRepository.getOne(hobbyId);
    }

    public void delete(Long hobbyId) {
        hobbyRepository.deleteById(hobbyId);
    }
}
