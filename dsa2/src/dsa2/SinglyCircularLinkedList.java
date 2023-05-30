package dsa2;

public class SinglyCircularLinkedList {
	private Node head;
	private Node tail;
	public SinglyCircularLinkedList() {
		this.head=null;
		this.tail=null;
	}
	public Node gethead() {
		return head;
	}
	public Node gettail() {
		return tail;
	}
	public void sethead(Node head) {
		this.head=head;
	}
	public void settail(Node tail) {
		this.tail=tail;
	}
	public boolean insertAtbeg(int data) {
		Node n=new Node(data);
		if(n==null) {
			return false;
		}
		if(head==null) {
			head=n;
			tail=n;
			tail.setnext(head);
		}
		else {
			n.setnext(head);
			head=n;
			tail.setnext(head);
			
		}
		return true;
	}
	public boolean insertAtlast(int data) {
		Node n=new Node(data);
		if(n==null) {
			return false;
		}
		if(head==null) {
			head=n;
			tail=n;
			tail.setnext(head);
		}
		else {
			tail.setnext(n);
			tail=n;
			n.setnext(head);
			
		}
		return true;
	}
	public boolean insertAtspecific(int data,int pos) {
		Node n=new Node(data);
		Node temp=head;
		if(n==null) {
			return false;
		}
		if(pos<=0) {
			System.out.println("invalid index");
		}
		if(pos==1) {
			insertAtbeg(data);
		}
		else {
			int i=1;
			while(i<pos-1) {
				temp=temp.getnext();
				i++;
			}
			n.setnext(temp.getnext());
			temp.setnext(n);

		}
		return true;
	}
	public void deletebeg()
	{
		Node temp;
		temp=head;
		
		if(head==null)
		{
			System.out.println("no element to delete");
		}
		else
		{
			
			temp=head.getnext();
			tail.setnext(temp);
			head=temp;
			//temp.setnext(null);
		}
	}
	public void deleteatlast()
	{
		
		
		if(head==null)
		{
			System.out.println("no element to delete");
		}
		else
		{
			Node temp;
			temp=head;
			while(temp.getnext().getnext()!=head) {
				temp=temp.getnext();
			}
			tail=temp;
			tail.setnext(head);
			
		}
	}
	public void checkcircuarity(int v) {
		Node temp=head;
		int i=1;
		while(i<=v) {
			System.out.print(temp.getdata()+" ");
			i++;
		}
	}
	public void deleteatspecificpos(int pos)
	{
		Node temp;
		temp=head;
		
		if(head==null)
		{
			System.out.println("no element to delete");
		}
		else
		{
			int i=1;
			while(i<pos-1) {
				temp=temp.getnext();
				i++;
			}
			temp.setnext(temp.getnext().getnext());
		}
	}
	public void display() {
		Node temp=head;
		while(temp.getnext()!=head) {
			System.out.print(temp.getdata()+"  ");
			temp=temp.getnext();	
		}
		System.out.print(temp.getdata()+"  ");
	}
	

}
