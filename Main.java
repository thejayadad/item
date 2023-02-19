
public class Main {

//Write a function that will return the
//count of distinct case-insensitve
//aplhabetic Characters & numeric digits
//the occur more than once in the input string

public static void main(String[] args) {
System.out.println(duplicateCount("aabbvvdd"));
System.out.println(duplicateCount("aA1123"));
System.out.println(duplicateCount("AABBCC"));

}
public static int duplicateCount(String text){
    String textLower = text.toLowerCase();
    char[] charArray = textLower.toCharArray();
    String uniqueRepeats = "";
    int count = 0;

    for(int i = 0; i < charArray.length -1; i++){
        String restOfString = textLower.substring(i + 1);

        String character = Character.toString(charArray[i]);

        if(!uniqueRepeats.contains(character)){
            if(restOfString.indexOf(character) != -1){
                count++;
                uniqueRepeats += character;
            }

        }

    }
    return count;


}

}
