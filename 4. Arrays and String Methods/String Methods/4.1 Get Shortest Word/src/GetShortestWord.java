public class GetShortestWord
{
    //code the method getShortestWord that accepts two words and returns the shortest one
    public static String getShortestWord(String word1, String word2){
        if (word1.length() < word2.length()){
            return word1;
        }
        else{
            return word2;
        }
    }
}