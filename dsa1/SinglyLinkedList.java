package dsa1;


	public class SinglyLinkedList {
		Node head;
		public SinglyLinkedList() {
			this.head=null;
		}
		public Node gethead() {
			return head;
		}
		public void sethead(Node head) {
			this.head=head;
		}
		public boolean insertAtBeg(int v) {
			Node n = new Node(v);
			if(n==null)
			{
				return false;
			}
			if(head==null) {
				head=n;
			}
			else {
				n.setnext(head);
				head = n;
				
			}
			return true;
		}
		public void insertAtLast(int data) {
			Node temp;
			temp=head;
			Node newt=new Node(data);		
			if(head==null) {
				head=newt;
			}
			else {
				while(temp.getnext()!=null) {
					temp=temp.getnext();
				}
				temp.setnext(newt);
//				newt.setnext(null);
			}
			
			
			
			
		}
		public void display() {
			int count=0;
			Node temp;
			temp=head;
			while(temp !=null)
			{
				System.out.print(temp.getdata()+"  ");
				count++;
				temp = temp.getnext();
			}
			System.out.println("\n length="+count);
		}
		
		public void removeduplicate() {
			Node temp;
			Node temp1;
			int pos=1;
			for(temp=head;temp!=null;temp=temp.getnext()) {
				for(temp1=temp.getnext();temp1!=null;temp1=temp1.getnext()) {
					if(temp.getdata()==temp1.getdata()) {
						deleteAtPos()
						System.out.println(temp.getdata());
						break;
					}
				}
			}
		}
	
}
