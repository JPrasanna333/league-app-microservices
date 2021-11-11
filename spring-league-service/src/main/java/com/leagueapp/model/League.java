package com.leagueapp.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@NamedQuery(name="findByBoard", query = "from League l inner join l.board b where b.boardName =?1")
public class League {
	private String name;
	@Id
	@GeneratedValue(generator = "league_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "league_gen",sequenceName = "league_seq",initialValue = 1,allocationSize = 1) 
	private Integer leagueId;
	private String country;
	
	@Column(name="duration")
	private int durationInMonths;
	
	
	@OneToOne
	@JoinColumn(name= "board_id")// to give a different column name
	private Board board;
    private String leagueImg;
    
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "league_id") // to remove the intermediate table and add the column to many side
	private Set<Fixtures> fixtures;
	
	// League is primary class. If you use ManyToOne add @JoinColumn annotation together with this
	@ManyToOne
	@JoinColumn(name="sports_id")
	private Sports sports;

	@Override
	public String toString() {
		return "League [name=" + name + ", leagueId=" + leagueId + ", country=" + country + ", durationInMonths="
				+ durationInMonths + ", board=" + board + ", leagueImg=" + leagueImg + ", sports=" + sports + "]";
	}

	
//	@Override
//	public String toString() {
//		return "League [name=" + name + ", leagueId=" + leagueId + ", country=" + country + ", durationInMonths="
//				+ durationInMonths + ", board=" + board + ", leagueImg=" + leagueImg + ", fixtures=" + fixtures
//				+ ", sports=" + sports + "]";
//	}

	

	
	
	

}
