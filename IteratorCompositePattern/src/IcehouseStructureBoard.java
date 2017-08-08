
public class IcehouseStructureBoard {
	public static void main(String []args){
		Employee vpEngineering = new Manager("Pria Purnama", "VP Engineering", 40000000);
		Employee supervisingEngineer = new Manager("Randi Waranugraha", "Supervising Engineer", 35000000);
		Employee seniorEngineer = new Manager("Yoko Ahadazaro", "Senior Engineer", 30000000);
		
		vpEngineering.add(supervisingEngineer);
		vpEngineering.add(seniorEngineer);
		
		seniorEngineer.add(new Developer("Mexan Juadha", "Android Developer", 20000000, false));
		seniorEngineer.add(new Developer("Nabilla Sabbaha", "Android Developer", 20000000, false));
		seniorEngineer.add(new Developer("Raihan", "Android Developer", 20000000, true));
		
		EmployeesStructureBoard employeesStructureBoard = new EmployeesStructureBoard(vpEngineering);
		employeesStructureBoard.printStructure();
		employeesStructureBoard.printProbationEmployee();
	}
}
