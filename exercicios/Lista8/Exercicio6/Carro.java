package pkg;

public class Carro {
    public String modelo;
    public double velocidadeAtual;
    public double velocidadeMaxima;

    public Carro(String modelo, double velocidadeAtual, double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = velocidadeAtual;
        this.modelo = modelo;
    }
    
    public void acelerar(int valor) {
    	this.velocidadeAtual += valor; 
    	if (velocidadeAtual < velocidadeMaxima) {
    		System.out.println("Aumento de "+ valor +" permitido. Velocidade atual: "+velocidadeAtual);
    	} else {
    		System.out.println("O aumento ultrapassaria a velocidade máxima. Não permitido.");
    	}
    }
    
    public void frear(int valor) {
    	this.velocidadeAtual -= valor;
    	if(velocidadeAtual >= 0) {
    	System.out.println("Velocidade atual: "+velocidadeAtual);
    } else { 
    	System.out.println("Velocidade atual ficaria negativa. Não permitido.");
    }
}

    public boolean atingiuVelocidadeMaxima() {
    	if (velocidadeAtual >= velocidadeMaxima) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
    public void calcularTempoViagem(double distancia) {
        if (velocidadeAtual > 0) {
            double tempo = distancia / velocidadeAtual;
            System.out.println("Para uma distância de " + distancia + "km, o tempo será de: " + tempo + " horas.");
        } else {
            System.out.println("O carro está parado. Não é possível calcular o tempo de viagem.");
        }
    }
    
}
