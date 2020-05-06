package lojadeinstrumentos;

public class Berimbau {

    private final int numeroCordas = 1;
    private static int numeroInstrumentos = 0;
    private String modelo;
    private boolean temCaxixi;

    public static int getNumeroInstrumentos() {
        return numeroInstrumentos;
    }

    public static void setNumeroInstrumentos(int numeroInstrumentos) {
        Berimbau.numeroInstrumentos = numeroInstrumentos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isTemCaxixi() {
        return temCaxixi;
    }

    public void setTemCaxixi(boolean temCaxixi) {
        this.temCaxixi = temCaxixi;
    }

    public int getNumeroCordas() {
        return numeroCordas;
    }
    

    public Berimbau() {
        Berimbau.setNumeroInstrumentos(Berimbau.getNumeroInstrumentos() + 1);

    }

    @Override
    public String toString() {
        return "Berimbau{" + "numeroCordas=" + numeroCordas + ", modelo=" + modelo + ", temCaxixi=" + temCaxixi + '}';
    }

}
