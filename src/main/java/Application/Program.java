package Application;

import Services.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>();

        System.out.println("Quantos numeros vamos digitar: ");
        int n = sc.nextInt();
        for(int i =0; i < n; i++){
            int value = sc.nextInt();
            ps.addValue(value);
        }
        ps.print();
        System.out.println("O primeiro numero é: " + ps.firstNum());
    }
}
