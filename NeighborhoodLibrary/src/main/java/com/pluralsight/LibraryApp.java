package com.pluralsight;
import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        Book[] books = {new Book(1, "978-0140449136", "Kobzar — Taras Shevchenko", false, "Free to take"),
                new Book(2, "978-0061120084", "The Hunters and the Hunted — Ivan Bahrianyi", false, "Free to take"),
                new Book(3, "978-6175851545", "Sweet Darusia — Maria Matios", false, "Free to take"),
                new Book(4, "978-9660319798", "Do the Oxen Low When the Manger is Full? — Panas Myrny", true, "Sahar"),
                new Book(5, "978-6176793691", "Black Raven — Vasyl Shkliar", false, "Free to take"),
                new Book(6, "978-9662646786", "The Forest Song — Lesya Ukrainka", false, "Free to take"),
                new Book(7, "978-6176142604", "Marusia Churai — Lina Kostenko", true, "David"),
                new Book(8, "978-9664986064", "Voroshylovhrad — Serhiy Zhadan", false, "Free to take"),
                new Book(9, "978-6176142291", "Notes of a Ukrainian Madman — Lina Kostenko", false, "Free to take"),
                new Book(10, "978-9660341417", "Shadows of Forgotten Ancestors — Mykhailo Kotsiubynsky", true, "Anna"),
                new Book(11, "978-9669171374", "The Old Man and the Sea — Ernest Hemingway (Ukrainian edition)", true, "Carol"),
                new Book(12, "978-9669424715", "The Orphanage — Serhiy Zhadan", false, "Free to take"),
                new Book(13, "978-9669761520", "Fieldwork in Ukrainian Sex — Oksana Zabuzhko", true, "Tonia"),
                new Book(14, "978-6176797804", "The Art of War — Sun Tz", false, "Free to take"),
                new Book(15, "978-9669423404", "The Kalynovych Family — Ivan Nechuy-Levytsky", true, "Ian"),
                new Book(16, "978-6177279132", "One Hundred Years of Solitude — Gabriel García Márquez (Ukr. edition)", true, "Kate"),
                new Book(17, "978-9660341820", "The City — Valerian Pidmohylny", true, "Amiz"),
                new Book(18, "978-6177960788", "The House in Which — Mariam Petrosyan (Ukr. edition)", false, "Free to take"),
                new Book(19, "978-6176292224", "Amadoka — Sofia Andrukhovych", true, "Lindsey"),
                new Book(20, "978-9663782627", "The Cross-Paths — Ivan Franko", false, "Free to take"),
        };

        System.out.println("Welcome to our \"Wisdom of an owl\" Library!");
        System.out.println("Choose from next options: ");
        System.out.println("1.Show Available Books.");
        System.out.println("2.Show Checked Out Books.");
        System.out.println("3.Exit.");
        System.out.print("Your choice number: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            boolean available = false;
            System.out.println("Available books: ");
            for (Book book : books) {
                if (book.isCheckedOut() == false) {
                    System.out.printf("Book id: %d| ISBN: %s| title: %s| Checked Out: %s\n ", book.getId(), book.getIsbn(), book.getTitle(), book.isCheckedOut(), book.getCheckedOutTo());
                    available = true;
                }
            }
            if (!available) {
                System.out.println("There are not available books.");
                return;
            }
            System.out.print("Enter book's Id to check it out: ");
            int bookId = scanner.nextInt();
            if (bookId == 0) {
                System.out.println("Wrong number.");
                return;
            }
            Book chosenBook = null;
            for (Book book : books) {
                if (book.getId() == bookId || book.isCheckedOut() == false) {
                    chosenBook = book;
                }
            }
            if (chosenBook != null) {
                scanner.nextLine();
                System.out.print("Enter your name to check out the book: ");
                String name = scanner.nextLine();
                System.out.println("Your book is checked out on the name: " + name);
            } else {
                System.out.println("Invalid book id or book is checked out.");
            }
        } else if (choice == 2) {
            boolean not_available = true;
            System.out.println("Books: ");
            for (Book book : books) {
                if (book.isCheckedOut() == true) {
                    System.out.printf("Book id: %d| ISBN: %s| title: %s| Checked Out: %s\n ", book.getId(), book.getIsbn(), book.getTitle(), book.isCheckedOut(), book.getCheckedOutTo());
                    not_available = false;
                }
            }
            if (!not_available){
                System.out.println("There are no checked out books.");
            }
            System.out.println("Do you want Check In your book? (If yes: print C, if you want to go back to the home screen: print X)");
            scanner.nextLine();
            System.out.print("Your choice: ");
            String choice_at_the_end  = scanner.nextLine();

            if (choice_at_the_end.equals("C")){
                System.out.print("Enter your id of the book: ");
                int checkedIn_Id = scanner.nextInt();
                for (Book book : books) {
                    if (book.getId() == checkedIn_Id || book.isCheckedOut()){
                        book.setCheckedOut(false);
                        book.setCheckedOutTo("Free to take");
                    }
                }

                }
            else if (choice_at_the_end.equals("X")) {
                int i = 0;
                for ( i = 3; i >= 1 ; i --){
                    System.out.println(i);
                    Thread.sleep(100);
                } System.out.println("Buy!");
            }
            } else if (choice == 3) {
            System.out.println("Buy! See you soon!");

        } else {
            System.out.println("Wrong number.");
        }
    }


    }




/*Screens
• The Store Home Screen - The home screen should display a list
of options that a user can choose from.
o Show Available Books
o Show Checked Out Books
o Exit - closes out of the application
• Show Available Books - Displays a list of all books that are not
currently checked out. Display the Id, ISBN and Title of the book.
o Prompt the user to either select a book to check out, or exit to
go back to the home screen
o If the user wants to check out a book, prompt them for their
name
o Then check out the book
• Show Checked Out books - This displays a list of all the books
that are currently checked out. Display the Id, ISBN, Title and
Name of the person who has the book checked out. Prompt the
user to
o C - to Check In a book
o X - to go back to the home screen
• Check In a book - Prompt the user for the ID of the book they
want to check in.
o Check in the book with the specified id
o Go back to the home screen*/
