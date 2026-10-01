package _26_BackTracking;

public class _05_LC2596KnightTour {
    /*

    Aapko ek n × n chessboard diya hai jisme numbers 0 se n² - 1 tak hain.
    Aapko check karna hai ki kya Knight exactly is order mein move kar sakta hai:

       Grid
         ↓
        pos[value] = {row, col}
         ↓
        pos[0] → pos[1]
         ↓
        pos[1] → pos[2]
         ↓
        ...
         ↓
        pos[n²-2] → pos[n²-1]
         ↓
        har move Knight ka valid move?
         ↓
        YES → true
        NO  → false


         0 par ho
             ↓
            8 possible moves check karo
             ↓
            kya kisi move par 1 hai?
             ↓
            YES → wahan jao
             ↓
            8 moves check karo
             ↓
            kya kisi move par 2 hai?
             ↓
            YES → wahan jao
             ↓
            ...
             ↓
            n² - 1 tak
             ↓
            true
*/


    class Solution {
        public boolean checkValidGrid(int[][] grid) {
            int n = grid.length;
            // up right, up left, down right, down left, right up, right down, left up, left down
            int[] dRow = {-2, -2, 2, 2, -1, 1, -1, 1};
            int[] dCol = {1, -1, 1, -1, 2, 2, -2, -2};
            // 0 se start karna chaiye
            if(grid[0][0] != 0) return false;
            int row = 0;
            int col = 0;
            // 1, 2, 3 ... n²-1 find karenge
            for(int i=0; i<n*n-1; i++){
                boolean found = false;
                for(int j=0; j<8; j++){
                    int newRow = row + dRow[j];
                    int newCol = col + dCol[j];
                    // to check board ke andar hai
                    if(newRow>=0 && newRow<n && newCol>=0 && newCol<n){
                        // kya yha next number hai
                        if(grid[newRow][newCol]==i+1){
                            row = newRow; // moving knight
                            col = newCol;
                            found = true;
                            break;
                        }
                    }
                }
                if(!found) return false; // it means nahi mila
            }
            return true;
        }
    }
}
