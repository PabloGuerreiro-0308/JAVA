package revisao;

import java.util.ArrayList;

public class Venda {
    private double precoFinal = 0.0;
    private  ArrayList<Refresco> itens;
    public Venda(){
        this.precoFinal = 0;
        itens = new ArrayList<>();



    }
void adicionarItem(Refresco refresco){
    this.precoFinal += refresco.getPrecoUnitario();
    itens.add(refresco);
}
public double getPrecoFinal() {
    return precoFinal;
}
public String getItens() {
    String item = " ";
    for (Refresco refresco : itens) {
        item += refresco.getInfoRefresco();
    }
    return item;
}
}
