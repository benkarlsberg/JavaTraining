package projects.library;

import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add a book");
            System.out.println("2. Remove a book");
            System.out.println("3. Display all books");
            System.out.println("4. Register a member");
            System.out.println("5. Display all members");
            System.out.println("6. Borrow a book");
            System.out.println("7. Return a book");
            System.out.println("8. Display borrowed books by member");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(title, author));
                    break;
                case 2:
                    System.out.print("Enter book title to remove: ");
                    String removeTitle = scanner.nextLine();
                    Book bookToRemove = null;
                    for (Book book : library.getBooks()) {
                        if (book.getTitle().equalsIgnoreCase(removeTitle)) {
                            bookToRemove = book;
                            break;
                        }
                    }
                    if (bookToRemove != null) {
                        library.removeBook(bookToRemove);
                    } else {
                        System.out.println("Book not found: " + removeTitle);
                    }
                    break;
                case 3:
                    library.displayAllBooks();
                    break;
                case 4:
                    System.out.print("Enter member name: ");
                    String memberName = scanner.nextLine();
                    System.out.print("Enter member ID: ");
                    int memberId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter member contact details: ");
                    String contactDetails = scanner.nextLine();
                    library.registerMember(new LibraryMember(memberName, memberId, contactDetails));
                    break;
                case 5:
                    library.displayAllMembers();
                    break;
                case 6:
                    System.out.print("Enter member ID: ");
                    int borrowMemberId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter book title to borrow: ");
                    String borrowTitle = scanner.nextLine();
                    Book borrowBook = null;
                    for (Book book : library.getBooks()) {
                        if (book.getTitle().equalsIgnoreCase(borrowTitle)) {
                            borrowBook = book;
                            break;
                        }
                    }
                    if (borrowBook != null) {
                        LibraryMember borrowMember = null;
                        for (LibraryMember member : library.getMembers()) {
                            if (member.getId() == borrowMemberId) {
                                borrowMember = member;
                                break;
                            }
                        }
                        if (borrowMember != null) {
                            library.borrowBook(borrowMember, borrowBook);
                        } else {
                            System.out.println("Member not found with ID: " + borrowMemberId);
                        }
                    } else {
                        System.out.println("Book not found: " + borrowTitle);
                    }
                    break;
                case 7:
                    System.out.print("Enter member ID: ");
                    int returnMemberId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter book title to return: ");
                    String returnTitle = scanner.nextLine();
                    Book returnBook = null;
                    for (Book book : library.getBooks()) {
                        if (book.getTitle().equalsIgnoreCase(returnTitle)) {
                            returnBook = book;
                            break;
                        }
                    }
                    if (returnBook != null) {
                        LibraryMember returnMember = null;
                        for (LibraryMember member : library.getMembers()) {
                            if (member.getId() == returnMemberId) {
                                returnMember = member;
                                break;
                            }
                        }
                        if (returnMember != null) {
                            library.returnBook(returnMember, returnBook);
                        } else {
                            System.out.println("Member not found with ID: " + returnMemberId);
                        }
                    } else {
                        System.out.println("Book not found: " + returnTitle);
                    }
                    break;
                case 8:
                    System.out.print("Enter member ID: ");
                    int displayMemberId = scanner.nextInt();
                    scanner.nextLine();
                    LibraryMember displayMember = null;
                    for (LibraryMember member : library.getMembers()) {
                        if (member.getId() == displayMemberId) {
                            displayMember = member;
                            break;
                        }
                    }
                    if (displayMember != null) {
                        library.displayBorrowedBooks(displayMember);
                    } else {
                        System.out.println("Member not found with ID: " + displayMemberId);
                    }
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);
    }
}
