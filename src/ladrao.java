
import java.util.Observable;
//Observado                                
public class ladrao extends Observable implements acoes{
    
    String acao = "";
    @Override
    public void frente() {
        acao = "frente";
        System.out.println("Ladrão segue em frente");
        this.mudaEstado();
    }

    @Override
    public void direita() {
        acao = "direita";
        System.out.println("Ladrão vira a direita");
        this.mudaEstado();
    }

    @Override
    public void esquerda() {
        acao = "esquerda";
        System.out.println("Ladrão vira a esquerda");
        this.mudaEstado();
    }
    
    public void mudaEstado(){
        setChanged();//Mudança de estado
        notifyObservers(acao);//Mostra aos observadores
    }
}
