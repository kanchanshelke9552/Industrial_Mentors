package stringPractice;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "Hello World";
        int count;

        // Convert the string into lowercase to ignore case
        str = str.toLowerCase();

        // Convert the string into a character array
        char[] stringArray = str.toCharArray();

        // Iterate over each character in the array
        for (int i = 0; i < stringArray.length; i++) {
            count = 1;

            // Check if the current character is a duplicate
            for (int j = i + 1; j < stringArray.length; j++) {
                if (stringArray[i] == stringArray[j] && stringArray[i] != ' ') {
                    count++;
                    // Set the character to 0 to avoid printing duplicates again
                    stringArray[j] = '0';
                }
            }

            // Print the duplicate character and its count
            if (count > 1 && stringArray[i] != '0') {
                System.out.println(stringArray[i] + " : " + count);
            }
        }
    }
}
