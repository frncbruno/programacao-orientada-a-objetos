//Crie uma classe Aluno com os atributos nome e notaFinal. Em seguida, crie uma 
// classe Boletim com um método imprimirStatus(Aluno a) que imprime se o aluno foi 
// aprovado (nota ≥ 6) ou reprovado.

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        
        Aluno aluno1 = new Aluno("João", 7.5);
        alunos.add(aluno1);
        
        Aluno aluno2 = new Aluno("Maria", 5.0);
        alunos.add(aluno2);
        
        Boletim boletim = new Boletim();
        
        for (Aluno aluno : alunos) {
            boletim.imprimirStatus(aluno);
        }
    }
}
