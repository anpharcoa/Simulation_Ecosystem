package control;

import java.util.ArrayList;

public class World {
	public Grass grass;
	public ArrayList<Animal> animals;
	public static long TIME_STEP = 1000; 
	public  String  display() {
		String s="";
		double [][] cells = new double[(grass.getNumBerRow())][grass.getNumBerColumn()];
		for (int i=0;i<grass.getNumBerRow();i++) {
			for(int j=0;j<grass.getNumBerColumn();j++) {
				cells[i][j] = grass.getCell(i, j);
			}
		}
		System.out.println(cells[0][0]);
		
		for(Animal a: animals) {
			cells[a.currentRow][a.currentColumn] = 2;
		}
		for (int i=0;i<grass.getNumBerRow();i++) {
			for(int j=0;j<grass.getNumBerColumn();j++) {
				cells[i][j] = grass.getCell(i, j);
				s=s+( String.format( "%.2f", grass.getCell(i, j) ) + " " );
			}
			s=s+"\n";
		}
		
		return s;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
