import java.util.Scanner;
public class Buscaminas{

static final int FILAS = 5;
static final int COLUMNAS = 7;
static final int TOTAL_MINAS = 5;
static final int MINA = -1;

	public static void main(String[] args){
	
	int minas=0;
	int celdasVacias=0;
	int posa=0;
	int posb=0;
	int posc=0;
	int posd=0;
	int posx=0;
	int posy=0;
	boolean salida=false;
	
	String tablero [][]= crearTablero();
    String tablero2 [][]= crearTablero();
	
	
		posa=(int)((Math.random()*FILAS)+1);
		posb=(int)((Math.random()*COLUMNAS)+1);
		for (int x=1; x < tablero.length; x++) {
			for (int y=1; y < 8; y++){
							
				tablero[posa][posb]="MM";
			}
		}
		
		posa=(int)((Math.random()*FILAS)+1);
		posb=(int)((Math.random()*COLUMNAS)+1);
		for (int x=1; x < tablero.length; x++) {
			for (int y=1; y < 8 ; y++){
							
				tablero[posa][posb]="MM";
			}
		}
		
		posa=(int)((Math.random()*FILAS)+1);
		posb=(int)((Math.random()*COLUMNAS)+1);
		for (int x=1; x < tablero.length; x++) {
			for (int y=1; y < 8; y++){
							
				tablero[posa][posb]="MM";
			}
		}
		
		posa=(int)((Math.random()*FILAS)+1);
		posb=(int)((Math.random()*COLUMNAS)+1);
		for (int x=1; x < tablero.length; x++) {
			for (int y=1; y < 8; y++){
							
				tablero[posa][posb]="MM";
			}
		}
		posa=(int)((Math.random()*FILAS)+1);
		posb=(int)((Math.random()*COLUMNAS)+1);
		for (int x=1; x < tablero.length; x++) {
			for (int y=1; y < 8; y++){
							
				tablero[posa][posb]="MM";
			}
		}
		
		
		
	while(!salida){
		
	mostrarTablero(tablero2);
	

		
	
	
	
	System.out.println("introduzca posicion X");
	Scanner scanner=new Scanner(System.in);
	posx=scanner.nextInt();
	
	System.out.println("Introduzca posicion Y");
	posy=scanner.nextInt();
	
	
	if ((tablero[posx][posy])=="  "){
		tablero2[posx][posy]= "--";
		celdasVacias++;
	}
	else{
		tablero2[posx][posy]= "**";
		minas++;
	}
	
	
	for (int x=0; x < tablero2.length; x++) {
		System.out.print("|");
		for (int y=0; y < 8; y++){
	
			System.out.print (tablero2[x][y]);
		}
		System.out.println("|");
	}

		
		if (minas==3){
		System.out.println("Lo siento, ha perdido");
		salida=true;
		}
		
		if (celdasVacias==30){
			System.out.println("Enhorabuena, ha ganado");
			salida=true;
		}
	
	}
		
	}

static String[][] crearTablero(){
    String tablero [][]= new String [FILAS +1][COLUMNAS +1];
    tablero[0][0]= "**";
    for (int i=1 ;i<=FILAS; i++){
        tablero[i][0]=""+i;

    }
    for (int j=1; j<=COLUMNAS; j++){
        tablero[0][j]=""+j;
        for( int i = 1 ; i <= FILAS; i++){
            tablero[i][j]=" ";
        }

    }
return tablero;
}
static void mostrarTablero(String tablero[][]){
    for (int x=0 ; x< tablero.length; x++){
        System.out.print("|");
        for (int y=0; y < tablero[0].length; y++){
            System.out.print(tablero[x][y]);
        }
        System.out.println("|");
    }
}

}