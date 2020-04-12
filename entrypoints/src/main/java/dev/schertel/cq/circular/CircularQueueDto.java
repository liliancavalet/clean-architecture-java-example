package dev.schertel.cq.circular;

import java.time.LocalDateTime;
import java.util.UUID;

public class CircularQueueDto {
    UUID id;
    String name;
    String description;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;

    public static CircularQueueDto from(CircularQueue cq) {
        return new CircularQueueDto(cq.getId(), cq.getName(), cq.getDescription(), cq.getCreatedAt(), cq.getUpdatedAt());
    }

    public CircularQueueDto() {
    }

    public CircularQueueDto(UUID id, String name, String description, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}
