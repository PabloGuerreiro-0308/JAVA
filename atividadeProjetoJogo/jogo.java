package projetoJogo;

public class jogo {
    protected String nome;
    protected float precoUnitario;
    protected int clasEtaria;


public jogo(String nome,float precoUnitario, int clasEtaria){
    this.nome = nome;
    this.precoUnitario = precoUnitario;
    this.clasEtaria = clasEtaria;






}
@Override
public String toString() {
    
    return "Nome: " + this.nome + " | Preço: " + precoUnitario + " | Classificação estária: " + clasEtaria;
}


}
