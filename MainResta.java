import java.util.Scanner;
public class MainResta {
    public static void main(String[] args) {
        Resta n1 = new Resta();
        Scanner num= new Scanner (System.in);
        System.out.println("Resta de 2 numeros");
        System.out.println("Ingrese un numero:");
        n1.setA(num.nextInt());
        System.out.println("Ingrese segundo1 numero:");
        n1.setB(num.nextInt());
        System.out.println("El resultado es:");
        System.out.println(n1.restar());
        System.out.println(n1);
        
        n1.getA();
        n1.getB();
    
    }
}