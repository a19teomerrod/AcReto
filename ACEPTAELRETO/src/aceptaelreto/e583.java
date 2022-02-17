package aceptaelreto;
import java.util.Scanner;
public class e583 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casos = scan.nextInt();        
        for (int i = casos; i > 0; i--) {
            long  gp1 = scan.nextInt(); 
            long  gp2 = scan.nextInt(); 
            long resu = 100 * (gp1-gp2)/(gp1+gp2);
            System.out.println(resu);
        }
    }
}
