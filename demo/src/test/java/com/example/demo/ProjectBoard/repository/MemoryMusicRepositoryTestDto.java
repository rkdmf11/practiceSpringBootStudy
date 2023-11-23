package com.example.demo.ProjectBoard.repository;

import com.example.demo.ProjectBoard.domain.Music;
import com.example.demo.ProjectBoard.dto.MusicDto;
import com.example.demo.ProjectBoard.dto.MusicRequestDto;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class MemoryMusicRepositoryTestDto {

    MemoryMusicRepository repository = new MemoryMusicRepository();

    @Test
    public void 저장() {
        MusicRequestDto music = new MusicRequestDto();
//        Music musicDto = new MusicDto();
        music.setMusicNm("노래");

        repository.save(music.toEntity()); //Music.builder().build()

//        MusicDto result = repository.findById(MusicRequestDto.toDTO(musicRequestDto1).getLine_no()).get();
//        assertThat(musicRequestDto1).isEqualTo(result);
        System.out.println(music);
//        System.out.println(result);
    }

    @Test
    public void 조회() {

        MusicRequestDto musicDto = new MusicRequestDto();
        musicDto.setMusicNm("노래_Memory_TEST");
        musicDto.setArtistNm("가수_Memory_TEST");
        musicDto.setUserId("TEST");
        musicDto.setUserNm("김테스트");
        repository.save(musicDto.toEntity());

        List<Music> result = repository.findAll();
        System.out.println(musicDto);

        assertThat(result.size()).isEqualTo(1);
    }
}
