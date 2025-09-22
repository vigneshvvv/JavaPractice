package ArrayTypes;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class ListPractice {
	
	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("is");
		deque.addFirst("This");
		deque.addLast("Sample");
		
		Iterator<String> itr = deque.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Set<String> linkedSet = new LinkedHashSet<String>();
		linkedSet.add("Error");
		linkedSet.add("occured");
		Iterator<String> itr1 = linkedSet.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		Stack<String> stack = new Stack<String>();
		stack.add("This");
		stack.add("is");
		stack.add("to");
		stack.add("test");
		stack.add("stack");
		
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		Iterator<String> itr2 = stack.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		Set<Integer> tree = new TreeSet<Integer>();
		tree.add(30);
		tree.add(10);
		tree.add(20);
		
		Iterator<Integer> itr3 = tree.iterator();
		while(itr3.hasNext()) {
			System.out.println(itr3.next());
		}
		
		for(Integer in: tree) {
			System.out.println(in);
		}
		
		
		
	}
	
	

}
