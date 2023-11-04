import java.util.Random;

class Main {
    public static void main(String[] args) {
        medias();
    }

    public static void medias() {
        Sort sort = new Sort();
        int[] v1 = criaVetor(50, 4913); int[] v2 = criaVetor(50, 6969); int[] v3 = criaVetor(50, 616);
        int[] v4 = criaVetor(50, 2001); int[] v5 = criaVetor(50, 1954);

        System.out.println("\n=/=/=/=/=/=/=/=/=/=/=/=/=/=/");
        System.out.println("MEDIAS VETOR DE TAMANHO 50");
        System.out.println("=/=/=/=/=/=/=/=/=/=/=/=/=/=/");
        mediasInsert(sort, v1, v2, v3, v4, v5); mediasBubble(sort, v1, v2, v3, v4, v5);
        mediasMerge(sort, v1, v2, v3, v4, v5); mediasQuick(sort, v1, v2, v3, v4, v5);

        v1 = criaVetor(500, 4913); v2 = criaVetor(500, 6969); v3 = criaVetor(500, 616);
        v4 = criaVetor(500, 2001); v5 = criaVetor(500, 1954);

        System.out.println("\n=/=/=/=/=/=/=/=/=/=/=/=/=/=/");
        System.out.println("MEDIAS VETOR DE TAMANHO 500");
        System.out.println("=/=/=/=/=/=/=/=/=/=/=/=/=/=/");
        mediasInsert(sort, v1, v2, v3, v4, v5); mediasBubble(sort, v1, v2, v3, v4, v5);
        mediasMerge(sort, v1, v2, v3, v4, v5); mediasQuick(sort, v1, v2, v3, v4, v5);

        v1 = criaVetor(1000, 4913); v2 = criaVetor(1000, 6969); v3 = criaVetor(1000, 616);
        v4 = criaVetor(1000, 2001); v5 = criaVetor(1000, 1954);

        System.out.println("\n=/=/=/=/=/=/=/=/=/=/=/=/=/=/");
        System.out.println("MEDIAS VETOR DE TAMANHO 1000");
        System.out.println("=/=/=/=/=/=/=/=/=/=/=/=/=/=/");
        mediasInsert(sort, v1, v2, v3, v4, v5); mediasBubble(sort, v1, v2, v3, v4, v5);
        mediasMerge(sort, v1, v2, v3, v4, v5); mediasQuick(sort, v1, v2, v3, v4, v5);

        v1 = criaVetor(5000, 4913); v2 = criaVetor(5000, 6969); v3 = criaVetor(5000, 616);
        v4 = criaVetor(5000, 2001); v5 = criaVetor(5000, 1954);

        System.out.println("\n=/=/=/=/=/=/=/=/=/=/=/=/=/=/");
        System.out.println("MEDIAS VETOR DE TAMANHO 5000");
        System.out.println("=/=/=/=/=/=/=/=/=/=/=/=/=/=/");
        mediasInsert(sort, v1, v2, v3, v4, v5); mediasBubble(sort, v1, v2, v3, v4, v5);
        mediasMerge(sort, v1, v2, v3, v4, v5); mediasQuick(sort, v1, v2, v3, v4, v5);

        v1 = criaVetor(10000, 4913); v2 = criaVetor(10000, 6969); v3 = criaVetor(10000, 616);
        v4 = criaVetor(10000, 2001); v5 = criaVetor(10000, 1954);

        System.out.println("\n=/=/=/=/=/=/=/=/=/=/=/=/=/=/");
        System.out.println("MEDIAS VETOR DE TAMANHO 10000");
        System.out.println("=/=/=/=/=/=/=/=/=/=/=/=/=/=/");
        mediasInsert(sort, v1, v2, v3, v4, v5); mediasBubble(sort, v1, v2, v3, v4, v5);
        mediasMerge(sort, v1, v2, v3, v4, v5); mediasQuick(sort, v1, v2, v3, v4, v5);
    }

    public static int[] criaVetor(int tamanho, int seed) {
        Random random = new Random(seed);
        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(100000);
        }

        return vetor;
    }


    public static void mediasInsert(Sort sortObjeto, int[] v1, int[] v2, int[] v3, int[] v4, int[] v5) {
        long incio, termino;

        int[] vetor = Sort.copiaVetor(v1);
        incio = System.nanoTime();
        sortObjeto.insertSort(vetor);
        termino = System.nanoTime();
        long v1Tempo = termino - incio;
        int v1Iteracoes = sortObjeto.getIteracoes();
        int v1Trocas = sortObjeto.getTrocas();
        sortObjeto.resetCounts();

        vetor = Sort.copiaVetor(v2);
        incio = System.nanoTime();
        sortObjeto.insertSort(vetor);
        termino = System.nanoTime();
        long v2Tempo = termino - incio;
        int v2Iteracoes = sortObjeto.getIteracoes();
        int v2Trocas = sortObjeto.getTrocas();
        sortObjeto.resetCounts();

        vetor = Sort.copiaVetor(v3);
        incio = System.nanoTime();
        sortObjeto.insertSort(vetor);
        termino = System.nanoTime();
        long v3Tempo = termino - incio;
        int v3Iteracoes = sortObjeto.getIteracoes();
        int v3Trocas = sortObjeto.getTrocas();
        sortObjeto.resetCounts();

        vetor = Sort.copiaVetor(v4);
        incio = System.nanoTime();
        sortObjeto.insertSort(vetor);
        termino = System.nanoTime();
        long v4Tempo = termino - incio;
        int v4Iteracoes = sortObjeto.getIteracoes();
        int v4Trocas = sortObjeto.getTrocas();
        sortObjeto.resetCounts();

        vetor = Sort.copiaVetor(v5);
        incio = System.nanoTime();
        sortObjeto.insertSort(vetor);
        termino = System.nanoTime();
        long v5Tempo = termino - incio;
        int v5Iteracoes = sortObjeto.getIteracoes();
        int v5Trocas = sortObjeto.getTrocas();
        sortObjeto.resetCounts();

        long mediaTempo = (v1Tempo + v2Tempo + v3Tempo + v4Tempo +v5Tempo) / 5;
        int mediaIteracoes = (v1Iteracoes + v2Iteracoes + v3Iteracoes +v4Iteracoes + v5Iteracoes) / 5;
        int mediaTrocas = (v1Trocas + v2Trocas + v3Trocas + v4Trocas + v5Trocas) / 5;

        System.out.println("\nInsert sort: ");
        System.out.println("Media trocas: " + mediaTrocas);
        System.out.println("Media iteracoes: " + mediaIteracoes);
        System.out.println("Media tempo: " + mediaTempo);
    }

    public static void mediasBubble(Sort sortObjeto, int[] v1, int[] v2, int[] v3, int[] v4, int[] v5) {
        long incio, termino;

        int[] vetor = Sort.copiaVetor(v1);
        incio = System.nanoTime();
        sortObjeto.bubbleSort(vetor);
        termino = System.nanoTime();
        long v1Tempo = termino - incio;
        int v1Iteracoes = sortObjeto.getIteracoes();
        int v1Trocas = sortObjeto.getTrocas();
        sortObjeto.resetCounts();

        vetor = Sort.copiaVetor(v2);
        incio = System.nanoTime();
        sortObjeto.bubbleSort(vetor);
        termino = System.nanoTime();
        long v2Tempo = termino - incio;
        int v2Iteracoes = sortObjeto.getIteracoes();
        int v2Trocas = sortObjeto.getTrocas();
        sortObjeto.resetCounts();

        vetor = Sort.copiaVetor(v3);
        incio = System.nanoTime();
        sortObjeto.bubbleSort(vetor);
        termino = System.nanoTime();
        long v3Tempo = termino - incio;
        int v3Iteracoes = sortObjeto.getIteracoes();
        int v3Trocas = sortObjeto.getTrocas();
        sortObjeto.resetCounts();

        vetor = Sort.copiaVetor(v4);
        incio = System.nanoTime();
        sortObjeto.bubbleSort(vetor);
        termino = System.nanoTime();
        long v4Tempo = termino - incio;
        int v4Iteracoes = sortObjeto.getIteracoes();
        int v4Trocas = sortObjeto.getTrocas();
        sortObjeto.resetCounts();

        vetor = Sort.copiaVetor(v5);
        incio = System.nanoTime();
        sortObjeto.bubbleSort(vetor);
        termino = System.nanoTime();
        long v5Tempo = termino - incio;
        int v5Iteracoes = sortObjeto.getIteracoes();
        int v5Trocas = sortObjeto.getTrocas();
        sortObjeto.resetCounts();

        long mediaTempo = (v1Tempo + v2Tempo + v3Tempo + v4Tempo +v5Tempo) / 5;
        int mediaIteracoes = (v1Iteracoes + v2Iteracoes + v3Iteracoes +v4Iteracoes + v5Iteracoes) / 5;
        int mediaTrocas = (v1Trocas + v2Trocas + v3Trocas + v4Trocas + v5Trocas) / 5;

        System.out.println("\nBubble sort\n");
        System.out.println("Media trocas: " + mediaTrocas);
        System.out.println("Media iteracoes: " + mediaIteracoes);
        System.out.println("Media tempo: " + mediaTempo);
    }

    public static void mediasMerge(Sort sortObjeto, int[] v1, int[] v2, int[] v3, int[] v4, int[] v5) {
        long incio, termino;

        int[] vetor = Sort.copiaVetor(v1);
        incio = System.nanoTime();
        sortObjeto.mergeSort(vetor);
        termino = System.nanoTime();
        long v1Tempo = termino - incio;
        int v1Iteracoes = sortObjeto.getIteracoes();
        int v1Trocas = sortObjeto.getTrocas();
        sortObjeto.resetCounts();

        vetor = Sort.copiaVetor(v2);
        incio = System.nanoTime();
        sortObjeto.mergeSort(vetor);
        termino = System.nanoTime();
        long v2Tempo = termino - incio;
        int v2Iteracoes = sortObjeto.getIteracoes();
        int v2Trocas = sortObjeto.getTrocas();
        sortObjeto.resetCounts();

        vetor = Sort.copiaVetor(v3);
        incio = System.nanoTime();
        sortObjeto.mergeSort(vetor);
        termino = System.nanoTime();
        long v3Tempo = termino - incio;
        int v3Iteracoes = sortObjeto.getIteracoes();
        int v3Trocas = sortObjeto.getTrocas();
        sortObjeto.resetCounts();

        vetor = Sort.copiaVetor(v4);
        incio = System.nanoTime();
        sortObjeto.mergeSort(vetor);
        termino = System.nanoTime();
        long v4Tempo = termino - incio;
        int v4Iteracoes = sortObjeto.getIteracoes();
        int v4Trocas = sortObjeto.getTrocas();
        sortObjeto.resetCounts();

        vetor = Sort.copiaVetor(v5);
        incio = System.nanoTime();
        sortObjeto.mergeSort(vetor);
        termino = System.nanoTime();
        long v5Tempo = termino - incio;
        int v5Iteracoes = sortObjeto.getIteracoes();
        int v5Trocas = sortObjeto.getTrocas();
        sortObjeto.resetCounts();

        long mediaTempo = (v1Tempo + v2Tempo + v3Tempo + v4Tempo +v5Tempo) / 5;
        int mediaIteracoes = (v1Iteracoes + v2Iteracoes + v3Iteracoes +v4Iteracoes + v5Iteracoes) / 5;
        int mediaTrocas = (v1Trocas + v2Trocas + v3Trocas + v4Trocas + v5Trocas) / 5;

        System.out.println("\nMerge sort\n");
        System.out.println("Media trocas: " + mediaTrocas);
        System.out.println("Media iteracoes: " + mediaIteracoes);
        System.out.println("Media tempo: " + mediaTempo);
    }

    public static void mediasQuick(Sort sortObjeto, int[] v1, int[] v2, int[] v3, int[] v4, int[] v5) {
        long incio, termino;

        int[] vetor = Sort.copiaVetor(v1);
        incio = System.nanoTime();
        sortObjeto.quickSort(vetor);
        termino = System.nanoTime();
        long v1Tempo = termino - incio;
        int v1Iteracoes = sortObjeto.getIteracoes();
        int v1Trocas = sortObjeto.getTrocas();
        sortObjeto.resetCounts();

        vetor = Sort.copiaVetor(v2);
        incio = System.nanoTime();
        sortObjeto.quickSort(vetor);
        termino = System.nanoTime();
        long v2Tempo = termino - incio;
        int v2Iteracoes = sortObjeto.getIteracoes();
        int v2Trocas = sortObjeto.getTrocas();
        sortObjeto.resetCounts();

        vetor = Sort.copiaVetor(v3);
        incio = System.nanoTime();
        sortObjeto.quickSort(vetor);
        termino = System.nanoTime();
        long v3Tempo = termino - incio;
        int v3Iteracoes = sortObjeto.getIteracoes();
        int v3Trocas = sortObjeto.getTrocas();
        sortObjeto.resetCounts();

        vetor = Sort.copiaVetor(v4);
        incio = System.nanoTime();
        sortObjeto.quickSort(vetor);
        termino = System.nanoTime();
        long v4Tempo = termino - incio;
        int v4Iteracoes = sortObjeto.getIteracoes();
        int v4Trocas = sortObjeto.getTrocas();
        sortObjeto.resetCounts();

        vetor = Sort.copiaVetor(v5);
        incio = System.nanoTime();
        sortObjeto.quickSort(vetor);
        termino = System.nanoTime();
        long v5Tempo = termino - incio;
        int v5Iteracoes = sortObjeto.getIteracoes();
        int v5Trocas = sortObjeto.getTrocas();
        sortObjeto.resetCounts();

        long mediaTempo = (v1Tempo + v2Tempo + v3Tempo + v4Tempo +v5Tempo) / 5;
        int mediaIteracoes = (v1Iteracoes + v2Iteracoes + v3Iteracoes +v4Iteracoes + v5Iteracoes) / 5;
        int mediaTrocas = (v1Trocas + v2Trocas + v3Trocas + v4Trocas + v5Trocas) / 5;

        System.out.println("\nQuick sort\n");
        System.out.println("Media trocas: " + mediaTrocas);
        System.out.println("Media iteracoes: " + mediaIteracoes);
        System.out.println("Media tempo: " + mediaTempo);
    }

}