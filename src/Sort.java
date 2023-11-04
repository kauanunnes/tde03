public class Sort {
    private int iteracoes;
    private int trocas;

    public Sort() {
        iteracoes = 0;
        trocas = 0;
    }

    public int getIteracoes() {
        return iteracoes;
    }

    public int getTrocas() {
        return trocas;
    }

    public void resetCounts() {
        iteracoes = 0;
        trocas = 0;
    }

    /* BUBBLE SORT */
    public void bubbleSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            iteracoes++;

            for (int j = 0; j < (n - i - 1); j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    trocas++;
                }
            }
        }
    }

    /* QUICK SORT */
    public void quickSort(int[] x) {
        quickSort(x, 0, x.length - 1);
    }
    public void quickSort(int[] x, int inferior, int superior) {
        if (inferior >= superior) return;

        int pivo = particiona(x, inferior, superior);

        quickSort(x, inferior, pivo - 1);
        quickSort(x, pivo +1, superior);
    }

    private int particiona(int[] x, int inferior, int superior) {
        int pivo = x[inferior];
        int i = superior + 1;

        for (int j = superior; j > inferior; j--) {
            if (x[j] >= pivo) {
                i--;

                int temp = x[i];
                x[i] = x[j];
                x[j] = temp;
                trocas++;
            }
            iteracoes++;
        }

        int temp = x[i-1];
        x[i-1] = x[inferior];
        x[inferior] = temp;
        trocas++;

        return i - 1;
    }

    /* INSERT SORT */
    public void insertSort(int[] x) {
        for (int k = 1; k < x.length; k++) {
            int y = x[k];
            int i;
            for (i = k - 1; i >= 0 && y < x[i]; i--) {
                x[i+1] = x[i];
            }

            x[i+1] = y;
            trocas++; iteracoes++;
        }
    }

    /* SHELL SORT */
    public void shellSort(int[] vetor) {
        int[] incrementosPadrao = {23, 10, 4, 1};
        shellSort(vetor, incrementosPadrao);
    }

    public void shellSort(int[] vetor, int[] incremento) {
        int incr, passo, j, y, k;
        for (incr = 0; incr < incremento.length; incr++) {
            passo = incremento[incr];

            for (j = passo; j < vetor.length; j++) {
                y = vetor[j];
                for (k = j - passo; k >= 0 && y < vetor[k]; k -= passo) {
                    vetor[k+passo] = vetor[k];
                    trocas++;
                }
                vetor[k+passo] = y;
                trocas++; iteracoes++;
            }
        }
    }

    /* MERGE SORT */
    public void mergeDivide(int[] x, int[] esquerdo, int[] direito) {
        int i = 0, j = 0, k = 0;
        while ((i < esquerdo.length) && (j < direito.length)) {
            if (esquerdo[i] < direito[j]) {
                x[k++] = esquerdo[i++];
                iteracoes++; trocas++;
            } else {
                x[k++] = direito[j++];
                iteracoes++; trocas++;
            }
        }

        while (i < esquerdo.length) {
            x[k++] = esquerdo[i++];
            iteracoes++; trocas++;
        }

        while (j < direito.length) {
            x[k++] = direito[j++];
            iteracoes++; trocas++;
        }
    }

    public void mergeSort(int[] x) {
        if (x == null)
            return;

        if (x.length > 1) {
            int meio = (x.length) / 2;
            int[] esquerdo = new int[meio];
            int[] direito = new int[x.length - meio];

            for (int i = 0; i < esquerdo.length; i++) {
                esquerdo[i] = x[i];
            }
            iteracoes++;

            for (int i = 0; i < direito.length; i++) {
                direito[i] = x[meio + i];
            }
            iteracoes++;

            mergeSort(esquerdo);
            mergeSort(direito);

            mergeDivide(x, esquerdo, direito);
        }
    }

    /* HEAP SORT */
    public void heapSort(int[] x) {
        int tamanho = x.length;
        int i = tamanho / 2;

        while (true) {
            int pai, esquerdo, direito, temp;

            if (i > 0) {
                i--;
                temp = x[i];
            } else {
                tamanho--;
                if (tamanho <= 0) return;
                temp = x[tamanho];
                x[tamanho] = x[0];
                trocas++;
            }
            pai = i;
            esquerdo = (2 * i) + 1;

            while (esquerdo < tamanho) {
                direito = esquerdo + 1;

                if ((direito < tamanho) && (x[esquerdo] < x[direito]))
                    esquerdo = direito;

                if (x[esquerdo] > temp) {
                    x[pai] = x[esquerdo];
                    pai = esquerdo;
                    esquerdo = (pai * 2) + 1;
                    trocas++;
                } else
                    break;

                iteracoes++;
            }
            x[pai] = temp;
            trocas++;
        }
    }

    /* SELECTION SORT */
    public void selectionSort(int[] x) {
        int temp, menor;

        for (int i = 0; i < x.length; i++) {
            menor = i;

            for (int j = i + 1; j < x.length; j++) {
                if (x[j] < x[menor]) {
                    menor = j;
                }
                iteracoes++;
            }

            if (menor != i) {
                temp = x[menor];
                x[menor] = x[i];
                x[i] = temp;
                trocas++;
            }

            iteracoes++;
        }
    }

    /* IMPRIME ARRAY */
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /* COPIA O VETOR */
    public static int[] copiaVetor(int[] original) {
        int[] copia = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            copia[i] = original[i];
        }

        return copia;
    }
}