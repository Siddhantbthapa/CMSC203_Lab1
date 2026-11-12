package lab1;

import java.util.Scanner;

public class MovieDriver {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String answer;

		do {

			Movie movie = new Movie();

			System.out.println("Enter the title of a movie:");
			String title = keyboard.nextLine();
			movie.setTitle(title);

			System.out.println("Enter the movie's rating:");
			String rating = keyboard.nextLine();
			movie.setRating(rating);

			System.out.println("Enter the number of tickets sold at a theater:");
			int tickets = keyboard.nextInt();
			movie.setSoldTickets(tickets);

			keyboard.nextLine();

			System.out.println(movie.toString());

			System.out.println("Do you want to enter another? (y/n)");
			answer = keyboard.nextLine();

		} while (answer.equalsIgnoreCase("y"));

		System.out.println("Goodbye!");
		keyboard.close();
		System.exit(0);
	}

}
