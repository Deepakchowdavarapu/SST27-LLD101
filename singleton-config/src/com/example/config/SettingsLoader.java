package com.example.config;

import java.nio.file.Path;

/** Thin wrapper that uses the singleton instance. */
public class SettingsLoader {
    public AppSettings load(Path file) {
        AppSettings s = AppSettings.getInstance(); // use singleton instance
        s.loadFromFile(file);
        return s;
    }
}
