package com.example.gestione_eventi.event;

import com.example.gestione_eventi.auth.AppUser;
import jakarta.persistence.*;
import lombok.Data;


import java.time.LocalDateTime;
@Entity
@Data
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private LocalDateTime date;
    @Column(nullable = false)
    private String location;


    @ManyToOne
    @JoinColumn(name = "organizer_id", nullable = false)
    private AppUser organizer;

}
