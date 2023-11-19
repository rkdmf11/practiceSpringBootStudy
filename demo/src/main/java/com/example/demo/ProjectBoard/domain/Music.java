package com.example.demo.ProjectBoard.domain;

import com.example.demo.ProjectBoard.dto.MusicRequestDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Getter
@Builder
@Entity
@NoArgsConstructor
// Mapping Name을 RecommandPostListMapping로 선언했으며, 해당 Query Result 들을 Matching 시켜주는 그런 역할입니다.
//@SqlResultSetMapping(
//        name = "MusicListMapping",
//        classes = @ConstructorResult(
//                targetClass = MusicListMapping.class,
//                columns = {
//                        @ColumnResult(name = "line_no", type = Long.class),
//                        @ColumnResult(name = "music_nm", type = String.class),
//                        @ColumnResult(name = "artist_nm", type = String.class),
//                        @ColumnResult(name = "user_id", type = String.class),
//                        @ColumnResult(name = "user_nm", type = String.class),
//                        @ColumnResult(name = "reg_datetime", type = Date.class),
//                })
//)
@Table(name = "musiclist")
public class Music {

    /**
     * 주의사항
     * 변수명을 korean_name 처럼 언더바로 사용할시에 findBy가 적용이 안됨
     */

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

//    public static Music toEntity(MusicRequestDto dto) {
//        return Music.builder()
//                .line_no(dto.getLine_no())
//                .music_nm(dto.getMusic_nm())
//                .artist_nm(dto.getArtist_nm())
//                .user_id(dto.getUser_id())
//                .user_nm(dto.getUser_nm())
//                .reg_datetime(dto.getReg_datetime())
//                .build();
//    }
}
