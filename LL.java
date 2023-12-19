package b1;

public class LL<T> {
	Node<Integer> first;

	void add(T x) {
		Node newNode = new Node(x);
		if (first == null) {
			first = newNode;
		} else {
			Node p = first;
			while (p.getNext() != null) {
				p = p.getNext();
			}
			p.setNext(newNode);
		}
	}

	public void addBeg(T data) {
		Node newNode = new Node(data);
		newNode.setNext(first);

		first = newNode;

	}

	public void insertAt(T data, int x) {

		Node newNode = new Node(data);
		newNode.setNext(null);
		if (x == 0) {
			System.out.println("position can not be 0");
		} else if (x == 1) {
			newNode.setNext(first);
			first = newNode;
		} else {
			Node<Integer> temp = first;
			for (int i = 1; i < x - 1; i++) {
				if (temp != null) {
					temp = temp.getNext();
				}
			}
			if (temp != null) {
				newNode.setNext(temp.getNext());
				temp.setNext(newNode);
			} else {
				System.out.println("earlier node was null");
			}

		}

	}

	public void deleteAt(int x) {
		if (x == 1) {
			first = first.next;
			return;
		}
		Node<Integer> current = first;
		for (int i = 1; i < x - 1; i++) {
			current = current.next;

		}

		current.next = current.next.next;

	}

	boolean delete(T d) {
		Node p = first, prev = null;
		while (p != null) {
			if (d.equals(p.getData()))
				break;
			prev = p;
			p = p.getNext();
		}
		if (p == null)
			return false;
		if (prev == null)
			first = p.getNext();
		else
			prev.setNext(p.getNext());
		return true;
	}

	// method to calculate node
	public int count() {
		Node<Integer> temp = first;
		int i = 0;
		while (temp != null) {
			i++;
			temp = temp.getNext();
		}
		return i;
	}

	public int max() {
		Node<Integer> temp = first;
		int i = 0;
		while (temp != null) {
			if (i < temp.getData()) {
				i = temp.getData();
			}
			temp = temp.getNext();

		}
		return i;
	}

	public String toString() {
		String s = "";
		Node p = first;
		while (p != null) {
			s = s + p.getData() + "\n";
			p = p.getNext();
		}
		return s;
	}
	
	public void insertOrder(T data) {

		Node<Integer> newNode = new Node(data);



		if (first == null || (((Integer) first.data).compareTo((Integer) data) > 0)) {

			newNode.next = first;

			first = newNode;

			return;

		}



		Node<Integer> current = first;

		while (current.next != null && (( (Integer) current.next.data).compareTo( (Integer) data) < 0)) {

			current = current.next;

		}



		newNode.next = current.next;

		current.next = newNode;

	}

}
