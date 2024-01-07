package com.backend.cricketinfo.entity;

import com.backend.cricketinfo.constant.MatchType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Getter
@Setter
@Table(name = "match_details")
public class MatchDetails {

    @Id
    @GeneratedValue
    private Long id;

    private String matchDescription;

    private String teamOneScore;

    private String teamTwoScore;

    private String matchResult;

    private MatchType matchType;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "match_id", referencedColumnName = "id")
    private Match match;

}
