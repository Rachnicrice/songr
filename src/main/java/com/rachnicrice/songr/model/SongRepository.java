package com.rachnicrice.songr.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository <Song, Long> {
}
