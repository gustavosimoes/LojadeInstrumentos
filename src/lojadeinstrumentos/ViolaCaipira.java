package lojadeinstrumentos;

public class ViolaCaipira {

    private final int numeroCordas = 1;
    private static int numeroInstrumentos = 0;
    private String cor;
    private float preco;

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public static int getNumeroInstrumentos() {
        return numeroInstrumentos;
    }

    public static void setNumeroInstrumentos(int numeroInstrumentos) {
        ViolaCaipira.numeroInstrumentos = numeroInstrumentos;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumeroCordas() {
        return numeroCordas;
    }

    public ViolaCaipira() {
        ViolaCaipira.setNumeroInstrumentos(ViolaCaipira.getNumeroInstrumentos() + 1);

    }

    @Override
    public String toString() {
        return "ViolaCaipira{" + "numeroCordas=" + numeroCordas + ", cor=" + cor + ", preco=" + preco + '}';
    }

}
