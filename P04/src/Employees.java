import java.util.ArrayList;
import java.util.List;

/**
 *
 * Student name:
 * Student number:
 */

public class Employees {
	private Employee[] data;
	private int size;
	
	public Employees(int n){
		data = new Employee[n];
		size = 0;
	}
	
	public int size(){
		return size;
	}
	
	// adds employees to data array
	public void addEmployee(Employee emp) {
		data[data.length] = emp;
		size++;
	}
	
	// returns array of employees by a specified gender
	public Employee[] getEmpByGender(char g) {
		List<Object> males = new ArrayList<Object>();
		List<Object> females = new ArrayList<Object>();
		List<Object> others = new ArrayList<Object>();
		boolean male = false;
		boolean female = false;
		for (int i = 0; i < data.length; i++){
			if (Character.toUpperCase(g) == 'M' && data[i].getPerson().getGender() == 'M'){
				males.add(data[i]);
				male = true;
			}
			if (Character.toUpperCase(g) == 'F' && data[i].getPerson().getGender() == 'F'){
				females.add(data[i]);
				female = true;
			}
			if(Character.toUpperCase(g) != 'M' && Character.toUpperCase(g) != 'F'){
				others.add(data[i]);
			}
		}
		if (male){
			Employee[] array = males.toArray(new Employee[males.size()]);
			return array;
		}
		if (female){
			Employee[] array = females.toArray(new Employee[females.size()]);
			return array;
		}
		else {
			Employee[] array = others.toArray(new Employee[others.size()]);
			return array;
		}
	}
	
	// returns array of employees by a specified department
	public Employee[] getEmpByDept(String dept) {
		List<Object> deptList = new ArrayList<Object>();
		for (int i = 0; i < data.length; i++){
			if (data[i].getDepartment().equalsIgnoreCase(dept)){
				deptList.add(data[i]);
			}
		}
		Employee[] array = deptList.toArray(new Employee[deptList.size()]);
		return array;
	}
	
	// returns array of employees by a specified id
	public Employee getEmpByID(String id) {
		Employee employee = new Employee();
		for (int i = 0; i < data.length; i++){
			if(data[i].getEmployeeId().equalsIgnoreCase(id)){
				employee = data[i];
			}
		}
		return employee;
	}
	
	public String toString(){
		if(size == 0) return "[]";
		String s = "[";
		for(int j = 0; j < size - 1; j++)
			s = s + data[j] + ",";
		return s+data[size-1]+"]";
	}
}