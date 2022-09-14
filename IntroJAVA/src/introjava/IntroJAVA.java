package introjava;

import static java.lang.System.in;
import java.util.Scanner;


public class IntroJAVA {
    public static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        int op;
        do{
            System.out.println( "MENU CONVERSÕES");
            System.out.println("1 - Comprimento");
            System.out.println("2 - Pesos");
            System.out.println("3 - Moedas");
            System.out.println("4 - SAIR");
            System.out.println("Escolha a opção pretendida");
        
        
        op = ler.nextInt();
        
        if(op == 1)
            converteComprimento();
        else if (op == 2)
            convertePesos();
        else if (op == 3)
            converteMoedas();
        else if (op!=4)
            System.out.println("Escolha uma opção válida");
}while(op!=4);
        
        
        
    }
    private static void converteComprimento() {
    }
   
    private static void convertePesos() {
      
    }
    private static void converteMoedas() {
     
    }
}
