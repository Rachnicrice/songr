package com.rachnicrice.songr;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AlbumTest {
    Album test;

    @BeforeAll
    public void setUp () {
        test = new Album("Fear Inoculum", "Tool", 10, 5198, "I'm a path to an image");
    }

    @Test
    public void testAlbumConstructor () {
    }


}
