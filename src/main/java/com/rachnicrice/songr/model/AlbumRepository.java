package com.rachnicrice.songr.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository <Album, Long> {
}
