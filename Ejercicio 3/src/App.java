
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        //datos
        double Total, porcentaje1, porcentaje2, departamento1, departamento2, departamento3, suma, promedio;
        double Salario=1000000;
        //Entrada
        System.out.println("Digite la cantidad vendida D1: ");
        departamento1 = leer.nextDouble();
        System.out.println("Digite la cantidad vendida D2: ");
        departamento2 = leer.nextDouble();
        System.out.println("Digite la cantidad vendida D3: ");
        departamento3 = leer.nextDouble();
        //Proceso 
        suma = departamento1 + departamento2 + departamento3;
        porcentaje1 = suma * 0.33;
        porcentaje2 = Salario * 0.2;

        //Salida 
        if (departamento1 > porcentaje1){
            Total = Salario + porcentaje2;
            System.out.println("Departamento 1");
            System.out.println("Salario empleados= " + Total);
        }else{
            System.out.println("Departamento 1");
            System.out.println("Salario empleados= " + Salario);}
        if (departamento2 > porcentaje1){
            Total = Salario + porcentaje2;
            System.out.println("Departamento 2");
            System.out.println("Salario empleados= " + Total);
        }else{
            System.out.println("Departamento 2");
            System.out.println("Salario empleados= " + Salario);}
        if (departamento3 > porcentaje1){
            Total = Salario + porcentaje2;
            System.out.println("Departamento 3");
            System.out.println("Salario empleados= " + Total);
        }else{
            System.out.println("Departamento 3");
            System.out.println("Salario empleados= " + Salario);}

}
}

