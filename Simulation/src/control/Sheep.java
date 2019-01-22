package control;

public class Sheep extends Animal implements IAnimal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object die(Object para) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object move(Object para) {
		Grass grass = (Grass) para;
	//	int x = this.rand.nextInt();
	//	int d = 2*this.speed +1;
	//	int y = x%d;
	//	int z = y - this.speed;
		currentRow += (this.rand.nextInt()) % (2*this.speed+1) - this.speed;
		currentColumn += (this.rand.nextInt()) % (2*this.speed+1) - this.speed;
	//	if(currentRow >= grass.getNumBerRow()) {
	//		currentRow =0;
	//	}
		currentRow = (currentRow >= grass.getNumBerRow())? 0:currentRow;
		currentRow = (currentRow <0)? (grass.getNumBerRow() -1): currentRow;
		currentColumn = (currentColumn >= grass.getNumBerColumn())? 0:currentColumn;
		currentColumn = (currentColumn <0)? (grass.getNumBerColumn() -1): currentColumn;
		
		return null;
	}

	@Override
	public Object drainEnergy(Object para) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object mate(Object para) {
		// TODO Auto-generated method stub
		return null;
	}
	public void run() {
		while (true) {
			try {
				move(world.grass);
				Thread.sleep(World.TIME_STEP);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

}
