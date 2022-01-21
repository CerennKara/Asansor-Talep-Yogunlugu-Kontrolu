import java.util.TimerTask;

public class Control extends TimerTask {
	   static public myQueue<Integer> floor0=new myQueue<Integer>();
	   static public myQueue<Integer> floor1=new myQueue<Integer>();
	   static public myQueue<Integer> floor2=new myQueue<Integer>();
	   static public myQueue<Integer> floor3=new myQueue<Integer>();
	   static public myQueue<Integer> floor4=new myQueue<Integer>();
	   Elevator1 ele1=new Elevator1();
	   Elevator2 ele2=new Elevator2();
	   Elevator3 ele3=new Elevator3();
	   Elevator4 ele4=new Elevator4();
	   Elevator5 ele5=new Elevator5();
	   public Control() {
		  
	   }
	   public void run() {
		 if(LoginA.q.size!=0) {
			  while(LoginA.q.size>0) {
				  floor0.enqueue(LoginA.q.peek(),LoginA.q.peek1());
				  screen.floor0+=LoginA.q.peek();
				  LoginA.q.dequeue();
			  }
		  }
		 if(Exit.q.size!=0) {
			  while(Exit.q.size>0) {
				  if(Exit.q.peek1()==1) {
					  floor1.enqueue(Exit.q.peek(),0);
				  }
				  else if(Exit.q.peek1()==2) {
					  floor2.enqueue(Exit.q.peek(),0);	
				 }
				  else if(Exit.q.peek1()==3) {
					  floor3.enqueue(Exit.q.peek(),0);
				 }
				  else if(Exit.q.peek1()==4) {
					  floor4.enqueue(Exit.q.peek(),0);
				 }
				 Exit.q.dequeue();
			  }
		  }
		 if(screen.floor0<20 & screen.floor1<20 & screen.floor2<20 & screen.floor3<20 & screen.floor4<20) {
			 if(ele1.isActive==false) {
				 screen.t.schedule(ele1,1300,1500);
				 ele1.isActive=true;
			 }
			 if(Elevator2.ele2.size==0) {
				 ele2=new Elevator2();
				 ele2.isActive=false;
				 screen.active2.setText("active:False");
				 screen.mode2.setText("mode: idle");
			 }
			 if(Elevator3.ele3.size==0) {
				 ele3=new Elevator3();
				 ele3.isActive=false;
				 screen.active3.setText("active:False");
				 screen.mode3.setText("mode: idle");
			 }
			 if(Elevator4.ele4.size==0) {
				 ele4=new Elevator4();
				 ele4.isActive=false;
				 screen.active4.setText("active:False");
				 screen.mode4.setText("mode: idle");
			 }
			 if(Elevator5.ele5.size==0) {
				 ele5=new Elevator5();
				 ele5.isActive=false;
				 screen.active5.setText("active:False");
				 screen.mode5.setText("mode: idle");
			 }
		 }
		 if(screen.floor0>=20 | screen.floor1>=20 |screen.floor2>=20 |screen.floor3>=20 |screen.floor4>=20 | Elevator2.ele2.size!=0) {
				 if(ele2.isActive==false) {
					 screen.t.schedule(ele2,1300,1500);
					 ele2.isActive=true;
					 screen.active2.setText("active:True");
					 screen.mode2.setText("mode: Working");
				 }
		 }
		 if(screen.floor0>=40 | screen.floor1>=40 |screen.floor2>40 |screen.floor3>=40 |screen.floor4>=40 | Elevator3.ele3.size!=0) {
			 if(ele3.isActive==false) {
				 screen.t.schedule(ele3,1300,1500);
				 ele3.isActive=true;
				 screen.active3.setText("active:True");
				 screen.mode3.setText("mode: Working");
			 }
		 }
		 if(screen.floor0>=60 | screen.floor1>=60 |screen.floor2>60 |screen.floor3>=60 |screen.floor4>=60 | Elevator4.ele4.size!=0) {
			 if(ele4.isActive==false) {
				 screen.t.schedule(ele4,1300,1500);
				 ele4.isActive=true;
				 screen.active4.setText("active:True");
				 screen.mode4.setText("mode: Working");
			 }
		 }
		 if(screen.floor0>=80 | screen.floor1>=80 |screen.floor2>80 |screen.floor3>=80 |screen.floor4>=80 | Elevator5.ele5.size!=0) {
			 if(ele5.isActive==false) {
				 screen.t.schedule(ele5,1300,1500);
				 ele5.isActive=true;
				 screen.active5.setText("active:True");
				 screen.mode5.setText("mode: Working");
			 }
		 }
			 screen.queue0.setText("0.floor: queue:"+Integer.toString(screen.floor0));
			  if(floor0.size!=0) {
			 screen.q0.setText("0.floor:"+floor0.q());
		 }
		 else {
			 screen.q0.setText("0.floor:");
		 }
		 if(floor1.size!=0) {
			 screen.q1.setText("1.floor:"+floor1.q());
		 }
		 else {
			 screen.q1.setText("1.floor:");
		 }
		 if(floor2.size!=0) {
			 screen.q2.setText("2.floor:"+floor2.q());
		 }
		 else {
			 screen.q2.setText("2.floor:");
		 }
		 if(floor3.size!=0) {
			 screen.q3.setText("3.floor:"+floor3.q());
		 }
		 else {
			 screen.q3.setText("3.floor:");
		 }
		 if(floor4.size!=0) {
			 screen.q4.setText("4.floor:"+floor4.q());
		 }
		 else {
			 screen.q4.setText("4.floor:");
		 }
		 
	   }
}
