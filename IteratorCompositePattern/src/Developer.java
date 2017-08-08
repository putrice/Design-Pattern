
public class Developer extends Employee{
	String name;
	String jobDescription;
	double salary;
	boolean isProbation;
	public Developer(String name, String jobDescription, double salary, boolean isProbation) {
		super();
		this.name = name;
		this.jobDescription = jobDescription;
		this.salary = salary;
		this.isProbation = isProbation;
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
	
	public boolean isProbation() {
		return isProbation;
	}
	
	@Override
	public void print() {
		System.out.print("Name : " + getName());
		if(isProbation()){
			System.out.print("(PROBATION)");
		}
		System.out.println("\nJob Description : " + getJobDescription());
		System.out.println("Salary : " + getSalary());
	}
}
