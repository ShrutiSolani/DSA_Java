import java.util.*;

class Solution {
    public boolean solve(String[][] board, String word) {
        for(int i = 0;i < board.length;i++){
            StringBuilder str = new StringBuilder();
            for(int j = 0;j < board[0].length;j++){
                str.append(board[i][j]);
            }
            if(str.toString().contains(word)){
                return true;
            }
        }

        for(int i = 0;i < board[0].length;i++){
            StringBuilder str = new StringBuilder();
            for(int j = 0;j < board.length;j++){
                str.append(board[j][i]);
            }
            if(str.toString().contains(word)){
                return true;
            }
        }
        return false;
    }
}
