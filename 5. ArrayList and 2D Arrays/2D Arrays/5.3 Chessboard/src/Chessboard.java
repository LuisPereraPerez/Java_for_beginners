public class Chessboard
{
   public static void main(String[] args)
   {
      char[][] chessboard = new char[8][8];

      for (int row = 0; row < 8; row++){
         for (int col = 0; col < 8; col++){
            if ((row+col)%2==0){
               chessboard[row][col] = '\u25A1';
            }
            else{
               chessboard[row][col] = '\u25A0';
            }
         }
      }

      for (char[] row: chessboard) {
         for (char square : row) {
            System.out.print(square);
         }
         System.out.println();
      }
   }
}