package com.lutalic;

import java.nio.file.Path;

// Database configuration at creation
public record Config(
        Path basePath,
        long flushThresholdBytes) {
}
