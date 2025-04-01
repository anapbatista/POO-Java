public class OperacaoMat {
    private float oper1;
    private float oper2;

    public OperacaoMat(float oper1, float oper2) {
        this.oper1 = oper1;
        this.oper2 = oper2;
    }

    public float realizaCalculo(int operador) {
        switch (operador) {
            case 0:
                return oper1 + oper2;
            case 1:
                return oper1 - oper2;
            case 2:
                return oper1 * oper2;
            case 3:
                if (oper2 != 0) {
                    return oper1 / oper2;
                } else {
                    System.out.println("Divisão por zero não permitida");
                    return 0;
                }
            default:
                System.out.println("Operador inválido");
                return 0;
        }
    }
}

