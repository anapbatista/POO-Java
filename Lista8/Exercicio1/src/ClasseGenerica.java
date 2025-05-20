public class ClasseGenerica<T extends Number>{

    private T valor1;
    private T valor2;

    public ClasseGenerica( T valor1, T valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public T getMax(){
        if (this.valor1.doubleValue() > this.valor2.doubleValue()) {
            return this.valor1;
        } else {
            return this.valor2;
        }
    }

    @Override
    public String toString() {
        return this.valor1.toString() + this.valor2.toString();
    }

    public static void main(String[] args) {
        // Testando com Integer
        ClasseGenerica<Integer> cgInt = new ClasseGenerica<>(10, 20);
        System.out.println("Maior (Integer): " + cgInt.getMax());

        // Testando com Double
        ClasseGenerica<Double> cgDouble = new ClasseGenerica<>(3.14, 2.71);
        System.out.println("Maior (Double): " + cgDouble.getMax());

        // Testando com Long
        ClasseGenerica<Long> cgLong = new ClasseGenerica<>(1000L, 999L);
        System.out.println("Maior (Long): " + cgLong.getMax());
    }

}
