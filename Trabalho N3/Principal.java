import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArquivoVeiculo arquivo = new ArquivoVeiculo("veiculos");
        List<Veiculo> listaVeiculos = arquivo.lerLista();

        while (true) {
            System.out.println("\n----- MENU -----");
            System.out.println("1 - Cadastrar veiculo");
            System.out.println("2 - Alterar quilometragem do veiculo");
            System.out.println("3 - Excluir veiculo pelo numero da placa");
            System.out.println("4 - Sair do sistema");
            System.out.print("Escolha uma opcao: ");
            int opcao = teclado.nextInt();
            teclado.nextLine();

            if (opcao == 1) {
                System.out.print("Placa: ");
                String placa = teclado.nextLine();
                System.out.print("Modelo: ");
                String modelo = teclado.nextLine();
                System.out.print("Marca: ");
                String marca = teclado.nextLine();
                System.out.print("Ano de fabricacao: ");
                int ano = teclado.nextInt();
                System.out.print("Quilometragem: ");
                double km = teclado.nextDouble();
                teclado.nextLine();

                Veiculo veiculo = new Veiculo(placa, modelo, marca, ano, km);
                listaVeiculos.add(veiculo);
                arquivo.gravarLista(listaVeiculos);

                System.out.println("Veiculo cadastrado com sucesso!");

            } else if (opcao == 2) {
                System.out.print("Digite a placa do veiculo: ");
                String placaAlterar = teclado.nextLine();
                boolean encontrado = false;

                for (Veiculo v : listaVeiculos) {
                    if (v.getPlaca().equalsIgnoreCase(placaAlterar)) {
                        System.out.print("Nova quilometragem: ");
                        double novaKm = teclado.nextDouble();
                        teclado.nextLine();
                        v.setQuilometragem(novaKm);
                        arquivo.gravarLista(listaVeiculos);
                        System.out.println("Quilometragem atualizada com sucesso!");
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println("Veiculo nao encontrado.");
                }

            } else if (opcao == 3) {
                System.out.print("Digite a placa do veiculo a ser excluido: ");
                String placaExcluir = teclado.nextLine();
                Veiculo veiculoExcluir = null;

                for (Veiculo v : listaVeiculos) {
                    if (v.getPlaca().equalsIgnoreCase(placaExcluir)) {
                        veiculoExcluir = v;
                        break;
                    }
                }

                if (veiculoExcluir != null) {
                    listaVeiculos.remove(veiculoExcluir);
                    arquivo.gravarLista(listaVeiculos);
                    System.out.println("Veiculo excluido com sucesso!");
                } else {
                    System.out.println("Veiculo nao encontrado.");
                }

            } else if (opcao == 4) {
                System.out.println("Saindo do sistema...");
                teclado.close();
                break;

            } else {
                System.out.println("Opcao invalida!");
            }
        }
    }
}
