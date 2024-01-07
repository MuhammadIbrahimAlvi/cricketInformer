package com.backend.cricketinfo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Entity
@Getter
@Setter
@Table(name = "teams")
public class Team {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Integer odiRanking;

    private Integer t20Ranking;

    private Integer testRanking;

    @ManyToMany(mappedBy = "teams")
    private List<Match> matches;
}
