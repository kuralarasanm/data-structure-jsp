package linkedlist;

public class linkedlistimpl {
	
	Node head;
	void insert(int ele) {
		Node n=new Node(ele);
		if(head==null) {
			head=n;
			
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=n;
		}
		System.out.println(ele+" has been added sucessfully");
	}
	
	void display() {
		System.out.println("---------linked list data---------------");
		if(head==null) {
			System.out.println("linked list is empty !!!");
		}else {
			Node temp=head;
			while(temp.next!=null) {
				System.out.print
				(temp.data+"->");
				temp=temp.next;
			}
			System.out.println(temp.data);
		}
		System.out.println("=======================================");
	}
	
	void insertFront(int ele) {
		Node n=new Node(ele);
		if(head==null) {
			head=n;
		}else {
			n.next=head;
			head=n;
		}
		System.out.println(ele+" had been inserted successfully...!!!");
	}
	
	void delete() {
		if(head==null) {
			System.out.println("linked list empty..!!");
		}
		else if(head.next==null) {
			System.out.println(head.data+"has been deleted...!!!");
			head=null;
		}
		else {
			Node temp=head;
			while(temp.next.next!=null) {
				temp=temp.next;
			}
			System.out.println(temp.next.data+"has been deleted..!!!");
			temp.next=null;
		}
	}
}
