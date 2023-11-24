package com.example.demo.ProjectBoard.dto;

import com.example.demo.ProjectBoard.domain.Music;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.sql.Date;

@Getter
@Data
public class MusicRequestDto {

    private Long lineNo; // 시스템에서 구분하기 위한 값
    private String musicNm;
    private String artistNm;
    private String userId;
    private String userNm;
    private Date regDatetime;

    public MusicRequestDto(Long lineNo, String musicNm, String artistNm, String userId, String userNm, Date regDatetime) {
        this.lineNo = lineNo;
        this.musicNm = musicNm;
        this.artistNm = artistNm;
        this.userId = userId;
        this.userNm = userNm;
        this.regDatetime = regDatetime;
    }

    public Music toEntity() { //Music music
        return Music.builder()
                .lineNo(lineNo)
                .musicNm(musicNm)
                .artistNm(artistNm)
                .userId(userId)
                .userNm(userNm)
                .regDatetime(regDatetime)
                .build();
    }
}
