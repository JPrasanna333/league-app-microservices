package com.fixturesapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fixturesapp.model.Fixtures;
import com.fixturesapp.service.IFixturesService;

@RestController
@RequestMapping("ics-fixtures-api")
@CrossOrigin("http://localhost:4200")
public class FixturesController {
	
	@Autowired
	IFixturesService fixturesService;
	
	@PostMapping("/fixtures")
	public ResponseEntity<Void> addfixturess(Fixtures fixtures){
		fixturesService.addFixtures(fixtures);
		return ResponseEntity.ok().build();
	}
	@GetMapping("/fixtures")
	public ResponseEntity<List<Fixtures>> getAll(){
		List<Fixtures> fixturesList =  fixturesService.getAll();
		return ResponseEntity.ok(fixturesList);
	}
	@PutMapping("/fixtures")
	public ResponseEntity<Void> updatefixturess(Fixtures fixtures){
		fixturesService.updateFixtures(fixtures);
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping("/fixtures/{fixturesId}")
	public ResponseEntity<Void> deletefixturess(@PathVariable("fixturesId")int fixturesId){
		fixturesService.deleteFixtures(fixturesId);
		return ResponseEntity.ok().build();
	}
	@GetMapping("/fixtures/{fixturesId}")
	public ResponseEntity<Fixtures> getById(@PathVariable("fixturesId")int fixturesId){
		Fixtures fixtures =  fixturesService.getById(fixturesId);
		return ResponseEntity.ok(fixtures);
	}
	@GetMapping("/fixtures/league/{leaguename}")
	public ResponseEntity<List<Fixtures>> getByLeague(@PathVariable("leaguename")String leaguename){
		List<Fixtures> fixturesList =  fixturesService.getFixturesByLeague(leaguename);
		return ResponseEntity.ok(fixturesList);
	}
	@GetMapping("/fixturess/league/{teamname}")
	public ResponseEntity<List<Fixtures>> getByTeam(@PathVariable("teamname")String teamname){
		List<Fixtures> fixturesList =  fixturesService.getFixturesByTeamName(teamname);
		return ResponseEntity.ok(fixturesList);
	}

}
