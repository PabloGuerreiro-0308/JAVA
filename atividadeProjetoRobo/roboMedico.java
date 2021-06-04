package atividadeRobo;

public class roboMedico implements robo{

@Override
public  String iniciar() {
    return "Olá, eu sou Baymax!. O seu agente pessoal de saúde.";
     
}

@Override
public String desligar() {
    
   return "Desligando.. bip bop";

}

@Override
public String recarregar() {
 
    return "Recarregando!";
}


String cortar(String orgao){
   return "Estou realizando uma pequena incisão na(no)" + orgao; 

}



String costurar(String orgao){


return "Estou costurando o(a) " + orgao;




}

}