package b1;
public class Node<T> {
	T data ;
	Node next;
	
	Node(){
		
	}
	Node(T d){
		data = d;
	}
	
	void setNext(Node t) {
		next = t;
	}
	
	Node getNext() {
		return next;
	}
	
	T getData() {
		return data;
	}
	
	public String toString() {
		return data+" ";
	}

}
