package Robo;

public class RoboMain {
    public static void main(String[] args) {
        RoboMedico RBM = new RoboMedico();
        System.out.println(RBM.iniciar());
        System.out.println(RBM.cortar("Coração"));
        System.out.println(RBM.costurar("Coração"));
        System.out.println(RBM.desligar());
        System.out.println(RBM.recarregar());

        System.out.println(" ");

        RoboArqueologo RBA = new RoboArqueologo();
        System.out.println(RBA.iniciar());
        System.out.println(RBA.cavar("Especifico informado pelo arqueologo"));
        System.out.println(RBA.desligar());
        System.out.println(RBA.recarregar());
    }
}
