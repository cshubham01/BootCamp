package linked_List;

public class LinkedList {
	
	Node head;
	
	public void insert(int data)
	{
		Node node = new Node();
		node.data = data;
		
		if(head == null)
		{
			head = node;
		}
		else
		{
			Node n = head;
			while(n.next != null)
			{
				n = n.next;
			}
			n.next = node;
		}
	}
	public void show()
	{
		Node node = head;
		
		while(node.next != null)
		{
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
	
	public void insertAtFirst(int data)
	{
		Node node = new Node();
		node.data = data;
		
		node.next = head;
		head = node;
	}
	public void insertAt(int index, int data) {
		
		if(index == 0)
		{
			insertAtFirst(data);
		}
		
		else
		{
			Node node = new Node();
		    node.data = data;
		
		    Node n = head;
		    for(int i=0;i<index-1;i++)
		    {
		       n = n.next;
		    }
		    node.next = n.next;
		    n.next = node;
		}
	}
	public void deleteAt(int index) {
		
		if(index == 0)
		{
			head = head.next;
		}
		else
		{
			Node n = head;
			Node n1 = null;
			for(int i=0;i<index-1;i++)
			{
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
		}
	}
	public int size() {
		
		int count = 0;
		Node n = head;
		while(n != null)
		{
			count++;
			n = n.next;
		}
		
		return count;
	}
	public int midEle() {
				
		Node n = head;
		Node n1 = head;
		for(int i=0;i<size()-2;i++)
		{
		  while(n1 != null)
		  {
		 	 n = n.next;
			 n1 = n1.next.next;
		  }
		}
		
		return n.data;
	}
	public void delete(int value) {
		Node n = head;
		Node n1 = head;
		Node n2 = null;
		int index = 0;
		
		for(int i=0;i<size();i++)
		{
			if(n.data == value)
			{
				index = i;
	            break;
			}
			else
			{
				n = n.next;
			}
		}
	    for(int i=0;i<index-1;i++)
	    {
	    	n1 = n1.next;
	    }
	    n2 = n1.next;
    	n1.next = n2.next;
	}
	public int duplicateEle() {
		 int duplicate = 0;
		 Node n = head;
		 Node n1 = head;
		
		for(int i=0;i<size()-1;i++)
		{
			while(n1 != null)
			{
				
				if(n1.data == n.next.data)
				{
					duplicate = n1.data;
				}
				n1 = n1.next;
				n.next = n1;
			}
		}
		n1 = null;
		return duplicate;
	}
}
