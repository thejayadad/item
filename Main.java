
public class Main {

//Write a function that will return the
//count of distinct case-insensitve
//aplhabetic Characters & numeric digits
//the occur more than once in the input string
            // #CODEWARS PROBLEM//

public static void main(String[] args) {
    System.out.println(duplicateCount("aabbccdd11"));
    System.out.println(duplicateCount("1155gugjdl"));
    System.out.println(duplicateCount("JJAADDBB"));

}
public static int duplicateCount(String text){
    String textLower = text.toLowerCase();
    char[] charArray = textLower.toCharArray();
    String uniqueRepeats = "";
    int count = 0;

    for(int i = 0; i < charArray.length; i++){
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
