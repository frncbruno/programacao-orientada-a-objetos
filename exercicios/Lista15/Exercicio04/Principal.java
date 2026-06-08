public class Principal {
    public static void main(String[] args) {
        System.out.println("--- TESTANDO O CARRO ---");
        // Criando uma referência do tipo Veiculo para um objeto Carro 
        Veiculo meuCarro = new Carro("Toyota", "Corolla", 2024);
        meuCarro.exibirDados();
        meuCarro.acelerar();
        meuCarro.frear();

        System.out.println("\n--- TESTANDO A MOTO ---");
        // Criando uma referência do tipo Veiculo para um objeto Moto 
        Veiculo minhaMoto = new Moto("Honda", "CB 500X", 2023);
        minhaMoto.exibirDados();
        minhaMoto.acelerar();
        minhaMoto.frear();
    }
}
