import java.util.Scanner;

public class Somatorio {
    
    public void imprimeSequencia(int n) {
        double soma = 0; 
        for (int i = 1; i <= n; i++) {
            double termo = 1.0 / i; 
            System.out.print(termo + " "); 
            soma += termo; 
        }
        System.out.println(); 
        System.out.println("Soma: " + soma); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("um número inteiro positivo (n): ");
        int n = scanner.nextInt(); 
       
        if (n > 0) {
            Somatorio somatorio = new Somatorio(); 
            somatorio.imprimeSequencia(n); 
        } else {
            System.out.println("um número inteiro positivo."); 
        }
        
        scanner.close(); 
    }
}
