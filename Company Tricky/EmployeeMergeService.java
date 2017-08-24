package com.mindtree.test;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMergeService {

	public void mergeData(List<Employee> sapDBList) {
		boolean flag = false;
		EmployeeDao dao = new EmployeeDao();
		List<Employee> LocalDB = dao.getInternalDBData();
		List<Employee> updateList = new ArrayList<>();
		List<Employee> insertList = new ArrayList<>();
		for (Employee sapEmployee : sapDBList) {
			for (Employee localEmployee : LocalDB) {
				if (localEmployee.getEmpId() == (sapEmployee.getEmpId())) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				insertList.add(sapEmployee);
			} else {
				flag = false;
				updateList.add(sapEmployee);
			}
		}
		System.out.println("Update : " + updateList);
		System.out.println("Insert : " + insertList);
	}

	public static void main(String[] args) {
		EmployeeMergeService service = new EmployeeMergeService();

		List<Employee> sapDB = new ArrayList<>();
		sapDB.add(new Employee(001, "XXX", "Infrastructure", "8888888887"));
		sapDB.add(new Employee(003, "ZZZ", "Catering", "9999999999"));
		sapDB.add(new Employee(005, "PQR", "TEST", "7777777777"));
		service.mergeData(sapDB);
	}

	private class EmployeeDao {

		public List<Employee> getInternalDBData() {
			List<Employee> LocalDB = new ArrayList<>();
			LocalDB.add(new Employee(001, "XXX", "Infrastructure", "8888888887"));
			LocalDB.add(new Employee(003, "ZZZ", "Catering", "9999999999"));
			LocalDB.add(new Employee(004, "WWW", "Security", "7777777777"));
			return LocalDB;
		}
	}
}
