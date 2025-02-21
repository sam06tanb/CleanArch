package dev.samir.eventclean.infrastructure.persistence;

import dev.samir.eventclean.core.Enums.EventType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "Eventos")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EventEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private LocalDateTime beginning;
    private LocalDateTime end;
    private String description;
    private String identification;
    private String local;
    private int capacity;
    private String organizer;
    @Enumerated(EnumType.STRING)
    private EventType type;



}


