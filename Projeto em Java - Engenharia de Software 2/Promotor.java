
import java.util.ArrayList;
import java.util.List;

public class Promotor {
    private List<Depoimento> depoimentos;

    public Promotor() {
        this.depoimentos = new ArrayList<>();
    }

    public void adicionarDepoimento(Depoimento depoimento) {
        depoimentos.add(depoimento);
    }

    public List<Depoimento> getDepoimentos() {
        return depoimentos;
    }

    public String classificarDepoimento(Depoimento depoimento) {
        int contagemPalavrasOdiosas = contarPalavrasOdiosas(depoimento.getTexto());
        if (contagemPalavrasOdiosas > 10) {
            return "Inseguro";
        } else if (contagemPalavrasOdiosas > 5) {
            return "Aceitável";
        } else {
            return "Livre";
        }
    }

    private int contarPalavrasOdiosas(String texto) {
        int contagem = 0;
        String[] palavrasOdiosas = {"puta","merda","caralho","bosta"}; 
        for (String palavraOdiosa : palavrasOdiosas) {
            int index = texto.indexOf(palavraOdiosa);
            while (index != -1) {
                contagem++;
                index = texto.indexOf(palavraOdiosa, index + 1);
            }
        }
        return contagem;
    }
}
