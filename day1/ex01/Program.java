import java.util.Scanner;

class Program {

    public static void main(String[] args) {
        int num;
        int i;
        Scanner scan;

        scan = new Scanner(System.in);
        num = scan.nextInt();
        if (num <= 1)
        {
            System.err.println("IllegalAmount");
            System.exit(-1);
        }
        i = 2;
        while (i * i <= num) {
            if (num % i == 0)
            {
                System.out.println("false " + (i - 1));
                return ;
            }
            i++;
        }
        System.out.println("true " + (i - 1));
    }
}