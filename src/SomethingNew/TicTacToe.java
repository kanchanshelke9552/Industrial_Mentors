package SomethingNew;

import java.util.Scanner;
//               0   1   2
//            0  X  | X  | O
//            1  O  | X  | O
//            2  X  | O  | X
//
//            player X Winner....

public class TicTacToe {
    public static void main(String[] args) {
        char[][] ticTacToe = new char[3][3];
        for (int row = 0; row < ticTacToe.length; row++) {
            for (int col = 0; col < ticTacToe[row].length; col++) {
                ticTacToe[row][col] = ' ';
            }
        }


        char player1 = 'X';
        char player2 = 'O';
        boolean gameOver = false;
        Scanner sc = new Scanner(System.in);

        while (!gameOver){
            printBoard(ticTacToe);
        }

    }
    public static void printBoard(char[][] board){

    }
}

