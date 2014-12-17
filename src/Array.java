import java.util.Arrays;
public class Array {
	public static void main(String[] args) {
	

			//se crea el array
		 //	int [] numeros;//definicion 
		 //	numeros = new int [5];//indicar espacio 
		 int numeros []= { 8, 1, 5, 9, 3};//declarar valores
		 int intercambio;
		 for (int n =0; n<numeros.length-1; n++){

		 	for(int i = n+1; i<numeros.length; i++){
		 		if (numeros[n]>numeros[i]){

		 			intercambio = numeros[n];
		 			numeros[n] = numeros[i];
		 			numeros[i] = intercambio;

		 		}
		 	}
		 }
		 for (int l = 0;l<numeros.length;l++ ) {
		 	System.out.println("numeros ordenados de - a + =" + (numeros[l]));
		 	
		 }

	}
	
}