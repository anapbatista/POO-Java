public class Soma implements Calcula{

    public void calcula(VetorR3 v){
        double[] v1 = v.getVetor1();
        double[] v2 = v.getVetor2();
        double[] v3 = new double[3];

        for (int i=0; i<3; i++ ){
            v3[i]=v1[i]+v2[i];
        }
        System.out.println("Soma: "+ v3[0] +" "+ v3[1] +" "+ v3[2]);
        

        
    }

}
