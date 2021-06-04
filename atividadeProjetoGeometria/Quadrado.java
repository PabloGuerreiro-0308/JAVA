package GEOMETRIA;

public class Quadrado {
        private double lado;
        private static double diag;

public Quadrado (double lado){

    this.lado = lado;

}

double calcularArea(){

return lado*lado;

}
double calcularPerimetro(){


return lado*4;


}

double calcularDiagonal(){


return diag*lado;


}
static void atualizarDiagonal(double diag){

Quadrado.diag = diag;

}



}