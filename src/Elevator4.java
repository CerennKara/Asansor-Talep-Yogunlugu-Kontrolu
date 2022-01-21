import java.util.TimerTask;

public class Elevator4 extends TimerTask {
	static public myQueue<Integer> ele4=new myQueue<Integer>();
	static int target=0,floor=0,direction=0,count_inside=0;
	boolean isActive=false;
   public Elevator4() {
	  
   }
   public void run() {
	   if(ele4.size==0) {
			 while((count_inside+Control.floor0.peek())<11 & Control.floor0.size>0 & floor==0){
				  ele4.enqueue(Control.floor0.peek(),Control.floor0.peek1());
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
					  ele4.enqueue(Control.floor1.peek(),0);
					  target=0;
					  count_inside+=Control.floor1.peek();
					  direction=0;
					  screen.floor1-=Control.floor1.peek();
					  Control.floor1.dequeue();
					  if(Control.floor1.size==0) {
						  break;
					  }
				 }if(Control.floor1.size!=0) {
					 screen.q1.setText("1.floor:"+Control.floor1.q());
				 }
				 else {
					 screen.q1.setText("1.floor:");
				 }
			}
			if(Control.floor2.size!=0 & floor==2) {
				while((count_inside+Control.floor2.peek())<11 & Control.floor2.size>0){
					  ele4.enqueue(Control.floor2.peek(),0);
					  target=0;
					  count_inside+=Control.floor2.peek();
					  direction=0;
					  screen.floor2-=Control.floor2.peek();
					  Control.floor2.dequeue();
					  if(Control.floor2.size==0) {
						  break;
					  }
				 }if(Control.floor2.size!=0) {
					 screen.q2.setText("2.floor:"+Control.floor2.q());
				 }
				 else {
					 screen.q2.setText("2.floor:");
				 }
			}
			if(Control.floor3.size!=0 & floor==3) {
				while((count_inside+Control.floor3.peek())<11 & Control.floor3.size>0){
					  ele4.enqueue(Control.floor3.peek(),0);
					  target=0;
					  count_inside+=Control.floor3.peek();
					  direction=0;
					  screen.floor3-=Control.floor3.peek();
					  Control.floor3.dequeue();
					  if(Control.floor3.size==0) {
						  break;
					  }
				 }if(Control.floor3.size!=0) {
					 screen.q3.setText("3.floor:"+Control.floor3.q());
				 }
				 else {
					 screen.q3.setText("3.floor:");
				 }
			}
			if(Control.floor4.size!=0 & floor==4) {
				while((count_inside+Control.floor4.peek())<11 & Control.floor4.size>0){
					  ele4.enqueue(Control.floor4.peek(),0);
					  target=0;
					  count_inside+=Control.floor4.peek();
					  direction=0;
					  screen.floor4-=Control.floor4.peek();
					  Control.floor4.dequeue();
					  if(Control.floor4.size==0) {
						  break;
					  }
				 } if(Control.floor4.size!=0) {
					 screen.q4.setText("4.floor:"+Control.floor4.q());
				 }
				 else {
					 screen.q4.setText("4.floor:");
				 }
			}
			if(ele4.size==0) {
				target=0;
			}
		}
		if(ele4.size!=0) {
			target=ele4.peek1();
		}
		screen.queue0.setText("0.floor: queue:"+Integer.toString(screen.floor0));
		screen.queue1.setText("1. floor: all: "+Integer.toString(screen.floor1)+" queue:"+Integer.toString(Control.floor1.sumPeek()));
		screen.queue2.setText("2. floor: all: "+Integer.toString(screen.floor2)+" queue:"+Integer.toString(Control.floor2.sumPeek()));
		screen.queue3.setText("3. floor: all: "+Integer.toString(screen.floor3)+" queue:"+Integer.toString(Control.floor3.sumPeek()));
		screen.queue4.setText("4. floor: all: "+Integer.toString(screen.floor4)+" queue:"+Integer.toString(Control.floor4.sumPeek()));
		screen.count4.setText("count_inside:"+Integer.toString(count_inside));
	screen.inside4.setText("inside:"+ele4.q());
	screen.destination4.setText("destination:"+Integer.toString(target));
	  if(floor<target) {
		  floor++;
		  screen.floor_4.setText("floor:"+Integer.toString(floor));
		  screen.direction4.setText("direction:up");
	  }
	  if(floor>target) {
		  floor--;
		  screen.floor_4.setText("floor:"+Integer.toString(floor));
		  screen.direction4.setText("direction:down");
	  }
	  if(floor==target){
		  if(direction==1) {
			  if(floor==0) {
				  screen.queue0.setText("0.floor: queue:"+Integer.toString(screen.floor0));
			  }
			  if(floor==1) {
				  screen.floor1+=ele4.peek();
				  count_inside-=ele4.peek();
				   }
			  else if(floor==2) {
				  screen.floor2+=ele4.peek();
				  count_inside-=ele4.peek();
				   }
			  else if(floor==3) {
				  screen.floor3+=ele4.peek();
				  count_inside-=ele4.peek();
				  }
			  else if(floor==4) {
				  screen.floor4+=ele4.peek();
				  count_inside-=ele4.peek();
				  }
		  }
		  if(direction==0) {
			  if(floor==0 & ele4.size!=0) {
				  count_inside-=ele4.peek();
				  screen.exitcount+=ele4.peek();
			  }
		  }
		  screen.inside4.setText("inside:"+ele4.q());
		  screen.count4.setText("count_inside:"+Integer.toString(count_inside));
		  if(ele4.size!=0) {
			  ele4.dequeue();
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