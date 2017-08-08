import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator{
	Stack stack = new Stack();

	public CompositeIterator(Iterator iterator) {
		stack.push(iterator);
	}

	@Override
	public boolean hasNext() {
		if(stack.empty()){
			return false;
		}else{
			Iterator iterator = (Iterator) stack.peek();
			if(!iterator.hasNext()){
				stack.pop();
				return hasNext();
			}else{
				return true;
			}
		}
	}

	@Override
	public Object next() {
		if(hasNext()){
			Iterator iterator = (Iterator) stack.peek();
			Employee employee = (Employee) iterator.next();
			if(employee instanceof Manager){
				stack.push(employee.createIterator());
			}
			return employee;
		}else{
			return null;
		}
	}
	
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
