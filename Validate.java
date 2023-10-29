import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Validate{
  public static void main(String[] args) {
    Puzzle new_puzzle = new Puzzle();
    int number;
    Scanner scnr = new Scanner(System.in);

    System.out.println("Welcome! Please enter your puzzle:");
    for(int i = 0; i< 4; i++){
      for(int j = 0; j < 4; j++){
        number = scnr.nextInt();
        new_puzzle.puzzle[i][j] = number;
      }
    }

    System.out.println("Enter sequence:");
    while(new_puzzle.check(new_puzzle.puzzle)){
      String userinput = scnr.next();
      new_puzzle.playgame(userinput);
    }

    System.out.println("Success!");
  }
}
