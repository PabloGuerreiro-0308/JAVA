package BANCO2;

import java.util.ArrayList;

public class agencia {

    private Integer numero;
    private String cidade;
    public ArrayList<contaBanco> listaContas;

    public agencia(Integer numero, String cidade) {
        
        this.numero = numero;
        this.cidade = cidade;
        
        listaContas= new ArrayList<>();
        
        ArrayList<contaBanco> listaContas;
        
        
    }

    public String getNumero(){

        return "Numero da agencia: " + this.numero;

    }
    public String getCidade(){
        return " da cidade de "+ this.cidade + ":";
    }


    public void adicionarConta(contaBanco conta) {
            listaContas.add(conta);
      }
      public String listarContas(){
         String dadosContas = getNumero();
                dadosContas+=getCidade();
            for (contaBanco contaBanco : listaContas) {
             dadosContas += contaBanco.exibirDados();
            }
            return dadosContas;

      }
    }


