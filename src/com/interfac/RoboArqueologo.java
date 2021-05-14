package Robo;

public class RoboArqueologo implements Robo {

    @Override
    public String iniciar() {
        return "O Robo arqueologo esta iniciando o sistema ";
    }

    @Override
    public String desligar() {
        return "O Robo arqueologo esta desligando... ";
    }

    public String cavar(String cavar) {
        return "O robo arqueologo esta cavando no local " + cavar;
    }

    @Override
    public String recarregar() {
        return "O Robo arqueologo esta carregando!";
    }
}
