package moviemonster;

import moviemonster.domain.Genre;
import moviemonster.domain.Movie;
import moviemonster.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

/**
 * Main method to call the application.
 * Run method is used to create example Genre and Movie objects to populate the database.
 */

@SpringBootApplication
public class ProWebServiceApplication implements CommandLineRunner {

	@Autowired
	private MovieRepository movieRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProWebServiceApplication.class, args);
	}

    @Override
    public void run(String... strings) throws Exception {
        // create & save example genre data
        Genre[] genres = new Genre[6];
        genres[0] = new Genre("Comedy");
        genres[1] = new Genre("Drama");
        genres[2] = new Genre("Documentary");
        genres[3] = new Genre("Action");
        genres[4] = new Genre("Sci-Fi");
        genres[5] = new Genre("Foreign");

        // create & save example movie data
        Movie[] movies = new Movie[6];
        movies[0] = getMovie0(genres);
        movies[1] = getMovie1(genres);
        movies[2] = getMovie2(genres);
        movies[3] = getMovie3(genres);
        movies[4] = getMovie4(genres);
        movies[5] = getMovie5(genres);
        movieRepository.save(Arrays.asList(movies));
    }


    // ******************************************** //
    // *****  METHODS TO CREATE EXAMPLE MOVIES ***** //
    // ******************************************** //

    private Movie getMovie0(Genre[] genres) {
        Genre genre = genres[4];
        String name = "The Martian";
        String description = "When astronauts blast off from the planet Mars, they leave behind Mark Watney " +
                "(Matt Damon), presumed dead after a fierce storm. With only a meager amount of supplies, the " +
                "stranded visitor must utilize his wits and spirit to find a way to survive on the hostile planet. " +
                "Meanwhile, back on Earth, members of NASA and a team of international scientists work tirelessly " +
                "to bring him home, while his crew mates hatch their own plan for a daring rescue mission.";
        int iRottenTomatoes = 92;
        int iMetaCritic = 80;
        String sImageUrl = "http://ia.media-imdb.com/images/M/MV5BMTc2MTQ3MDA1Nl5BMl5BanBnXkFtZTgwODA3OTI4NjE@._V1_UY1200_CR90,0,630,1200_AL_.jpg";

        return new Movie(name, description, genre, iRottenTomatoes, iMetaCritic, sImageUrl);
    }

    private Movie getMovie1(Genre[] genres) {
        Genre genre = genres[2];
        String name = "The Act of Killing";
        String description = "Filmmakers expose the horrifying mass executions of accused communists in Indonesia " +
                "and those who are celebrated in their country for perpetrating the crime.";
        int iRottenTomatoes = 96;
        int iMetaCritic = 89;
        String sImageUrl = "https://upload.wikimedia.org/wikipedia/en/c/ca/The_Act_of_Killing_(2012_film).jpg";
        return new Movie(name, description, genre, iRottenTomatoes, iMetaCritic, sImageUrl);
    }

    private Movie getMovie2(Genre[] genres) {
        Genre genre = genres[1];
        String name = "The Revenant";
        String description = "While exploring the uncharted wilderness in 1823, frontiersman Hugh " +
                "Glass (Leonardo DiCaprio) sustains life-threatening injuries from a brutal bear attack. When a " +
                "member (Tom Hardy) of his hunting team kills his young son (Forrest Goodluck) and leaves him for " +
                "dead, Glass must utilize his survival skills to find a way back to civilization. Grief-stricken and " +
                "fueled by vengeance, the legendary fur trapper treks through the snowy terrain to track down the " +
                "man who betrayed him.";
        int iRottenTomatoes = 82;
        int iMetaCritic = 76;
        String sImageUrl = "https://upload.wikimedia.org/wikipedia/en/b/b6/The_Revenant_2015_film_poster.jpg";
        return new Movie(name, description, genre, iRottenTomatoes, iMetaCritic, sImageUrl);
    }

    private Movie getMovie3(Genre[] genres) {
        Genre genre = genres[0];
        String name = "Pitch Perfect 2";
        String description = "It's been three years since the Barden Bellas (Anna Kendrick, Rebel Wilson) became the " +
                "first all-female group to win a national title. All seems well until a botched Lincoln Center " +
                "performance for the president leads to a scandal that strips them of their performing duties, " +
                "causing internal tension and strife. With the world championships on the horizon in Copenhagen, " +
                "Denmark, the women must get their act together for their one and only shot at redemption.";
        int iRottenTomatoes = 66;
        int iMetaCritic = 63;
        String sImageUrl = "https://upload.wikimedia.org/wikipedia/en/3/3f/Pitch_Perfect_2_poster.jpg";
        return new Movie(name, description, genre, iRottenTomatoes, iMetaCritic, sImageUrl);
    }

    private Movie getMovie4(Genre[] genres) {
        Genre genre = genres[5];
        String name = "Son of Saul";
        String description = "During World War II, a Jewish worker (Géza Röhrig) at the Auschwitz concentration camp " +
                "tries to find a rabbi to give a child a proper burial.";
        int iRottenTomatoes = 96;
        int iMetaCritic = 89;
        String sImageUrl = "http://ia.media-imdb.com/images/M/MV5BMTUxNjk0NTczMV5BMl5BanBnXkFtZTgwNzIzMTEzNzE@._V1_UY1200_CR93,0,630,1200_AL_.jpg";
        return new Movie(name, description, genre, iRottenTomatoes, iMetaCritic, sImageUrl);
    }

    private Movie getMovie5(Genre[] genres) {
        Genre genre = genres[3];
        String name = "Mad Max: Fury Road";
        String description = "Years after the collapse of civilization, the tyrannical Immortan Joe enslaves " +
                "apocalypse survivors inside the desert fortress the Citadel. When the warrior Imperator Furiosa " +
                "(Charlize Theron) leads the despot's five wives in a daring escape, she forges an alliance with " +
                "Max Rockatansky (Tom Hardy), a loner and former captive. Fortified in the massive, armored truck " +
                "the War Rig, they try to outrun the ruthless warlord and his henchmen in a deadly high-speed chase " +
                "through the Wasteland.";
        int iRottenTomatoes = 97;
        int iMetaCritic = 90;
        String sImageUrl = "http://ia.media-imdb.com/images/M/MV5BMTUyMTE0ODcxNF5BMl5BanBnXkFtZTgwODE4NDQzNTE@._V1_UY1200_CR97,0,630,1200_AL_.jpg";
        return new Movie(name, description, genre, iRottenTomatoes, iMetaCritic, sImageUrl);
    }

}
