package control;

import java.util.Random;

public class Grass extends Thread{
	public int nColumns;
	public int nRows;
	private double [][] cells;
	private Random rand;
	private static double MAX_GROWING_SPEED = 0.1;
	

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
	public synchronized double getCell (int i, int j) {
		return cells[i][j];
	}
	public void grow() {
		
		Random rand = new Random();
		for (int i=0;i<nRows;i++) {
			for(int j=0;j<nColumns;j++) 
			{
				cells[i][j] += rand.nextDouble()*MAX_GROWING_SPEED;
				//if(cells[i][j]>1) cells[i][j] =1;
				cells[i][j]=(cells[i][j]>1)?1:cells[i][j];
			}
		}	
		
	}
	public void run() {
		while (true) {
			try {
				grow();
				Thread.sleep(World.TIME_STEP);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public synchronized int getNumBerRow () {
		return nRows;
	}
	public synchronized int getNumBerColumn () {
		return nColumns;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
