import javax.swing.*;
import java.util.Scanner;
import java.util.Scanner;

import java.util.Scanner;


import java.util.Scanner;

import java.util.Scanner;
import javax.swing.*;
import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;
import javax.swing.*;
import java.util.Scanner;
import javax.swing.*;
import java.util.Scanner;
import javax.swing.*;
import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] salarios = new float[100]; // Cria um vetor para armazenar até 100 salários
        int numSalarios = 0; // Variável para controlar o número de salários digitados
        float maiorSalario = 0;
        float folhaAntiga = 0;
        float folhaCorrigida = 0;

        while (true) {
            System.out.print("Digite o próximo salário (ou 0 para parar): R$ ");
            float salario = scanner.nextFloat();

            if (salario == 0) {
                break;
            }

            salarios[numSalarios] = salario; // Armazena o salário no vetor
            numSalarios++; // Incrementa o contador de salários

            if (salario > maiorSalario) {
                maiorSalario = salario;
            }

            folhaAntiga += salario; // Adiciona o salário à folha de pagamento antiga

            if (salario < 2500) {
                float aumento = salario * 0.1f; // Calcula o valor do aumento (10% do salário)
                salario += aumento; // Adiciona o aumento ao salário original
            }

            folhaCorrigida += salario; // Adiciona o salário corrigido à folha de pagamento corrigida
        }

        if (maiorSalario == 0) {
            System.out.println("Nenhum salário foi digitado.");
        } else {
            System.out.println("O maior salário digitado é: R$" + maiorSalario);
        }

        System.out.println("Total da folha de pagamento antiga: R$" + folhaAntiga);
        System.out.println("Total da folha de pagamento corrigida: R$" + folhaCorrigida);

        scanner.close();
    }
}
