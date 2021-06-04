package projetoJogo;

import java.util.ArrayList;

public class jogoEletronico extends jogo {
   private ArrayList<String> plataformas;
   private String categoria = " | Categoria: ";
   private String categorias[]= { "Ação", "Esporte", "Estratégia" };
    public jogoEletronico(String nome, float precoUnitario, int clasEtaria, ArrayList<String> plataformas, int numCateg) {
        super(nome, precoUnitario, clasEtaria);
        this.plataformas = plataformas;
        this.categoria += categorias[numCateg];
    }
    

 @Override
 public String toString() {
     
     return super.toString() + categoria;
 }

    public String getPlataformas() {
        String plataformass= "Plataformas: ";
       for (String plataforma : plataformas) {
           plataformass += plataforma + "; ";
       }
       return plataformass;
    }
}
