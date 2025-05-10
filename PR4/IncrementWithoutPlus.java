public class IncrementWithoutPlus {
      public static void main(String[] args) {
          int a = 5;
          int carry = 1;
          while (carry != 0) {
              int sum = a ^ carry;        // XOR adds bits without carrying
              carry = (a & carry) << 1;   // AND finds carry, shift it left
              a = sum;
          }
          System.out.println("Incremented value: " + a);  // Output: 6
      }
  }
  