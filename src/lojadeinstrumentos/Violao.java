package lojadeinstrumentos;

public class Violao {

    private final int numeroCordas = 1;
    private static int numeroInstrumentos = 0;
    private String Cor;
    private boolean eletrico;

    public static int getNumeroInstrumentos() {
        return numeroInstrumentos;
    }

    public static void setNumeroInstrumentos(int numeroInstrumentos) {
        Violao.numeroInstrumentos = numeroInstrumentos;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public boolean isEletrico() {
        return eletrico;
    }

    public void setEletrico(boolean eletrico) {
        this.eletrico = eletrico;
    }

    public int getNumeroCordas() {
        return numeroCordas;
    }

    public Violao() {
        Violao.setNumeroInstrumentos(Violao.getNumeroInstrumentos() + 1);
    }

    @Override
    public String toString() {
        return "Violao{" + "numeroCordas=" + numeroCordas + ", Cor=" + Cor + ", eletrico=" + eletrico + '}';
    }

}
