package Recursion.BackTracking;

import java.util.Scanner;

/**
 * knights_tour
 */
public class knights_tour {

    public static void main(String[] args) throws Exception {
        Scanner  br = new Scanner (System.in);
        int n = br.nextInt();
        int r = br.nextInt();
        int c = br.nextInt();

        int[][] chess = new int[n][n];
        printKnightsTour(chess, r, c, 1);
    }

    public static void printKnightsTour(int[][] chess, int r, int c, int moveCount){
        if(r < 0 || c < 0 || r >= chess.length || c >= chess.length || chess[r][c] != 0){
            return;
        } else if(moveCount == chess.length * chess.length){
            chess[r][c] = moveCount;
            displayBoard(chess);
            chess[r][c] = 0;    
            return;
        }

        chess[r][c] = moveCount;
        printKnightsTour(chess, r - 2, c + 1, moveCount + 1);
        printKnightsTour(chess, r - 1, c + 2 , moveCount + 1);
        printKnightsTour(chess, r + 1, c + 2 , moveCount + 1);
        printKnightsTour(chess, r + 2, c + 1 , moveCount + 1);
        printKnightsTour(chess, r + 2, c - 1 , moveCount + 1);
        printKnightsTour(chess, r + 1, c - 2 , moveCount + 1);
        printKnightsTour(chess, r - 1, c - 2 , moveCount + 1);
        printKnightsTour(chess, r - 2, c - 1 , moveCount + 1);
        chess[r][c] = 0;
    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
    
}