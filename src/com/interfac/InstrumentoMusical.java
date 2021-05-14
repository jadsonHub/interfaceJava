package Intrumentos;

public abstract class InstrumentoMusical {

    private String nome;
    private TipoInstrumento tipoInstrumento;

    public enum TipoInstrumento {
        SOPRO,
        CORDA,
        PERCUSAO
    }

    public InstrumentoMusical(String nome, TipoInstrumento tipoInstrumento) {

        this.nome = nome;
        this.tipoInstrumento = tipoInstrumento;
    }

    public String getNome() {
        return nome;
    }

    public TipoInstrumento getTipoInstrumento() {
        return tipoInstrumento;
    }

    public abstract String tocar(String musica);

    public abstract String afinar();
}