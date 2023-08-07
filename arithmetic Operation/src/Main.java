import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Please Enter Your First Number");
        int numb1 = read.nextInt();
        System.out.println("Please Enter Your 2nd Number");
        int numb2 = read.nextInt();
        System.out.println("Please Enter The Operation");
        String operation = read.next();
        if(operation.equals("+")){
            System.out.println("Answer: "+ (numb1 + numb2));
        }else if(operation.equals("-")){
            System.out.println("Answer: "+ (numb1 - numb2));
        } else if(operation.equals("*")){
            System.out.println("Answer: "+ (numb1 * numb2));
        }else if(operation.equals("/")){
            System.out.println("Answer: "+ (numb1 / numb2));
        }else{
            System.out.println("Error");
        }
    }
}