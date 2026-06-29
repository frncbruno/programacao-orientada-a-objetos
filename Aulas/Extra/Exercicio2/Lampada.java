public class Lampada implements Controlavel {

    boolean acesa;

    public void ligar() {
        acesa = true;
        System.out.println("Lampada acesa.");
    }

    public void desligar() {
        acesa = false;
        System.out.println("Lampada apagada.");
    }

}
