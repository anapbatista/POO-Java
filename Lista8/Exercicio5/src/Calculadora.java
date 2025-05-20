import java.util.List;

public class Calculadora {

// Método estático para calcular média de elementos que possuem doubleValue()
    public static <T extends Number> double calcularMedia(List<T> lista) {
        if (lista == null || lista.isEmpty()) {
            throw new IllegalArgumentException("A lista não pode ser vazia ou nula.");
        }

        double soma = 0.0;
        for (T elemento : lista) {
            soma += elemento.doubleValue();  // Usa o método doubleValue() herdado de Number
        }

        return soma / lista.size();
    }

    public static void main(String[] args) {
        List<Integer> numerosInt = List.of(1, 2, 3, 4, 5);
        List<Double> numerosDouble = List.of(2.5, 3.5, 4.5);

        double mediaInt = calcularMedia(numerosInt);
        double mediaDouble = calcularMedia(numerosDouble);

        System.out.println("Média Inteiros: " + mediaInt);       // Saída: 3.0
        System.out.println("Média Doubles: " + mediaDouble);     // Saída: 3.5
    }

}
