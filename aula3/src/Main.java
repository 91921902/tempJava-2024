import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        int n, maior = -1;
        for(int i=0; i<10; i++){
            n = Integer.parseInt(JOptionPane.showInputDialog((i+1) + ") Digite um numero: "));
            if(n>maior){
                maior = n;

            }
        }
        System.out.printf("O maior numero digitado foi: %d", maior);

    }
}