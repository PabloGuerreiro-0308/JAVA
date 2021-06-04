package atividadeRobo;

public class roboArquelogo implements robo{

public roboArquelogo() {
}

@Override
public String iniciar() {
   
    return "Asas batendo, marcha de decolagem, turbinas e já!";
}

@Override
public String desligar() {
  
    return "Desligando!";
}

@Override
public String recarregar() {
    
    return "Carregando!";
}

    public String cavar(String local){



        return "O grande Indiana Jones está cavando no " + local + "!";








    }
}
