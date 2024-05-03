import java.util.Scanner;

public class MainResta {
    public static void main(String[] args) {
        Scanner opc = new Scanner(System.in);
        System.out.println("Ingresa un numero:");
        int a = opc.nextInt();
        System.out.println("Ingresa un numero:");
        int b = opc.nextInt();
        Resta r1 = new Resta();
        r1.setA(a);
        r1.setB(b);
        r1.restar();
        System.out.println(r1.restar());
        System.out.println(r1.toString());
    }
}