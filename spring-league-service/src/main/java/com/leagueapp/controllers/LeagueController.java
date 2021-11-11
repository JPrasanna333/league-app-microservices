package com.leagueapp.controllers;

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

import com.leagueapp.model.League;
import com.leagueapp.service.ILeagueService;

@RestController
@RequestMapping("ics-league-api")
@CrossOrigin("http://localhost:4200")
public class LeagueController {
	
	@Autowired
	ILeagueService leagueService;
	
	@PostMapping("/leagues")
	public ResponseEntity<Void> addLeagues(League league){
		leagueService.addLeague(league);
		return ResponseEntity.ok().build();
	}
	@GetMapping("/leagues")
	public ResponseEntity<List<League>> getAll(){
		List<League> leagueList =  leagueService.getAll();
		return ResponseEntity.ok(leagueList);
	}
	@PutMapping("/leagues")
	public ResponseEntity<Void> updateLeagues(League league){
		leagueService.updateLeague(league);
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping("/leagues/{leagueId}")
	public ResponseEntity<Void> deleteLeagues(@PathVariable("leagueId")int leagueId){
		leagueService.deleteLeague(leagueId);
		return ResponseEntity.ok().build();
	}
	@GetMapping("/leagues/{leagueId}")
	public ResponseEntity<League> getById(@PathVariable("leagueId")int leagueId){
		League league =  leagueService.getById(leagueId);
		return ResponseEntity.ok(league);
	}
	@GetMapping("/leagues/board/{boardname}")
	public ResponseEntity<League> getByBoardName(@PathVariable("boardname")String boardname){
		League league =  leagueService.getLeagueByBoard(boardname);
		return ResponseEntity.ok(league);
	}
}
