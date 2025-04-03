public class Ordenacao {
    public static void bubbleSort(TimeFutebol[] array) {
        int n = array.length;
        boolean trocou;
        do {
            trocou = false;
            for (int i = 0; i < n - 1; i++) {
                if (array[i].comparaCom(array[i + 1]) > 0) {
                    TimeFutebol temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    trocou = true;
                }
            }
            n--;
        } while (trocou);
    }
}
