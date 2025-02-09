import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //class PartyFinder
        //  main()
        //      String yourParty
        //      Output “Do you choose (D)emocrat, (I)ndependant, or (R)epublican?”
        //      Input yourParty
        //      if yourParty == "R” then
        //          Output "You get a Republican Elephant."
        //      else if yourParty == "D” then
        //          Output "You get a Democratic Donkey."
        //      else if yourParty == "I” then
        //          Output "You get an Independant Man."
        //      end if
        //  return
        //end class
        Scanner in = new Scanner(System.in);
        String yourParty; //I want to do a char, but we haven't started indexes and the assignment calls for a String.
        System.out.println("Do you choose (D)emocrat, (I)ndependant, or (R)epublican?");
        yourParty = in.nextLine();//next().charAt(0) could also work here for char
        if(yourParty.equalsIgnoreCase("R")) {//the prompt asks for the first letter I used the equalsIgnoreCase from the example video.
            System.out.println("You get a Republican Elephant.");
        } else if(yourParty.equalsIgnoreCase("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if(yourParty.equalsIgnoreCase("I")) {
            System.out.println("You get an Independent Man.");
        } else {
            System.out.println("You get the Other Otter!");
        }
    }
}