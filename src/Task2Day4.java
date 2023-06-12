import java.util.Random;
public class Task2Day4 {
    public static void main(String[] args){
        Random rand = new Random();
        int[] a = new int[100];
        for(int i=0;i<100;i++){
            a[i] = rand.nextInt(10000);
        }
        int max = a[0];
        int min = a[0];
        int ten = 0;
        int summ = 0;
        for(int value:a){
            if(value>max){
                max = value;
            } else if(value < min){
                min = value;
            }
            if(value%10==0){
                ten+=1;
                summ+=value;
            }
        }
        System.out.println("Min = "+min+" Max = "+max);
        System.out.println("Ten = "+ten+" Summa = "+summ);
    }
}
