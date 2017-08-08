import java.util.ArrayList;

public class EmployeeBeanImpl implements EmployeeBean{
	String name;
	String position;
	String skill;
	ArrayList<String> skillList = new ArrayList<>();
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public String getPosition() {
		return position;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void setPosition(String position) {
		this.position = position;
	}
	
	@Override
	public void setSkill(String skill) {
		skillList.add(skill);
	}
	
	@Override
	public ArrayList<String> getSkill() {
		return skillList;
	}
}
