public class Main {
    public static void main(String[] args) {

        SensorTemperatura sensor = new SensorTemperatura();

        ObservadorTemperatura painel = new PainelPrincipal();
        ObservadorTemperatura alarme = new AlarmeTemperatura();

        sensor.adicionar(painel);
        sensor.adicionar(alarme);
        

        sensor.SetTemperatura(35);
        sensor.SetTemperatura(55);
    }

}
