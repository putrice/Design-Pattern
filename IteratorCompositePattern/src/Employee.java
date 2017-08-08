import java.util.Iterator;

public abstract class Employee {
	
	public void add(Employee employee){
		throw new UnsupportedOperationException();
	}
	
	public void remove(Employee employee){
		throw new UnsupportedOperationException();
	}
	
	public Employee getChild(int i){
		throw new UnsupportedOperationException();
	}
	
	public String getName(){
		throw new UnsupportedOperationException();
	}
	
	public String getJobDescription(){
		throw new UnsupportedOperationException();
	}
	
	public double getSalary(){
		throw new UnsupportedOperationException();
	}
	
	public boolean isProbation(){
		throw new UnsupportedOperationException();
	}
	
	public void print(){
		throw new UnsupportedOperationException();
	}
	
	public Iterator createIterator(){
		throw new UnsupportedOperationException();
	}
}
