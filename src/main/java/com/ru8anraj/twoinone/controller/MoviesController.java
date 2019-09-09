package com.ru8anraj.twoinone.controller;

import com.ru8anraj.twoinone.modal.Movie;
import com.ru8anraj.twoinone.modal.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class MoviesController {

    @GetMapping("/movies")
    public @ResponseBody
    List<Movie> getMovies(
            @RequestParam(value="page", defaultValue="1") String page
    ) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://api.themoviedb.org/3/movie/now_playing?api_key=1d76cf519e61077a326903a4ae9a9f83&page="+page;
        Result res = restTemplate.getForObject(url, Result.class);
        return res.getResults();
    }
}
