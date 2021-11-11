package com.teamapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teamapp.model.Team;
import com.teamapp.repository.ITeamRepository;

@Service
public class TeamServiceImpl implements ITeamService {

	@Autowired
	ITeamRepository teamRepository;
	@Override
	public Team addTeam(Team team) {
		return teamRepository.save(team);
	}

	@Override
	public void updateTeam(Team team) {
		teamRepository.save(team);
	}

	@Override
	public void deleteTeam(int teamId) {
		teamRepository.deleteById(teamId);
	}

	@Override
	public Team getById(int teamId) {
		return teamRepository.findById(teamId).get();
	}

	@Override
	public List<Team> getAll() {
		return teamRepository.findAll();
	}

	@Override
	public Team getByPlayerName(String playerName) {
		// TODO Auto-generated method stub
		return null;
	}

}
