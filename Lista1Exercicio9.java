package lista1exercicio9;

import java.util.Scanner;

public class Lista1Exercicio9 {

    public static void main(String[] args) {
       
        System.out.println("Sistema para calcular valor do dolar no dia");
        
        Float VAL_REAL, VAL_DOLAR, COT;
        
        System.out.println("Digite o valor dos Dolar dentro do cofre: ");
        Scanner teclado = new Scanner (System.in);
        VAL_DOLAR = teclado.nextFloat();
        System.out.println("Digite a cotação do dolar do dia");
        COT = teclado.nextFloat();
        
        VAL_REAL = (VAL_DOLAR*COT);
        
        System.out.println("O valor em reais dos dolares guardados no cofre é de: " +VAL_REAL);
     
    }
    
}
