package linkedlist;

public class run {
	public static void main(String[] args) {
		linkedlistimpl l1=new linkedlistimpl();
		l1.display();
		l1.insert(10);
		l1.insert(20);
		l1.display();
		l1.insertFront(5);
		l1.insert(30);
		l1.insertFront(7);
		l1.insert(40);
		l1.display();
		l1.delete();
		l1.display();
		
	}
	
}