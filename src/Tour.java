import java.util.*;

public class Tour {
    public static void main(String[] args) {
        String[] friends1 = new String[] { "A1", "A2", "A3", "A4", "A5" };
        String[][] fTowns1 = { new String[] {"A1", "X1"}, new String[] {"A2", "X2"}, new String[] {"A3", "X3"},
                new String[] {"A4", "X4"} };
        Map<String, Double> distTable1 = new HashMap<String, Double>();
        distTable1.put("X1", 100.0); distTable1.put("X2", 200.0); distTable1.put("X3", 250.0);
        distTable1.put("X4", 300.0);
        System.out.println(Tour.tour(friends1, fTowns1, distTable1)); //889
    }
    public static int tour(String[] arrFriends, String[][] ftwns, Map<String, Double> h) {
        // your code
        return 1;
    }
}
