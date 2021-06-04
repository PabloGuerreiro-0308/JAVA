package atividadeInstrumento;

public class percussao extends instrumentoMusical {
    static String nome = "Tambor";

    public percussao() {
        super(nome, tipoInstrumento.PERCUSSÃO);
     
    }

    @Override
    public String tocar(String musica) {
    
        return  "Tocando " + musica + " no instrumento de percussão!";
    }

    @Override
    public String afinar() {
    
        return "Afinando o instrumento de percussão!";
    }
    
}
