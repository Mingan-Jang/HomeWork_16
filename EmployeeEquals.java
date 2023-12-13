// public class Employee implements Comparable<Employee> {

public class EmployeeEquals implements Comparable<EmployeeEquals> {
    private int empno;
    private String ename;

    public void serEmpN(int empno) {
        this.empno = empno;
    }

    public int getEmpno() {
        return empno;
    }

    public void setName(String ename) {
        this.ename = ename;
    }

    public String getEname() {
        return ename;
    }

    public EmployeeEquals(int empno, String ename) {
        this.empno = empno;
        this.ename = ename;
    }

    public EmployeeEquals(int empno) {
        this(empno, "-");
    }

    public EmployeeEquals(String ename) {
        this(0, ename);
    }

    public EmployeeEquals() {
        this(0, "-"); // 或 empno = 0; ename = "-"
    }

    public void display() {
        System.out.println("empno=" + empno);
        System.out.println("ename=" + ename);
    }

    @Override
    public int compareTo(EmployeeEquals aEmployee) {
        // 物件本身與 aEmployee 相比較，如果 retrun 正值
        // 就表示比 aEmployee 大
        if (this.empno > aEmployee.empno) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj != null && this.getClass() == obj.getClass()) {
            EmployeeEquals e = (EmployeeEquals) obj;
            if (this.empno == e.empno && this.ename.equals(e.ename)) {
                return true;
            }
        }
        return false;
    }

}
