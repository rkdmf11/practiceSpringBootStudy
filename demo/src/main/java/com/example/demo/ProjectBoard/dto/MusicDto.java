package com.example.demo.ProjectBoard.dto;

import com.example.demo.ProjectBoard.domain.Music;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@Data
public class MusicDto {

    private Long lineNo; // 시스템에서 구분하기 위한 값
    private String musicNm;
    private String artistNm;
    private String userId;
    private String userNm;
    private Date regDatetime;

//    @Builder
//    public MusicDto()

    public static Music toEntity(Music dto) {
//        return Music.builder()
//                .line_no(line_no)
//                .music_nm(music_nm)
//                .artist_nm(artist_nm)
//                .user_id(user_id)
//                .user_nm(user_nm)
//                .reg_datetime(reg_datetime)
//                .build();
        return Music.builder()
                .lineNo(dto.getLineNo())
                .musicNm(dto.getMusicNm())
                .artistNm(dto.getArtistNm())
                .userId(dto.getUserId())
                .userNm(dto.getUserNm())
                .regDatetime(dto.getRegDatetime())
                .build();
    }
}
