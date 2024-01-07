package com.backend.cricketinfo.repository;

import com.backend.cricketinfo.entity.MatchDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchDetailsRepository extends JpaRepository<MatchDetails, Long> {
}
