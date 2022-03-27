package com.xwork.movies.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xwork.movies.service.MovieService;

@Controller
public class MoviesController {
	
	@Autowired
	public MovieService movieservice;

	public MoviesController() {
		System.out.println(this.getClass().getSimpleName()+" Movies object created");
	}
	
	@GetMapping("/saveMovie.do")
	public ModelAndView saveMovie(String movieName,String actorName,HttpSession session) {
		
		Long budget = movieservice.calculateBudget(actorName);
		ModelAndView modelAndView = new ModelAndView("MoviesProfile");
		modelAndView.addObject("movie", movieName);
		modelAndView.addObject("movieBudget",budget);
		if(session.getAttribute("movie")==null)
	    session.setAttribute("movie", movieName);
		return modelAndView;
	}

}
