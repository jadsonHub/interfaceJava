package Intrumentos;

public class IntrumentosMain {

    public static void main(String[] args) {
        Violao vi = new Violao();
        System.out.println(vi.afinar());
        System.out.println(vi.tocar("Sorriso resplandecente"));
        System.out.println(" ");

        FlautaDoce fd = new FlautaDoce();
        System.out.println(fd.afinar());
        System.out.println(fd.tocar("Classica"));
    }
}