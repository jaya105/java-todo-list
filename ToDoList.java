import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("\n---- TO DO LIST MENU----");
            System.out.println("1.Add Task");
            System.out.println("2.View Tasks");
            System.out.println("3.Delete Task");
            System.out.println("4.Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    System.out.println("Enter task:");
                    String task = sc.nextLine();
                    tasks.add(task);
                    System.out.println("Task added!");
                    break;

                case 2:
                    System.out.println("\nYour Tasks:");
                    for (int i = 0; i < tasks.size();i++){
                        System.out.println((i+1) + "." + tasks.get(i));
                    }  
                    break;
                    
                case 3:
                    System.out.println("Enter task number to delete:");
                    int num = sc.nextInt();
                    if (num > 0 && num <= tasks.size()){
                        tasks.remove(num-1);
                        System.out.println("Task removed!");
                    } else {
                        System.out.println("Invlid task number");
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice");    
            }
        }
        
    }
}
