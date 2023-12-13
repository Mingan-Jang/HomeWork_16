
import java.util.HashSet;
import java.util.Set;

public class TestHashSetEmpEquals {

    public static void main(String[] args) {
        Set<EmployeeEquals> set = new HashSet<EmployeeEquals>();
        EmployeeEquals em1 = new EmployeeEquals(7001, "king1");
        EmployeeEquals em2 = new EmployeeEquals(7002, "king2");
        EmployeeEquals em3 = new EmployeeEquals(7003, "king3");
        EmployeeEquals em4 = new EmployeeEquals(7004, "king4");
        EmployeeEquals em5 = new EmployeeEquals(7005, "king5");
        EmployeeEquals em6 = new EmployeeEquals(7005, "king5");
        EmployeeEquals em7 = new EmployeeEquals(7005, "king5");
        set.add(em7);
        set.add(em6);
        set.add(em5);
        set.add(em2);
        set.add(em3);
        set.add(em4);
        set.add(em1);

        for (EmployeeEquals aEmp2 : set) {
            System.out.println(aEmp2.getEmpno() + "-" + aEmp2.getEname());
        }
        System.out.println(set.size());
        // 6 because the value of Object em6 = em7;
    }
}
