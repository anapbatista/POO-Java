import java.io.*;
import java.util.zip.ZipInputStream;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream theFile = new FileInputStream("texto.zip");
            ZipInputStream zip = new ZipInputStream(theFile);
            zip.getNextEntry(); // pega o primeiro arquivo do zip

            VogalContadorInputStream vc = new VogalContadorInputStream(zip);
            InputStreamReader isr = new InputStreamReader(vc);
            BufferedReader br = new BufferedReader(isr);

            System.out.println("Lendo arquivo dentro do zip:");
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }

            System.out.println("Total de vogais encontradas: " + vc.getTotalVogaisLidas());

            // Fechando apenas o decorador, ele fecha os streams internos também
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Digite um texto (digite 'x' para sair):");

        try (VogalContadorInputStream vc = new VogalContadorInputStream(System.in)) {
            int caractere;
            while ((caractere = vc.read()) != -1) {
                char c = (char) caractere;

                // Verifica se é 'x' (encerra)
                if (c == 'x' || c == 'X') {
                    System.out.println("\nEncerrando leitura...");
                    break;
                }

                System.out.print(c); // Imprime o caractere lido
            }

            System.out.println("\nTotal de vogais digitadas: " + vc.getTotalVogaisLidas());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
