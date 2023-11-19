package com.example.demo.ProjectBoard.service;

import com.example.demo.ProjectBoard.domain.Music;
import com.example.demo.ProjectBoard.dto.MusicDto;
import com.example.demo.ProjectBoard.dto.MusicRequestDto;
import com.example.demo.ProjectBoard.repository.MemoryMusicRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class MusicRecordServiceTest {

    MusicRecordService musicRecordService;
    MemoryMusicRepository musicRepository;

    @BeforeEach
    public void beforeEach() {
        musicRepository = new MemoryMusicRepository();
        musicRecordService = new MusicRecordService(musicRepository);
    }

    @AfterEach
    public void afterEach() {
        musicRepository.clearStore();
    }

    @Test
    void 조회() {
        musicRecordService.findMusics();
        System.out.println(musicRecordService.findMusics());
    }

    @Test
    void 저장() {
        // given(값 지정)
//        Music music = new Music();
//        MusicRequestDto musicDto1 = new MusicRequestDto();
//        musicDto1.setMusic_nm("노래");
//
//        //when(행위)
//        Long saveId = musicRecordService.save(musicDto1);
////        IllegalStateException e = assertThrows(IllegalStateException.class, () -> musicRecordService.save(musicDto1));
//
//        //then(결과)
//        Music findMusic = musicRecordService.findOne(saveId).get();
//        assertThat(musicDto1.getMusic_nm()).isEqualTo(findMusic.getMusic_nm());
    }
}
