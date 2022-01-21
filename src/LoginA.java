import java.util.Random;
import java.util.TimerTask;

public class LoginA extends TimerTask {
	static public myQueue<Integer> q=new myQueue<Integer>();
	int floor,people;
	Random rnd=new Random();
   public LoginA() {
	   
   }
   public void run() {
	   people=rnd.nextInt(10)+1;
	   floor=rnd.nextInt(4)+1;
	   q.enqueue(people,floor);
   }
}