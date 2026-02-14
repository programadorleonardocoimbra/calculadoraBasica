import java.util.Scanner;

public class calculadoraBasica {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        double numero1, numero2;
        int opcao;

        //Ao abrir a calculadora, aparecerá um menu para o usuário escolher a operação desejada.
        System.out.print("=======  CALCULADORA SIMPLES ========" );
        System.out.print("1 - Soma");
        System.out.print("2 - Subtração");
        System.out.print("3 - Multiplicação");  
        System.out.print("4 - Divisão");
        System.out.print("Escolha a operação desejada: ");
        
        //O usuário deve digitar o número correspondente à operação que deseja realizar.
        opcao = scanner.nextInt();


        // Após escolher a operação, o usuário deve digitar o primeiro número da operação.
        System.out.print("Digite o primeiro número: ");
        // espaço para digitar o primeiro número:
        numero1 = scanner.nextDouble();

        // Em seguida, o usuário deve digitar o segundo número da operação.
        System.out.print("Digite o segundo número: ");
        // espaço para digitar o segundo número:
        numero2 = scanner.nextDouble();

        double resultado;

        switch ( opcao ) {

            // O programa realizará a operação de adição:
            case 1:
                resultado = numero1 + numero2;
                System.out.println("Resultado:" + resultado);
            break;

            // O programa realizará a operação de subtração:             
            case 2:
                resultado = numero1 - numero2;
                System.out.println("Resultado:" + resultado);
            break;

            // O programa realizará a operação de multiplicação:
            case 3:
                resultado = numero1 * numero2;
                System.out.println("Resultado:" + resultado);
            break;
            
            // O programa realizará a operação de divisão:
            case 4:
                resultado = numero1 / numero2;
                System.out.println("Resultado:" + resultado);
            break;
        
        }

    }
    }
