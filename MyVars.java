public class MyVars {
    public static void main(String[] args) {
        System.out.println(OurConstants.David.RUNT_VAR);
        System.out.println(OurConstants.John.TEST_VAR);
    }
}

class OurConstants {

    public class David {
        public static final int RUNT_VAR = 1;
    }

    public class John {
        public static final int TEST_VAR = 1;
    }

}