import java.util.Random;
import java.util.Scanner;
public class pass1{
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the length of the password :");
	int length = sc.nextInt();
      System.out.println(genPwd(length));
   }

   private static char[] genPwd(int length) {
      String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
      String specialChar = "!@#$";
      String num = "1234567890";
      String combChars = upperCaseLetters + lowerCaseLetters + specialChar + num;
      Random random = new Random();
      char[] pwd = new char[length];

      pwd[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
      pwd[1] = upperCaseLetters.charAt(random.nextInt(upperCaseLetters.length()));
      pwd[2] = specialChar.charAt(random.nextInt(specialChar.length()));
      pwd[3] = num.charAt(random.nextInt(num.length()));
   
      for(int i = 4; i< length ; i++) {
         pwd[i] = combChars.charAt(random.nextInt(combChars.length()));
      }
      return pwd;
   }
}