import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class MyDataInput {
    public static void main(String[] args) throws IOException {
        // Variable Declare
        int totalAge = 0;
        double totalHeight = 0.0;
        double totalWeight = 0.0;
        int totalPerson = 0;
        Map<String, Integer> cities = new HashMap<String, Integer>();

        // Read data from file
        BufferedReader br = new BufferedReader(new FileReader(".//file//data.txt"));

        // Parsing data
        String data;
        while ((data = br.readLine()) != null) {
            totalPerson++;
            StringTokenizer st = new StringTokenizer(data, ",");
            if (st.hasMoreTokens()) {
                int no = Integer.parseInt(st.nextToken());
                String name = st.nextToken();
                totalAge += Integer.parseInt(st.nextToken());
                totalHeight += Integer.parseInt(st.nextToken());
                totalWeight += Integer.parseInt(st.nextToken());
                String tel = st.nextToken();

                String city = st.nextToken();
                if (cities.containsKey(city)) {
                    int count = cities.get(city) + 1;
                    cities.put(city, count);
                } else {
                    cities.put(city, 1);
                }

                // JDK 8 以後引入的功能
                // cities.computeIfAbsent(city, k -> 0);
                // cities.compute(city, (key, count) -> count + 1);

            }
        }
    }
}
