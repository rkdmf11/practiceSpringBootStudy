package com.example.demo.ProjectBoard.repository;

import com.example.demo.ProjectBoard.domain.Music;

import java.util.List;
import java.util.Optional;

public interface MusicRepository {

    Music save(Music music);   // 추천 음악 저장

//    void delete(Long lineNo);   // 추천 음악 삭제

    Optional<Music> findById(Long lineNo);  // rowKey 찾기

    Optional<Music> findByMusicNm(String musicNm);  // 추천 음악 찾기

    Optional<Optional<Music>> findByUserId(String userId);  // 회원 id 찾기

    List<Music> findAll();  // 저장된 음악 리스트 모두 반환
}
