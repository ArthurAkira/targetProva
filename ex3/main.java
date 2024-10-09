package ex3;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {

            String content = new String(Files.readAllBytes(Paths.get("dados.json")));

            JSONArray faturamento = new JSONArray(content);

            ArrayList<Double> valores = new ArrayList<>();

            for (int i = 0; i < faturamento.length(); i++) {
                JSONObject dia = faturamento.getJSONObject(i);
                double valor = dia.getDouble("valor");

                if (valor > 0) {
                    valores.add(valor);
                }
            }

            double menor = valores.get(0);
            double maior = valores.get(0);
            double somaValores = 0;

            for (double valor : valores) {
                if (valor < menor) menor = valor;
                if (valor > maior) maior = valor;
                somaValores += valor;
            }

            double media = somaValores / valores.size();

            int acimaDaMedia = 0;
            for (double valor : valores) {
                if (valor > media) {
                    acimaDaMedia++;
                }
            }

            System.out.println("Menor valor: " + menor);
            System.out.println("Maior valor: " + maior);
            System.out.println("Número de dias acima da média: " + acimaDaMedia);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
