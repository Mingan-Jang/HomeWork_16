import java.util.HashSet;
import java.util.Set;

public class MyTestArraysForArrayEmpHash {
    public static void main(String[] args) {
        Set<EmployeeEqualsHash> set = new HashSet<EmployeeEqualsHash>();
        EmployeeEqualsHash em1 = new EmployeeEqualsHash(7001, "king1");
        EmployeeEqualsHash em2 = new EmployeeEqualsHash(7002, "king2");
        EmployeeEqualsHash em3 = new EmployeeEqualsHash(7003, "king3");
        EmployeeEqualsHash em4 = new EmployeeEqualsHash(7004, "king4");
        EmployeeEqualsHash em5 = new EmployeeEqualsHash(7005, "king5");
        EmployeeEqualsHash em6 = new EmployeeEqualsHash(7005, "king5");
        EmployeeEqualsHash em7 = new EmployeeEqualsHash(7005, "king5");
        set.add(em7);
        set.add(em6);
        set.add(em5);
        set.add(em2);
        set.add(em3);
        set.add(em4);
        set.add(em1);

        for (EmployeeEqualsHash aEmp2 : set) {
            System.out.println(aEmp2.getEmpno() + "-" + aEmp2.getEname());
        }
        System.out.println(set.size());
        // 6 because the value of Object em6 = em7;
    }
}
