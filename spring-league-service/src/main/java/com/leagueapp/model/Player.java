package com.leagueapp.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Player {
	private String playerName;
	@Id
	@GeneratedValue(generator = "player_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "player_gen",sequenceName = "player_seq",initialValue = 100,allocationSize = 1) 
	private Integer playerId;
	private int age;
	private	String city;
	private String playerImg;
	
	@ManyToOne
	@JoinColumn(name= "team_id") 
	private Team team;
	public Player(String playerName, int age, String city, String playerImg) {
		super();
		this.playerName = playerName;
		this.age = age;
		this.city = city;
		this.playerImg = playerImg;
	}
	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", playerId=" + playerId + ", age=" + age + ", city=" + city
				+ ", playerImg=" + playerImg + "]";
	}
	

}
