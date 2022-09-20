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
        
        System.out.println("--Nineteen words to input here--");
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
        System.out.print("Verb ending in 'ing': ");
        String ving1 = input.nextLine();
        System.out.print("Verb ending in 'ing': ");
        String ving2 = input.nextLine();
        System.out.print("Plural Noun: ");
        String pn3 = input.nextLine();
        System.out.println("--Halfway done!--");
        System.out.print("Verb ending in 'ing': ");
        String ving3 = input.nextLine();
        System.out.print("Noun: ");
        String noun3 = input.nextLine();
        System.out.print("Plant: ");
        String plant = input.nextLine();
        System.out.print("Part of the body: ");
        String part = input.nextLine();
        System.out.print("A place: ");
        String place = input.nextLine();
        System.out.print("Verb ending in 'ing': ");
        String ving4 = input.nextLine();
        System.out.println("--Three to go!--");
        System.out.print("Adjective: ");
        String adj3 = input.nextLine();
        System.out.print("Number: ");
        double num = input.nextDouble();
        String buffer2 = input.nextLine();
        System.out.print("Plural noun: ");
        String pn4 = input.nextLine();
        System.out.println();
        
        System.out.println("--MadLibs Summer Trip--");
        System.out.println();
        System.out.println("A vacation is when you take a trip to some " + adj1 + " place");
        System.out.println("with your " + adj2 + " family. Usually you go to some place");
        System.out.println("that is near a/an " + noun1 + " or up on a/an " + noun2 + ".");
        System.out.println("A good vacation place is one where you can ride " + pn1);
        System.out.println("or play " + game + " or go hunting for " + pn2 + ". I like");
        System.out.println("to spend my time " + ving1 + " or " + ving2 + ".");
        System.out.println("When parents go on a vacation, they spend their time eating");
        System.out.println("three " + pn3 + " a day, and fathers play golf, and mothers");
        System.out.println("sit around " + ving3 + ". Last summer, my brother");
        System.out.println("fell in a/an " + noun3 + " and got poison " + plant + " all");
        System.out.println("over his " + part + ". My family is going to (the)");
        System.out.println(place + ", and I will practice " + ving4 + ". Parents");
        System.out.println("need vacations more than kids because parents are always very");
        System.out.println(adj3 + ", and because they have to work " + num);
        System.out.println("hours every day all year making enough " + pn4 + " to pay");
        System.out.println("for the vacation.");
    }
}
