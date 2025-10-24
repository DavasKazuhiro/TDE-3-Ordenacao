public class GnomeSort {
    public static int[] vetor1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
    public static int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
    public static int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};

    public static void ordenar(int tamanho, int[] vetor, String numero) {
        int iteracoes = 0;
        int trocas = 0;
        int temp;

        System.out.println("\nGNOME SORT");
        System.out.print("Vetor Desordenado: " + vetor[0]);
        for (int i = 1; i < tamanho; i++) {
            System.out.print(", " + vetor[i]);
        }

        int pos = 0;
        while (pos < tamanho) {
            iteracoes++;
            if (pos == 0 || vetor[pos] >= vetor[pos - 1]) {
                pos++;
            } else {
                temp = vetor[pos];
                vetor[pos] = vetor[pos - 1];
                vetor[pos - 1] = temp;
                trocas++;
                pos--;
            }
        }

        System.out.print("\nVetor Ordenado: " + vetor[0]);
        for (int i = 1; i < tamanho; i++) {
            System.out.print(", " + vetor[i]);
        }

        System.out.println("\nTrocas: " + trocas);
        System.out.println("Iteracoes: " + iteracoes);
        GeradorResultados.resultados[GeradorResultados.contador] = new Resultado("Gnome Sort", numero, iteracoes, trocas);
        GeradorResultados.contador ++;
    }

    public static void resultados() {
        ordenar(20, vetor1, "1");
        ordenar(20, vetor2, "2");
        ordenar(20, vetor3, "3");
    }
}
