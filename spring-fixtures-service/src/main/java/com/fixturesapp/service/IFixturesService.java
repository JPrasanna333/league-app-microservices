package com.fixturesapp.service;

import java.util.List;

import com.fixturesapp.model.Fixtures;

public interface IFixturesService {
	Fixtures addFixtures(Fixtures fixtures);
	void updateFixtures(Fixtures fixtures);
	void deleteFixtures(int fixturesId);
	Fixtures getById(int fixturesId);
	List<Fixtures> getAll();

	List<Fixtures> getFixturesByLeague(String leagueName);
	List<Fixtures> getFixturesByTeamName(String teamname);
}
