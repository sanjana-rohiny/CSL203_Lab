package Lab8;

class Node {
	int data;
	Node prev;
	Node next;

	public Node(int data) {
		this.data = data;
		this.prev = null;
		this.next = null;
	}
}

class DList {

	Node head;
	Node tail;

	public void insert(int data) {

		if (head == null) {
			// list is not created, creating first node
			head = new Node(data);
			// only one element, so tail and head points same node
			tail = head;
		} else {

			// list already exists, create new node and add to tail.
			Node temp = new Node(data);
			tail.next = temp;
			temp.prev = tail;
			// tail advanced set to next node
			tail = tail.next;
		}
	}

	/*
	 * function deletes the node where node.data = key
	 */
	public void delete(int key) {

		Node temp = head;

		if (head != null && head.data == key) {
			// handle if key in first node
			head = head.next;
			// check required, if list has only one node.
			if (head != null) {
				head.prev = null;
			}
		} else if (tail.data == key ) {
			// handle if key in last node
			tail = tail.prev;
			if (tail != null) {
				tail.next = null;
			}
		} else {
			// parse list
			while (temp != null) {
				// locate node
				if (temp.data == key) {
					// delete current node, that is temp
					Node prevNode = temp.prev;
					Node nextNode = temp.next;
					
					prevNode.next = nextNode;
					nextNode.prev = prevNode;					
				}
				// advance list to next node
				temp = temp.next;
			}
		}
	}

	public void display() {

		Node temp = head;
		System.out.print("List Data :");
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

		System.out.println();
	}

}

public class DlistTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DList dlist = new DList();
		
		// create list
		dlist.insert(1);
		dlist.insert(2);
		dlist.insert(3);
		dlist.insert(4);
		dlist.insert(5);
		dlist.insert(6);
		dlist.display();

		// delete in between node
		dlist.delete(3);
		dlist.display();

		// delete first node
		dlist.delete(1);
		dlist.display();

		// delete last node
		dlist.delete(6);
		dlist.display();
	}
}
