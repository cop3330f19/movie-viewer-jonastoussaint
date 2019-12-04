/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movies.models;
import info.movito.themoviedbapi.TmdbApi;
import info.movito.themoviedbapi.TmdbMovies;
import info.movito.themoviedbapi.model.MovieDb;
import info.movito.themoviedbapi.model.Video;
import info.movito.themoviedbapi.model.core.MovieResultsPage;
import java.util.ArrayList;

/**
 *
 * @author Jameeyah
 */
public class Movies {
   
    private  static final TmdbApi CONNECTION = new TmdbApi("2cf6a1a6e991657d6a8b106248bf5732");
    
    private static final String LANGUAGE = "en-US";
    
    
    
    public ArrayList<MovieDb> getMovies()
    {  
        TmdbMovies movies = new TmdbMovies(CONNECTION);
        MovieResultsPage result = movies.getNowPlayingMovies(LANGUAGE, 1, "");
    
        return (ArrayList<MovieDb>) result.getResults();
    }
      
   
    public ArrayList<Video> getVideos(int movieId)
    {
        TmdbMovies movies = new TmdbMovies(CONNECTION);
        return (ArrayList<Video>) movies.getVideos(movieId, LANGUAGE);
    }
 
}
