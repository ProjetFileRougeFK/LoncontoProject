package com.loncoto.backendIntervention.metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter@Setter@NoArgsConstructor@ToString
public class Article {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id								private int id;

}
