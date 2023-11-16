package com.example.demo.ProjectBoard.service;

import com.example.demo.ProjectBoard.domain.Music;
import com.example.demo.ProjectBoard.dto.MusicDto;
import com.example.demo.ProjectBoard.repository.JdbcMusicRepository;
import com.example.demo.ProjectBoard.repository.MusicRepository;
import jakarta.transaction.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Transactional  // 트랜젝션을 자동으로 COMMIT 해줌
public class MusicRecordService {

    private final JdbcMusicRepository jdbcMusicRepository;

    public MusicRecordService(JdbcMusicRepository jdbcMusicRepository) {
        this.jdbcMusicRepository = jdbcMusicRepository;
    }

    /**
     * 추천 음악 저장
     */
    @PostMapping(value = "/music/new")
    public Long save(MusicDto music) {
        jdbcMusicRepository.save(music);
        return music.getLine_no();
    }

    /**
     * 전체 회원 조회
     */
    public List<Music> findAll() {
        return jdbcMusicRepository.findAll();
    }
}
