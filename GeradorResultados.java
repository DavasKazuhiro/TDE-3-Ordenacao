import java.io.FileWriter;

public class GeradorResultados {
    public static int contador = 0;
    public static Resultado[] resultados = new Resultado[18];

    public static void gerarResultado(){
        String nomeArquivo = "resultadosSorting.csv";

        try {
            FileWriter escritor = new FileWriter(nomeArquivo);

            escritor.append("Tipo de Ordenação,Número do Vetor,Iterações,Trocas\n");
            String s = ",";
            for(Resultado r : resultados){
                escritor.append(r.tipo + s + r.numero + s + r.iteracoes + s + r.trocas + "\n");
            }

            escritor.flush();
            escritor.close();

            System.out.println("Arquivo criado com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao criar o arquivo CSV: " + e.getMessage());
        }
    }
}
