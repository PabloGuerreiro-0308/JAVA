package atividadeInstrumento;



public class violao extends instrumentoMusical{
   static String nome = "Violão";
    
public violao(){
   super(nome,tipoInstrumento.CORDA); 


}

@Override
public String tocar(String musica) {
    
    return "Tocando " + musica + "!";
}

@Override
public String afinar() {
    
    return "Afinando as cordas!";
}













}
