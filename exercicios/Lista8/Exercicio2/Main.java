package pkg;

public class Main {

    public static void main(String[] args) {

        ContaBancaria bruno = new ContaBancaria("Bruno", 1000.0);

        bruno.depositar(500.0);   
        bruno.sacar(200.0);       

        ContaBancaria ana = new ContaBancaria("Ana", 500.0);

        bruno.transferir(500.0, ana);

        bruno.consultarSaldo();
        ana.consultarSaldo();
    }
}
