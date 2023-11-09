package com.example.demo.ProjectBoard.repository;

import com.example.demo.ProjectBoard.dto.MusicDto;

import java.util.List;
import java.util.Optional;

public interface MusicRepository {

    MusicDto save(MusicDto music);   // 추천 음악 저장

    Optional<MusicDto> findByMusic(String music_nm);  // 추천 음악 찾기

    Optional<MusicDto> findByUserId(String user_id);  // 회원 id 찾기

    List<MusicDto> findAll();  // 저장된 음악 리스트 모두 반환
}
