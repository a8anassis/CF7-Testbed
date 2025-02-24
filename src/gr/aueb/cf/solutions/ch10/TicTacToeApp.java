package gr.aueb.cf.solutions.ch10;

import java.util.Arrays;
import java.util.Scanner;

/**
 * A simple Tic-Tac-Toe game for two players.
 */
public class TicTacToeApp {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        char[] gameBoard = new char[9];
        Arrays.fill(gameBoard, ' ');
        char playerOne = ' ';
        char playerTwo = ' ';

        System.out.println("Welcome to Tic-Tac-Toe!");


        try {
            playerOne = getPlayerOne(playerOne);
            playerTwo = getPlayerTwo(playerOne);
            System.out.println("Player one plays with: " + playerOne);
            System.out.println("Player two plays with: " + playerTwo);
            displayBoard(gameBoard);

            do {
                System.out.println(playerOne + "'s turn: choose a position from 1-9");
                getPosition(gameBoard, playerOne);
                displayBoard(gameBoard);
                if (gameOver(gameBoard, playerOne, playerTwo)) break;

                System.out.println(playerTwo + "'s turn: choose a position from 1-9");
                getPosition(gameBoard, playerTwo);
                displayBoard(gameBoard);
            } while (!gameOver(gameBoard, playerOne, playerTwo));

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

    /**
     * Displays the board in the console.
     *
     * @param gameBoard The char[] used for the game.
     */
    public static void displayBoard(char[] gameBoard) {
        System.out.println(gameBoard[0] + " | " + gameBoard[1] + " | " + gameBoard[2]);
        System.out.println("---------");
        System.out.println(gameBoard[3] + " | " + gameBoard[4] + " | " + gameBoard[5]);
        System.out.println("---------");
        System.out.println(gameBoard[6] + " | " + gameBoard[7] + " | " + gameBoard[8]);
    }

    /**
     * Gets the mark choice for player one, 'X' or 'O'.
     *
     * @param playerOne the player to be assigned with a mark.
     * @return          the mark that playerOne will play with.
     */
    public static char getPlayerOne(char playerOne) {
        System.out.println("Player one please pick 'X' or 'O' ");
        while (playerOne != 'X' && playerOne != 'O') {
            playerOne = in.nextLine().toUpperCase().charAt(0);
            if (playerOne != 'X' && playerOne != 'O') {
                System.out.println("Please pick either X or O");
            }
        }
        return playerOne;
    }

    /** Assigns the remaining mark to player two.
     *
     * @param playerOne the mark player one has chosen.
     * @return the mark that remains for player two.
     */
    public static char getPlayerTwo(char playerOne) {
        if (playerOne == 'X') return 'O';
        else return 'X';
    }

    /**
     * Checks for victory conditions for either player
     *
     * @param gameBoard the char[] used for the game
     * @param player    the player to check for
     * @return          true if the player has won, false otherwise
     */
    public static boolean isVictory(char[] gameBoard, char player) {
        return ((gameBoard[0] == player) && (gameBoard[1] == player) && (gameBoard[2] == player)) ||
                ((gameBoard[3] == player) && (gameBoard[4] == player) && (gameBoard[5] == player)) ||
                ((gameBoard[6] == player) && (gameBoard[7] == player) && (gameBoard[8] == player)) ||
                ((gameBoard[0] == player) && (gameBoard[3] == player) && (gameBoard[6] == player)) ||
                ((gameBoard[1] == player) && (gameBoard[4] == player) && (gameBoard[7] == player)) ||
                ((gameBoard[2] == player) && (gameBoard[5] == player) && (gameBoard[8] == player)) ||
                ((gameBoard[0] == player) && (gameBoard[4] == player) && (gameBoard[8] == player)) ||
                ((gameBoard[2] == player) && (gameBoard[4] == player) && (gameBoard[6] == player));
    }

    /**
     * Assigns a mark to a position on the board.
     *
     * @param gameBoard the char[] used for the game.
     * @param player    the player whose turn it is to place a mark.
     */
    public static void getPosition(char[] gameBoard, char player) {
        int position = 1;
        do {

            try {
                position = Integer.parseInt(in.nextLine());
                if (position < 1 || position > 9) {
                    throw new IllegalArgumentException("Please enter a number from 1-9");
                }
                if (gameBoard[position - 1] != ' ') {
                    throw new IllegalArgumentException("Position is occupied. Please choose another position");
                } else {
                    gameBoard[position - 1] = player;
                    break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        } while (gameBoard[position - 1] != ' ');
//        } while (position < 1 || position > 9);

    }

    /**
     * Checks if the board is full.
     *
     * @param gameBoard the char[] used for the game.
     * @return          true if the board is full, false otherwise.
     */
    public static boolean fullBoard(char[] gameBoard) {
        for (char c : gameBoard) {
            if (c == ' ') {
                return false;
            }
        }
        return true;
    }

    /** Checks for end of game conditions (victory or draw)
     *
     * @param gameBoard the char[] used for the game
     * @param playerOne First player
     * @param playerTwo second player
     * @return  True and a message if the game has ended, False otherwise
     */
    public static boolean gameOver(char[] gameBoard, char playerOne, char playerTwo) {
        boolean gameOver = false;

        if (isVictory(gameBoard, playerOne)) {
            System.out.println(playerOne + "'s win!");
            gameOver = true;
        } else if (isVictory(gameBoard, playerTwo)) {
            System.out.println(playerTwo + "'s win!");
            gameOver = true;
        } else if (fullBoard(gameBoard)) {
            System.out.println("Game ended in a draw");
            gameOver = true;
        }
        return gameOver;
    }
}

