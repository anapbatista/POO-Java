public class InsertionSort {

    public <T extends Comparable<T>> void insertionSort(T[] a){
        for (int j = 1; j < a.length; j++) {
            T temp = a[j];
            int i = j - 1;

            // Enquanto i >= 0 e A[i] > temp
            while (i >= 0 && a[i].compareTo(temp) > 0) {
                a[i + 1] = a[i]; // Move A[i] para a direita
                i = i - 1;
            }

            a[i + 1] = temp;
        }
    }

    public static void main(String[] args) {
        Integer[] numeros = {5, 2, 9, 1, 3};

        InsertionSort is = new InsertionSort();
        is.insertionSort(numeros);

        for (Integer n : numeros) {
            System.out.print(n + " ");
        }
    }

}
