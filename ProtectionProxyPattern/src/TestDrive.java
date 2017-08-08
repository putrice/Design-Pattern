
public class TestDrive {
	
	public static void main(String[] args){
		new TestDrive().run();
	}
	
	public void run(){
		EmployeeBean putri = new EmployeeBeanImpl();
		
		EmployeeBean ownerProxy = getOwnerProxy(putri);
		ownerProxy.setName("Name : Putri");
		ownerProxy.setPosition("Position : Junior Engineer");
		ownerProxy.setSkill("Android");
		ownerProxy.setSkill("Java");
		
		System.out.println("---- Owner Proxy print data ----");
		print(ownerProxy);
		
		System.out.println("---- Non Owner Proxy try to change data ----");
		EmployeeBean nonOwnerProxy = getNonOwnerProxy(putri);
		try{
			nonOwnerProxy.setName("Hanbin");
		}catch(Exception ex){
			System.out.println("You dont have access to change data");
		}
		System.out.println("---- Non Owner Proxy print data ----");
		print(nonOwnerProxy);
		
		System.out.println("---- Owner Proxy try to change data ----");
		ownerProxy.setSkill("iOS");
		
		System.out.println("---- Owner Proxy print data ----");
		print(ownerProxy);
		System.out.println("---- Non Owner Proxy print data ----");
		print(nonOwnerProxy);
	}
	
	private void print(EmployeeBean bean){
		System.out.println(bean.getName());
		System.out.println(bean.getPosition());
		System.out.println("Skill :");
		for(String string : bean.getSkill()){
			System.out.println("- " + string);
		}
	}
	
	public EmployeeBean getOwnerProxy(EmployeeBean employeeBean) {
		return new OwnerInvocationHandler(employeeBean).getOwnerProxy(employeeBean);
	}
	
	public EmployeeBean getNonOwnerProxy(EmployeeBean employeeBean) {
		return new NonOwnerInvocationHandler(employeeBean).getNonOwnerProxy(employeeBean);
	}
}
