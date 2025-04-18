package com.pluralsight;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public Book(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = "";
    }

    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public Book setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
        return this;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public Book setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
        return this;
    }

    public void checkOut(String name) {
        this.checkedOutTo = name;
        this.isCheckedOut = true;

    }

    public void checkIn() {
        this.checkedOutTo = "";
        this.isCheckedOut = false;

    }
}
/*• Create a Book class with appropriate getters, setters, constructors
and methods. The class should have the following properties:
o Properties
- id: int
- isbn: String
- title: String
- isCheckedOut: boolean
- checkedOutTo: String
o Methods
- checkOut(name)
- checkIn()
• Use an array to hold an inventory of at least 20 books of your
choice
• When a book is checked out
o the books checkedOutTo variable should be set to the
name provided
o the isCheckedOut variable should be set to true
3
• When a book is checked in
o the books checkedOutTo variable should be set to ""
o the isCheckedOut variable should be set to false*/