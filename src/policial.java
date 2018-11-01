
import java.util.Observable;
import java.util.Observer;
//Observador
public class policial implements Observer, acoes {

    @Override
    public void update(Observable observado, Object acao_observado) {
        //ladrao ladrao = (ladrao)observado;
        String acao = String.valueOf(acao_observado);
        
        if(acao.equals("frente")){
            this.frente();
        }
        if(acao.equals("esquerda")){
            this.esquerda();
        }
        if(acao.equals("direita")){
            this.direita();
        }
    }

    @Override
    public void frente() {
        System.out.println("Policial segue em frente\n");
    }

    @Override
    public void direita() {
        System.out.println("Policial vira a direita\n");
    }

    @Override
    public void esquerda() {
        System.out.println("Policial vira a esquerda\n");
    }
}
