import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) throws Exception {
        
        somanum();
        
        
    }
        
        
        static void somanum() {
            
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o primeiro número:");
        int num1 =entrada.nextInt();
        System.out.println("Insira o segundo número:");
        int num2 =entrada.nextInt();
        System.out.println("Insira o terceiro número:");
        int num3 =entrada.nextInt();
        entrada.close();

        int soma=num1+num2+num3;

        System.out.println(soma);}

    
}
