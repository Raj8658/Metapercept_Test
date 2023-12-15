public class First_Longest_Word{

    public static void main(String[] args){
        String input1="dummy text of the printing and typesetting industry." ;
        String output1=findLongestWord(input1);
        System.out.println("input:\""+input1+"\"");
        System.out.println("Output: "+output1);

        String input2= "It is a ling-established fact that a reader will be distracted by the readable content of"+" a page when looking at its layout. The point of using Lorem Ipsum is that it has a " +"more-or-less normal distributionqqqqqqqqqqqqqqqqqqq of letters, as opposed to using" +" 'Content here, content here', making it look like readable English";


        String output2 = findLongestWord(input2);

        System.out.println("\nInput: \"" + input2+"\"");
        System.out.println("Output: "+output2);
    }

    private static String findLongestWord(String input){
        String[] words=input.split("\\s+");
        String longestWord = " ";

        for (String word : words){
            String cleanWord = word.replaceAll("[^a-zA-Z]", " ");

            if (cleanWord.length() > longestWord.length()) {
                longestWord = cleanWord;
            }
        }

        return longestWord;
    }
}