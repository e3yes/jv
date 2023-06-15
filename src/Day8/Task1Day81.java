package Day8;

public class Task1Day81 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String numbers = null;
        for(int n=0;n<=20000;n++){
            numbers = numbers + " " + n;
        }
        System.out.print(numbers);
        long stopTime = System.currentTimeMillis();
        long lol = stopTime-startTime;
        System.out.println();
        System.out.println("Длительность работы в мс = "+lol);
    }
}
