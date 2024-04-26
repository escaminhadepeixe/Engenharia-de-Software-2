
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        Promotor promotor = new Promotor();

        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.println("Informe os depoimentos: ");
        while (true) {
            System.out.print("Dia: ");
            int dia = scanner.nextInt();
            System.out.print("Mês: ");
            int mes = scanner.nextInt();
            System.out.print("Ano: ");
            int ano = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Nome do Depoente: ");
            String depoente = scanner.nextLine();
            System.out.print("Depoimento: ");
            String texto = scanner.nextLine();

            Depoimento depoimento = new Depoimento(dia, mes, ano, depoente, texto);

            promotor.adicionarDepoimento(depoimento);

            System.out.print("Deseja inserir outro depoimento? (s/n): ");
            String continuar = scanner.nextLine();
            if (continuar.equalsIgnoreCase("n") || continuar.equalsIgnoreCase("não") || continuar.equalsIgnoreCase("nao")) {
                break;
            }
        }
        scanner.close();

        
        List<Depoimento> depoimentos = promotor.getDepoimentos();
        for (Depoimento depoimento : depoimentos) {
            String classificacao = promotor.classificarDepoimento(depoimento);
            System.out.println("Depoimento de " + depoimento.getNomeDepoente() + " (" + depoimento.getDia() + "/" + depoimento.getMes() + "/" + depoimento.getAno() + "): " + classificacao);
        }
    }
}