import java.util.ArrayList;

public interface EmployeeBean {
	
	String getName();
	String getPosition();
	ArrayList<String> getSkill();
	
	void setName(String name);
	void setPosition(String position);
	void setSkill(String skill);
}
