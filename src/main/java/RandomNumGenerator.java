public class RandomNumGenerator{
   public static void main (String [] args){
   
  
   //7 - 14
   int num1 = (int)(Math.random()* 8 + 7);
   
   // the first number (8 in this case) will multiply the [0;1), meaning the last nu,mber will be one above the number you want, which also means you wont get that number and instead get the number that youy do want because you will never reach that last number
   
   System.out.println (num1);
   
   //6 - 12
   int num2 = (int)(Math.random()* 7 + 6);
   
   System.out.println (num2);
   
   //9 - 18
   int num3 = (int)(Math.random()* 10 + 9);
   
   System.out.println (num3);
   

   

   
   }
}