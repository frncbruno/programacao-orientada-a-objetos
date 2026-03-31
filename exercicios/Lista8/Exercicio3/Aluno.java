package pkg;

public class Aluno {
	public float nota1;
	public float nota2;
	public float nota3;
	
	float soma;
	float media;
	
	public void Notas(float n1, float n2, float n3) {
		nota1 = n1;
		nota2 = n2;
		nota3 = n3;
	}
	
	public void calcularMedia(float n1, float n2, float n3) {
		float soma = n1 + n2 + n3;
		float media = soma / 3;
		System.out.println("Media das notas = "+media);
	}
	
	public boolean aprovado() {
		if (media >= 7) {
			return true;
		} else {
			return false;
		}
	}
	
	public void maiorNota(float n1, float n2, float n3) {
		float maiorN = n1;
		
		if (n2 > maiorN) {
			maiorN = n2;
		if (n3 > maiorN) {
			maiorN = n3;
		}
		
		System.out.println("Maior Nota: "+maiorN);
		}
	}	

	
	public void menorNota(float n1, float n2, float n3) {
		float menorN = n1;
		
		 if (n2 < menorN) {
			 menorN = n2;
		 }
		  if (n3 < menorN) {
			 menorN = n3;
		 }
		  
		System.out.println("Menor Nota: "+menorN);
	}
	
}
