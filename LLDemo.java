package b1;

public class LLDemo {
	public static void main(String[] args) {
		LL<Integer> x = new LL<>();
		x.add(10);
		x.add(20);
		x.add(50);
		x.add(30);
		x.add(40);
		System.out.println(x);
		System.out.println("for max value");
		int m = x.max();
		System.out.println(m);
		System.out.println("for delete");
		
		x.delete(50);
		System.out.println(x);
		x.delete(10);
		System.out.println(x);
		System.out.println("for adding at begining");
		x.addBeg(15);
		System.out.println(x);
		x.addBeg(5);
		System.out.println(x);
		
		System.out.println("for counting nodes");
		int n = x.count();
		System.out.println("No of nodes : "+ n);
		
		System.out.println("for inserting at specific index");
		x.insertAt(25, 4);
		System.out.println(x);
		x.insertAt(2, 1);
		System.out.println(x);
		
		System.out.println("for deleting at specific index");
		x.deleteAt(3);
		System.out.println(x);
		x.deleteAt(1);
		System.out.println(x);
		
		System.out.println("for insert order ");
		x.insertOrder(27);
		System.out.println(x);
		x.insertOrder(35);
		System.out.println(x);
		x.insertOrder(3);
		System.out.println(x);
		
		
		
		
		
		
	}

}
