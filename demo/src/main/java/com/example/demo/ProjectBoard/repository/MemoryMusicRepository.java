package com.example.demo.ProjectBoard.repository;


import com.example.demo.ProjectBoard.domain.Music;
import com.example.demo.ProjectBoard.dto.MusicDto;
import lombok.RequiredArgsConstructor;

import java.util.*;

import static java.sql.DriverManager.getConnection;

//@RequiredArgsConstructor
public class MemoryMusicRepository implements MusicRepository {

    private static Map<Long, Music> store = new HashMap<>();
    private static long sequence = 0L;

    // Create, Update
    @Override
    public Music save(Music music) {
        MusicDto musicDto = new MusicDto();
        musicDto.setLineNo(++sequence);
        store.put(music.getLineNo(), music);
        return music;
    }

    // Delete
//    @Override
//    public void delete(Long lineNo) {
//        em.remove(findById(String.valueOf(lineNo)));
//    }

    /**
     * rowKey 찾기
     *
     * @param lineNo
     * @return
     */
    @Override
    public Optional<Music> findById(Long lineNo) {
        return Optional.ofNullable(store.get(lineNo));
    }

    /**
     * 음악명 찾기
     *
     * @param musicNm
     * @return
     */
    @Override
    public Optional<Music> findByMusicNm(String musicNm) {
        return store.values().stream()
                .filter(musicDto -> musicDto.getMusicNm().equals(musicNm))
                .findAny();
    }

    /**
     * 사용자ID 찾기
     *
     * @param userId
     * @return
     */
    @Override
    public Optional<Optional<Music>> findByUserId(String userId) {
        Optional<Music> result = store.values().stream()
                .filter(musicDto -> musicDto.getUserId().equals(userId))
                .findAny();
        return Optional.ofNullable(result);
    }

    /**
     * 전체 내역 조회
     *
     * @return
     */
    @Override
    public List<Music> findAll() {
        return new ArrayList<>(store.values());
    }

    public void clearStore() {
        store.clear();
    }
}
