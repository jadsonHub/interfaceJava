package Intrumentos;

public class Violao extends InstrumentoMusical {


    public Violao() {
        super("Violão", TipoInstrumento.CORDA);
    }

    @Override
    public String tocar(String musica) {
        return "O violão está tocando a musica " + musica;
    }

    @Override
    public String afinar() {
        return "Afinando as cordas do violão!";
    }
}
