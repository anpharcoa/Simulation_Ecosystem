package view;
import java.util.ArrayList;

import control.Animal;
import control.Grass;
import control.Sheep;
import control.World;

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
		World world = new World();
		world.grass = grass;
		ArrayList<Animal> animals= new ArrayList<>();
		Sheep sheep1 = new Sheep(12, 1, 0, 0, world);
		animals.add(sheep1);
		
		world.animals = animals;
		sheep1.start();
		grass.start();
		while(true) {
			System.out.println("////////////////");
			System.out.println(world.display());
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
}
	}

}
