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
        Double[] distances = new Double[arrFriends.length];
        for (int i = 0; i < arrFriends.length; i++) {
            for (int j = 0; j < ftwns.length; j++) {
                if (ftwns[j][0] == arrFriends[i]) {
                    distances[i] = h.get(ftwns[j][1]);
                    break;
                }
            }
        }
        double sum = distances[0];
        for (int i = 1; i < distances.length; i++) {
            if (distances[i] != null)
                sum += Math.sqrt(distances[i]*distances[i] - distances[i-1]*distances[i-1]);
        }
        for (int i = distances.length - 1; i >=0; i--) {
            if (distances[i] != null) {
                sum += distances[i];
                break;
            }
        }
        return (int)Math.floor(sum);
    }
}
