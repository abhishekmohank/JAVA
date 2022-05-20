import java.util.Scanner;

public class Reverse
{
        public static void main(String[] args) {

           System.out.print("Enter a number : ");
        Scanner input = new Scanner (System.in);
        int X = input.nextInt();
        int Y = X;
        int Reverse = 0;
        System.out.print("Reverse : ");
        while (Y != 0)
        {
            Reverse = (Reverse*10) + (Y%10);
                
            if (Y%10==0){
                System.out.print("0");
            }
            Y = Y / 10;
        }
        System.out.println(Reverse);
    }
}