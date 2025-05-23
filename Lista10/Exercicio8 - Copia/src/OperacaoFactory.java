public class OperacaoFactory {
    public static OperacaoConjunto criarOperacao(String tipo) {
        switch (tipo.toLowerCase()) {
            case "uniao":
            return new OperacaoUniao();
            case "intersecao" :
            return new OperacaoIntersecao();
            case "diferenca" :
            return new OperacaoDiferenca();
            default :
            throw new IllegalArgumentException("Operação inválida: " + tipo);
        
        }
    }
}
