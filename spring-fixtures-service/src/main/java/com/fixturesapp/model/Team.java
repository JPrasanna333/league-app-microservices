package com.fixturesapp.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Team {
	
	private String teamName;
	@Id
	@GeneratedValue(generator = "team_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "team_gen",sequenceName = "team_seq",initialValue = 1,allocationSize = 1) 
	private Integer teamId;
	private String owner;
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "team_id")
	private Set<Player> players;
	private String teamImg;
	public Team(String teamName, String owner, Set<Player> players, String teamImg) {
		super();
		this.teamName = teamName;
		this.owner = owner;
		this.players = players;
		this.teamImg = teamImg;
	}
	@Override
	public String toString() {
		return "Team [teamName=" + teamName + ", teamId=" + teamId + ", owner=" + owner + ", players=" + players
				+ ", teamImg=" + teamImg + "]";
	}
	
	
	

}
