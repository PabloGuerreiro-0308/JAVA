package atividadeInstrumento;
abstract class instrumentoMusical{
private String nome;
private tipoInstrumento tipo;

public enum tipoInstrumento {

SOPRO, CORDA ,PERCUSSÃO;

}
public String getNome() {
    return nome;
}

public tipoInstrumento getTipo() {
    return tipo;
}
public instrumentoMusical(String nome, tipoInstrumento tipo) {

this.nome = nome;
this.tipo = tipo;


}





public abstract String tocar(String musica);


public abstract String afinar();


}