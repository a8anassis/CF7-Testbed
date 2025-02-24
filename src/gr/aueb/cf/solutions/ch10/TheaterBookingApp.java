package gr.aueb.cf.solutions.ch10;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A Theater booking app that prints a menu with choices for the user.
 * The user can choose to book a seat or cancel a previously booked seat
 * by entering the column and the row.
 */
public class TheaterBookingApp {
    private static final int ROWS = 26;
    private static final int COLUMNS = 12;
    private static final boolean[][] seats = new boolean[ROWS][COLUMNS];

    public static void main(String[] args) {
        runTheaterApp();
        //printTheater();
    }

    public static void runTheaterApp() {
        Scanner in = new Scanner(System.in);
        int choice = 0;
        do {
            printTheaterMenu();
            choice = selectFromMenu(seats, in);
        } while(choice != 3);
    }

    /**
     * Selects a choice from the Menu and either books or cancels a seat.
     * @param seats The array of seats.
     * @param in    The user input.
     * @return
     *      the user's choice
     */
    public static int selectFromMenu(boolean[][] seats, Scanner in) {
        int choice = 0;
        int row = 0;
        char col;
        try {
            choice = in.nextInt();
            if (choice < 1 || choice > 3) {
                System.out.println("Please insert a valid choice.");
                in.nextLine();
                choice = getUserInput();
            }
            switch(choice) {
                case 1:
                    System.out.println("Enter a column between A - L, and a row between 1-30.");
                    String inputChoice = in.next();
                    col = inputChoice.charAt(0);
                    row = Integer.parseInt(Character.toString(inputChoice.charAt(1))) ;

                    if (col < 'A' || col > 'Z' || row < 1 || row > 12) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    book(seats, col, row);
                    printTheater();
                    break;
                case 2:
                    System.out.println("Cancel a booked seat.");
                    String inputChoice2 = in.next();
                    col = inputChoice2.charAt(0);
                    row = Integer.parseInt(Character.toString(inputChoice2.charAt(1))) ;

                    if (col < 'A' || col > 'Z' || row < 1 || row > 12) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    cancel(seats, col, row);
                    printTheater();
                    break;
                case 3:
                    System.out.println("Thank you for using our program.");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Please insert a valid choice.");
            in.nextLine();
            printTheaterMenu();
            choice = getUserInput();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please insert a valid choice, between A-L for column and 1-30 for row.");
            in.nextLine();
            printTheaterMenu();
            choice = getUserInput();
        }
        return choice;
    }

    /**
     * Gets the user's input.
     * @return
     *      the user's input
     */
    public static int getUserInput() {
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            return in.nextInt();
        }else {
            System.out.println("Enter a number between 1 and 5");
            in.nextLine();
        }
        return in.nextInt();
    }

    /**
     * Prints the Theater menu
     */
    public static void printTheaterMenu() {
        System.out.println("Welcome to our Theater! Please choose an option:");
        System.out.println("1. Book a seat.");
        System.out.println("2. Cancel a booking.");
        System.out.println("3. Exit.");
    }

    /**
     * Books a seat by referencing its column and row number from a range
     * of available unbooked seats.
     * @param seats  The theater seats.
     * @param column The column of choice.
     * @param row    The row number.
     */
    public static void book(boolean[][]seats, char column, int row) {
        try {
            /*
             Offset rows by -1 in order to be able to book seats starting from number 1 to 30,
             and also offset columns by -65, in order to be able to use chars A through L.
             I did the same for the cancel method below.
            */
            if (seats[column - 65][row - 1]) {
                System.out.printf("Seat %c%d is already booked.\n",column,row);

            } else {
                seats[column - 65][row -1 ] = true;
                System.out.printf("Booked a reservation for seat %c%d. \n",column,row);
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Cancels a previously booked seat.
     *
     * @param seats  The theater seats.
     * @param column The column of choice.
     * @param row    The row number.
     */
    public static void cancel(boolean[][]seats, char column, int row) {
        if (seats[column - 65][row - 1]) {
            seats[column - 65][row - 1] = false;
            System.out.printf("Cancelled reservation for seat %c%d.\n",column,row);
        } else {
            System.out.printf("Seat %c%d is not booked.\n",column,row);
        }
    }


    public static void printTheater() {
        for (char i = 65; i <= 90; i++) {
            for (int j = 1; j <= 12; j++) {
                String s = String.format("%c%d", (char) i, j);
                System.out.printf("%s(%s) ", s, (isBooked(i, j) ? "Booked" : "Free"));
            }
            System.out.println();
        }
    }

    public static boolean isBooked(int i, int j) {
        return seats[i-65][j-1];
    }
}

