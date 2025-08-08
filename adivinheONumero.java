
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        int numeroEscondido = random.nextInt(51);
        boolean acertou = false;
        int tentativa = 5;
            
        System.out.println("Adivinhe um numero inteiro de 0 ate 50: ");
            
        for(int i = 5; i>0; i--){
            int numeroTentativa = sc.nextInt();
            tentativa = tentativa - 1;
            
            if(numeroTentativa == numeroEscondido){
                System.out.println("Parabens,voce acertou!!");
                acertou = true;
                break;
            } else if(numeroTentativa < numeroEscondido && tentativa > 0){
                System.out.println("Chute um numero maior! Voce tem " + tentativa + " tentativas");
            } else if(numeroEscondido < numeroTentativa && tentativa > 0){
                System.out.println("Chute um numero menor! Voce tem " + tentativa + " tentativas");
            }
        }
        
        if(!acertou){
            System.out.println("Suas chances acabaram! O numero era: " + numeroEscondido);
        }
        sc.close();
    }
}
