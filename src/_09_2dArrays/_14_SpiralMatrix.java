package _09_2dArrays;

import java.util.ArrayList;
import java.util.List;

public class _14_SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if(matrix.length == 0) return ans;
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        while(top <= bottom && left <= right){
            // right side jaa rhe hai
            for(int i=left; i<=right; i++){
                ans.add(matrix[top][i]);
            }
            top ++;
            // down jaa rhe hai
            for(int i=top; i<=bottom; i++){
                ans.add(matrix[i][right]);
            }
            right --;
            // left jaa rhe hai
            if(top <= bottom){
                for(int i=right; i>=left; i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom --;
            }
            // up jaa rhe hai
            if(left <= right){
                for(int i=bottom; i>=top; i--){
                    ans.add(matrix[i][left]);
                }
            }
            left ++;
        }
        return ans;
    }
}
