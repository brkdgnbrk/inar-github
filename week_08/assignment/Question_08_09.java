package week_08.assignment;

import java.util.Scanner;

public class Question_08_09 {
    public static void main(String[] args) {
        char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        printBoard(board);

        Scanner input = new Scanner(System.in);
        char currentPlayer = 'X';

        boolean gameOn = true;

        while (gameOn) {
            System.out.print("Enter a row(0, 1, or 2) for player "+currentPlayer+" :");
            System.out.print("Enter a column(0, 1, or 2) for player "+currentPlayer+" :");
            int row = input.nextInt();
            int col = input.nextInt();

            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                board[row][col] = currentPlayer;
                printBoard(board);

                if (checkWin(board, currentPlayer)) {
                    System.out.println(currentPlayer+" player won");
                    gameOn = false;
                } else if (isBoardFull(board)) {
                    System.out.println("The game ended in a draw");
                    gameOn = false;
                } else {
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Invalid! Try again!");
            }
        }
    }

    public static void printBoard(char[][] board) {
        System.out.println("-------------");
        for (int i = 0; i < board.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    public static boolean checkWin(char[][] board, char currentPlayer) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
        }

        for (int j = 0; j < 3; j++) {
            if (board[0][j] == currentPlayer && board[1][j] == currentPlayer && board[2][j] == currentPlayer) {
                return true;
            }
        }

        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }

        return false;
    }

    public static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
