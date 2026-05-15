import java.util.Scanner;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;
        String cedula;
        
        ArrayList<Visitante> visitantes = new ArrayList<>();
        
        
        for(int i = 0; i < 5; i++) {
            System.out.print("|> Ingrese el nombre del visitante: ");
            nombre = sc.nextLine();
            System.out.print("|> Ingrese la cedula del visitante: ");
            cedula = sc.nextLine();
            System.out.print("|> Ingrese la edad del visitante: ");
            edad = sc.nextInt();
            sc.nextLine();

            System.out.println();

            Visitante visitante = new Visitante(nombre, edad, cedula);
            visitantes.add(visitante);
        }
        System.out.flush();

        System.out.println("\n==== LOS VISITANTES INGRESADOS SON ====\n");

        for(Visitante visitante : visitantes) {
            String cad = "Nombre: " + visitante.getNombre() +
                         "\nEdad: " + visitante.getEdad() +
                         "\nCedula: " + visitante.getCedula();

            System.out.println(cad);

            System.out.println("---------------------------------------");            
        }
    }
}