public class CalculadoraComplexa {

    private OperacaoComplexa a;

public void setOperacao(OperacaoComplexa a){
    this.a = a;

}
public NumeroComplexo calcular(NumeroComplexo c, NumeroComplexo b){
         return a.executar(c,b);

}

}
