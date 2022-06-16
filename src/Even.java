import java.util.Random;

public class Even {
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;

        Random ran = new Random();
                for (int i=1; i<=100; i++){
                    if (ran.nextInt() % 2 == 0) {
                        even++;
                    }
                    else {
                        odd++;
                    }
                }
        System.out.println(even);
        System.out.println(odd);

       if (even >= odd){
           System.out.println("Even win");}
       else if (odd >= even){
           System.out.println("Odd win");}
       else {
           System.out.println("EMPATE");}
       }

}