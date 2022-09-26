import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args)throws IOException {

        List<Ponto2D> listPonto = new ArrayList<>();
        List<Linha2D> listLinha = new ArrayList<>();
        List<String> listFileN = new ArrayList<>();
        listFileN = new File().List("figura1.n");

        var sizePoints = Integer.parseInt(listFileN.get(0));

        for(int linha=1; linha<=sizePoints; linha++){
            var linhaPosicao = listFileN.get(linha).split("");
            for (int posicao=0; posicao<=linhaPosicao.length; posicao++){
                if(!Objects.equals(linhaPosicao[posicao], "")){
                    System.out.println(linhaPosicao[posicao]);
                }
            }
        }
    }

}
