public class myQueue<Item>{ //Bu class yazilirken stackoverflow ve medium.com sitelerinde ki farkli yazilardan yardim alinmistir
	public int size;
	private static class Node<Item>{
		private Item people,floor;
		private Node<Item> next;
		public Node(Item people,Item floor){
			this.people=people;
			this.floor=floor;
		}
	}
	
	private Node<Item> tail;
	private Node<Item> head;

	public void enqueue(Item people,Item floor) {
		size++;
		Node<Item> node=new Node<Item>(people,floor);
		if(tail!=null) {
			tail.next=node;
		}
		tail=node;
		if(head==null) {
			head=node;
		}
	}
	public Item dequeue(){
		Item data=head.people;
		head=head.next;
		size--;
		if(head==null) {
			tail=null;
		}
		return data;
	}
	public Item peek() {
		return head.people;
	}
	public Item peek1() {
		return head.floor;
	}
	public void Display() {
		Node<Item> temp1=head;
		while(temp1!=null) {
			System.out.println(temp1.people+" "+temp1.floor);
			temp1=temp1.next;
		}
	}
	public String q() {
		Node<Item> temp1=head;
		String str=null;
		str="[";
		while(temp1!=null) {
			str+="["+temp1.people.toString()+","+temp1.floor+"]";
			temp1=temp1.next;
		}
		str+="]";
		return str;
	}
	public int sumPeek() {
		Node<Item> temp1=head;
		int sum=0;
		while(temp1!=null) {
			sum+=Integer.valueOf(temp1.people.toString());
			temp1=temp1.next;
		}
		return sum;
	}
}