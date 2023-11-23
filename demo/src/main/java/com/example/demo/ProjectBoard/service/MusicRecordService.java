package com.example.demo.ProjectBoard.service;

import com.example.demo.ProjectBoard.domain.Music;
import com.example.demo.ProjectBoard.dto.MusicRequestDto;
import com.example.demo.ProjectBoard.repository.MusicRepository;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Transactional
public class MusicRecordService {
    /**
     * Service-> Entity가 아닌 DTO만 입력 받고 출력하는 방식으로 진행
     */

    private final MusicRepository musicRepository;
//    private final ModelMapper modelMapper;

    //    @Autowired
    public MusicRecordService(MusicRepository musicRepository) {
        this.musicRepository = musicRepository;
    }

    /**
     * 추천 음악 저장
     */
    @PostMapping(value = "/music/new")
    public Long save(MusicRequestDto requestDto) {
        Music musicEntity = requestDto.toEntity();
        musicRepository.save(musicEntity);
        return musicEntity.getLineNo();
    }

//    public Long delete(Long line_no) {
//        musicRepository.delete(line_no);
//        return line_no;
//    }

    /**
     * 전체 회원 조회
     */
    public List<Music> findMusics() {
        return musicRepository.findAll();
    }

    public Optional<Music> findOne(Long musicLindNo) {
        return musicRepository.findById(musicLindNo);
    }
}
