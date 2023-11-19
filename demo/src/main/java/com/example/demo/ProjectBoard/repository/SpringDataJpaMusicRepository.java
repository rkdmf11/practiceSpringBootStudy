package com.example.demo.ProjectBoard.repository;

import com.example.demo.ProjectBoard.domain.Music;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMusicRepository extends JpaRepository<Music, Long>, MusicRepository { //JpaRepository<Entity 클래스, PK 타입>

//    @Query("select new com.example.demo.ProjectBoard.dto.MusicDto(m.line_no, m.music_nm, m.artist_nm, m.user_id, m.user_nm, m.reg_datetime) from Music")
//    List<MusicDto> findMusicListDto();

    @Override
    Optional<Music> findByMusicNm(String musicNm);

    @Override
    Optional<Optional<Music>> findByUserId(String userId);
}
