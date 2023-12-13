package hw4;

public class HW4_03 {
    public static void main(String[] args) {
        // Q3. 有個字串陣列如下 (八大行星):
        String[] planets = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
        char[] alphaets = { 'a', 'e', 'i', 'o', 'u' };
        int count = 0;
        // System.out.println(planets[0].charAt(0)==alphaets[0]);

        for (int i = 0; i < planets.length; i++) {
            for (int k = 0; k < planets[i].length(); k++) {
                for (int alpInd = 0; alpInd < alphaets.length; alpInd++) {
                    if (planets[i].charAt(k) == alphaets[alpInd]) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
