package com.teamapp.controllers;

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

import com.teamapp.model.Team;
import com.teamapp.model.Team;
import com.teamapp.service.ITeamService;

@RestController
@RequestMapping("ics-team-api")
@CrossOrigin("http://localhost:4200")
public class TeamController {
	
	@Autowired
	ITeamService teamService;
	
	@PostMapping("/teams")
	public ResponseEntity<Void> addTeams(Team league){
		teamService.addTeam(league);
		return ResponseEntity.ok().build();
	}
	@GetMapping("/teams")
	public ResponseEntity<List<Team>> getAll(){
		List<Team> leagueList =  teamService.getAll();
		return ResponseEntity.ok(leagueList);
	}
	@PutMapping("/teams")
	public ResponseEntity<Void> updateTeams(Team league){
		teamService.updateTeam(league);
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping("/teams/{teamId}")
	public ResponseEntity<Void> deleteTeams(@PathVariable("teamId")int teamId){
		teamService.deleteTeam(teamId);
		return ResponseEntity.ok().build();
	}
	@GetMapping("/teams/{teamId}")
	public ResponseEntity<Team> getById(@PathVariable("teamId")int teamId){
		Team league =  teamService.getById(teamId);
		return ResponseEntity.ok(league);
	}
	@GetMapping("/teams/player/{playername}")
	public ResponseEntity<Team> getByBoardName(@PathVariable("playername")String playername){
		Team league =  teamService.getByPlayerName(playername);
		return ResponseEntity.ok(league);
	}


}
