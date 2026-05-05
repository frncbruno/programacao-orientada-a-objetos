package pkg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria();
        cb.calcularSaldo();

        ContaCorrente cc = new ContaCorrente();
        cc.calcularSaldo();

        cb.calcularSaldo();
        cc.calcularSaldo();
    }
}
