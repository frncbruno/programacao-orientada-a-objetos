public class Principal {

    public static void main(String[] args) {

        Televisao tv = new Televisao();

        tv.ligar();
        tv.desligar();

        System.out.println();

        Lampada lampada = new Lampada();

        lampada.ligar();
        lampada.desligar();

    }

}
