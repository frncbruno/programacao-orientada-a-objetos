public class Boletim {
    public void imprimirStatus(Aluno a) {
        if (a.notaFinal >= 6) {
            System.out.println("O aluno " + a.nome + " foi aprovado.");
        } else {
            System.out.println("O aluno " + a.nome + " foi reprovado.");
        }
    }
}
