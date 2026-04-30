import java.util.Scanner;

public class Notebook extends Computador {

    public String exibeMarca() {
        return "Marca: " + Marca;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Notebook n = new Notebook();

        System.out.print("Informe a marca do Notebook: ");
        String marca = sc.nextLine();
        n.setMarca(marca);

        // modelo é sempre "Portátil" conforme a dica
        n.setModelo("Portátil");

        System.out.println("---");
        System.out.println(n.exibeMarca());
        System.out.println(n.exibeModelo()); // método herdado de Computador

        sc.close();
    }
}
