package view;
import control.Grass;

public class GrassConsole {
	private static void display(Grass grass) {
		for (int i=0; i< grass.nRows;i++)
		{
			for (int j=0; j< grass.nColumns; j++)
			{
				//System.out.println(grass.getCell(i, j));
				System.out.print( String.format( "%.2f", grass.getCell(i, j) ) + " " );
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		Grass grass = new Grass(5,7);
		display(grass);
		for (int i=0;i<5;i++) {
			grass.grow();
			System.out.println("//////////////////////");
			display(grass);
		}
		
		
		
		

	}

}
