import java.util.Scanner;

public class inicio {
    public static void main(String[] args) {



        boolean entrada = true;
        while (entrada){
            int opt=0;
            try (Scanner sc = new Scanner (System.in)) {
                System.out.println("Bienvenido, seleccione una opcion para continuar");
                System.out.println("1. Estudiante de ingenieria");
                System.out.println("2. Estudiante de diseño");
                System.out.println("3. Inventario total");
                System.out.println("4. Salir");
                opt=sc.nextInt();
            }
                switch (opt) {
                    case 1:
                        
                        break;
                    
                    case 2:
                        
                        break;
                
                    case 3:
                        
                        break;

                    case 4:
                        System.out.println("Hasta luego.");
                        entrada = false;
                        break;
                    default:
                        System.out.println("Opcion no valida, porfavor valide");
                        break;
                }
        }
    }
}