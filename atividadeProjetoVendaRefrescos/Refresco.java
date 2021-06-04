package revisao;

public class Refresco {
   private double precoUnitario;
   private String sabor;
   private char tamanho; 
   private boolean contemAcucar;
   private Fabricante fabricante;
   public static String sabores[] = {"Tamarindo","Limão","Groselha"};
   public Refresco(String sabor, char tamanho, boolean contemAcucar, Fabricante fabricante){

    this.sabor=sabor;
    this.tamanho=tamanho;
    this.contemAcucar=contemAcucar;
    this.fabricante=fabricante;
    setPrecoUnitario();






   }
   private void setPrecoUnitario(){
        
    this.precoUnitario= 2.5;
    if (this.tamanho == 'G') {
        this.precoUnitario+=1.0;
    } else { if (this.tamanho== 'M') {
        this.precoUnitario+=0.5;
    }
    if (contemAcucar == true) {
        precoUnitario+=0.50;
    } else {
        
    }     

    }
   }
   String getInfoRefresco(){
        
            return "\nSabor: " + sabor + "\nTamanho: " + tamanho +"\n Contém açucar: " + contemAcucar + "\n Preço: " + precoUnitario + fabricante.getInfoFabricante();




   }

   public double getPrecoUnitario() {
       return precoUnitario;
   }


}
