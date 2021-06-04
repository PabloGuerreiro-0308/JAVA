package revisao;

public class Fabricante {
    private String nome;
    private String ceo;
    private int anoFundacao;


    public Fabricante(String nome,String ceo,int anoFundacao){

        this.nome = nome;
        this.ceo = ceo;
        this.anoFundacao = anoFundacao;

    }

  public String getInfoFabricante(){

    return "\n Nome da fabricante: " + nome + "\n CEO: " + ceo + "\n Ano de fundação:  " + anoFundacao;

   }
}
