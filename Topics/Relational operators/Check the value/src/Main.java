import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean result;
        if (num > 0 && num < 10){
            result = true;
            System.out.println(result);
        } else{
            result = false;
            System.out.println(result);
        }
    }
}
