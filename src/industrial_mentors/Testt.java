package industrial_mentors;

public class Testt {

        public static int hammingDistance (String s1, String s2){
            if (s1.length() != s2.length()) {
                throw new IllegalArgumentException("Strings must be of equal length");
            }
            int distance = 0;
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    distance++;
                }
            }
            return distance;
        }

        // Example usage:
        public static void main(String[] args) {
            //int distance = hammingDistance("10011", "10100");
            int distance = hammingDistance("coder", "codec");
            System.out.println(distance);  // Output: 3
        }
    }
