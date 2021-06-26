package _05_netflix;

public class Nice {
	public static void main(String[] args) {
		Movie movie = new Movie("Name of the movie", 5);
		Movie movie1 = new Movie("a", 3);
		Movie movie2 = new Movie("b", 2);
		Movie movie3 = new Movie("c", 1);
		Movie movie4 = new Movie("d", 4);
		System.out.println(movie.getTicketPrice());
		NetflixQueue netflix = new NetflixQueue();
		netflix.addMovie(movie4);
		netflix.addMovie(movie3); 
		netflix.addMovie(movie2);
		netflix.addMovie(movie1);
		netflix.addMovie(movie); 
		netflix.printMovies();
		netflix.sortMoviesByRating();
		System.out.println("The best movie is" + netflix.getBestMovie());
		System.out.println("The worst movie is" + netflix.getMovie(1));

	}
}
