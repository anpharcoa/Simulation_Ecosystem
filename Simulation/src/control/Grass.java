package control;

import java.util.Random;

public class Grass {
	public int nColumns;
	public int nRows;
	private double [][] cells;
	private Random rand;
	private static double MAX_GROWING_SPEDD = 0.1;

	public Grass(int nColumns, int nRows) {
		super();
		this.rand = new Random();
		this.nColumns = nColumns;
		this.nRows = nRows;
		this.cells = new double [nRows][nColumns];
		for (int i=0;i<nRows;i++) {
			for(int j=0;j<nColumns;j++) 
			{
				cells[i][j] = rand.nextDouble();
				
			}
		}
	}
	public double getCell (int i, int j) {
		return cells[i][j];
	}
	public void grow() {
		
		Random rand = new Random();
		for (int i=0;i<nRows;i++) {
			for(int j=0;j<nColumns;j++) 
			{
				cells[i][j] += rand.nextDouble()*0.1;
				//if(cells[i][j]>1) cells[i][j] =1;
				cells[i][j]=(cells[i][j]>1)?1:cells[i][j];
			}
		}	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
