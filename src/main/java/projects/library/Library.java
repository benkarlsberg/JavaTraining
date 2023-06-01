package projects.library;

import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books;
    private List<LibraryMember> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<LibraryMember> getMembers() {
        return members;
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void removeBook(Book book) {
        if (books.remove(book)) {
            System.out.println("Book removed: " + book.getTitle());
        } else {
            System.out.println("Book not found: " + book.getTitle());
        }
    }

    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }
    }

    public void registerMember(LibraryMember member) {
        members.add(member);
        System.out.println("Member registered: " + member.getName());
    }

    public void displayAllMembers() {
        if (members.isEmpty()) {
            System.out.println("No members registered.");
        } else {
            System.out.println("Registered members:");
            for (LibraryMember member : members) {
                System.out.println(member.getId() + ": " + member.getName());
            }
        }
    }

    public void borrowBook(LibraryMember member, Book book) {
        if (books.contains(book)) {
            System.out.println("Book borrowed: " + book.getTitle() + " by " + book.getAuthor()
                    + " (Member: " + member.getName() + ")");
            books.remove(book);
        } else {
            System.out.println("Book not available: " + book.getTitle());
        }
    }

    public void returnBook(LibraryMember member, Book book) {
        books.add(book);
        System.out.println("Book returned: " + book.getTitle() + " by " + book.getAuthor()
                + " (Member: " + member.getName() + ")");
    }

    public void displayBorrowedBooks(LibraryMember member) {
        System.out.println("Borrowed books by " + member.getName() + ":");
        boolean found = false;
        for (Book book : books) {
            if (!books.contains(book)) {
                System.out.println(book.getTitle() + " by " + book.getAuthor());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No borrowed books.");
        }
    }
}
