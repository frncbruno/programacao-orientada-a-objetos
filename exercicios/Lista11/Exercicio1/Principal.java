public class Principal {

    public static void main(String[] args) {

        Retangulo r = new Retangulo();

        r.setCor("Azul");
        r.setPreenchido(true);

        r.setLargura(5);
        r.setAltura(3);

        System.out.println("Cor: " + r.getCor());
        System.out.println("Preenchido: " + r.isPreenchido());
        System.out.println("Largura: " + r.getLargura());
        System.out.println("Altura: " + r.getAltura());
        System.out.println("Área: " + r.calcularArea());
    }
}
