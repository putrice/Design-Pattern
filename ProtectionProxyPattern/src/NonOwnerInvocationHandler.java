import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class NonOwnerInvocationHandler implements InvocationHandler{
	EmployeeBean employee;
	
	public NonOwnerInvocationHandler(EmployeeBean employee) {
		this.employee = employee;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
		try{
			if(method.getName().startsWith("get")){
				return method.invoke(employee, args);
			}else if(method.getName().startsWith("set")){
				throw new IllegalAccessException();
			}
		}catch(InvocationTargetException e){
			e.printStackTrace();
		}
		return null;
	}
	
	EmployeeBean getNonOwnerProxy(EmployeeBean employee){
		return (EmployeeBean) Proxy.newProxyInstance(employee.getClass().getClassLoader(), employee.getClass().getInterfaces(), new NonOwnerInvocationHandler(employee));
	}

}
