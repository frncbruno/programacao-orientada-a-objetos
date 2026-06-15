public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;

    public abstract void acelerar();
    public abstract void frear();
}

public class Carro extends Veiculo {
    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando: Vrummm!");
    }

    @Override
    public void frear() {
        System.out.println("O carro freou!");
    }
}

public class Moto extends Veiculo {
    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando: Randandan!");
    }

    @Override
    public void frear() {
        System.out.println("A moto freou!");
    }
}
