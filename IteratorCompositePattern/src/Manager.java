import java.util.ArrayList;
import java.util.Iterator;

public class Manager extends Employee{
	ArrayList<Employee> employees = new ArrayList<>();
	String name;
	String jobDescription;
	double salary;
	
	public Manager(String name, String jobDescription, double salary){
		this.name = name;
		this.jobDescription = jobDescription;
		this.salary = salary;
	}
	
	@Override
	public void add(Employee employee) {
		employees.add(employee);
	}
	
	@Override
	public void remove(Employee employee) {
		employees.remove(employee);
	}
	
	@Override
	public Employee getChild(int i) {
		return employees.get(i);
	}
	
	public String getName() {
		return name;
	}
	
	public String getJobDescription() {
		return jobDescription;
	}
	
	public double getSalary() {
		return salary;
	}
	
	@Override
	public void print() {
		System.out.println("Name : " + getName());
		System.out.println("Job Description : " + getJobDescription());
		System.out.println("Salary : " + getSalary());
		
		Iterator iterator = employees.iterator();
		while(iterator.hasNext()){
			Employee employee = (Employee) iterator.next();
			employee.print();
		}
	}
	
	@Override
	public Iterator createIterator() {
		return new CompositeIterator(employees.iterator());
	}
}
