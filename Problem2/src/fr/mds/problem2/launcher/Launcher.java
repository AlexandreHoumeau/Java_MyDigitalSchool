package fr.mds.problem2.launcher;

import fr.mds.problem2.model.Author;
import fr.mds.problem2.model.Book;

public class Launcher {
	public static void main(String[] args) {

		Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'M');
		Book aBook = new Book("Java For Dummy",anAuthor,19.95,1000);
		System.out.println("Book name: " + aBook.getName());
		System.out.println("Book price: " + aBook.getPrice());
		System.out.println("Qty in Stock: " + aBook.getQtyInStock());
		
		
		Author newAuthor = new Author("Tic Tac Toe", "TicTacToe@gmail.com", 'F');
		Book anOtherBook = new Book("More Java For Dummy", newAuthor, 29.95,888);
		System.out.println("Name: " + anAuthor.getName());
		System.out.println("Author: " + anAuthor.getEmail());
		System.out.println("Gender: " + anAuthor.getGender());
	}

}
