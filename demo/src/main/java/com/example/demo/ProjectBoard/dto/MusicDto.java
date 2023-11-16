package com.example.demo.ProjectBoard.dto;

import com.example.demo.ProjectBoard.domain.Music;
import lombok.Getter;

import java.sql.Date;

@Getter
public class MusicDto {

    private Long line_no; // 시스템에서 구분하기 위한 값
    private String music_nm;
    private String artist_nm;
    private String user_id;
    private String user_nm;
    private Date reg_datetime;

    //esquest dto 로 받은 Posts 객체를 entity 화하여 저장하는 용도
    public static Music toEntity(MusicDto dto) {
        return Music.builder()
                .line_no(dto.getLine_no())
                .music_nm(dto.getMusic_nm())
                .artist_nm(dto.getArtist_nm())
                .user_id(dto.getUser_id())
                .user_nm(dto.getUser_nm())
                .reg_datetime(dto.getReg_datetime())
                .build();
    }
}
