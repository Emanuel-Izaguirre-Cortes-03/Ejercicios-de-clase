package tarea011;

import java.util.Scanner;

public class MainMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Ejecutar Clase 1-10");
            System.out.println("2. Ejecutar Clase 11-20");
            System.out.println("3. Ejecutar Clase 21-30");
            System.out.println("4. Ejecutar Clase 31-40");
            System.out.println("5. Ejecutar Clase 41-50");
            System.out.println("6. Ejecutar Clase 51-60");
            System.out.println("7. Ejecutar Clase 61-67");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
            case 1:
                programa1.main(args);
                Programa2.main(args);
                Programa3.main(args);
                Programa4.main(args);
                Programa5.main(args);
                Programa6.main(args);
                Programa7.main(args);
                Programa9.main(args);
                Programa10.main(args);
                break;
            case 2:
                Programa11.main(args);
                Programa12.main(args);
                Programa13A.main(args);
                Programa13B.main(args);
                Programa14A.main(args);
                Programa14B.main(args);
                Programa15.main(args);
                Programa16A.main(args);
                Programa16B.main(args);
                Programa17.main(args);
                Programa18.main(args);
                Programa19.main(args);
                Programa20.main(args);
                break;
            case 3:
                Programa21.main(args);
                Programa22.main(args);
                Programa23.main(args);
                Programa24.main(args);
                Programa25.main(args);
                Programa26.main(args);
                Programa27A.main(args);
                Programa27B.main(args);
                Programa28.main(args);
                Programa29.main(args);
                Programa30.main(args);
                break;
            case 4:
            	Programa31.main(args);
            	Programa32.main(args);
            	Programa33.main(args);
            	Programa34.main(args);
            	Programa35.main(args);
            	Programa36.main(args);
            	Programa37.main(args);
            	Programa38.main(args);
            	Programa39.main(args);
            	Programa40.main(args);
            	break;
            case 5:
            	Programa41.main(args);
            	Programa42A.main(args);
            	Programa42B.main(args);
            	Programa43.main(args);
            	Programa44.main(args);
            	Programa45.main(args);
            	Programa46.main(args);
            	Programa47.main(args);
            	Programa48.main(args);
            	Programa49.main(args);
            	Programa50.main(args);
            	break;
            case 6:
            	Programa51.main(args);
            	Programa52.main(args);
            	Programa53.main(args);
            	Programa54.main(args);
            	Programa55.main(args);
            	Programa56.main(args);
            	Programa57.main(args);
            	Programa58.main(args);
            	Programa59.main(args);
            	Programa60.main(args);
            	break;
            case 7:
            	Programa61A.main(args);
            	Programa61B.main(args);
            	Programa62.main(args);
            	Programa63.main(args);
            	Programa64A.main(args);
            	Programa64B.main(args);
            	Programa65.main(args);
            	Programa66.main(args);
            	Programa67.main(args);
            	break;
            case 8:
                System.out.println("Saliendo del programa.");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    } while (opcion != 8);

    scanner.close();
	
	}

}
