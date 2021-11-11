package com.leagueapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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
public class Board {
	private String boardName;
	@Id
	@GeneratedValue(generator = "board_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "board_gen",sequenceName = "board_seq",initialValue = 100,allocationSize = 1) 
	private Integer boardId;
	private String city;
	private String boardLogo;
	@JsonIgnore
	@OneToOne(mappedBy="board")
	League league;

	public Board(String boardName, String city, String boardLogo) {
		super();
		this.boardName = boardName;
		this.city = city;
		this.boardLogo = boardLogo;
	}

	@Override
	public String toString() {
		return "Board [boardName=" + boardName + ", boardId=" + boardId + ", city=" + city + ", boardLogo=" + boardLogo
				+ "]";
	}
	
	

}
