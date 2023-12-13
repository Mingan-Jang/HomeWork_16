// public class Employee implements Comparable<Employee> {

public class EmployeeEqualsHash implements Comparable<EmployeeEqualsHash> {
    private int empno;
    private String ename;

    public int getEmpno() {
        return empno;
    }

    public String getEname() {
        return ename;
    }

    public EmployeeEqualsHash(int empno, String ename) {
        this.empno = empno;
        this.ename = ename;
    }

    @Override
    // 在HashSet跟HashMap中沒有用，只在TreeSet跟TreeMap有用
    public int compareTo(EmployeeEqualsHash aEmployee) {
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
            EmployeeEqualsHash e = (EmployeeEqualsHash) obj;
            if (this.empno == e.empno && this.ename.equals(e.ename)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + empno;
        result = prime * result + ((ename == null) ? 0 : ename.hashCode());
        return result;
    }

}
