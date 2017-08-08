import java.util.Iterator;

public class EmployeesStructureBoard {
	Employee allEmployee;

	public EmployeesStructureBoard(Employee allEmployee) {
		this.allEmployee = allEmployee;
	}
	
	public void printStructure(){
		allEmployee.print();
	}
	
	public void printProbationEmployee(){
		Iterator iterator = allEmployee.createIterator();
		System.out.println("\nPROBATION EMPLOYEE\n");
		while(iterator.hasNext()){
			Employee employee = (Employee) iterator.next();
			try{
				if(employee.isProbation()){
					employee.print();
				}
			}catch(UnsupportedOperationException e){
			}
		}
	}

}
