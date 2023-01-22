
import java.util.Scanner;

public class App{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String Esferas = "ABCD";

        double A, B, C, D, peso_diferente;
        double peso_normal;

        System.out.print("Ingresar el valor de A: ");
        A = in.nextDouble();
        System.out.print("Ingresar el valor de B: ");
        B = in.nextDouble();
        System.out.print("Ingresar el valor de C: ");
        C = in.nextDouble();
        System.out.print("Ingresar el valor de D: ");
        D = in.nextDouble();

        peso_normal=0;
        peso_diferente=0;

        if(A==B&B==C){
            System.out.println("D es la esfera diferente.");
            peso_normal=A;
        
        }else{
            peso_diferente=D;

        }if(B==C&C==D){
            System.out.println("A es la esfera diferente.");
            peso_normal=B;
        
        }else{
            peso_diferente=A;
        }if(C==D&D==A)
        {
            System.out.println("B es la esfera diferente.");
            peso_normal=C;
        }
        else
            peso_diferente=C;
        if(D==A&A==B)
        {
            System.out.println("C es la esfera diferente.");
            peso_normal=D;
        }
        else
            peso_diferente=C;

        if(peso_diferente < peso_normal){
            System.out.println("Bola con menos peso: " + peso_diferente);
        }else{
            System.out.println("Bola con mayor peso: " + peso_diferente);
        }
        }

    }

