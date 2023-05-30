package dsa2;

public class Tester {

	public static void main(String[] args) {
		SinglyCircularLinkedList l1= new SinglyCircularLinkedList();
		l1.insertAtbeg(34);
		l1.insertAtbeg(56);
		l1.insertAtbeg(39);
		l1.insertAtbeg(78);
		System.out.println("insert at beginning:\n");
		l1.display();
		System.out.println();
		l1.insertAtlast(45);
		System.out.println("insert at last:\n");
		l1.display();
		System.out.println();
		l1.insertAtspecific(67,3);
		System.out.println("insert at specific psition:\n");
		l1.display();
		System.out.println();
		
		l1.deletebeg();
		System.out.println("delete at beginning:\n");
		l1.display();
		System.out.println();
		l1.deleteatlast();
		System.out.println("delete at last:\n");
		l1.display();
		System.out.println();
//		l1.deleteatspecificpos(2);
		l1.deleteatspecificpos(4);
//		l1.display();
		System.out.println("checking the circularity");
		l1.checkcircuarity(4);

	}

}
