public class HundredthPrime
{
   public static void main(String[] args)
   {
      int count = 0;
      int num = 2;

      while (count < 100){
         boolean primo = true;

         if (num <= 1){
            primo = false;
         }
         else{
            for (int i = 2; i*i<= num; i++){
               if (num%i == 0){
                  primo=false;
                  break;
               }
            }
         }

         if (primo){
            count++;
            if (count==100){
               System.out.println(num);
            }
         }
         num++;
      }
   }
}