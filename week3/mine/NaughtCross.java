/* run board

now i have amde the array that has my commands in.

next i need to take the values and use them to make changes on the printed array.

don't let them overwrite

improve the text

split the commands so that it promts twice for input

change it so that when it prints it x for 1 and 0 for 2

to stop repeats i can have an array of already inputted characters in my player class and then refuse inputs that have been previously done.



he said that the board class should not have input or output. does that mean that display should be elsewhere?

when i print i can use enumerated types

mains should be static. nothing else should.

lots of comments

private fields except for immutable objects

defensive programming

lack of dpeendancy cycles

check tools he offers

*/

public class NaughtCross {
   public static void main(String[] args) {
      Play game = new Play();
   }
}