package com.example.demo.ProjectBoard.service;

import com.example.demo.ProjectBoard.domain.Music;
import com.example.demo.ProjectBoard.dto.MusicRequestDto;
import com.example.demo.ProjectBoard.repository.MusicRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
@Transactional
public class MusicDtoRecordServiceIntegrationTest {

    @Autowired
    MusicRecordService musicRecordService;
    @Autowired
    MusicRepository musicRepository;
    MusicRequestDto musicRequestDto;

    @Test
    void 조회() {
        List<Music> result = musicRecordService.findMusics();
        System.out.println("test");
        System.out.println(result);
    }

    @Test
    void 저장() {
        // given(값 지정)
        MusicRequestDto musicRequestDto1 = musicRequestDto;
        musicRequestDto1.setMusicNm("노래");

        //when(행위)
        Long saveId = musicRecordService.save(musicRequestDto);
//        IllegalStateException e = assertThrows(IllegalStateException.class, () -> musicRecordService.save(musicDto1));

        //then(결과)
        Music findMusic = musicRecordService.findOne(saveId).get();
        assertThat(musicRequestDto.getMusicNm()).isEqualTo(findMusic.getMusicNm());
    }
}
