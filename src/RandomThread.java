
public class RandomThread implements Runnable{

	tree guileam;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i =0 ; i<2000; i++) {
			this.guileam.insert((int) Math.random()*100);
		}
		
		
	}
	
	public RandomThread(tree guileam) {
		this.guileam = guileam;
	}
	
	
	
}
