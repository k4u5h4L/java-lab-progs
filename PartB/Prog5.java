package PartB;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 	Design and implement a simple inventory central system for a small video rental
	store using constructors and Object List
*/

class Movie {
 String movieName;
 float movieRating;
 boolean movieStatus;
 
 Movie(String name, float rating, boolean status) {
  movieName = name;
  movieRating = rating;
  movieStatus = status;
 }
}

public class Prog5 {
 public static void main(String args[]) {
  ArrayList<Movie> movies = new ArrayList<Movie>();
  Scanner scan = new Scanner(System.in);
  
  movies.add(new Movie("Tenet", 3.0f, true));
  movies.add(new Movie("Ninja turtles", 2.5f, true));
  movies.add(new Movie("A", 5.0f, true));
  movies.add(new Movie("Super", 5.0f, true));
  
  int i = 0;
  
  String nameOfMovie;
  
  while (true) {
   System.out.println("1. Add movies\n2. Display movies\n3. Rent out\n4. Collect back\n5. Exit");
   int choice = scan.nextInt();;
   
   switch (choice) {
    case 1: System.out.println("Enter movie name:");
      String tempName = scan.next();
      System.out.println("Enter movie rating:");
      float tempRating = scan.nextFloat();
      movies.add(new Movie(tempName, tempRating, true));
      System.out.println("Movie has been saved");
      break;
      
    case 2: System.out.println("The movies are:\n");
    
      for (Movie movie: movies) {
       System.out.println("Name: " + movie.movieName);
       System.out.println("Rating: " + movie.movieRating);
       System.out.println("Status: " + movie.movieStatus + "\n");
      }
      System.out.println("\n");
      break;
      
    case 3: System.out.println("Enter name of the movie to be rented out:");
      nameOfMovie = scan.next();
      
      for (Movie movie: movies) {
       if (movie.movieName.equals(nameOfMovie)) {
        System.out.println("The movie was found!");
        if (movie.movieStatus == false) {
         System.out.println("Movie is already rented out. Not available at the moment");
         break;
        } else {
         System.out.println("Movie is being rented out. Saving status as false...");
         movie.movieStatus = false;
         break;
        }
       }
       i++;
      }
      
      if (movies.size() <= i) {
       System.out.println("Movie was not found");
       i = 0;
      }
      break;
      
    case 4: System.out.println("Enter name of the movie to be rented out:");
      nameOfMovie = scan.next();
      
      for (Movie movie: movies) {
       if (movie.movieName.equals(nameOfMovie)) {
        System.out.println("The movie was found!");
        System.out.println("Movie status is being saved as true...");
        movie.movieStatus = true;
        break;
       }
       i++;
      }
      
      if (movies.size() <= i) {
       System.out.println("Movie was not found");
       i = 0;
      }
      break;
      
    case 5: System.out.println("Exiting program...");
      scan.close();
      
      System.exit(0);
   }
  }
 }
}