import java.util.*;
import java.io.*;

import javax.swing.JOptionPane;

public class Practica1_2015 {

	public static void main(String[] args) throws IOException {
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
			
			if (y==1){
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
			else
				System.out.println("Ese problema no existe ");
		}
		
		else if (x==2){
			
			System.out.println("Selecciono el nivel 2");
			Scanner d = new Scanner(System.in);
			System.out.println("Selecione problemas del 6 al 15: ");
			z = d.nextInt();
			
			if (z==6){
				//System.out.println("Seleccione el problema 6 ");
				double n1;
				double carac;
		        double n2;
		        double resultado=0;
		        char calculadora;
		  
		        
		    	System.out.println("Ingrese caracter a operar: ");
				Scanner calc = new Scanner (System.in);
		        char ope = calc.next().charAt(0);

		               switch (ope){
		            case 's':
				        Scanner suma = new Scanner(System.in);
						System.out.println("Ingrese 1 numero: ");
						n1 = suma.nextInt();
						System.out.println("Ingrese otro numero: ");
						n2 = suma.nextInt();
		                resultado=n1+n2;
		                System.out.println("La suma es: " +resultado);
		                break;
		            case 'r':
				        Scanner resta = new Scanner(System.in);
						System.out.println("Ingrese 1 numero: ");
						n1 = resta.nextInt();
						System.out.println("Ingrese otro numero: ");
						n2 = resta.nextInt();
		                resultado=n1-n2;
		                System.out.println("La diferencia es: " +resultado);
		                break;
		            case 'm':
				        Scanner multi = new Scanner(System.in);
						System.out.println("Ingrese 1 numero: ");
						n1 = multi.nextInt();
						System.out.println("Ingrese otro numero: ");
						n2 = multi.nextInt();
		                resultado=n1*n2;
		                System.out.println("La multiplicacion es: " +resultado);
		                break;
		            case 'd':
				        Scanner coci = new Scanner(System.in);
						System.out.println("Ingrese 1 numero: ");
						n1 = coci.nextInt();
						System.out.println("Ingrese otro numero: ");
						n2 = coci.nextInt();
		                resultado=n1/n2;
		                System.out.println("El Cociente es: " +resultado);
		                break;
		            }
		 
		      	    
			
				/*System.out.println("Ingrese un caracter s, r, m ó d");
		        int n1=0; int n2 = 0;
				char s = 0; char r=0; char m=0; char di=0; 
				Scanner p6 = new Scanner (System.in);
		        char calc = p6.next().charAt(0);
				if(calc=="s"){
				System.out.println("Selecciono la suma");
				Scanner suma = new Scanner(System.in);
				System.out.println("Ingrese 2 numeros: ");
				n1 = suma.nextInt();
				n2 = suma.nextInt();
				System.out.println("La suma es: " +(n1+n2));
				}
				else if(calc==r){
					System.out.println("Selecciono la suma");
					Scanner resta = new Scanner(System.in);
					System.out.println("Ingrese 2 numeros: ");
					n1 = resta.nextInt();
					n2 = resta.nextInt();
					System.out.println("La Diferencia es: " +(n1-n2));
					}*/
			}
			
			else if (z==7){
				//System.out.println("Seleccione el problema 7 ");
				int ta=0; 
				int tabla0;	int tabla1;	int tabla2;	int tabla3;	int tabla4; int tabla5; int tabla6;	int tabla7; int tabla8; int tabla9;	int tabla10 = 0;
				Scanner tablas = new Scanner(System.in);
				System.out.print(" Ingrese un numero de 0 a 10: ");
				ta = tablas.nextInt();
				tablas.close();
				if((ta>=0)&&(ta<=10)){
				System.out.println("Si es un numero valido, se mostrara la tabla de multiplicar de:" + ta);
				switch(ta){
				case 0:
				System.out.println("0X10=0");
				System.out.println("0X9=0");
				System.out.println("0X8=0");
				System.out.println("0X7=0");
				System.out.println("0X6=0");
				System.out.println("0X5=0");
				System.out.println("0X4=0");
				System.out.println("0X3=0");
				System.out.println("0X2=0");
				System.out.println("0X1=0");
				break;
				case 1:
					System.out.println("1X10=10");
					System.out.println("1X9=9");
					System.out.println("1X8=8");
					System.out.println("1X7=7");
					System.out.println("1X6=6");
					System.out.println("1X5=5");
					System.out.println("1X4=4");
					System.out.println("1X3=3");
					System.out.println("1X2=2");
					System.out.println("1X1=1");
					break;
				case 2:
					System.out.println("2X10=20");
					System.out.println("2X9=18");
					System.out.println("2X8=16");
					System.out.println("2X7=14");
					System.out.println("2X6=12");
					System.out.println("2X5=10");
					System.out.println("2X4=8");
					System.out.println("2X3=6");
					System.out.println("2X2=4");
					System.out.println("2X1=2");
					break;
				case 3:
					System.out.println("3X10=30");
					System.out.println("3X9=27");
					System.out.println("3X8=24");
					System.out.println("3X7=21");
					System.out.println("3X6=18");
					System.out.println("3X5=15");
					System.out.println("3X4=12");
					System.out.println("3X3=9");
					System.out.println("3X2=6");
					System.out.println("3X1=3");
					break;
					case 4:
						System.out.println("4X10=40");
						System.out.println("4X9=36");
						System.out.println("4X8=32");
						System.out.println("4X7=28");
						System.out.println("4X6=24");
						System.out.println("4X5=20");
						System.out.println("4X4=16");
						System.out.println("4X3=12");
						System.out.println("4X2=8");
						System.out.println("4X1=4");
						break;
					case 5:
						System.out.println("5X10=50");
						System.out.println("5X9=45");
						System.out.println("5X8=40");
						System.out.println("5X7=35");
						System.out.println("5X6=30");
						System.out.println("5X5=25");
						System.out.println("5X4=20");
						System.out.println("5X3=15");
						System.out.println("5X2=10");
						System.out.println("5X1=5");
						break;
					case 6:
						System.out.println("6X10=60");
						System.out.println("6X9=54");
						System.out.println("6X8=48");
						System.out.println("6X7=42");
						System.out.println("6X6=36");
						System.out.println("6X5=30");
						System.out.println("6X4=24");
						System.out.println("6X3=18");
						System.out.println("6X2=12");
						System.out.println("6X1=6");
						break;
					case 7:
						System.out.println("7X10=70");
						System.out.println("7X9=63");
						System.out.println("7X8=56");
						System.out.println("7X7=49");
						System.out.println("7X6=42");
						System.out.println("7X5=35");
						System.out.println("7X4=28");
						System.out.println("7X3=21");
						System.out.println("7X2=14");
						System.out.println("7X1=7");
						break;
					case 8:
						System.out.println("8X10=80");
						System.out.println("8X9=72");
						System.out.println("8X8=64");
						System.out.println("8X7=56");
						System.out.println("8X6=48");
						System.out.println("8X5=40");
						System.out.println("8X4=32");
						System.out.println("8X3=24");
						System.out.println("8X2=16");
						System.out.println("8X1=8");
						break;
						case 9:
							System.out.println("9X10=90");
							System.out.println("9X9=81");
							System.out.println("9X8=72");
							System.out.println("9X7=63");
							System.out.println("9X6=54");
							System.out.println("9X5=45");
							System.out.println("9X4=36");
							System.out.println("9X3=27");
							System.out.println("9X2=18");
							System.out.println("9X1=9");
							break;
						case 10:
							System.out.println("10X10=100");
							System.out.println("10X9=90");
							System.out.println("10X8=80");
							System.out.println("10X7=70");
							System.out.println("10X6=60");
							System.out.println("10X5=50");
							System.out.println("10X4=40");
							System.out.println("10X3=30");
							System.out.println("10X2=20");
							System.out.println("10X1=10");
							break;
						default:
							System.out.println("No es un numero valido, no esta en el rango de 0 a 10 el numero: " + ta);
							break;	
			}
				}		
			}
			
			else if (z==8){
				//System.out.println("Seleccione el problema 8 ");
				Scanner p8 = new Scanner(System.in);
				   System.out.print("Teclea el primer entero");
				   int xa = p8.nextInt();
				   System.out.println("Teclea el segundo entero");
				   int ya = p8.nextInt();
				   if(xa>-1 && ya<101){
					   String[] unidades = {"cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};
					   String[] descenasexactas = {"","diez","veinte","treinta","cuarenta","cincuenta","sesenta","setenta","ochenta","noventa"};   
					   Random r = new Random();
					   int Low = xa;
					   int High = ya+1;
					   int R = r.nextInt(High-Low) + Low;
					   System.out.println(R);
					   if(R == 100){
						   System.out.println("cien");
					   }else{
						   if(R>9){
							   int descena = R/10;
							   int unidad = R%10;
							   if(unidad != 0){
								   if(descena == 1){
									   if(unidad>5){
										   System.out.print("dieci");
										   System.out.print(unidades[unidad]);
									   }else{
										   switch(unidad){
										   case 1:
											   System.out.print("once");
											   break;
										   case 2:
											   System.out.print("doce");
											   break;
										   case 3: 
											   System.out.print("trece");
											   break; 
										   case 4:
											   System.out.print("catorce");
											   break;
										   case 5:
											   System.out.print("quince");
											   break;
										   }
									   }
									   
								   }else if(descena == 2){
									   System.out.print("veinti");
									   System.out.print(unidades[unidad]);
								   }else{
									  System.out.print(descenasexactas[descena]); 
									  System.out.print(" y "+unidades[unidad]);
								   }
								   
							   }else{
								   System.out.print(descenasexactas[descena]);
							   }
						   }else{
							  System.out.println(unidades[R]);
						   }
					   }
				   }else
					   System.out.println("error");
			}
				
			
			
			else if (z==9){
				//System.out.println("Seleccione el problema 9 ");
				BufferedReader letra=new BufferedReader(new InputStreamReader (System.in));
				int miles;
				int centenas;
				int decenas;
				int unidades;
				System.out.print(" Ingrese un numero arábigo: ");
				String numero=letra.readLine();
				int num=Integer.parseInt(numero);
				if((num>0)&&(num<4000)){
				miles=num/1000;
				centenas=num/100;
				decenas=(num%100)/10;
				unidades=(num%100)%10;

				System.out.println();
				System.out.print(" En numeros romanos Miles: ");
				switch(miles){
				case 1:
				System.out.print("M");
				miles=num/1000;
				break;
				case 2:
				System.out.print("MM");
				miles=num/1000;
				break;
				case 3:
				System.out.print("MMM");
				miles=num/1000;
				break;
				}

				System.out.println();
				System.out.print(" En numeros romanos Centenas: ");
				switch(centenas){
				case 1:
				System.out.print("C");
				centenas=num/100;
				break;
				case 2:
				System.out.print("CC");
				centenas=num/100;
				break;
				case 3:
				System.out.print("CCC");
				centenas=num/100;
				break;
				case 4:
				System.out.print("CD");
				centenas=num/100;
				break;
				case 5:
				System.out.print("D");
				centenas=num/100;
				break;
				case 6:
				System.out.print("DC");
				centenas=num/100;
				break;
				case 7:
				System.out.print("DCC" );
				centenas=num/100;
				break;
				case 8:
				System.out.print("DCCC");
				centenas=num/100;
				break;
				case 9:
				System.out.print("DM");
				centenas=num/100;
				break;
				}
				
				System.out.println();
				System.out.print(" En numeros romanos Decenas: ");
				switch(decenas){
				case 1:
				System.out.print("X");
				decenas=(num%100)/10;
				break;
				case 2:
				System.out.print("XX");
				decenas=(num%100)/10;
				break;
				case 3:
				System.out.print("XXX");
				decenas=(num%100)/10;
				break;
				case 4:
				System.out.print("XL");
				decenas=(num%100)/10;
				break;
				case 5:
				System.out.print("L");
				decenas=(num%100)/10;
				break;
				case 6:
				System.out.print("LX");
				decenas=(num%100)/10;
				break;
				case 7:
				System.out.print("LXX");
				decenas=(num%100)/10;
				break;
				case 8:
				System.out.print("LXXX");
				decenas=(num%100)/10;
				break;
				case 9:
				System.out.print("XC");
				decenas=(num%100)/10;
				break;
				}
				
				System.out.println();
				System.out.print(" En numeros romanos Unidades: ");
				switch(unidades){
				case 1:
				System.out.print("I");
				unidades=(num%100)%10;
				break;
				case 2:
				System.out.print("II");
				unidades=(num%100)%10;
				break;
				case 3:
				System.out.print("III");
				unidades=(num%100)%10;
				break;
				case 4:
				System.out.print("IV");
				unidades=(num%100)%10;
				break;
				case 5:
				System.out.print("V");
				unidades=(num%100)%10;
				break;
				case 6:
				System.out.print("VI");
				unidades=(num%100)%10;
				break;
				case 7:
				System.out.print("VII");
				unidades=(num%100)%10;
				break;
				case 8:
				System.out.print("VIII");
				unidades=(num%100)%10;
				break;
				case 9:
				System.out.print("IX");
				unidades=(num%100)%10;
				break;
				
				}
			}
			}			
			
			else if (z==10){
				//System.out.println("Seleccione el problema 10 ");
			Scanner aaa = new Scanner(System.in);
		       System.out.print("Teclea un entero ");
		       int xx = aaa.nextInt();
		       int reduce = 0;
		       int aumento = 1;
		      if(xx>0){
		    	  while(aumento< xx+1){
			    	   for (int i=0; i<xx;i++){
			    		   if(i<reduce){
			    			 System.out.print(" ");
			    		   }else{
			    			   if(xx>10 && aumento<10){
			    				   System.out.print(aumento + "  ");
			    			   }else
			    				   System.out.print(aumento + " ");
			    		   }
			    	   }
			    	   aumento++;
			    	   reduce++;
			    	   System.out.println("");
			       }
		      }else
		    	  System.out.println("error");
		}		
			
			else if (z==11){
				//System.out.println("Seleccione el problema 11 ");
				BufferedReader letra=new BufferedReader(new InputStreamReader (System.in));
				int miles;
				int centenas;
				int decenas;
				int unidades;
				System.out.print(" Ingrese un numero arábigo: ");
				String numero=letra.readLine();
				int num=Integer.parseInt(numero);
				if((num>0)&&(num<4000)){
				miles=num/1000;
				centenas=num/100;
				decenas=(num%100)/10;
				unidades=(num%100)%10;

					System.out.println();
					System.out.print(" En numeros romanos a arabigos en Miles: ");
					switch(miles){
					case 1:
					System.out.print("1000");
					miles=num/1000;
					break;
					case 2:
					System.out.print("2000");
					miles=num/1000;
					break;
					case 3:
					System.out.print("3000");
					miles=num/1000;
					break;
					}

					System.out.println();
					System.out.print(" En numeros romanos a arabigos Centenas: ");
					switch(centenas){
					case 1:
					System.out.print("100");
					centenas=num/100;
					break;
					case 2:
					System.out.print("200");
					centenas=num/100;
					break;
					case 3:
					System.out.print("300");
					centenas=num/100;
					break;
					case 4:
					System.out.print("400");
					centenas=num/100;
					break;
					case 5:
					System.out.print("500");
					centenas=num/100;
					break;
					case 6:
					System.out.print("600");
					centenas=num/100;
					break;
					case 7:
					System.out.print("700");
					centenas=num/100;
					break;
					case 8:
					System.out.print("800");
					centenas=num/100;
					break;
					case 9:
					System.out.print("900");
					centenas=num/100;
					break;
					}
					
					System.out.println();
					System.out.print(" En numeros romanos a arabigos Decenas: ");
					switch(decenas){
					case 1:
					System.out.print("10");
					decenas=(num%100)/10;
					break;
					case 2:
					System.out.print("20");
					decenas=(num%100)/10;
					break;
					case 3:
					System.out.print("30");
					decenas=(num%100)/10;
					break;
					case 4:
					System.out.print("40");
					decenas=(num%100)/10;
					break;
					case 5:
					System.out.print("5");
					decenas=(num%100)/10;
					break;
					case 6:
					System.out.print("60");
					decenas=(num%100)/10;
					break;
					case 7:
					System.out.print("70");
					decenas=(num%100)/10;
					break;
					case 8:
					System.out.print("80");
					decenas=(num%100)/10;
					break;
					case 9:
					System.out.print("90");
					decenas=(num%100)/10;
					break;
					}
					
					System.out.println();
					System.out.print(" En numeros romanos a arabigos Unidades: ");
					switch(unidades){
					case 1:
					System.out.print("1");
					unidades=(num%100)%10;
					break;
					case 2:
					System.out.print("2");
					unidades=(num%100)%10;
					break;
					case 3:
					System.out.print("3");
					unidades=(num%100)%10;
					break;
					case 4:
					System.out.print("4");
					unidades=(num%100)%10;
					break;
					case 5:
					System.out.print("5");
					unidades=(num%100)%10;
					break;
					case 6:
					System.out.print("6");
					unidades=(num%100)%10;
					break;
					case 7:
					System.out.print("7");
					unidades=(num%100)%10;
					break;
					case 8:
					System.out.print("8");
					unidades=(num%100)%10;
					break;
					case 9:
					System.out.print("9");
					unidades=(num%100)%10;
					break;
					
					}
				}
					    	   
			}
			else if (z==12){
				//System.out.println("Seleccione el problema 12 ");
				System.out.println("Ingrese cadena de texto:");
		        Scanner p12 = new Scanner (System.in);
		        String let = p12.next();
		        
		        	for(int j=0; j<let.length(); j++){ 
						System.out.print("*");
						} 
					System.out.print("\n");	
			}
			
			else if (z==13){
				//System.out.println("Seleccione el problema 13 ");
				System.out.println("Ingrese la letra a adivinar");
		        Scanner p13 = new Scanner (System.in);
		        char le = p13.next().charAt(0);
				int intletra = (int)le;
				if(intletra>96 && intletra<123){
					boolean ax = false;
					while(!ax){
						System.out.println("Ingrese la letra que piense que es la correcta:");
						char la = p13.next().charAt(0);
						int ila = (int)le;
						if(ila>96 && ila<123){
							if(la==le)
								ax = true;
							else if(la>le)
								System.out.println("Antes");
							else
								System.out.println("Despues");
						}else{
							System.out.println("Debes ingresar una letra minuscula");
						}
					}
					System.out.println("Felicidades es correcto!!");
				}else
					System.out.println("Debe ser una letra minuscula para q pueda ser");
			}
			
			else if (z==14){
				//System.out.println("Seleccione el problema 14 ");
				Scanner p14 = new Scanner(System.in);
			       System.out.print("Teclea de que cantidad el Cuadrado: ");
			       int lineas = p14.nextInt(); 
				System.out.println("Cuadrado"); 
				for(int i=0;i<lineas;i++){ 
					for(int j=0;j<lineas;j++){ 
						System.out.print("*");
						} 
					System.out.print("\n"); 
					}
			}
			
			else if (z==15){
				//System.out.println("Seleccione el problema 15 ");
				BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
				System.out.println ("Introduzca un Numero: ");
				String nu = br.readLine (); 
				int n = Integer.parseInt (nu); 
				System.out.println(); int contador=0; 
				for (int i = 1 ; i <= n ; i++) 
				{ 
					if (n % i == 0) 
					{ 
						System.out.println (i); contador++;
						}
					} 
				System.out.println("Hay un total de "+contador+" numeros primos");
			}
			
			else{
				System.out.println("Ese problema no existe ");
				}
			//break;
		//default:
		}
		else
			System.out.println("..::A seleccionado salir del programa::.. ");
		}

	}
