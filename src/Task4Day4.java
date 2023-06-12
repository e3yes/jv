import java.util.Random;
public class Task4Day4 {
    public static void main(String [] args){
        int[] array = new int[100];
        Random rand = new Random();
        for(int i = 0;i<array.length;i++){
            array[i] = rand.nextInt(10000);
        }
        int maxSumm = 0;
        int indx = 0;
        for (int i = 0;i<array.length - 2; i++){
            int summ = 0;
            for(int f = i;f<i+3;f++){
                summ += array[f];
            }
            if(summ > maxSumm){
                maxSumm = summ;
                indx = i;
            }
        }
        System.out.println("Max summ = "+maxSumm + " Index 3 = "+indx);

    }
}
