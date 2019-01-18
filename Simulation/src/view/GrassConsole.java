package view;
import control.Grass;

public class GrassConsole {

	public static void main(String[] args) {
		Grass grass = new Grass(5,7);
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

}
