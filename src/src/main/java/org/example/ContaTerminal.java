package org.example;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        String[] perguntas = {"Por favor, digite o numero da conta!", "Por favor, digite o número da Agência !", "Por favor, digite seu nome!", "Por favor digite seu saldo!"};
        Scanner scanner = new Scanner(System.in);
        int numeroConta = 0;
        String numeroAgencia = "";
        String nomeCliente = "";
        double saldo = 0.0;

        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
            switch (i) {
                case 0:
                    numeroConta = Integer.parseInt(scanner.nextLine());
                    break;
                case 1:
                    numeroAgencia = scanner.nextLine();
                    break;
                case 2:
                    nomeCliente = scanner.nextLine();
                    break;
                case 3:
                    saldo = Double.parseDouble(scanner.nextLine());
            }
        }


        String resultado = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque";
        System.out.println(resultado);
    }
}