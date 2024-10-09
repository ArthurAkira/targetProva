package ex2;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        int fibonacci = 0;  
        int anterior = 0;
        Scanner sc = new Scanner(System.in);
        int numInformado = sc.nextInt();

        for (int i = 0; i != -1 ; i++) {
            if(i == 1){
                fibonacci = 1;
                anterior = 0;
            }else{
                fibonacci = anterior + fibonacci;
                anterior = fibonacci - anterior;
                if(numInformado == fibonacci){
                    System.out.println("pertence a sequencia fibonacci");
                    break;
                }
                if(numInformado < fibonacci){
                    System.out.println("não pertence a sequencia fibonacci");
                    break;
                }
            }
        }
    }
}
