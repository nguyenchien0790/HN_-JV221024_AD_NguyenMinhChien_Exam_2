import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        Stack<String> stack = new Stack<>();
        do {
            System.out.println("---------------------------------");
            System.out.println("JAVA-HACKATHON-05-ADVANCE-1-MENU");
            System.out.println("1. Nhập URL");
            System.out.println("2. Quay lại");
            System.out.println("3. Thoát");
            System.out.print("Mời lựa chon ( 1/2/3 ): ");

            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.print("\nMời nhập URL cần truy cập: ");
                    String inputUrl = scanner.nextLine();
                    stack.push(inputUrl);
                    System.out.println("Truy cập hành công : " +inputUrl);
                    break;
                case 2:
                    if (!stack.isEmpty()){
                        stack.pop();
                        if (!stack.isEmpty()){
                            System.out.println("Quay lai : " +stack.peek());
                            ;
                        } else {
                            System.out.println("Trang đầu");
                        }
                    } else {
                        System.out.println("Không thể quay lại");
                    }
                    break;
                case 3:
                    System.exit(0);
            }
        } while (choice != 3);
    }
}