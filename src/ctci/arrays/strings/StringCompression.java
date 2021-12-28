package ctci.arrays.strings;

public class StringCompression {
    public static void main(String[] args) {
        StringCompression stringCompression = new StringCompression();
        System.out.println(stringCompression.compress("aaccccccbbbbdddd"));
    }

    private String compress(String input) {
        char c = '\0';
        int count = 0;
        StringBuilder compressed = new StringBuilder();
        for(int i=0; i < input.length(); i++){
            if(c == input.charAt(i)){
                count++;
            } else {
                c = input.charAt(i);
                count = 1;
            }
            compressed.append("");
        }

        return compressed.length() < input.length() ? compressed.toString() : input;
    }

}
