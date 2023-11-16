package com.example.demo.ProjectBoard.repository;

import org.junit.jupiter.api.Test;
import com.example.demo.ProjectBoard.repository.JdbcMusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JdbcMusicRepositoryTest {

    @Autowired
    private JdbcMusicRepository jdbcMusicRepository;

    @Test
    void 조회() {
        jdbcMusicRepository.findAll();
    }
}
