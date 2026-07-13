package _09_2dArrays;

import java.util.ArrayList;
import java.util.List;

public class _16_Leetcode119 {
    class Solution {
        public List<Integer> getRow(int rowIndex) {

            List<Integer> row = new ArrayList<>();
            row.add(1);

            for (int i = 1; i <= rowIndex; i++) {

                List<Integer> newRow = new ArrayList<>();

                // First element
                newRow.add(1);

                // Middle elements
                for (int j = 1; j < i; j++) {
                    newRow.add(row.get(j - 1) + row.get(j));
                }

                // Last element
                newRow.add(1);

                // Update previous row
                row = newRow;
            }

            return row;
        }
    }
}
