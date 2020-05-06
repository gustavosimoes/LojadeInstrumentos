package lojadeinstrumentos;

public class Violino {

    private final int numeroCordas = 1;
    private static int numeroInstrumentos = 0;
    private String Cor;
    private String afinacao;

    public static int getNumeroInstrumentos() {
        return numeroInstrumentos;
    }

    public static void setNumeroInstrumentos(int numeroInstrumentos) {
        Violino.numeroInstrumentos = numeroInstrumentos;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public String getAfinacao() {
        return afinacao;
    }

    public void setAfinacao(String afinacao) {
        this.afinacao = afinacao;
    }

    public int getNumeroCordas() {
        return numeroCordas;
    }

    public Violino() {
        Violino.setNumeroInstrumentos(Violino.getNumeroInstrumentos() + 1);
    }

    @Override
    public String toString() {
        return "Violino{" + "numeroCordas=" + numeroCordas + ", Cor=" + Cor + ", afinacao=" + afinacao + '}';
    }

}
