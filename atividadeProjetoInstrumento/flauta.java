package atividadeInstrumento;

public class flauta extends instrumentoMusical {
    static String nome = "Flauta doce";

    public flauta() {
        super(nome, tipoInstrumento.SOPRO);

    }

    @Override
    public String tocar(String musica) {
        
        return "Tocando " + musica + " na flauta!";
    }

    @Override
    public String afinar() {
        
        return "Afinando a flauta!";
    }
    
}
