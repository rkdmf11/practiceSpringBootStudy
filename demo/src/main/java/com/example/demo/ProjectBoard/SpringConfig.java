package com.example.demo.ProjectBoard;

import com.example.demo.ProjectBoard.repository.*;
import com.example.demo.ProjectBoard.service.MusicRecordService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    private final MusicRepository musicRepository;

    @Autowired
    public SpringConfig(MusicRepository musicRepository) {
        this.musicRepository = musicRepository;
    }

    @Bean
    public MusicRecordService musicRecordService() {
        return new MusicRecordService(musicRepository);
    }

//    @Bean
//    public ModelMapper modelMapper() {
//        return new ModelMapper();
//    }

    // Memory 테스트용 -> 단위 테스트
//    @Bean
//    public MusicRepository musicRepository() {
//        return new MemoryMusicRepository();
//    }
}
