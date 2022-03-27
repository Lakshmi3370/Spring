package com.xwork.movies.service;

import java.util.Objects;

import org.springframework.stereotype.Service;

@Service
public class MovieService {

	public Long calculateBudget(String actor) {
		Long budget = 50000l;
		if (Objects.isNull(actor) || actor.isEmpty())
			budget = 83444000l;
		else if (actor.equalsIgnoreCase("Puneeth"))
			budget = 8000000l;
		else if (actor.equalsIgnoreCase("SRK"))
			budget = 7800000l;
		else if (actor.equalsIgnoreCase("Sudeep"))
			budget = 5000000l;
		return budget;
	}

}
