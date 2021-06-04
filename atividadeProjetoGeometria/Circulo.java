package GEOMETRIA;

public class Circulo {
    private double raio;
    private static double pi;

    public Circulo(double raio) {
         this.raio= raio;
    }
    double calcularArea(){

            return pi* Math.pow(raio,2);
    }
    double calcularCircunferencia(){

        return 2*pi*raio;
    }
    static void atualizarPi(double pi){

        Circulo.pi = pi;


    }




    
}
