package com.example.Bai_4;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PathUtilTest {
    @Test
    void portablePath(){
        Path path = PathUtil.buildPath("tmp","data","file.txt");
        String p = path.toString();
        assertTrue(p.contains("tmp"));
    }
    @Test
    void wrongPathTest() {
        String p = "C:\\temp\\data\\file.txt"; // Windows-only
        assertTrue(p.startsWith("/")); // Linux/macOS-only
    }

}
