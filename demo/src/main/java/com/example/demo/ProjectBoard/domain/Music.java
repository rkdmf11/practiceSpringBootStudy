package com.example.demo.ProjectBoard.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;

import java.sql.Date;

@Getter
@Builder
@Entity
@Table(name = "musiclist")
public class Music {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long line_no; // 시스템에서 구분하기 위한 값
    private String music_nm;
    private String artist_nm;
    private String user_id;
    private String user_nm;
    private Date reg_datetime;

    public Music(Long line_no, String music_nm, String artist_nm, String user_id, String user_nm, Date reg_datetime) {
        this.line_no = line_no;
        this.music_nm = music_nm;
        this.artist_nm = artist_nm;
        this.user_id = user_id;
        this.user_nm = user_nm;
        this.reg_datetime = reg_datetime;
    }
}
