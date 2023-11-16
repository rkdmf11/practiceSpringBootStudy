package com.example.demo.ProjectBoard;

import com.example.demo.ProjectBoard.repository.*;
import com.example.demo.ProjectBoard.service.MusicRecordService;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import javax.swing.*;

@Configuration
public class SpringConfig {

    private final DataSource dataSource;
    private final EntityManager em;

    @Autowired
    public  SpringConfig(DataSource dataSource, EntityManager em) {
        this.dataSource = dataSource;
        this.em = em;
    }

    @Bean
    public MusicRecordService musicRecordService() {
        return new MusicRecordService(jdbcMusicRepository());
    }

    @Bean
    public JdbcMusicRepository jdbcMusicRepository() {
        return new JdbcMusicRepository(em);
    }
}
