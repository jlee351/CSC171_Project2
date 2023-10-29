ReadMe.txt for Joon Hyup Lee
Project 2: Puzzling Arrays
Due November 10, 2021
jlee351@u.rochester.edu

// Overall Description: Code is divided into three classes: Interact, Validation
and Puzzle. The main method is in both Interact and Validation where the user is 
prompted to solve the puzzle or make and validate the puzzle, respectively. The 
Puzzle class creates has two 2D arrays, the answer array and the actual puzzle. 
The puzzle is created by making random moves l, r, d or u 10,20 or 30 times 
according to the difficulty. l, r, d and u moves the 0 in the puzzle to left right
down and up accordingly. In the Interact class, the user can set the difficulty 
and solve the problem by inputting either each character or a line of any of the 
four alphabets.  

// Error: Whenever a new puzzle is made, it generates a random string of l,r,d
and u of a certain length. This string is then used to give instructions to the
puzzle to move the 0 around until the end of the string is reached. However, the
string is generated at random so it sometimes provides wrong instructions; e.g.)
left when the 0 is at [0][0]. It therefore prints out an error message Whenever
it sees an error. 
