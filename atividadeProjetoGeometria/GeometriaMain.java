package GEOMETRIA;

public class GeometriaMain {

    public static void main(String[] args) {
        
        Quadrado.atualizarDiagonal(1.41);
        Quadrado q1 = new Quadrado(2.5);
        System.out.printf("Área de Q1: %.2f cm²\n", q1.calcularArea());
        System.out.printf("Perímetro de Q1: %.2f cm\n", q1.calcularPerimetro());
        System.out.printf("Diagonal de Q1: %.2f cm\n", q1.calcularDiagonal());
        
        Circulo.atualizarPi(3.14);
        Circulo c1 = new Circulo(2.5);
        System.out.printf("\nÁrea de C1: %.2f cm²\n", c1.calcularArea());
        System.out.printf("Circunf. de C1: %.2f cm\n", c1.calcularCircunferencia());

        Quadrado.atualizarDiagonal(Math.sqrt(2));
        System.out.printf("\nDiagonal de Q1: %.2f cm\n", q1.calcularDiagonal());
        Circulo.atualizarPi(Math.PI);
        System.out.printf("\nÁrea de C1: %.2f cm²\n", c1.calcularArea());
        System.out.printf("Circunf. de C1: %.2f cm\n", c1.calcularCircunferencia());
    }

}