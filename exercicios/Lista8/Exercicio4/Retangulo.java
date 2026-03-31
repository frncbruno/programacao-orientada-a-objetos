package pkg;

public class Retangulo {
    public double altura;
    public double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura() { return altura; }
    public double getLargura() { return largura; }
    
    public void calcularArea() {
    	double area;
    	area = altura * largura;
    	System.out.println("A área é: "+area);
    }
    
    public void calcularPerimetro() {
    	double perimetro;
    	perimetro = (altura*2) + (largura*2);
    	System.out.println("O perímetro é: "+perimetro);
    	
    }
    
    public void calcularDiagonal() {
        // d = raiz quadrada de (a² + l²)
        double diagonal = Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2));
        System.out.println("A diagonal é: " + diagonal);
    }
        
    public boolean ehQuadrado() {
    	if (largura == altura) {
    		System.out.println("É quadrado.");
    		return true;
    	} else {
    		System.out.println("Não é quadrado.");
    		return false;
    	}
    }
    }
