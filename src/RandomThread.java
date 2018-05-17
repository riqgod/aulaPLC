
public class RandomThread implements Runnable{

	tree arvore;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i =0 ; i<2000; i++) {
	        int x = (int) (Math.random()*100);
			this.arvore.insert(x);
			System.out.println(x);
		}
		
		
	}
	
	public RandomThread(tree arvore) {
		this.arvore = arvore;
	}
	
	
	
}
