package datastructures;

public class LinkedList {
	Node head;
	
	public static Node newNode()
	{
		Node temp = new Node();
		temp.data = 0;
		temp.next = null;
		return temp;
	}
	
	public void insert(int val)
	{
		Node temp = newNode();
		temp.data = val;
		
		if(head == null)
		{
			head = temp;
		}
		else {
			Node n = newNode();
			n = head;
			while(n.next != null)
			{
				n = n.next;
			}
			n.next = temp;
		}
	}
	
	public int size()
	{
		int c = 1;
		Node temp = head;
		while(temp.next != null)
		{
			c++;
			temp = temp.next;
		}
		return c;
	}
	
	public void show() 
	{
		Node temp = newNode();
		temp = head;
		while(temp.next != null)
		{
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
	
	public int[] array_converter()
	{
		Node temp = head;
		int[] arr = new int[20];
		int i = 0;
		while(temp.next != null)
		{
			arr[i++] = temp.data;
			temp = temp.next;
		}
		arr[i] = temp.data;
		return arr;
	}
	
	public static void main(String[] args)
	{
		LinkedList l = new LinkedList();
		l.insert(5);
		l.insert(6);
		l.insert(8);
		l.show();
	}
}
