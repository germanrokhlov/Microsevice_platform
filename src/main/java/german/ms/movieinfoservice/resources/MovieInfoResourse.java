package german.ms.movieinfoservice.resources;

import german.ms.movieinfoservice.model.MovieInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class MovieInfoResourse {

private List<MovieInfo> movieInfos = new ArrayList<MovieInfo>(Arrays.asList(
        new MovieInfo(1, "Star Wars", "Wars in the space"),
        new MovieInfo(2, "James Bond", "Adventures"),
        new MovieInfo(3, "Java lectures", "Java lectures")
));

@RequestMapping ("/movies/{movieId}")
public MovieInfo getMovies(@PathVariable ("movieId") int movieId){
    return getMoviesById(movieId);
}

public MovieInfo getMoviesById(int movieId){
    MovieInfo theMovie = new MovieInfo();
    for (MovieInfo movie : movieInfos){
        if (movie.getMovieId() == movieId){
            theMovie = movie;
        }
    }
    return theMovie;
}

}
