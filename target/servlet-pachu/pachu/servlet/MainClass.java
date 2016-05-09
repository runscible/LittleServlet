import java.util.Array;
public class MainClass {
	public String nombre;
	public int edad;
// acá se construye la clase (lo que se va a ejecutar a la hora de de hacer las cosas)
	public persona (nombre , edad){
		
		this.nombre;
		this.edad;		
	}
//acá se imprime la información de las personas
	
	static void ImprimePersonas(persona[]array){
		for (int i = 0; < array.lenght; i++){
			System.out.println(i++)+ " " + array[i]nombre + "edad: "+ array[i]edad;
					
		}
	}
public static void main (String[]args){
	persona[] arrayPersonas = new persona[5];
	arrayPersonas[0]= new persona("Mario",90);
	arrayPersonas[1]= new persona("José",55);
	arrayPersonas[2]= new persona("Juan",56);
	arrayPersonas[3]= new persona("Antonio",78);
	arrayPersonas[4]= new persona("Carmen",)56;
	}
	System.out.Println("array ordenado");
	imprimePersonas(arrayPersonas);
}
