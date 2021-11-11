package com.teamapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teamapp.model.Team;

@Repository
public interface ITeamRepository extends JpaRepository<Team, Integer>{

	}
