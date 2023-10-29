import java.util.Arrays;
import java.util.Scanner;

public class Interact{
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);

    System.out.println("Choose a difficulty:\n1. Easy\n2. Medium\n3. Hard");
    int difficulty = scnr.nextInt();

    Puzzle new_puzzle = new Puzzle(difficulty);

    new_puzzle.makepuzzle();

    while(new_puzzle.check(new_puzzle.puzzle)){
      String userinput = scnr.next();
      new_puzzle.playgame(userinput);
    }


  }
}
