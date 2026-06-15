public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        validarData();
    }

    public void validarData() {
        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("Mês inválido!");
        }
        if (dia < 1 || dia > 31) {
            throw new IllegalArgumentException("Dia inválido!");
        }
        // Validação simples do exemplo: fevereiro não pode passar de 29 dias
        if (mes == 2 && dia > 29) {
            throw new IllegalArgumentException("Data inválida! Fevereiro não tem mais de 29 dias.");
        }
    }
}
