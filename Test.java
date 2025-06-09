import java.util.Scanner;
public class Test{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the First letter: ");
        char word1 = scanner.next().charAt(0);

        // Check if the character is NOT a letter (i.e., it's a digit, symbol, etc.)
        if(!Character.isLetter(word1)){
            System.out.println("This is not valid letter");
        }
        else if(word1 == 'A'|| word1 == 'a'){
            System.out.println(word1+" is Vowel letter");
        }
        else if(word1 == 'E'|| word1 == 'e'){
            System.out.println(word1+" is Vowel letter");
        }
        else if(word1 == 'I'|| word1 == 'i'){
            System.out.println(word1+" is Vowel letter");
        }
        else if(word1 == 'O'|| word1 =='o'){
            System.out.println(word1+" is Vowel letter");
        }
        else if(word1 == 'U'|| word1 == 'u'){
            System.out.println(word1+" is Vowal letter");
        }
        else{
            System.out.println(word1+" is consonant letter");
        }

    }

}
