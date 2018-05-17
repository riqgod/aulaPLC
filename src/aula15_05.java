

public class aula15_05 {

	public static void main(String [] Args) throws InterruptedException {
		
		tree arvore = new tree();
			
		(new Thread(new RandomThread(arvore))).start();
		(new Thread(new RandomThread(arvore))).start();
		(new Thread(new RandomThread(arvore))).start();
		(new Thread(new RandomThread(arvore))).start();
		(new Thread(new RandomThread(arvore))).start();
		(new Thread(new RandomThread(arvore))).start();
		(new Thread(new RandomThread(arvore))).start();
		(new Thread(new RandomThread(arvore))).start();
		(new Thread(new RandomThread(arvore))).start();
		(new Thread(new RandomThread(arvore))).start();
		(new Thread(new RandomThread(arvore))).start();
		(new Thread(new RandomThread(arvore))).start();
		(new Thread(new RandomThread(arvore))).start();
		(new Thread(new RandomThread(arvore))).start();
		(new Thread(new RandomThread(arvore))).start();
		
		
		
		
		
		
		Thread.sleep(5000);
		System.out.println(arvore);
		int t = 1000;
		System.out.println(t);
		
		
		
		
			
		
	}
	
	
	
	
	
}
