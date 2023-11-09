package com.example.demo.ProjectBoard.service;

import com.example.demo.ProjectBoard.dto.MusicDto;
import com.example.demo.ProjectBoard.repository.MusicRepository;
import jakarta.transaction.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Transactional
public class MusicRecordService {

    private final MusicRepository musicRepository;

    public MusicRecordService(MusicRepository musicRepository) {
        this.musicRepository = musicRepository;
    }

    /**
     * 추천 음악 저장
     */
    @PostMapping(value = "/music/new")
    public Long save(MusicDto music) {
        musicRepository.save(music);
        return music.getLine_no();
    }

    /**
     * 전체 회원 조회
     */
    public List<MusicDto> findAll() {
        return musicRepository.findAll();
    }
}
