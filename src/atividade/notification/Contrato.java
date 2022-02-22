package atividade.notification;

public class Contrato {
    private long numProtocolo;
    private Cadastro cadastro;

    public long getNumProtocolo() {
        return numProtocolo;
    }

    public void setNumProtocolo(long numProtocolo) {
        this.numProtocolo = numProtocolo;
    }

    public Cadastro getCadastro() {
        return cadastro;
    }

    public void setCadastro(Cadastro cadastro) {
        this.cadastro = cadastro;
    }
}
