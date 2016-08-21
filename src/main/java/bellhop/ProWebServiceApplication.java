package bellhop;

import bellhop.domain.Genre;
import bellhop.domain.MediaType;
import bellhop.domain.Show;
import bellhop.repository.GenreRepository;
import bellhop.repository.MediaTypeRepository;
import bellhop.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class ProWebServiceApplication implements CommandLineRunner {

    @Autowired
    private GenreRepository mGenreRepository;

	@Autowired
	private ShowRepository mShowRepository;

    @Autowired
    private MediaTypeRepository mMediaTypeRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProWebServiceApplication.class, args);
	}

    @Override
    public void run(String... strings) throws Exception {

        // create media types
        MediaType[] mediaTypes = new MediaType[2];
        mediaTypes[0] = new MediaType("TV");
        mediaTypes[1] = new MediaType("Movie");

        mMediaTypeRepository.save(Arrays.asList(mediaTypes));

        // create genres
        Genre[] genres = new Genre[6];
        genres[0] = new Genre("Comedy");
        genres[1] = new Genre("Drama");
        genres[2] = new Genre("Documentary");
        genres[3] = new Genre("Action");
        genres[4] = new Genre("Sci-Fi");
        genres[5] = new Genre("Foreign");

        mGenreRepository.save(Arrays.asList(genres));

        // create shows
        Show[] shows = new Show[10];
        shows[0] = getShow0(mediaTypes, genres);
        shows[1] = getShow1(mediaTypes, genres);
        shows[2] = getShow2(mediaTypes, genres);
        shows[3] = getShow3(mediaTypes, genres);
        shows[4] = getShow4(mediaTypes, genres);
        shows[5] = getShow5(mediaTypes, genres);
        shows[6] = getShow6(mediaTypes, genres);
        shows[7] = getShow7(mediaTypes, genres);
        shows[8] = getShow8(mediaTypes, genres);
        shows[9] = getShow9(mediaTypes, genres);

        mShowRepository.save(Arrays.asList(shows));

    }


    // ******************************************** //
    // *****  METHODS TO CREATE EXAMPLE SHOWS ***** //
    // ******************************************** //

    private Show getShow0(MediaType[] mediaTypes, Genre[] genres) {
        MediaType mediaType = mediaTypes[1];
        Genre genre = genres[4];
        String name = "The Martian";
        String description = "When astronauts blast off from the planet Mars, they leave behind Mark Watney " +
                "(Matt Damon), presumed dead after a fierce storm. With only a meager amount of supplies, the " +
                "stranded visitor must utilize his wits and spirit to find a way to survive on the hostile planet. " +
                "Meanwhile, back on Earth, members of NASA and a team of international scientists work tirelessly " +
                "to bring him home, while his crew mates hatch their own plan for a daring rescue mission.";
        String runningTime = "2 hrs 31 mins";
        int iRottenTomatoes = 92;
        int iMetaCritic = 80;
        String sImageUrl = "http://ia.media-imdb.com/images/M/MV5BMTc2MTQ3MDA1Nl5BMl5BanBnXkFtZTgwODA3OTI4NjE@._V1_UY1200_CR90,0,630,1200_AL_.jpg";

        return new Show(mediaType, name, description, genre, runningTime, iRottenTomatoes, iMetaCritic, sImageUrl);
    }

    private Show getShow1(MediaType[] mediaTypes, Genre[] genres) {
        MediaType mediaType = mediaTypes[1];
        Genre genre = genres[2];
        String name = "The Act of Killing";
        String description = "Filmmakers expose the horrifying mass executions of accused communists in Indonesia " +
                "and those who are celebrated in their country for perpetrating the crime.";
        String runningTime = "2 hrs 26 mins";
        int iRottenTomatoes = 96;
        int iMetaCritic = 89;
        String sImageUrl = "https://upload.wikimedia.org/wikipedia/en/c/ca/The_Act_of_Killing_(2012_film).jpg";

        return new Show(mediaType, name, description, genre, runningTime, iRottenTomatoes, iMetaCritic, sImageUrl);
    }

    private Show getShow2(MediaType[] mediaTypes, Genre[] genres) {
        MediaType mediaType = mediaTypes[1];
        Genre genre = genres[1];
        String name = "The Revenant";
        String description = "While exploring the uncharted wilderness in 1823, frontiersman Hugh " +
                "Glass (Leonardo DiCaprio) sustains life-threatening injuries from a brutal bear attack. When a " +
                "member (Tom Hardy) of his hunting team kills his young son (Forrest Goodluck) and leaves him for " +
                "dead, Glass must utilize his survival skills to find a way back to civilization. Grief-stricken and " +
                "fueled by vengeance, the legendary fur trapper treks through the snowy terrain to track down the " +
                "man who betrayed him.";
        String runningTime = "2 hrs 36 mins";
        int iRottenTomatoes = 82;
        int iMetaCritic = 76;
        String sImageUrl = "https://upload.wikimedia.org/wikipedia/en/b/b6/The_Revenant_2015_film_poster.jpg";

        return new Show(mediaType, name, description, genre, runningTime, iRottenTomatoes, iMetaCritic, sImageUrl);
    }

    private Show getShow3(MediaType[] mediaTypes, Genre[] genres) {
        MediaType mediaType = mediaTypes[1];
        Genre genre = genres[0];
        String name = "Pitch Perfect 2";
        String description = "It's been three years since the Barden Bellas (Anna Kendrick, Rebel Wilson) became the " +
                "first all-female group to win a national title. All seems well until a botched Lincoln Center " +
                "performance for the president leads to a scandal that strips them of their performing duties, " +
                "causing internal tension and strife. With the world championships on the horizon in Copenhagen, " +
                "Denmark, the women must get their act together for their one and only shot at redemption.";
        String runningTime = "1 hr 55 mins";
        int iRottenTomatoes = 66;
        int iMetaCritic = 63;
        String sImageUrl = "https://upload.wikimedia.org/wikipedia/en/3/3f/Pitch_Perfect_2_poster.jpg";

        return new Show(mediaType, name, description, genre, runningTime, iRottenTomatoes, iMetaCritic, sImageUrl);
    }

    private Show getShow4(MediaType[] mediaTypes, Genre[] genres) {
        MediaType mediaType = mediaTypes[1];
        Genre genre = genres[5];
        String name = "Son of Saul";
        String description = "During World War II, a Jewish worker (Géza Röhrig) at the Auschwitz concentration camp " +
                "tries to find a rabbi to give a child a proper burial.";
        String runningTime = "1 hr 57 mins";
        int iRottenTomatoes = 96;
        int iMetaCritic = 89;
        String sImageUrl = "http://ia.media-imdb.com/images/M/MV5BMTUxNjk0NTczMV5BMl5BanBnXkFtZTgwNzIzMTEzNzE@._V1_UY1200_CR93,0,630,1200_AL_.jpg";

        return new Show(mediaType, name, description, genre, runningTime, iRottenTomatoes, iMetaCritic, sImageUrl);
    }

    private Show getShow5(MediaType[] mediaTypes, Genre[] genres) {
        MediaType mediaType = mediaTypes[1];
        Genre genre = genres[3];
        String name = "Mad Max: Fury Road";
        String description = "Years after the collapse of civilization, the tyrannical Immortan Joe enslaves " +
                "apocalypse survivors inside the desert fortress the Citadel. When the warrior Imperator Furiosa " +
                "(Charlize Theron) leads the despot's five wives in a daring escape, she forges an alliance with " +
                "Max Rockatansky (Tom Hardy), a loner and former captive. Fortified in the massive, armored truck " +
                "the War Rig, they try to outrun the ruthless warlord and his henchmen in a deadly high-speed chase " +
                "through the Wasteland.";
        String runningTime = "2 hrs";
        int iRottenTomatoes = 97;
        int iMetaCritic = 90;
        String sImageUrl = "http://ia.media-imdb.com/images/M/MV5BMTUyMTE0ODcxNF5BMl5BanBnXkFtZTgwODE4NDQzNTE@._V1_UY1200_CR97,0,630,1200_AL_.jpg";

        return new Show(mediaType, name, description, genre, runningTime, iRottenTomatoes, iMetaCritic, sImageUrl);
    }

    private Show getShow6(MediaType[] mediaTypes, Genre[] genres) {
        MediaType mediaType = mediaTypes[0];
        Genre genre = genres[0];
        String name = "BoJack Horseman: Season 3";
        String description = "Meet the most beloved sitcom horse of the '90s - 20 years later. BoJack Horseman was the" +
                " star of the hit TV show \"Horsin' Around,\" but today he's washed up, living in Hollywood, " +
                "complaining about everything, and wearing colorful sweaters.";
        String runningTime = "25 mins";
        int iRottenTomatoes = 100;
        int iMetaCritic = 89;
        String sImageUrl = "http://cdn1-www.comingsoon.net/assets/uploads/gallery/bojack-horseman/bojackhorseman_s2_dateannounce_us.jpg";

        return new Show(mediaType, name, description, genre, runningTime, iRottenTomatoes, iMetaCritic, sImageUrl);
    }

    private Show getShow7(MediaType[] mediaTypes, Genre[] genres) {
        MediaType mediaType = mediaTypes[0];
        Genre genre = genres[1];
        String name = "Mr. Robot: Season 2";
        String description = "Elliot Alderson, a young man living in New York City, who works at the cyber security " +
                "company Allsafe as a security engineer. Constantly struggling with social anxiety disorder and" +
                " clinical depression, Elliot's thought process seems heavily influenced by paranoia and delusion. He " +
                "connects to people by hacking them, which often leads him to act as a cyber-vigilante. He is " +
                "recruited by a mysterious insurrectionary anarchist known as Mr. Robot and joins his team of " +
                "hacktivists known as fsociety.";
        String runningTime = "55 mins";
        int iRottenTomatoes = 96;
        int iMetaCritic = 81;
        String sImageUrl = "https://pmcdeadline2.files.wordpress.com/2016/06/mrrobot_s2_keyart_press1.jpg";

        return new Show(mediaType, name, description, genre, runningTime, iRottenTomatoes, iMetaCritic, sImageUrl);
    }

    private Show getShow8(MediaType[] mediaTypes, Genre[] genres) {
        MediaType mediaType = mediaTypes[0];
        Genre genre = genres[4];
        String name = "Stranger Things: Season 2";
        String description = "This thrilling Netflix-original drama stars award-winning actress Winona Ryder as Joyce " +
                "Byers, who lives in a small Indiana town in 1983 -- inspired by a time when tales of science fiction " +
                "captivated audiences. When Joyce's 12-year-old son, Will, goes missing, she launches a terrifying " +
                "investigation into his disappearance with local authorities. As they search for answers, they" +
                " unravel a series of extraordinary mysteries involving secret government experiments, unnerving" +
                " supernatural forces, and a very unusual little girl.";
        String runningTime = "1 hr";
        int iRottenTomatoes = 94;
        int iMetaCritic = 76;
        String sImageUrl = "http://www.what-song.com/images/showposters/173.jpg";

        return new Show(mediaType, name, description, genre, runningTime, iRottenTomatoes, iMetaCritic, sImageUrl);
    }

    private Show getShow9(MediaType[] mediaTypes, Genre[] genres) {
        MediaType mediaType = mediaTypes[0];
        Genre genre = genres[0];
        String name = "You're the Worst: Season 1";
        String description = "\"You're the Worst\" isn't a typical romantic comedy. Narcissist Jimmy Shive-Overly " +
                "thinks all relationships are doomed from the start, while stubborn cynic Gretchen Cutler is certain " +
                "that amorous bonds aren't her thing. When the two meet at a wedding, though, there's a sea change: " +
                "They go home together and find they're beginning to fall for each other. Jimmy and Gretchen navigate " +
                "fear, heartbreak, ardor and other feelings, while their situation seems to establish that " +
                "nontraditionalists sometimes make great partners.";
        String runningTime = "26 mins";
        int iRottenTomatoes = 88;
        int iMetaCritic = 65;
        String sImageUrl = "https://i.jeded.com/i/youre-the-worst-first-season.29056.jpg";

        return new Show(mediaType, name, description, genre, runningTime, iRottenTomatoes, iMetaCritic, sImageUrl);
    }


}
