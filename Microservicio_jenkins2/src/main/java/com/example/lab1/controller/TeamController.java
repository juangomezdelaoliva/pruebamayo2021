package com.example.lab1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.lab1.model.Team;
import com.example.lab1.repository.TeamRepository;

//@RestController
public class TeamController {
	
	@Autowired 
	TeamRepository teamRepository;
	
	@GetMapping("/teams1")
	public List<Team> getTeams1() {
		List<Team> list = new ArrayList<>();

		Team team = new Team();
		team.setId(0l);
		team.setLocation("Harlem");
		team.setName("Globetrotters");
		list.add(team);
		
		team = new Team();
		team.setId(1l);
		team.setLocation("Washington");
		team.setName("Generals");
		list.add(team);
		
		return list;
	}
	
	@GetMapping("/teams")
	public Iterable<Team> getTeams() {
		return teamRepository.findAll();
	}
	@GetMapping("/teams/{id}")
	public Team getTeam(@PathVariable Long id){
		return teamRepository.findById(id).get();
	}
	
}
