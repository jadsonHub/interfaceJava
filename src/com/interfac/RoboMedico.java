package Robo;

public class RoboMedico implements Robo {

    @Override
    public String iniciar() {
        return "O robo médico esta iniciando o sistema!";
    }

    public String cortar(String corte) {
        return "O robo médico esta cortando o(a) " + corte + " do paciente";
    }

    @Override
    public String desligar() {
        return "O robo médico esta desligando!";
    }

    public String costurar(String costura) {
        return "O robo médico esta costurando o(a) " + costura + " do paciente";
    }

    @Override
    public String recarregar() {
        return "O robo médico esta recarregando !";
    }
}
