package matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> list = new ArrayList<>();
            if(matrix.length == 0) return list;
            int rowBegin = 0;
            int rowEnd = matrix.length - 1;
            int columnBegin = 0;
            int columnEnd = matrix[0].length - 1;
            while(rowBegin <= rowEnd && columnBegin <= columnEnd){
                for(int i=columnBegin; i <= columnEnd; i++){
                    list.add(matrix[rowBegin][i]);
                }
                rowBegin++;
                for(int i=rowBegin; i <= rowEnd; i++){
                    list.add(matrix[i][columnEnd]);
                }

                columnEnd--;
                if(rowBegin <= rowEnd){
                    for(int i=columnEnd; i >= columnBegin; i--){
                        list.add(matrix[rowEnd][i]);
                    }
                    rowEnd--;
                }
                if(columnBegin <= columnEnd){
                    for(int i=rowEnd; i >= rowBegin; i--){
                        list.add(matrix[i][columnBegin]);
                    }
                    columnBegin++;
                }
            }
            return list;
        }
}
