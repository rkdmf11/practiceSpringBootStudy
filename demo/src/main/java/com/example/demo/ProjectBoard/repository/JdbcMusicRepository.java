package com.example.demo.ProjectBoard.repository;

import com.example.demo.ProjectBoard.domain.Music;
import com.example.demo.ProjectBoard.dto.MusicDto;
import jakarta.persistence.EntityManager;
import org.springframework.jdbc.datasource.DataSourceUtils;

import javax.sql.DataSource;
import java.sql.*;
import java.util.*;

import static java.sql.DriverManager.getConnection;

public class JdbcMusicRepository implements MusicRepository {

    private final EntityManager em;

    public JdbcMusicRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public MusicDto save(MusicDto music) {
        em.persist(music);
        return music;
    }

    /**
     * 음악명 찾기
     *
     * @param music_nm
     * @return
     */
    @Override
    public Optional<MusicDto> findByMusic(String music_nm) {
        List<MusicDto> result = em.createQuery("select m from Music m where m.music_nm = :music_nm", MusicDto.class)
                .setParameter("music_nm", music_nm)
                .getResultList();
        return result.stream().findAny();
    }

    /**
     * 사용자ID 찾기
     *
     * @param user_id
     * @return
     */
    @Override
    public Optional<MusicDto> findByUserId(String user_id) {
        MusicDto music = em.find(MusicDto.class, user_id);
        return Optional.ofNullable(music);
    }

    /**
     * 전체 내역 조회
     * jpql 사용 -> Music Entity 자체를 조회
     *
     * @return
     */
    @Override
    public List<Music> findAll() {
        return em.createQuery("select m from Music m", Music.class)
                .getResultList();
    }
}
