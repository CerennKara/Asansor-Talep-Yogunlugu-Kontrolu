import java.awt.EventQueue;
import java.util.Timer;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class screen extends JFrame {
	static int floor0=0,floor1=0,floor2=0,floor3=0,floor4=0,floor5=0,exitcount=0;
	public static JLabel queue0,queue1,queue2,queue3,queue4,exitqueue,active1,active2,active3,active4,active5,mode1,mode2,mode3;
	public static JLabel mode4,mode5,floor_1,floor_2,floor_3,floor_4,floor_5,destination1,destination2,destination3,destination4;
	public static JLabel destination5,direction1,direction2,direction3,direction4,direction5,capacity1,capacity2,capacity3,capacity4,count1,count2,count3,count4;
	public static JLabel capacity5,count5,inside1,inside2,inside3,inside4,inside5,q0,q1,q2,q3,q4;
	private JPanel contentPane;
	static Timer t;
	public static void main(String[] args) {
		  t = new Timer();
		  
		  LoginA login = new LoginA();
		  Exit exit = new Exit();
	      Control ctrl=new Control();
	      
	      t.schedule(ctrl,1200,1400);
	      t.schedule(login,500,1000);
	      t.schedule(exit,1600,2600);
	      
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					screen frame = new screen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public screen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1155, 584);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		queue0 = new JLabel("0. floor: queue : 0");
		queue0.setBounds(15, 10, 180, 16);
		contentPane.add(queue0);
		
		queue1 = new JLabel("1. floor: all:0 queue : 0");
		queue1.setBounds(15, 30, 180, 16);
		contentPane.add(queue1);
		
		queue2 = new JLabel("2. floor: all: 0 queue : 0");
		queue2.setBounds(15, 50, 180, 16);
		contentPane.add(queue2);
		
		queue3 = new JLabel("3. floor: all: 0 queue : 0");
		queue3.setBounds(15, 70, 180, 16);
		contentPane.add(queue3);
		
		queue4 = new JLabel("4. floor: all: 0 queue : 0");
		queue4.setBounds(15, 90, 180, 16);
		contentPane.add(queue4);
		
		exitqueue = new JLabel("exit count: 0");
		exitqueue.setBounds(15, 110, 180, 16);
		contentPane.add(exitqueue);
		
		active1 = new JLabel("active: True");
		active1.setBounds(15, 130, 180, 16);
		contentPane.add(active1);
		
		mode1 = new JLabel("mode: Working");
		mode1.setBounds(50, 150, 180, 16);
		contentPane.add(mode1);
		
		floor_1 = new JLabel("floor: 2");
		floor_1.setBounds(50, 170, 180, 16);
		contentPane.add(floor_1);
		
		destination1 = new JLabel("destination: 3");
		destination1.setBounds(50, 190, 180, 16);
		contentPane.add(destination1);
		
		direction1 = new JLabel("direction: up");
		direction1.setBounds(50, 210, 180, 16);
		contentPane.add(direction1);
		
		capacity1 = new JLabel("capacity: 10");
		capacity1.setBounds(50, 230, 180, 16);
		contentPane.add(capacity1);
		
		count1 = new JLabel("count_inside: 10");
		count1.setBounds(50, 250, 180, 16);
		contentPane.add(count1);
		
		inside1 = new JLabel("inside[]");
		inside1.setBounds(50, 270, 180, 16);
		contentPane.add(inside1);
		
		active2 = new JLabel("active: False");
		active2.setBounds(195, 130, 180, 16);
		contentPane.add(active2);
		
		mode2 = new JLabel("mode: idle");
		mode2.setBounds(230, 150, 180, 16);
		contentPane.add(mode2);
		
		floor_2 = new JLabel("floor: 0");
		floor_2.setBounds(230, 170, 180, 16);
		contentPane.add(floor_2);
		
		destination2 = new JLabel("destination: 0");
		destination2.setBounds(230, 190, 180, 16);
		contentPane.add(destination2);
		
		direction2 = new JLabel("direction: up");
		direction2.setBounds(230, 210, 180, 16);
		contentPane.add(direction2);
		
		capacity2 = new JLabel("capacity: 10");
		capacity2.setBounds(230, 230, 180, 16);
		contentPane.add(capacity2);
		
		count2 = new JLabel("count_inside: 0");
		count2.setBounds(230, 250, 180, 16);
		contentPane.add(count2);
		
		inside2 = new JLabel("inside[]");
		inside2.setBounds(230, 270, 180, 16);
		contentPane.add(inside2);
		
		active3 = new JLabel("active: False");
		active3.setBounds(375, 130, 179, 16);
		contentPane.add(active3);
		
		mode3 = new JLabel("mode: idle");
		mode3.setBounds(410, 150, 180, 16);
		contentPane.add(mode3);
		
		floor_3 = new JLabel("floor: 0");
		floor_3.setBounds(410, 170, 180, 16);
		contentPane.add(floor_3);
		
		destination3 = new JLabel("destination: 0");
		destination3.setBounds(410, 190, 180, 16);
		contentPane.add(destination3);
		
		direction3 = new JLabel("direction: up");
		direction3.setBounds(410, 210, 180, 16);
		contentPane.add(direction3);
		
		capacity3 = new JLabel("capacity: 10");
		capacity3.setBounds(410, 230, 180, 16);
		contentPane.add(capacity3);
		
		count3 = new JLabel("count_inside: 0");
		count3.setBounds(410, 250, 180, 16);
		contentPane.add(count3);
		
		inside3 = new JLabel("inside[]");
		inside3.setBounds(410, 270, 180, 16);
		contentPane.add(inside3);
		
		active4 = new JLabel("active: False");
		active4.setBounds(555, 130, 179, 16);
		contentPane.add(active4);
		
		mode4 = new JLabel("mode: idle");
		mode4.setBounds(590, 150, 180, 16);
		contentPane.add(mode4);
		
		floor_4 = new JLabel("floor: 0");
		floor_4.setBounds(590, 170, 180, 16);
		contentPane.add(floor_4);
		
		destination4 = new JLabel("destination: 0");
		destination4.setBounds(590, 190, 180, 16);
		contentPane.add(destination4);
		
		direction4 = new JLabel("direction: up");
		direction4.setBounds(590, 210, 180, 16);
		contentPane.add(direction4);
		
		capacity4 = new JLabel("capacity: 10");
		capacity4.setBounds(590, 230, 180, 16);
		contentPane.add(capacity4);
		
		count4 = new JLabel("count_inside: 0");
		count4.setBounds(590, 250, 180, 16);
		contentPane.add(count4);
		
		inside4 = new JLabel("inside[]");
		inside4.setBounds(590, 270, 180, 16);
		contentPane.add(inside4);
		
		active5 = new JLabel("active: False");
		active5.setBounds(735, 130, 179, 16);
		contentPane.add(active5);
		
		mode5 = new JLabel("mode: idle");
		mode5.setBounds(770, 150, 180, 16);
		contentPane.add(mode5);
		
		floor_5 = new JLabel("floor: 0");
		floor_5.setBounds(770, 170, 180, 16);
		contentPane.add(floor_5);
		
		destination5 = new JLabel("destination: 0");
		destination5.setBounds(770, 190, 180, 16);
		contentPane.add(destination5);
		
		direction5 = new JLabel("direction: up");
		direction5.setBounds(770, 210, 180, 16);
		contentPane.add(direction5);
		
		capacity5 = new JLabel("capacity: 10");
		capacity5.setBounds(770, 230, 180, 16);
		contentPane.add(capacity5);
		
		count5 = new JLabel("count_inside: 0");
		count5.setBounds(770, 250, 180, 16);
		contentPane.add(count5);
		
		inside5 = new JLabel("inside[]");
		inside5.setBounds(770, 270, 180, 16);
		contentPane.add(inside5);
		
		q0 = new JLabel("0. floor: [[4,4],[3,3],[9,4]]");
		q0.setBounds(15, 400, 334, 16);
		contentPane.add(q0);
		
		q1 = new JLabel("1. floor: []");
		q1.setBounds(15, 420, 334, 16);
		contentPane.add(q1);
		
		q2 = new JLabel("2. floor: []");
		q2.setBounds(15, 440, 334, 16);
		contentPane.add(q2);
		
		q3 = new JLabel("3. floor: []");
		q3.setBounds(15, 460, 334, 16);
		contentPane.add(q3);
		
		q4 = new JLabel("4. floor: []");
		q4.setBounds(15, 480, 334, 16);
		contentPane.add(q4);
		
		JLabel lblNewLabel_51 = new JLabel("1. Asans\u00F6r");
		lblNewLabel_51.setBounds(15, 300, 180, 16);
		contentPane.add(lblNewLabel_51);
		
		JLabel lblNewLabel_52 = new JLabel("2. Asans\u00F6r");
		lblNewLabel_52.setBounds(195, 300, 180, 16);
		contentPane.add(lblNewLabel_52);
		
		JLabel lblNewLabel_53 = new JLabel("3. Asans\u00F6r");
		lblNewLabel_53.setBounds(375, 300, 180, 16);
		contentPane.add(lblNewLabel_53);
		
		JLabel lblNewLabel_54 = new JLabel("4. Asans\u00F6r");
		lblNewLabel_54.setBounds(555, 300, 180, 16);
		contentPane.add(lblNewLabel_54);
		
		JLabel lblNewLabel_55 = new JLabel("5. Asans\u00F6r");
		lblNewLabel_55.setBounds(735, 300, 180, 16);
		contentPane.add(lblNewLabel_55);
	}
}
