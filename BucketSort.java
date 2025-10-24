public class BucketSort {
    public static int[] vetor1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
    public static int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
    public static int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};

    public static void ordenar(int tamanho, int[] vetor, String numero) {
        int iteracoes = 0;
        int trocas = 0;

        System.out.println("\nBUCKET SORT");
        System.out.print("Vetor Desordenado: " + vetor[0]);
        for (int i = 1; i < tamanho; i++) {
            System.out.print(", " + vetor[i]);
        }

        // descobrir maior e menor valor
        int min = vetor[0];
        int max = vetor[0];
        for (int i = 1; i < tamanho; i++) {
            if (vetor[i] < min) min = vetor[i];
            if (vetor[i] > max) max = vetor[i];
        }

        int numBuckets = 5;
        int[][] buckets = new int[numBuckets][tamanho];
        int[] tamanhosBuckets = new int[numBuckets];

        // intervalo de valores de cada balde
        double intervalo = (double)(max - min + 1) / numBuckets;

        // distribuicao dos elementos nos baldes
        for (int i = 0; i < tamanho; i++) {
            int indice = (int)((vetor[i] - min) / intervalo);
            if (indice >= numBuckets) indice = numBuckets - 1;
            int pos = tamanhosBuckets[indice];
            buckets[indice][pos] = vetor[i];
            tamanhosBuckets[indice]++;
        }

        // ordena cada balde com bubble sort
        int index = 0;
        for (int b = 0; b < numBuckets; b++) {
            int tam = tamanhosBuckets[b];
            if (tam == 0) continue;

            for (int i = 0; i < tam - 1; i++) {
                for (int j = 0; j < tam - i - 1; j++) {
                    iteracoes++;
                    if (buckets[b][j] > buckets[b][j + 1]) {
                        int temp = buckets[b][j];
                        buckets[b][j] = buckets[b][j + 1];
                        buckets[b][j + 1] = temp;
                        trocas++;
                    }
                }
            }

            // juntar os baldes
            for (int k = 0; k < tam; k++) {
                vetor[index] = buckets[b][k];
                index++;
            }
        }

        System.out.print("\nVetor Ordenado: " + vetor[0]);
        for (int i = 1; i < tamanho; i++) {
            System.out.print(", " + vetor[i]);
        }

        System.out.println("\nTrocas: " + trocas);
        System.out.println("Iteracoes: " + iteracoes);
        GeradorResultados.resultados[GeradorResultados.contador] = new Resultado("Bucket Sort", numero, iteracoes, trocas);
        GeradorResultados.contador ++;
    }

    public static void resultados() {
        ordenar(20, vetor1, "1");
        ordenar(20, vetor2, "2");
        ordenar(20, vetor3, "3");
    }
}
