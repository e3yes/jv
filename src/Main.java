import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        int[][] heroes = {{0,1,2},{6,3,7},{9,5,4}};

        Scanner sc = new Scanner(System.in);
        int choosen = 0;
        do{
            System.out.println("Choose your hero in matrix");
            System.out.println("Enter a number hero");
            for(int[] x:heroes){
                for(int f:x){
                    System.out.print(f + " ");
                }
                System.out.println();
            }
            choosen = sc.nextInt();
            if(choosen != 6){
                System.out.println("Your hero is so weak");
            } else {
                System.out.println("Your Hero is a Pudge! You are win");
                break;
            }
        } while(choosen != 6);
    }
}