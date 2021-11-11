package com.leagueapp.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

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
@Table(name="Fixtures")
public class Fixtures {
	
	private String squads;
	@Id
	@GeneratedValue(generator = "fixture_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "fixture_gen",sequenceName = "fixture_seq",initialValue = 11,allocationSize = 10) 
	private Integer fixtureId;
	private String stadium;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name= "league_id") // to use the existing column that is created in unidirectional relation
	private League league;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="fixture_id")
	@JsonIgnore
	private Set<Team> teams;
	private String tournamentImg;
	public Fixtures(String squads, String stadium, String tournamentImg) {
		super();
		this.squads = squads;
		this.stadium = stadium;
		this.tournamentImg = tournamentImg;
	}
	@Override
	public String toString() {
		return "Fixtures [squads=" + squads + ", fixtureId=" + fixtureId + ", stadium=" + stadium + ", tournamentImg="
				+ tournamentImg + "]";
	}
	

	
	
	

}
