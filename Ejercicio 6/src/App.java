import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        String seguir;
        int Codigo_Estudiante;
        int Nota_M1,  Numero_Creditos1, Nota_M2,  Numero_Creditos2,Nota_M3,  
        Numero_Creditos3,Nota_M4,  Numero_Creditos4, O1,O2, O3, O4, Suma,Creditos_Cursados, Promedio; 
        do
        {
            //Entrada
            System.out.println("Codigo de estudiantes: ");
            Codigo_Estudiante = leer.nextInt();
            System.out.println("Nota Materia 1: ");
            Nota_M1 = leer.nextInt();
            System.out.println("Número de Creditos M1: ");
            Numero_Creditos1 = leer.nextInt();
            System.out.println("Nota Materia 2: ");
            Nota_M2 = leer.nextInt();
            System.out.println("Número de Creditos M2: ");
            Numero_Creditos2 = leer.nextInt();
            System.out.println("Nota Materia 3: ");
            Nota_M3 = leer.nextInt();
            System.out.println("Número de Creditos M3: ");
            Numero_Creditos3 = leer.nextInt();
            System.out.println("Nota Materia 4: ");
            Nota_M4 = leer.nextInt();
            System.out.println("Número de Creditos M4: ");
            Numero_Creditos4 = leer.nextInt();

            //Proceso
            O1 = Nota_M1 * Numero_Creditos1;
            O2 = Nota_M2 * Numero_Creditos2;
            O3 = Nota_M3 * Numero_Creditos3;
            O4 = Nota_M4 * Numero_Creditos4;
            Suma = O1 + O2 + O3 + O4;
            Creditos_Cursados = Numero_Creditos1 + Numero_Creditos2 + Numero_Creditos3 + Numero_Creditos4;
            Promedio = Suma / Creditos_Cursados;                    
            
        
            System.out.println("Codigo de Estudiante: " + Codigo_Estudiante);
            System.out.println("Número de Creditos Cursados: " + Creditos_Cursados);
            System.out.println("Promedio: " + Promedio);
            
        System.out.println("Desea seguir (S/N): ");
        seguir = leer.next();

        }while(seguir.equalsIgnoreCase("S"));

    }
}