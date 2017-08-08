import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OwnerInvocationHandler implements InvocationHandler {
	EmployeeBean employee;
	
	public OwnerInvocationHandler(EmployeeBean employee) {
		this.employee = employee;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
		try{
			if(method.getName().startsWith("get")){
				return method.invoke(employee, args);
			}else if(method.getName().startsWith("set")){
				return method.invoke(employee, args);
			}
		}catch(InvocationTargetException e){
			e.printStackTrace();
		}
		return null;
	}

	EmployeeBean getOwnerProxy(EmployeeBean employee){
		return (EmployeeBean) Proxy.newProxyInstance(employee.getClass().getClassLoader(), employee.getClass().getInterfaces(), new OwnerInvocationHandler(employee));
	}
}
