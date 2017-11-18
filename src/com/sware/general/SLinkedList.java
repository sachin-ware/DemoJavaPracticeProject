package com.sware.general;

public class SLinkedList {

	Node head=null;
	Node tail=null;
	public SLinkedList() {
		// TODO Auto-generated constructor stub
	}
	
	public void add(Node node){
		if(head==null){
			this.head=node;
			this.tail=node;
		}
		else{
			this.tail.next=node;
			this.tail=node;
		}
	}
	
	public void showList(){
		Node tmp=head;
		System.out.println("start"+head.toString());
		if(head==null){
			System.out.println("List is empty");
		}
		else{
			do {
				//System.out.print(tmp.toString()+"==>>");
				tmp=tmp.next;
			} while (tmp!=null);
		}
		
		System.out.println("end"+head.toString());
		
	}
	
	
	
	public static void main(String[] args) {
		try {
			SLinkedList list=new SLinkedList();
			list.add(new Node(10));
			list.add(new Node(20));
			list.add(new Node(30));
			list.add(new Node(40));
			list.add(new Node(50));
			
			list.showList();
			//list.showList();
			
		} catch (Exception e) {
			System.out.println("Exception:"+e.getMessage());
		}
	}

}

class Node{
	int val;
	Node next;
	public Node(){	}
	public Node(int val){
		this.val=val;
		this.next=null;
	}
	public Node(int v,Node n){
			this.val=v;
			this.next=n;
	}
	
	@Override
	public String toString(){
		return "["+this.val+"|"+this.next+"]";
	}

}


