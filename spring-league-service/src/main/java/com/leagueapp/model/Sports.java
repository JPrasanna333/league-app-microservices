package com.leagueapp.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class Sports {
	private String name;
	@Id
	@GeneratedValue(generator = "sports_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "sports_gen",sequenceName = "sports_seq",initialValue = 20,allocationSize = 1)
	private Integer sportsId;
	private String origin;
	private String sportsImg;
	// use mappedBy as League is the primary class/owner of this relationship
	// cannot use joinColumn and mappedBy together
	@JsonIgnore
	@OneToMany(mappedBy = "sports") 
	private Set<League> leagues;
	public Sports(String name, String origin, String sportsImg) {
		super();
		this.name = name;
		this.origin = origin;
		this.sportsImg = sportsImg;
	}
	@Override
	public String toString() {
		return "Sports [name=" + name + ", sportsId=" + sportsId + ", origin=" + origin + ", sportsImg=" + sportsImg
				+ "]";
	}
	
	
}
