// public class Employee implements Comparable<Employee> {

public class EmployeeTree implements Comparable<EmployeeTree> {
    private int empno;
    private String ename;

    public int getEmpno() {
        return empno;
    }

    public String getEname() {
        return ename;
    }

    public EmployeeTree(int empno, String ename) {
        this.empno = empno;
        this.ename = ename;
    }

    @Override
    public int compareTo(EmployeeTree aEmployee) {
        // 物件本身與 aEmployee 相比較，如果 retrun 正值
        // 就表示比 aEmployee 大
        if (this.empno > aEmployee.empno) {
            return 1;
        } else if (this.empno == aEmployee.empno) {
            return 0;
        }
        return -1;
    }

}
