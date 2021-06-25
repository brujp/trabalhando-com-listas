package methods;

import java.util.List;

import entities.Employee;

public class IncreaseSalaryMethod {

	public Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getID() == id) {
				return i;
			}
		}
		return null;
	}

}
