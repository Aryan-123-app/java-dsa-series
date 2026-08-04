public class Stringsbasics{
    static int getLengthofString(String str){
        int count = 0;
        for(int i = 0 ; i < str.length(); i++){
            count++;
        }
        return count;
    }

    static int countvowelsinString(String str){
        int vowel = 0;
        for(int i=0 ; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u'){
                vowel++;
            }
        }
        return vowel;
    }

    static String reverseString(String str){
        String reverse = "";
        int n = str.length();
        for(int i = n-1; i >= 0 ; i--){
            char ch = str.charAt(i);
            reverse += ch;

        }
        return reverse;
    }

    static boolean isPalindrome(String str){
        String original = str;
        String reverse = reverseString(original);
        //compare
        for(int i=0; i < original.length(); i++){
            char ch1 = original.charAt(i);
            char ch2 = reverse.charAt(i);
            if(ch1 != ch2){
                //no match
                return false;
            }
        }
        return true;
    }

    static int countconsonants(String str){
        int consonant = 0;
        for(int i = 0 ; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch != 'a' && ch != 'e' && ch != 'i' && ch !='o' && ch != 'u' && 
                ch != 'A' && ch != 'E' && ch != 'I' && ch !='O' && ch != 'U'
            ){
                consonant++;
            }
        }
        return consonant;
    }

    static String touppperCase(String str){
        String result ="";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch-32); // convert to Uppercase
            }
            result += ch;
        }
        return result;
    }

    static int frequency(String str,char target){
        int count = 0;
        char res = target;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(res == ch){
                count++;
            } 
        }
        return count;
    }

    static String removeSpace(String str){
        String space = "";
        for(int i = 0; i < str.length(); i++){
            char cp = str.charAt(i);

            if(cp != ' '){
                space += cp;
            }
        }
        return space;
    }

    static boolean isonlyDigit(String str){
        for(int i = 0 ; i < str.length(); i++){
            char cl = str.charAt(i);

            if(cl < '0' || cl > '9'){
                return false;
            }
        }
        return true;
    }

    static int countWords(String str){
        int count = 0;
        String[] res = str.trim().split("\\s+"); //handles multiple space
        for(String word: res){
            count++;
        }
        return count;
    }

    public static void main(String[] args){

        //11. Count words in a sentence 
        String sentence = "I study Computer Engineering at PVGCOET";
        int answer = countWords(sentence);
        System.out.println("Number of words: "+ answer);




        /* // 10. Check if String contains only digits
        String str1 = "956";
        boolean check = isonlyDigit(str1);
        if(check){
            System.out.println("String contains only digits");
        } else{
            System.out.println("string contains other characters");
        } */

       /*  //9. Remove all spaces from string
        String name = "A   r   y  a n";
        String result = removeSpace(name);
        System.out.println("String after removing spaces: " + result); */

        /* //8. Find Frequency of a character
        String str = "aryan";
        char c = 'a';
        int answer = frequency(str, c);
        System.out.println("Frequency of " + c + " is: "+ answer); */

        /* //7. Convert String to Upper Case
        String str = "aryan";
        String value = touppperCase(str);
        System.out.println("Upper case: " + value); */

        /* //6. Count Consonants in a String
        String str = "Computer";
        int num = countconsonants(str);
        System.out.println("Consonants in given String: " + num); */

        /* // 5. Check String is a Palindrome or not
        String str = "RACECAR";
        System.out.println(isPalindrome(str)); */

        /* //4. Reverse a String
        String name = "ARYAN";
        System.out.println(reverseString(name)); */

        /* //3. Count the number of vowels in a string
        String str = "Computer";
        int match = countvowelsinString(str);
        System.out.println("No. of vowels in given String: " + match); */

        /* //2. Count length of string without str.length() method
        String str = "Computer";
        int length = getLengthofString(str);
        System.out.println("Length of String: " + length ); */



        /* //1. Print each character of String
        String name = "Computer";
        for (int i = 0; i < name.length() ; i++){
            System.out.println(name.charAt(i));
        } */

        /* //Taking String Input
        Scanner sc = new Scanner(System.in);
        String str = sc.next(); //single word
        String fullname = sc.nextLine(); // Full Line
        System.out.println("String: "+ str);
        System.out.println("Full name: " + fullname); */


        /* //Comparing Strings
        String str1 = "Computer";
        String str2 = "Information Technology";

        if(str1.equals(str2)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        } */

        /* //Length of a string
        String branch = "Computer";
        System.out.println(branch.length());
        //Access Characters
        System.out.println(branch.charAt(0)); */

        // Creating String
        /* String name = "Aryan";
        String lname = new String("Patade");
        System.out.println(name + lname); */
    }
}