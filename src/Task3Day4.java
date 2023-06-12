import java.util.Random;
public class Task3Day4{
    public static void main(String[] args) {
        int[][] matrix = new int[12][8];
        Random rand = new Random();
        for(int i=0;i<matrix.length;i++){
            for(int f = 0; f < matrix[i].length; f++){
                matrix[i][f] = rand.nextInt(50);
            }
        }
        int maxSum = 0;
        int maxSumIndex = 0;
        for(int i = 0;i<matrix.length;i++){
            int summ = 0;
            for (int f = 0;f<matrix[i].length;f++){
                summ+=matrix[i][f];
            }
            if (summ>=maxSum){
                maxSum = summ;
                maxSumIndex = i;
            }
        }
        System.out.println(maxSumIndex);
    }
}