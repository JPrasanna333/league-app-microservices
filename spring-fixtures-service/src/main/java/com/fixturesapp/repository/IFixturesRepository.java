package com.fixturesapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fixturesapp.model.Fixtures;

@Repository
public interface IFixturesRepository extends JpaRepository<Fixtures, Integer>{

	
}
