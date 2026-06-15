public abstract class Pessoa {
    protected String nome;
    protected String cidade;

    public abstract void efetuarCompra();
}

public class PessoaFisica extends Pessoa {
    private String cpf; 

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    @Override
    public void efetuarCompra() {
        System.out.println(nome + " (CPF: " + cpf + ") efetuou uma compra.");
    }
}

public class PessoaJuridica extends Pessoa {
    private String cnpj; 

    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }

    @Override
    public void efetuarCompra() {
        System.out.println("A empresa " + nome + " (CNPJ: " + cnpj + ") efetuou uma compra.");
    }
}
