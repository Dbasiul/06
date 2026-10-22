package lt.vcd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Iveskite N: ");
        int n = sc.nextInt();
        
        System.out.println("Pirminiai skaiciai:");
        for (int i = 2; i <= n; i++) {
            boolean arPirminis = true;
            
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    arPirminis = false;
                    break;
                }
            }
            
            if (arPirminis) {
                System.out.print(i + " ");
            }
        }
    }
}
