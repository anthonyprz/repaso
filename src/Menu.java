import java.util.Scanner;
import java.util.ArrayList;

public class Menu {

	public static void main(String[] args) {

		ArrayList<Integer> cambio = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int num;
		int nuevo;

		System.out.println("1.  Introducir dato");
		int dato = sc.nextInt();
		cambio.add(dato);
		System.out.println("<><><><><><><><><>menu<><><><><><><><><><><><><><><><><><><><>");
		System.out.println("1.  Modificar dato (pedir el dato a modificar y el nuevo dato)");
		System.out.println("2.  Eliminar dato");
		System.out.println("3.  Buscar dato");
		System.out.println("4.  Mostrar datos");
		System.out.println("5.  Salir");
		System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
		
		num = sc.nextInt();
			if(num!=5){
				switch (num) {

					case 1:  
							System.out.println("introduce un valor nuevo");
							nuevo = sc.nextInt();
							cambio.set(0, nuevo);
							System.out.println("dato cambiado a " + cambio);
					break;
					case 2: 
							cambio.remove(0);
							System.out.println("se a eliminado el dato " + cambio);
					break;
					case 3:
							System.out.println("introduce una posicion para saber que numero tiene");
							int buscar = sc.nextInt();
							cambio.get(buscar-1);
							System.out.println("el dato que buscas es " + cambio);
					break; 
					case 4:
							System.out.println("el dato es " + dato);
					break; 
					default:
						System.out.println("no has introducido un numero valido");
						break;

			
				}
			}
	}
	
}