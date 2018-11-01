
import java.util.Random;

public class Main {
    private static Random gerador = new Random();
    public static void main(String args[]) throws InterruptedException{
        
        //Observador
        policial policial = new policial();
        
        //Observador
        ladrao ladrao = new ladrao();
        
        ladrao.addObserver(policial);
        
        int m = gerador.nextInt(10) + 10;
        for(int i=0; i<m; i++){
            int a = gerador.nextInt(3);
            switch(a){
                case 0:
                    ladrao.frente();
                    break;
                case 1:
                    ladrao.direita();
                    break;
                case 2:
                    ladrao.esquerda();
                    break;
            }
            Thread.currentThread().sleep(500);
        }
        System.out.println("\nO ladrão foi pego !\n");
    }
}