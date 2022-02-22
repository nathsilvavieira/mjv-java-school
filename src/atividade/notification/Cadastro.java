package atividade.notification;

public class Cadastro {
    private int numero;
    private boolean ativo;
    private char   tipoCadastro = 'F' ; //'J'
    private Pessoa pessoa;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public char getTipoCadastro() {
        return tipoCadastro;
    }

    public void setTipoCadastro(char tipoCadastro) {
        this.tipoCadastro = tipoCadastro;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
