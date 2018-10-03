import java.util.Scanner;

/**
 *
 * Demo class for Game
 *
 *
 * @author Ben LeDoux
 * @author Jimmy Morgan
 * @author Mark Huntington
 * @author Anh Nguyen
 * @version 1.0
 */

public class Demo {
  public static void main(String[] args) {
    int sections = 8;
    Scanner input = new Scanner(System.in);
    String quitChar;
    int[] revealedSections = new int[4];
    revealedSections[0] = 2;
    revealedSections[1] = 4;
    revealedSections[2] = 6;

    System.out.print("The Spinning Wheel (Wheel is being defaulted to 8 Sections)\n" +
                     "In this demo version, the wheel is spun with indexes 3, 5, and 7 always revealed" +
                      "----------------------------------------------------------\n");

    for(int i = 0; i < sections; i++) {
      System.out.print("X ");
    }

    System.out.print("\n");

    for(int i = 1; i < sections+1; i++) {
      System.out.print(i + " ");
    }

    boolean quit = false;

    pressAnyKeyToContinue();

    while(!quit) {
      System.out.print("\n");
      Wheel gameWheel = new Wheel(8);
      gameWheel.get_wheel(revealedSections);
      for(int i = 1; i < sections+1; i++) {
        System.out.print(i + " ");
      }

      System.out.print("\nQ to quit or ENTER to spin again: ");
      quitChar = input.nextLine();
      if(quitChar.toLowerCase().equals("q")) {
        quit = true;
      }
    }

  }
  private static void pressAnyKeyToContinue() {
       System.out.println("\nPress ENTER to spin...");
       try
       {
           System.in.read();
       }
       catch(Exception e)
       {}
  }
}
