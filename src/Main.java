import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DNALib dna = new DNALib();
        Scanner s = new Scanner(System.in);

        System.out.println("[DNA Reverser and Translator]");
        System.out.println("Enter a sequence: ");
        String a = s.nextLine();
        if(dna.validator(a)){

            a = dna.reverse(a);

            a = dna.inverser(a);

            System.out.println(dna.translator(a));

        }
        else{
            System.out.println("Your DNA sequence is not valid.");
        }



    }
}