import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {   
    Scanner leer= new Scanner(System.in);
    int ced;
    int ingresar;
    int vilma = 0;
    int betty= 0;
    int pedro= 0;
    int pablo=0;
    int blanco=0;
    int total;
    int votos;
    int num =0;
    double x;
    double y;
    double z;
    double c;
    double d;

    System.out.println("ingrese el numero personas que van ha votar" );
    votos = leer.nextInt();

    while (num <= votos)
    {

    System.out.println("ingrese su numero de documento");
    ced = leer.nextInt();
    System.out.println("indique por quien vota: 1- Vilma, 2-Betty, 3- Pedro, 4- Pablo y 5 Voto en blanco");
    ingresar = leer.nextInt();
    switch (ingresar){
        case 1:

            vilma=vilma+1;
            
            break;
        case 2:
            betty=betty+1;
            
            break;
        case 3:
            pedro=pedro+1;
            
            break;
        case 4:
            pablo=pablo+1;
            
            break;
        case 5:
            blanco=blanco+1;

    }
    num=num+1;
    if( num == votos){
    x= (vilma*100)/votos;
    y= (betty*100)/votos;
    z= (pedro*100)/votos;
    c= (pablo*100)/votos;
    d= (blanco*100)/votos;
    
    System.out.println("votos vilma: " + vilma + " /// porcentaje del total de votos: "+x+ " %");
    System.out.println("votos betty: " + betty + " /// porcentaje del total de votos: "+y+ " %");
    System.out.println("votos pedro: " + pedro + " /// porcentaje del total de votos: "+z+ " %");
    System.out.println("votos pablo: " + pablo + " /// porcentaje del total de votos: "+c+ " %");
    System.out.println("votos en blanco: " + blanco + " /// porcentaje del total de votos: "+d+ " %");
    System.out.println("Gran total votacion: "+ votos + " /// porcentaje del total de votos: "+ "100 %");

}
}
}
}