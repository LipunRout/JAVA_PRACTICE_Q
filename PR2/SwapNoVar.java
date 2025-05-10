public class SwapNoVar {
   public static void main(String[] args) {
      int a=5,b=3;
            System.out.println("BEfore Swap "+(a)+"   "+(b));
            a=a+b;
            b=a-b;
            a=a-b;
            System.out.println("After Swap "+(a)+"   "+(b));
   }   
}
