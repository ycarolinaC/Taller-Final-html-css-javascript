import java.io.IOException;
import java.util.Scanner;

public class Operaciones {
	private boolean bandera = true;
    private int opcion;
    private Scanner input;
    private float a, b;
    
    public Operaciones() throws IOException{
    	input = new Scanner(System.in);
    	do {
    		menu();
    		bandera = evaluar(opcion);
    	}while(bandera==true);
    	
    }
    
    private void menu(){
        System.out.println("Calculadora");
        System.out.println("Elige una opci�n");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.M�dulo de la divisi�n");
        System.out.println("6.Salir");
        opcion= solicitarInt();

    }
    
    private void solicitarDatos() {
    	 System.out.println("Ingrese el n�mero 1");
    	 a = solicitarF();
    	 System.out.println("Ingrese el n�mero 2");
    	 b = solicitarF();
    	 
    }
    
    private int solicitarInt(){   
        return Integer.parseInt(input.nextLine());
    }
    
    private float solicitarF(){   
        return Float.parseFloat(input.nextLine());
    }
    
    private boolean evaluar(int opcion) throws IOException{
    	float r;
    	switch(opcion) {
    	case 1:
    		solicitarDatos();
    		r = a+b;
    		System.out.println(r);
    		return true;
    	case 2:
    		solicitarDatos();
    		r = a-b;
    		System.out.println(r);
    		return true;
    	case 3:
    		solicitarDatos();
    		r = a*b;
    		System.out.println(r);
    		return true;
    	case 4:
    		solicitarDatos();
    		if(b!=0) {
    			r = a/b;
        		System.out.println(r);
    		}else {
    			System.out.println("Error");
    		}
    		
    		return true;
    	case 5:
    		solicitarDatos();
    		if(b!=0) {
    			r = a%b;
        		System.out.println(r);
    		}else {
    			System.out.println("Error");
    		}
    		
    		return true;
    	case 6:
    		System.out.println("Operaciones finalizadas");
    		
    		return false;
    		
    	default:
            System.out.println("Ingresa un valor v�lido");
            System.in.read();
    	}
    	
    	return true;
    }

	
}


