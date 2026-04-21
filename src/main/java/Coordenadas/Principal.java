package Coordenadas;

import java.util.Scanner;


public class Principal {
	static Scanner sc = new Scanner(System.in);
	    public static void main(String args[]) {
	    	
	        // Check the number of arguments (the two coordinates)
	/**        if (args.length != 2) {
	            System.out.println("Uso: java comprobarcoordenadas x y");
	            System.out.println("donde x e y son las coordenadas de un Punto.");
	            System.exit(1);
	        }     **/
	    	
	    	
	        System.out.println("Introduce la coordenada x");
	        double x=Double.parseDouble(sc.next());
	       
	        
	        System.out.println("Introduce la coordenada y");
	        double y=Double.parseDouble(sc.next());
	        
	        Punto p = new Punto( x, y);
	        
	        System.out.println("El Punto es " + "(" + p.getX() +","+ p.getY()+ ")");
	        
	        System.out.println("La coordinada x es:  " + p.getX()
	        
	                           + " y la coordinada y es:  " + p.getY());
	        

	        Punto[] PuntosArray = new Punto[] {new Punto(1, 1), new Punto(5, 3),
	                                           new Punto(10, 10), new Punto(-3, 2),
	                                           new Punto(-4, -5)};
	        
	        for (int i = 0; i < PuntosArray.length; i++) {
	            System.out.println("Su distancia al punto ("
	                               + PuntosArray[i].getX() +","+ PuntosArray[i].getY() + ") es:   "
	                               + p.distancia(PuntosArray[i]));
	        }
	        
	       
	        for (int i = 0; i < PuntosArray.length; i++) {
	        	
	        	if (p.compara(PuntosArray[i])){
	        		System.out.println("El punto ("
	                              + p.getX() +","+ p.getY() + ") es igual a otro");
	                               
	        	}
	        }
	    }
}  
