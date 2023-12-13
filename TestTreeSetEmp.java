import java.util.*;

public class TestTreeSetEmp {
	public static void main(String args[]) {

		Set<EmployeeTree> set = new TreeSet<EmployeeTree>();
		EmployeeTree e1 = new EmployeeTree(7001, "king1");
		EmployeeTree e2 = new EmployeeTree(7002, "king2");
		EmployeeTree e3 = new EmployeeTree(7003, "king3");
		EmployeeTree e4 = new EmployeeTree(7004, "king4");
		EmployeeTree e5 = new EmployeeTree(7005, "king5");
		EmployeeTree e6 = new EmployeeTree(7005, "king5");

		set.add(e6);
		set.add(e5);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e1);

		for (EmployeeTree aEmp : set) {
			System.out.println(aEmp.getEmpno() + "-" + aEmp.getEname());
		}

	}
}
