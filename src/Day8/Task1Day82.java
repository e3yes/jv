package Day8;

public class Task1Day82 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder strbd = new StringBuilder();
        for(int i =0;i<=20000;i++){
            strbd.append(i + " ");
        }
        System.out.print(strbd);
        long stopTime = System.currentTimeMillis();
        long lol = stopTime-startTime;
        System.out.println();
        System.out.println("Длительность работы в мс = "+lol);
    }
}
