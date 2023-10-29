import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Puzzle{
  int[][] puzzle = {{0,1,2,3}, {4,5,6,7}, {8,9,10,11}, {12,13,14,15}};
  int[][] answer = {{0,1,2,3}, {4,5,6,7}, {8,9,10,11}, {12,13,14,15}};
  int difficulty;

  public Puzzle(){

  }

  public Puzzle(int difficulty){
    this.difficulty = difficulty;
  }

  public void printarray(int[][] x){
    for(int i=0; i < 4; i++){
      for(int j = 0; j < 4; j++){
        System.out.print(x[i][j] + "\t");
      }
    System.out.print("\n\n\n");
    }
  }

  public void printanswer(){
    printarray(this.answer);
  }

  public void playgame(String move){
    for(int i = 0; i < move.length(); i++){
      if(move.charAt(i) == 'l'){
        left(this.puzzle);
      }
      else if(move.charAt(i) == 'r'){
        right(this.puzzle);
      }
      else if(move.charAt(i) == 'u'){
        up(this.puzzle);
      }
      else if(move.charAt(i) == 'd'){
        down(this.puzzle);
      }
      else{
        System.out.println("Wrong input");
        System.exit(0);
      }
    }
    printarray(this.puzzle);
  }

  public void left(int[][] x){
    int temp;
    if(x[0][0] == 0 ||  x[1][0] == 0 || x[2][0] == 0 || x[3][0] == 0){
      System.out.println("Wrong input, try again");
    }
    else{
      if(x[0][1] == 0){
        temp = x[0][0];
        x[0][0] = 0;
        x[0][1] = temp;
      }
      else if(x[1][1] == 0){
        temp = x[1][0];
        x[1][0] = 0;
        x[1][1] = temp;
      }
      else if(x[2][1] == 0){
        temp = x[2][0];
        x[2][0] = 0;
        x[2][1] = temp;
      }
      else if(x[3][1] == 0){
        temp = x[3][0];
        x[3][0] = 0;
        x[3][1] = temp;
      }
      else if(x[3][1] == 0){
        temp = x[3][0];
        x[3][0] = 0;
        x[3][1] = temp;
      }
      else if(x[0][2] == 0){
        temp = x[0][1];
        x[0][1] = 0;
        x[0][2] = temp;
      }
      else if(x[1][2] == 0){
        temp = x[1][1];
        x[1][1] = 0;
        x[1][2] = temp;
      }
      else if(x[2][2] == 0){
        temp = x[2][1];
        x[2][1] = 0;
        x[2][2] = temp;
      }
      else if(x[3][2] == 0){
        temp = x[3][1];
        x[3][1] = 0;
        x[3][2] = temp;
      }
      else if(x[0][3] == 0){
        temp = x[0][2];
        x[0][2] = 0;
        x[0][3] = temp;
      }
      else if(x[1][3] == 0){
        temp = x[1][2];
        x[1][2] = 0;
        x[1][3] = temp;
      }
      else if(x[2][3] == 0){
        temp = x[2][2];
        x[2][2] = 0;
        x[2][3] = temp;
      }
      else if(x[3][3] == 0){
        temp = x[3][2];
        x[3][2] = 0;
        x[3][3] = temp;
      }




    }
  }

  public void right(int[][] x){
    int temp;
    if(x[0][3] == 0 ||  x[1][3] == 0 || x[2][3] == 0 || x[3][3] == 0){
      System.out.println("Wrong input, try again");
    }
    else{
      if(x[0][0] == 0){
        temp = x[0][1];
        x[0][1]=0;
        x[0][0]=temp;
      }
      else if(x[1][0] == 0){
        temp = x[1][1];
        x[1][1]=0;
        x[1][0]=temp;
      }
      else if(x[2][0] == 0){
        temp = x[2][1];
        x[2][1]=0;
        x[2][0]=temp;
      }
      else if(x[3][0] == 0){
        temp = x[3][1];
        x[3][1]=0;
        x[3][0]=temp;
      }
      else if(x[0][1] == 0){
        temp = x[0][2];
        x[0][2]=0;
        x[0][1]=temp;
      }
      else if(x[1][1] == 0){
        temp = x[1][2];
        x[1][2]=0;
        x[1][1]=temp;
      }
      else if(x[2][1] == 0){
        temp = x[2][2];
        x[2][2]=0;
        x[2][1]=temp;
      }
      else if(x[3][1] == 0){
        temp = x[3][2];
        x[3][2]=0;
        x[3][1]=temp;
      }
      else if(x[0][2] == 0){
        temp = x[0][3];
        x[0][3]=0;
        x[0][2]=temp;
      }
      else if(x[1][2] == 0){
        temp = x[1][3];
        x[1][3]=0;
        x[1][2]=temp;
      }
      else if(x[2][2] == 0){
        temp = x[2][3];
        x[2][3]=0;
        x[2][2]=temp;
      }
      else if(x[3][2] == 0){
        temp = x[3][3];
        x[3][3]=0;
        x[3][2]=temp;
      }




    }
  }

  public void up(int[][] x){
    int temp;
    if(x[0][0] == 0 ||  x[0][1] == 0 || x[0][2] == 0 || x[0][3] == 0){
      System.out.println("Wrong input, try again");
    }
    else{
      if(x[1][0] == 0){
        temp = x[0][0];
        x[0][0]=0;
        x[1][0]=temp;
      }
      else if(x[2][0] == 0){
        temp = x[1][0];
        x[1][0]=0;
        x[2][0]=temp;
      }
      else if(x[3][0] == 0){
        temp = x[2][0];
        x[2][0]=0;
        x[3][0]=temp;
      }
      else if(x[1][1] == 0){
        temp = x[0][1];
        x[0][1]=0;
        x[1][1]=temp;
      }
      else if(x[2][1] == 0){
        temp = x[1][1];
        x[1][1]=0;
        x[2][1]=temp;
      }
      else if(x[3][1] == 0){
        temp = x[2][1];
        x[2][1]=0;
        x[3][1]=temp;
      }
      else if(x[1][2] == 0){
        temp = x[0][2];
        x[0][2]=0;
        x[1][2]=temp;
      }
      else if(x[2][2] == 0){
        temp = x[1][2];
        x[1][2]=0;
        x[2][2]=temp;
      }
      else if(x[3][2] == 0){
        temp = x[2][2];
        x[2][2]=0;
        x[3][2]=temp;
      }
      else if(x[1][3] == 0){
        temp = x[0][3];
        x[0][3]=0;
        x[1][3]=temp;
      }
      else if(x[2][3] == 0){
        temp = x[1][3];
        x[1][3]=0;
        x[2][3]=temp;
      }
      else if(x[3][3] == 0){
        temp = x[2][3];
        x[2][3]=0;
        x[3][3]=temp;
      }

    }
  }

  public void down(int[][] x){
    int temp;
    if(x[3][0] == 0 ||  x[3][1] == 0 || x[3][2] == 0 || x[3][3] == 0){
      System.out.println("Wrong input, try again");
    }
    else{
      if(x[0][0] == 0){
        temp = x[1][0];
        x[1][0]=0;
        x[0][0]=temp;
      }
      else if(x[1][0] == 0){
        temp = x[2][0];
        x[2][0]=0;
        x[1][0]=temp;
      }
      else if(x[2][0] == 0){
        temp = x[3][0];
        x[3][0]=0;
        x[2][0]=temp;
      }
      else if(x[0][1] == 0){
        temp = x[1][1];
        x[1][1]=0;
        x[0][1]=temp;
      }
      else if(x[1][1] == 0){
        temp = x[2][1];
        x[2][1]=0;
        x[1][1]=temp;
      }
      else if(x[2][1] == 0){
        temp = x[3][1];
        x[2][1]=0;
        x[3][1]=temp;
      }
      else if(x[0][2] == 0){
        temp = x[1][2];
        x[1][2]=0;
        x[0][2]=temp;
      }
      else if(x[1][2] == 0){
        temp = x[2][2];
        x[2][2]=0;
        x[1][2]=temp;
      }
      else if(x[2][2] == 0){
        temp = x[3][2];
        x[2][2]=0;
        x[3][2]=temp;
      }
      else if(x[0][3] == 0){
        temp = x[1][3];
        x[1][3]=0;
        x[0][3]=temp;
      }
      else if(x[1][3] == 0){
        temp = x[2][3];
        x[2][3]=0;
        x[1][3]=temp;
      }
      else if(x[2][3] == 0){
        temp = x[3][3];
        x[3][3]=0;
        x[2][3]=temp;
      }


    }
  }

  public void makepuzzle(){
    String possible = "ludr";
    String command = "";
    Random rnd = new Random();

    if(this.difficulty == 1){
      for(int i = 0; i < 10; i++){
        int index = (int) (rnd.nextFloat() * possible.length());
        command = command + (possible.charAt(index));
      }
      playgame(command);
    }

    else if(this.difficulty == 2){
      for(int i = 0; i < 20; i++){
        int index = (int) (rnd.nextFloat() * possible.length());
        command = command + (possible.charAt(index));
      }
      playgame(command);
    }

    else if (this.difficulty == 3){
      for(int i = 0; i < 30; i++){
        int index = (int) (rnd.nextFloat() * possible.length());
        command = command + (possible.charAt(index));
      }
      playgame(command);
    }

  }

  public boolean check(int[][] x){
    boolean check = Arrays.deepEquals(this.answer, x);
    if(!check){
      return true;
    }
    else{
      return false;
    }
  }

}
