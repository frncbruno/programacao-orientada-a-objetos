import java.util.Scanner;

public class Netbook extends Computador {

    public String exibeMarca() {
        return "Marca: " + Marca;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Netbook nb = new Netbook();

        System.out.print("Informe a marca do Netbook: ");
        String marca = sc.nextLine();
        nb.setMarca(marca);

        // modelo é sempre "Portátil" conforme a dica
        nb.setModelo("Portátil");

        System.out.println("---");
        System.out.println(nb.exibeMarca());
        System.out.println(nb.exibeModelo()); // método herdado de Computador

        sc.close();
    }
}
