import java.util.Scanner;
public class JavaLoop {
public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();

        for(int c = 1; c<=10; c++){
            int r = n * c;
            System.out.println(n + " x " + c + " = " + r);
        }
    }


}