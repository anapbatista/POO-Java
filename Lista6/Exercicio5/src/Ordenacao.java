public class Ordenacao {
    public static void bubbleSort(Object[] array) {
        int n = array.length;
        boolean trocou;
        do {
            trocou = false;
            for (int i = 0; i < n - 1; i++) {
                Comparavel atual = (Comparavel) array[i];
                Comparavel proximo = (Comparavel) array[i + 1];
                if (atual.comparaCom(proximo) > 0) {
                    Object temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    trocou = true;
                }
            }
            n--;
        } while (trocou);
    }
}
