public class ClasseT<T extends Comparable<T>> {

    private T valor1;
    private T valor2;

    public ClasseT( T valor1, T valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public T getMax(){
        if (valor1.compareTo(valor2) >0) return valor1;
        else return valor2;
        
    }

    @Override
    public String toString() {
        return this.valor1.toString() + "\n" + this.valor2.toString();
    }


}
