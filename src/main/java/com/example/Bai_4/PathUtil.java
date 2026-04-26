package com.example.Bai_4;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathUtil {
    public static Path buildPath(String... parts){
        return Paths.get("", parts);
    }
}
