public class MostVowels {
    public static void main(String[] args) {
        String[] strings = {"Sunshine", "Umbrella", "Major", "Resourceful"};
        String mostVowelString = findMostVowels(strings);
        System.out.println("String with the most number of vowels: " + mostVowelString);
    }
    
    public static String findMostVowels(String[] strings) {
        String mostVowelString = "";
        int maxVowels = 0;
        
        for (String str : strings) {
            int vowelsCount = countVowels(str);
            if (vowelsCount > maxVowels) {
                maxVowels = vowelsCount;
                mostVowelString = str;
            }
        }
        
        return mostVowelString;
    }
    
    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase(); 
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        
        return count;
    }
}
