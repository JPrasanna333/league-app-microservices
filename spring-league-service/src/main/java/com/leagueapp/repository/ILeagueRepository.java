package com.leagueapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.leagueapp.model.League;

@Repository
public interface ILeagueRepository extends JpaRepository<League, Integer>{

   
   // using named query
    @Query(name = "findByBoard")
    League findLeagueByBoard(String boardname);
   
}
