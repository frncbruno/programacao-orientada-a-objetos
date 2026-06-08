public class Principal {
    public static void main(String[] args) {
        // Criando uma Pessoa Física usando a referência de Pessoa [cite: 32]
        Pessoa clientePF = new PessoaFisica("Carlos Silva", "São Paulo", "123.456.789-00");
        
        // Criando uma Pessoa Jurídica usando a referência de Pessoa [cite: 32]
        Pessoa clientePJ = new PessoaJuridica("Tech Inovações LTDA", "Belo Horizonte", "12.345.678/0001-99");

        // Executando as compras de forma polimórfica [cite: 32, 35]
        clientePF.efetuarCompra(1500.0);
        
        System.out.println(); // Apenas saltar uma linha no console
        
        clientePJ.efetuarCompra(50000.0);
    }
}
