package com.fixturesapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.fixturesapp.model.Fixtures;
import com.fixturesapp.repository.IFixturesRepository;

@Service
public class FixtureServiceImpl implements IFixturesService{

	private IFixturesRepository fixtureRepository;

	@Autowired
	public void setFixtureRepository(IFixturesRepository fixtureRepository) {
		this.fixtureRepository = fixtureRepository;
	}

	@Override
	public Fixtures addFixtures(Fixtures fixtures) {
		return fixtureRepository.save(fixtures);
	}

	@Override
	public void updateFixtures(Fixtures fixtures) {
		fixtureRepository.save(fixtures);
		
	}

	@Override
	public void deleteFixtures(int fixturesId) {
		fixtureRepository.deleteById(fixturesId);		
	}

	@Override
	public Fixtures getById(int fixturesId) {
		return fixtureRepository.findById(fixturesId).get();
	}

	@Override
	public List<Fixtures> getAll() {
		Sort sort = Sort.by("squads");
		return fixtureRepository.findAll(sort);
	}

	@Override
	public List<Fixtures> getFixturesByLeague(String leagueName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Fixtures> getFixturesByTeamName(String teamName) {
		return null;
	}
	
	
}
