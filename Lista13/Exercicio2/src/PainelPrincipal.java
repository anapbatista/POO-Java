public class PainelPrincipal implements ObservadorTemperatura {

    @Override
    public void atualizar(double temperatura) {
        System.out.println("Painel Principal: Temperatura atual: " + temperatura + "°C\n");
    }

}
