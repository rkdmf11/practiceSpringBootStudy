package com.example.demo.ProjectBoard.domain;

import com.example.demo.ProjectBoard.dto.MusicRequestDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.sql.Date;

@Getter
@Builder
@Entity
@NoArgsConstructor
@DynamicInsert  //insert 시 null인 필드 제외
@Table(name = "musiclist")
public class Music {

    /**
     * 주의사항
     * 변수명을 korean_name 처럼 언더바로 사용할시에 findBy가 적용이 안됨
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "line_no")
    private Long lineNo; // 시스템에서 구분하기 위한 값

    @Column(name = "music_nm", nullable = false)
    private String musicNm;

    @Column(name = "artist_nm", nullable = false)
    private String artistNm;

    @Column(name = "user_id", nullable = false)
    private String userId;

    @Column(name = "user_nm", nullable = false)
    private String userNm;

    @Column(name = "reg_datetime")
    private Date regDatetime;

    public Music(Long lineNo, String musicNm, String artistNm, String userId, String userNm, Date regDatetime) {
        this.lineNo = lineNo;
        this.musicNm = musicNm;
        this.artistNm = artistNm;
        this.userId = userId;
        this.userNm = userNm;
        this.regDatetime = regDatetime;
    }
}
