import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//    **Ler n salários e:**
//
//    **(a) encontrar o maior**
//
//    **(b) aplicar 10% de aumento a quem ganha menos de R$2500,00**
//
//    **(c) mostrar o total da folha de pagamento antiga**
//
//    **(d) mostrar o total da folha corrigida**
//
//    Você pode escolher entre `perguntar ao usuário quantos salários serão digitados` ou `ler salários até que seja digitado um salário de zero reais`.
//

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

            if (salario < 2500) {
                salario *= 1.1;
                folhaCorrigida += salario;
                System.out.println("Salário com aumento de 10%: R$" + salario);
            } else {
                folhaCorrigida += salario;
                System.out.println("Salário: R$" + salario);
            }

            folhaAntiga += salario;
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