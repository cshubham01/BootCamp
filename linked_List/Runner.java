package linked_List;

public class Runner {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(5);
		list.insert(52);
		list.insert(29);
		list.insert(25);
		list.insert(52);
		
		list.insertAtFirst(8);
		
		list.insertAt(4, 18);
		
		list.deleteAt(3);
		
		list.insert(25);
		
		list.delete(52);
		
		list.show();
		
		System.out.println("Size of List is: " + list.size());
		
		System.out.println("Middle Element is: "+ list.midEle());
		
		System.out.println("Duplicate Element in Linked List is: " + list.duplicateEle());
	}

}
