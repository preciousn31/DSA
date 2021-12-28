package ctci.arrays.strings;

public class ZeroMatrix {
    public static void main(String[] args) {
        ZeroMatrix zeroMatrix = new ZeroMatrix();
        zeroMatrix.resetMatrix(new int[][] {{1,2,3},{4,5,0}});

        zeroMatrix.resetMatrix(new int[][] {{1,2,0},{4,5,9}});
    }

    private void resetMatrix(int[][] array) {

        for(int i=0; i < array.length; i++){
            System.out.println("");
            for(int j=0; j < array[i].length; j++){
                int currentI = i;
                int currentJ = j;
                if(array[i][j] == 0){
                    while(i > 0){
                        array[--i][j] = 0;
                    }
                    while(j > 0){
                        array[i][--j] = 0;
                    }
                    while(currentI < array.length -1 && i <= array.length){
                        array[++i][j] = 0;
                    }
                    while(currentJ < array[i].length -1 && j <= array.length){
                        array[i][++j] = 0;
                    }
                }
                i = currentI;
                j = currentJ;

            }
        }
        for(int i=0; i < array.length; i++) {
            System.out.println("");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
        }
    }
}
