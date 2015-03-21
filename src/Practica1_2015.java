import java.util.*;


public class Practica1_2015 {

	public static void main(String[] args) {
		// Edgar Alfonso Pérez Hernández
		// Carnet: 201021195
		
		int ee; int pp; int x ; int y; int z; int w; int v; int u = 0; 
		double aa = 0;
		
		Scanner a = new Scanner(System.in);
		System.out.println("Bienvenido al Menú");
		System.out.println("Ingrese el nivel al que desea iniciar");
		System.out.println("Seleccione nivel 1: ");
		System.out.println("Seleccione nivel 2: ");
		System.out.println("Opción 3 Salir");
		x = a.nextInt();
		//a.close();
		//switch(x){
		//case 1:
		
		if(x==1){
			System.out.println("Selecciono el nivel 1");
			Scanner b = new Scanner(System.in);
			System.out.println("Selecione problemas del 1 al 5: ");
			y = b.nextInt();
			
			if (y==1)
				for(int i = 1; i < 5; i++){
					for(int j = 4-i; j > 0 ; j--){
						System.out.print(" ");}
						for(int k=0; k<i; k++) {
						System.out.print("**"); }
						System.out.println( );
				}
	
						for(int ii = 4; ii > 0; ii--){
							for(int jj = 1+ii; jj <5 ; jj++){
								System.out.print(" ");}
								for(int kk=ii; kk>0; kk--){ 
								System.out.print("**"); }			
								System.out.println( );
						}
		}
						
				
			else if (y==2){
				System.out.println("Selecciono el nivel 1 problema 2: ");
				Scanner e = new Scanner(System.in);
				System.out.println("Ingrese 6 notas");
				x = e.nextInt();
				System.out.println("Ingrese la segunda nota:");
				y = e.nextInt();
				System.out.println("Ingrese la tercera nota:");
				z = e.nextInt();
				System.out.println("Ingrese la cuarta nota:");
				w = e.nextInt();
				System.out.println("Ingrese la quinta nota:");
				v = e.nextInt();
				System.out.println("Ingrese la sexta nota:");
				u = e.nextInt();
				
				ee = (x+y+z+w+v+u)/6;
				
				if (ee > 0 && ee <= 59)
					pp = 'A';
				else if (ee > 60 && ee <= 69)
					pp = 'B';
				else if (ee > 70 && ee <= 79)
					pp = 'C';
				else if (ee > 80 && ee <= 89)
					pp = 'D';
				else if (ee > 90 && ee <= 100)
					pp = 'E';
				else 
					System.out.println("La nota no es real");
				
				System.out.println(" ...Media.....Puntuación.. ");
				System.out.println(" ..90 - 100.......A.. ");
				System.out.println(" ..80 - 89.......B.. ");
				System.out.println(" ..70 - 79.......C.. ");
				System.out.println(" ..60 - 69.......D.. ");
				System.out.println(" ...0 - 59.......E.. ");
				System.out.println("La Media es :" + ee );
				//System.out.println("La Ponderación es:" + pp );
							
			
			}
			
			else if (y==3){
				double bb = 0;
				System.out.println("Selecciono el nivel 1 problema 3: ");
			Scanner ff = new Scanner(System.in);
			System.out.println("Ingrese la hora en notación 24 horas: ");
			aa = ff.nextInt();
			
			
			if (aa > 12 && aa < 25 ){
				bb = aa-12;
				System.out.println("la hora nueva es :" + bb );
			}
			else 
				System.out.println("La hora no existe ");
			
				
			
			
			}
			else if (y==4){
				System.out.println("Selecciono el nivel 1 problema 4: ");
				Scanner ff = new Scanner(System.in);
				System.out.println("Ingrese que figura desea calcular: ");
				aa = ff.nextInt();
		
					
			
			}
			else if (y==5){
				System.out.println("Selecione problemas 5: ");
			}
			else{
				System.out.println("Ese problema no existe ");
		}
	
		else if (x==2){
			
			System.out.println("Selecciono el nivel 2");
			Scanner d = new Scanner(System.in);
			System.out.println("Selecione problemas del 6 al 15: ");
			z = d.nextInt();
			
			if (z==6){
				System.out.println("Seleccione el problema 6 ");
			}
			else if (z==7){
				System.out.println("Seleccione el problema 7 ");
			}
			else if (z==8){
				System.out.println("Seleccione el problema 8 ");
			}
			else if (z==9){
				System.out.println("Seleccione el problema 9 ");
			}
			else if (z==10){
				//System.out.println("Seleccione el problema 10 ");
				int limite=0;
		        for(int i=1; i<=limite;i++)
		        {
		            for(int j=1;j<=i;j++)
		            {
		                System.out.print(i);
		            }
		            System.out.println("");
		        }
			}
		}
			else if (z==11){
				System.out.println("Seleccione el problema 11 ");
			}
			else if (z==12){
				System.out.println("Seleccione el problema 12 ");
			}
			else if (z==13){
				System.out.println("Seleccione el problema 13 ");
			}
			else if (z==14){
				System.out.println("Seleccione el problema 14 ");
			}
			else if (z==15){
				System.out.println("Seleccione el problema 15 ");
			}
			else{
				System.out.println("Ese problema no existe ");
				}
			//break;
		//default:
	}
		else
			System.out.println("Salir del programa: ");
	}
}