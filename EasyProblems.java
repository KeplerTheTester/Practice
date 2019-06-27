import static java.lang.Character.toUpperCase;

public class EasyProblems {
    public static void main(String [] args)
    {

        String test = reverseWords("Kepler Was born");
        System.out.println(test);
    }

    private static void stringReverse(char [] chars)
    {
        for(int i=0, j=chars.length-1; i<chars.length/2; i++)
        {
            char placeHolder = chars[i];
            chars[i] = chars[j];
            chars[j] = placeHolder;
            j--;
        }
    }

    private static int divided(int dividend, int divisor)
    {
        int howManyTimes = 0;
        boolean negative = divisor < 0;
        if(negative)
        {
            divisor = Math.abs(divisor);
        }
        while(dividend >= divisor)
        {
            dividend -= divisor;
            howManyTimes++;
        }

        if(negative)
        {
            return 0-howManyTimes;
        }
        else
        {
            return  howManyTimes;
        }
    }


    private static boolean detectCapitalUse(String word) {
        /*

        All letters in this word are capitals, like "USA".
        All letters in this word are not capitals, like "leetcode".
        Only the first letter in this word is capital, like "Google".
         */
        int capitalCount = 0;
        for(int i=0; i<word.length(); i++)
        {
            if(Character.isUpperCase(word.charAt(i)))
                capitalCount++;
        }
        System.out.println(capitalCount+ "  and length "+word.length());
        if( capitalCount==0 || capitalCount==word.length())
            return true;
        else if(Character.isUpperCase(word.charAt(0)) && capitalCount==1)
        {
            return true;
        }
        else
            return false;
    }

    private static String reverseWords(String s) {
        /*
            Given a string, you need to reverse the order of characters in each word within a sentence while still
             preserving whitespace and initial word order.
            Example 1:
            Input: "Let's take LeetCode contest"
            Output: "s'teL ekat edoCteeL tsetnoc"
         */
        String answer = "";
        //can use string builder later on
        String [] words = s.split(" ");
        for(int i=0; i<words.length-1; i++)
        {
            answer += reverseIndividual(words[i])+" ";
        }
        answer+= reverseIndividual(words[words.length-1]);
        return answer;
    }

    private static String reverseIndividual(String s)
    {
        String answer = "";
        for(int i=s.length()-1; i>=0; i--)
            answer+= s.charAt(i);
        return answer;

    }
}
