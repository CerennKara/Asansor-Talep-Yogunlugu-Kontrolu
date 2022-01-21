import java.util.ArrayList;
import java.util.Random;
import java.util.TimerTask;

public class Exit extends TimerTask {
	static public myQueue<Integer> q=new myQueue<Integer>();
	ArrayList<Integer> floorList = new ArrayList<Integer>(4); 
	ArrayList<Integer> peopleList = new ArrayList<Integer>(4); 
	int floor,people,index;
	Random rnd=new Random();
	public Exit() {
		   
	}
	public void run() {
		if((screen.floor1-Control.floor1.sumPeek())>0) {
			floorList.add(1);
			peopleList.add(screen.floor1);
		}
		if((screen.floor2-Control.floor2.sumPeek())>0) {
			floorList.add(2);
			peopleList.add(screen.floor2);
		}
		if((screen.floor3-Control.floor3.sumPeek())>0) {
			floorList.add(3);
			peopleList.add(screen.floor3);
		}
		if((screen.floor4-Control.floor4.sumPeek())>0) {
			floorList.add(4);
			peopleList.add(screen.floor4);
		}
		if(floorList.size()>0) {
			index=rnd.nextInt(floorList.size());
			floor=floorList.get(index);
			people=rnd.nextInt(peopleList.get(index))+1;
			if(people>5) {
				people=rnd.nextInt(5)+1;
			}
			q.enqueue(people,floor);
		}
		floorList.clear();
		peopleList.clear();
	}
}