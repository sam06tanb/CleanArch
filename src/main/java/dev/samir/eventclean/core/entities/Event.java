package dev.samir.eventclean.core.entities;

import dev.samir.eventclean.core.Enums.EventType;

import java.time.LocalDateTime;

public record Event(String name, Long id, LocalDateTime beginning, LocalDateTime end, String description, String identification, String local, int capacity, String organizer, EventType type) {
}
