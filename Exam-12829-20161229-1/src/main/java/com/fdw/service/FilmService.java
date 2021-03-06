package com.fdw.service;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fdw.dao.FilmDao;
import com.fdw.entity.Film;


public class FilmService {
	
	private FilmDao  filmDao;
	 
	public void setFilmDao(FilmDao filmDao) {
		this.filmDao = filmDao;
	}
	 
	public  void  insertFilm(Film film){
		filmDao.insertOneInToFilm(film);
	}
}
