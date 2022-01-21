import java.util.TimerTask;

public class Elevator5 extends TimerTask {
	static public myQueue<Integer> ele5=new myQueue<Integer>();
	static int target=0,floor=0,direction=0,count_inside=0;
	boolean isActive=false;
   public Elevator5() {
	  
   }
   public void run() {
	   if(ele5.size==0) {
			 while((count_inside+Control.floor0.peek())<11 & Control.floor0.size>0 & floor==0){
				  ele5.enqueue(Control.floor0.peek(),Control.floor0.peek1());
				  count_inside+=Control.floor0.peek();
				  direction=1;
				  screen.floor0-=Control.floor0.peek();
				  Control.floor0.dequeue();
				  if(Control.floor0.size==0) {
					  break;
				  }
			 }
			 if(Control.floor0.size!=0) {
				 screen.q0.setText("0.floor:"+Control.floor0.q());
			 }
			 else {
				 screen.q0.setText("0.floor:");
			 }
			if(Control.floor1.size!=0 & floor==1) {
				while((count_inside+Control.floor1.peek())<11 & Control.floor1.size>0){
					  ele5.enqueue(Control.floor1.peek(),0);
					  target=0;
					  count_inside+=Control.floor1.peek();
					  direction=0;
					  screen.floor1-=Control.floor1.peek();
					  Control.floor1.dequeue();
					  if(Control.floor1.size==0) {
						  break;
					  }
				 }
				if(Control.floor1.size!=0) {
					 screen.q1.setText("1.floor:"+Control.floor1.q());
				 }
				 else {
					 screen.q1.setText("1.floor:");
				 }
			}
			if(Control.floor2.size!=0 & floor==2) {
				while((count_inside+Control.floor2.peek())<11 & Control.floor2.size>0){
					  ele5.enqueue(Control.floor2.peek(),0);
					  target=0;
					  count_inside+=Control.floor2.peek();
					  direction=0;
					  screen.floor2-=Control.floor2.peek();
					  Control.floor2.dequeue();
					  if(Control.floor2.size==0) {
						  break;
					  }
				 }
				if(Control.floor2.size!=0) {
					 screen.q2.setText("2.floor:"+Control.floor2.q());
				 }
				 else {
					 screen.q2.setText("2.floor:");
				 }
			}
			if(Control.floor3.size!=0 & floor==3) {
				while((count_inside+Control.floor3.peek())<11 & Control.floor3.size>0){
					  ele5.enqueue(Control.floor3.peek(),0);
					  target=0;
					  count_inside+=Control.floor3.peek();
					  direction=0;
					  screen.floor3-=Control.floor3.peek();
					  Control.floor3.dequeue();
					  if(Control.floor3.size==0) {
						  break;
					  }
				 }
				if(Control.floor3.size!=0) {
					 screen.q3.setText("3.floor:"+Control.floor3.q());
				 }
				 else {
					 screen.q3.setText("3.floor:");
				 }
			}
			if(Control.floor4.size!=0 & floor==4) {
				while((count_inside+Control.floor4.peek())<11 & Control.floor4.size>0){
					  ele5.enqueue(Control.floor4.peek(),0);
					  target=0;
					  count_inside+=Control.floor4.peek();
					  direction=0;
					  screen.floor4-=Control.floor4.peek();
					  Control.floor4.dequeue();
					  if(Control.floor4.size==0) {
						  break;
					  }
				 }
				if(Control.floor4.size!=0) {
					 screen.q4.setText("4.floor:"+Control.floor4.q());
				 }
				 else {
					 screen.q4.setText("4.floor:");
				 }
			}
			if(ele5.size==0) {
				target=0;
			}
		}
		if(ele5.size!=0) {
			target=ele5.peek1();
		}
		screen.queue0.setText("0.floor: queue:"+Integer.toString(screen.floor0));
		screen.queue1.setText("1. floor: all: "+Integer.toString(screen.floor1)+" queue:"+Integer.toString(Control.floor1.sumPeek()));
		screen.queue2.setText("2. floor: all: "+Integer.toString(screen.floor2)+" queue:"+Integer.toString(Control.floor2.sumPeek()));
		screen.queue3.setText("3. floor: all: "+Integer.toString(screen.floor3)+" queue:"+Integer.toString(Control.floor3.sumPeek()));
		screen.queue4.setText("4. floor: all: "+Integer.toString(screen.floor4)+" queue:"+Integer.toString(Control.floor4.sumPeek()));
		screen.count5.setText("count_inside:"+Integer.toString(count_inside));
	screen.inside5.setText("inside:"+ele5.q());
	screen.destination5.setText("destination:"+Integer.toString(target));
	  if(floor<target) {
		  floor++;
		  screen.floor_5.setText("floor:"+Integer.toString(floor));
		  screen.direction5.setText("direction:up");
	  }
	  if(floor>target) {
		  floor--;
		  screen.floor_5.setText("floor:"+Integer.toString(floor));
		  screen.direction5.setText("direction:down");
	  }
	  if(floor==target){
		  if(direction==1) {
			  if(floor==0) {
				  screen.queue0.setText("0.floor: queue:"+Integer.toString(screen.floor0));
			  }
			  if(floor==1) {
				  screen.floor1+=ele5.peek();
				  count_inside-=ele5.peek();
				  }
			  else if(floor==2) {
				  screen.floor2+=ele5.peek();
				  count_inside-=ele5.peek();
				}
			  else if(floor==3) {
				  screen.floor3+=ele5.peek();
				  count_inside-=ele5.peek();
				   }
			  else if(floor==4) {
				  screen.floor4+=ele5.peek();
				  count_inside-=ele5.peek();
			  }
		  }
		  if(direction==0) {
			  if(floor==0 & ele5.size!=0) {
				  count_inside-=ele5.peek();
				  screen.exitcount+=ele5.peek();
			  }
		  }
		  screen.inside5.setText("inside:"+ele5.q());
		  screen.count5.setText("count_inside:"+Integer.toString(count_inside));
		  if(ele5.size!=0) {
			  ele5.dequeue();
		  }
	  }
	  screen.queue0.setText("0.floor: queue:"+Integer.toString(screen.floor0));
	  screen.queue1.setText("1. floor: all: "+Integer.toString(screen.floor1)+" queue:"+Integer.toString(Control.floor1.sumPeek()));
		screen.queue2.setText("2. floor: all: "+Integer.toString(screen.floor2)+" queue:"+Integer.toString(Control.floor2.sumPeek()));
		screen.queue3.setText("3. floor: all: "+Integer.toString(screen.floor3)+" queue:"+Integer.toString(Control.floor3.sumPeek()));
		screen.queue4.setText("4. floor: all: "+Integer.toString(screen.floor4)+" queue:"+Integer.toString(Control.floor4.sumPeek()));
		screen.exitqueue.setText("exit count: "+Integer.toString(screen.exitcount));
  }
	}