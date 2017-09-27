package EightQueen;

import java.util.Random;

/**
 * @author kavunnuggihalli
 * @param <E>
 */
public class Board<E>{
    
    //Declare board
    public static String [][] board = new String[8][8];
    public static int numQueens = 0;
    public static Random rand = new Random();
    public static Stack<Integer> takenx = new Stack<>();
    public static Stack<Integer> takeny = new Stack<>();
    
    public static void main(String [] args){
        loadBoard();//load the chess board with all values
        takenx.push(0);//Load first cordinate
        takeny.push(0);//load first cordinate

        
                int num1 = 0;//from 0-7
                int num2 = 0;//from 0-7
                
                if(!"[ * ]".equals(board[num1][num2]) || !"[ Q ]".equals(board[num1][num2])){
                   Queen queen = new Queen(num1,num2); 
                   takenx.push(num1);
                   takeny.push(num2);
                   board[num1][num2] = "[ "+queen.getQueen()+" ]"; 
                   fill(num1,num2,"*"); 
                   numQueens++;
                }
        
        
        displayBoard();//Display the chessboard with queens
    }//End of main
    
    public static void displayBoard(){//Display chess board
        for(int i=0;i<8;i++){
            for(int y=0;y<8;y++){
                System.out.print(board[i][y]);
            }
            System.out.println("");
        }
    }//end of display board

    private static void loadBoard(){//Load chess board
        for(int i=0;i<8;i++){
            for(int y=0;y<8;y++){
                board[i][y] = "["+i+","+y+"]";
            }
        }
    }//end of load board
    
    public static void fill(int x, int y, String z){//Display chess board
       boolean goDown = false;
       boolean goUp = false;
       boolean goLeft = false;
       boolean goRight = false;
       boolean dLeft = false;
       boolean dRight = false;
       boolean sLeft = false;
       boolean sRight = false;
       
       
       int xval = x;
       int yval = y;
        
       if(x<7){
         while(goDown == false){
           try{
             if(!"[ * ]".equals(board[xval+1][yval]) || !"[ Q ]".equals(board[xval+1][yval])){  
                board[xval+1][yval] = "[ "+z+" ]";//mark all verticals down 
             }
                xval++;
             
           }catch(Exception a){
             goDown = true;
           }
         }  
       }
       
       xval = x;
       yval = y;
       
       if(x>0){
         while(goUp == false){
           try{
             if(!"[ * ]".equals(board[xval-1][yval]) || !"[ Q ]".equals(board[xval-1][yval])){
             board[xval-1][yval] = "[ "+z+" ]";//mark all verticals down  
             }
             xval--;
             
           }catch(Exception a){
             goUp = true;
           }
         }  
       }
       
       xval = x;
       yval = y;
       
       if(x>0){
         while(goLeft == false){
           try{
             if(!"[ * ]".equals(board[xval][yval-1]) || !"[ Q ]".equals(board[xval][yval-1])){
                board[xval][yval-1] = "[ "+z+" ]";//mark all verticals down  
             }
                yval--;
             
           }catch(Exception a){
             goLeft = true;
           }
         }  
       }
        
       xval = x;
       yval = y;
       
       if(x>0){
         while(goRight == false){
           try{
             if(!"[ * ]".equals(board[xval][yval+1]) || !"[ Q ]".equals(board[xval][yval+1])){
                board[xval][yval+1] = "[ "+z+" ]";//mark all verticals down  
             }
                yval++;
             
           }catch(Exception a){
             goRight = true;
           }
         }  
       }
       
       xval = x;
       yval = y;
       
       if(x>0){
         while(dRight == false){
           try{
             if(!"[ * ]".equals(board[xval+1][yval+1]) || !"[ Q ]".equals(board[xval+1][yval+1])){
             board[xval+1][yval+1] = "[ "+z+" ]";//mark all verticals down  
             }
             yval++;
             xval++;
           }catch(Exception a){
             dRight = true;
           }
         }  
       }
       
       xval = x;
       yval = y;
       
       if(x>0){
         while(dLeft == false){
           try{
             if(!"[ * ]".equals(board[xval-1][yval-1]) || !"[ Q ]".equals(board[xval-1][yval-1])){
             board[xval-1][yval-1] = "[ "+z+" ]";//mark all verticals down  
             }
             yval--;
             xval--;
           }catch(Exception a){
             dLeft = true;
           }
         }  
       }
         
       xval = x;
       yval = y;
       
       if(x>0){
         while(sLeft == false){
           try{
             if(!"[ * ]".equals(board[xval-11][yval+1]) || !"[ Q ]".equals(board[xval-1][yval+1])){
             board[xval-1][yval+1] = "[ "+z+" ]";//mark all verticals down 
             }
             yval++;
             xval--;
           }catch(Exception a){
             sLeft = true;
           }
         }  
       }
       
       xval = x;
       yval = y;
       
       if(x>0){
         while(sRight == false){
           try{
             if(!"[ * ]".equals(board[xval+1][yval-1]) || !"[ Q ]".equals(board[xval+1][yval-1])){
             board[xval+1][yval-1] = "[ "+z+" ]";//mark all verticals down  
             }
             yval--;
             xval++;
           }catch(Exception a){
             sRight = true;
           }
         }  
       }
  
    }//end of display board
    
}//end of class
