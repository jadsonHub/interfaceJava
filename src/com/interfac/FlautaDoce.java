package Intrumentos;

public class FlautaDoce extends InstrumentoMusical {

    public FlautaDoce() {
        super("Flauta doce", TipoInstrumento.SOPRO);
    }

    @Override
    public String tocar(String musica) {
        return "A flauta doce está tocando a musica " + musica;
    }

    @Override
    public String afinar() {
        return "Realizando afinação  da flauta !";
    }
}