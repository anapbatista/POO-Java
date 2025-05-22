public class AlarmeTemperatura implements ObservadorTemperatura{

    public void atualizar(double temperatura){
        if(temperatura > 40)
        System.out.println("Alarme de temperatura alta!\n");
    }

}
