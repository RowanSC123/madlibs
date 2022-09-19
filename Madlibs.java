import java.util.Scanner;
/**
 * Write a description of class Madlibs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Madlibs
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("RSC - Madlibs!");
        System.out.println();
        System.out.print("Input name: ");
        String name = input.nextLine();
        System.out.print("Input age: ");
        int age = input.nextInt();
        String buffer1 = input.nextLine();
        System.out.println();
        
        System.out.print("Adjective: ");
        String adj1 = input.nextLine();
        System.out.print("Adjective: ");
        String adj2 = input.nextLine();
        System.out.print("Noun: ");
        String noun1 = input.nextLine();
        System.out.print("Noun: ");
        String noun2 = input.nextLine();
        System.out.print("Plural Noun: ");
        String pn1 = input.nextLine();
        System.out.print("Game: ");
        String game = input.nextLine();
        System.out.print("Plural Noun: ");
        String pn2 = input.nextLine();
        System.out.println(name + age + adj1 + adj2);
    }
}
