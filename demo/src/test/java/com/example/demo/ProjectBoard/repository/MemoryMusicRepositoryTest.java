package com.example.demo.ProjectBoard.repository;

import com.example.demo.ProjectBoard.domain.Music;
import com.example.demo.ProjectBoard.dto.MusicDto;
import com.example.demo.ProjectBoard.dto.MusicRequestDto;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class MemoryMusicRepositoryTest {

    MemoryMusicRepository repository = new MemoryMusicRepository();

    @Test
    public void 저장() {
        MusicDto musicDto = new MusicDto();
//        Music musicDto = new MusicDto();
        musicDto.setMusicNm("노래");

        repository.save(Music.builder().build());

//        MusicDto result = repository.findById(MusicRequestDto.toDTO(musicRequestDto1).getLine_no()).get();
//        assertThat(musicRequestDto1).isEqualTo(result);
        System.out.println(musicDto);
//        System.out.println(result);
    }

    @Test
    void 조회() {

//        MusicDto musicDto = new MusicDto();
//        MusicDto.setMusic_nm("노래_Memory_TEST");
//        MusicDto.setArtist_nm("가수_Memory_TEST");
//        MusicDto.setUser_id("TEST");
//        MusicDto.setUser_nm("김테스트");
////        musicRequestDto.toEntity();
//        repository.save(musicDto);
//
//        List<Music> result = repository.findAll();
//        System.out.println(musicDto);
//
//        assertThat(result.size()).isEqualTo(1);
    }
}
