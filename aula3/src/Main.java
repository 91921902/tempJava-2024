import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        int numeroDigitado, maior = -1;
        for (int i = 0; i < 10; i++) {
            numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ") Digite um numero: "));
            if (numeroDigitado > maior) {
                maior = numeroDigitado;

            }
        }
        System.out.printf("O maior numero digitado foi: %d", maior);

    }
}