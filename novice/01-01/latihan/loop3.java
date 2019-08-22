import java.util.Scanner;

public class loop3
{
 	public static void main(String[] args) {


// the string that we want to analyze
String s = "A programmer gets stuck in the shower because the instructions on the shampoo were: Lather, Wash, and Repeat.";
System.out.println(s);
s = s.toLowerCase();

// Counters initialization
int vowelsCount = 0;
int consonantsCount = 0;

// definition of character groups
String vowels = "aeiouyaeeiouuy";
String consonants = "bccddfghjklmnpqrrssttvwxzz";

// the main loop
for (char c : s.toCharArray()) {
        if (vowels.contains(String.valueOf(c))) {
                vowelsCount++;
        }
        else if (consonants.contains(String.valueOf(c))) {
                consonantsCount++;
        }
}

System.out.println("Vowels: " + vowelsCount);
System.out.println("Consonants: " + consonantsCount);
System.out.println("Non-alphanumeric characters: " + (s.length() - (vowelsCount + consonantsCount)));
	}
}