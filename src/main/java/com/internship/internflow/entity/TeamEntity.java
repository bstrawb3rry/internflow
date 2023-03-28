package com.internship.internflow.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.time.OffsetDateTime;

@Entity
@Table(name = "Team")

public class TeamEntity {
    @Id
    @SequenceGenerator(
            name = "teamGenerator",
            sequenceName = "intern_flow.sq_team_id",
            allocationSize = 1
    )
    @Column(name = "team_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teamGenerator")
    private Long teamId;

    @Column(name = "registration_date")
    private OffsetDateTime timestamp;

    public TeamEntity() {
        // no-arg constructor
    }

    // Getters and setters
    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public OffsetDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
