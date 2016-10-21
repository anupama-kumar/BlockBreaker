
public class Animate implements Runnable{

	BlockBreakerPanel bp;
	
	Animate(BlockBreakerPanel b){
		//this is a constructor
		bp = b;
	}
	public void run(){
		
		while(true){
			bp.update();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		}
		
	}
}
