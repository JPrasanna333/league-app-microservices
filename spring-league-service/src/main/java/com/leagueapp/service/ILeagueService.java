package com.leagueapp.service;

import java.util.List;

import com.leagueapp.model.League;

public interface ILeagueService {
	League addLeague(League league);
	void updateLeague(League league);
	void deleteLeague(int leagueId);
	League getById(int leagueId);
	List<League> getAll();

	
	League getLeagueByBoard(String boardname);

}
