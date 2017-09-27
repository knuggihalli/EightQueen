/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EightQueen;

/**
 *
 * @author kavunnuggihalli
 */
public class EightQueen {

    public static int col = 0;
    public static String[][] board = new String[8][8];
    public static int[] except = new int[8];
    public static int index = 0;
    public static int progress = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            except[i] = -8;
        }
        int first = answer();
        System.out.println("");
        System.out.println("Number Queens: " + first);
    }

    private static int answer() {
        loadBoard();//load the chess board with all values
        solve(col);
        displayBoard();//Display the chessboard with queens
        return progress;
    }

    private static void loadBoard() {
        for (int i = 0; i < 8; i++) {
            except[i] = -8;
            for (int y = 0; y < 8; y++) {
                board[i][y] = "[" + i + "," + y + "]";
            }
        }
    }//end of load board

    private static void displayBoard() {//Display chess board
        for (int i = 0; i < 8; i++) {
            for (int y = 0; y < 8; y++) {
                System.out.print(board[i][y]);
            }
            System.out.println("");
        }
    }//end of display board

    private static boolean solve(int col) {
if(col>=8){
    return true;
}
        for (int i = 0; i <= 7; i++) {
            boolean canPlace = canPlaceHere(i, col);
            //System.out.println(""+i+","+col+" can:"+canPlace);//Debug can place
            //System.out.println(except[col]);
            if (canPlace == true && except[col] != i) {
                board[i][col] = "  ♛  ";
                except[col] = i;
                //System.out.println(except[col]+" "+col);
                if(solve (col +1)){
                    return true;
                }
                removeQCol(col);

            }
        }

        return false;
    }

    private static void removeQCol(int col) {
        for (int i = 0; i <= 7; i++) {
            board[i][col] = "[" + i + "," + col + "]";
        }
    }

    private static boolean canPlaceHere(int x, int y) {
        int check = 0;
        boolean checkDiagUp = false;
        boolean checkDiagDown = false;

        for (int i = y; i >= 0; i--) {//check left
            if ("  ♛  ".equals(board[x][i]) || "  *  ".equals(board[x][i])) {
                check++;
            }
        }

        int xval = x;
        int yval = y;
        while (checkDiagUp == false) {
            try {
                if ("  ♛  ".equals(board[xval][yval]) || "  *  ".equals(board[xval][yval])) {
                    check++;
                }
                xval--;
                yval--;
            } catch (Exception a) {
                checkDiagUp = true;
            }
        }

        int xv = x;
        int yv = y;
        while (checkDiagDown == false) {
            try {
                if ("  ♛  ".equals(board[xv][yv]) || "  *  ".equals(board[xv][yv])) {
                    check++;
                }
                xv++;
                yv--;
            } catch (Exception a) {
                checkDiagDown = true;
            }
        }

        return check == 0;
    }

}
