import java.util.Arrays;
import java.util.List;

public class Spiral_Matrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(mat));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int left = 0, right = n - 1, top = 0, down = m - 1;

        //Define result arr
        Integer[] res = new Integer[m * n];
        int index = 0;

        while(index < res.length){
            //Traverse right
            for(int i = left; i <= right && index < res.length; i++){
                res[index++] = matrix[top][i];
            }
            top++;
            //Traverse down
            for(int i = top; i <= down && index < res.length; i++){
                res[index++] = matrix[i][right];
            }
            right--;
            //Traverse left
            for(int i = right; i >= left && index < res.length; i--){
                res[index++] = matrix[down][i];
            }
            down--;
            //Traverse top
            for(int i = down; i >= top && index < res.length; i--){
                res[index++] = matrix[i][left];
            }
            left++;
        }
        return Arrays.asList(res);
    }
}
