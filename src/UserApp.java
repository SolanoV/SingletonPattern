import java.util.Scanner;

public class UserApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Application app=Application.getInstance();
        int desk1=0, desk2=0, desk3=0;

        while(true){
            System.out.println("Pag-ibig Office Centralized Queuing System");
            System.out.println("[1] Next Number for Desk 1");
            System.out.println("[2] Next Number for Desk 2");
            System.out.println("[3] Next Number for Desk 3");
            System.out.println("[4] View numbers currently in queue");
            System.out.println("[5] Reset the Queue");
            System.out.println("[6] Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            System.out.println();

            switch(choice){
                case 1:
                    app.addQueueNumber();
                    desk1=app.getQueueNumber();
                    currentQueueNumbers(app, desk1, desk2, desk3);
                    break;
                case 2:
                    app.addQueueNumber();
                    desk2=app.getQueueNumber();
                    currentQueueNumbers(app, desk1, desk2, desk3);
                    break;
                case 3:
                    app.addQueueNumber();
                    desk3=app.getQueueNumber();
                    currentQueueNumbers(app, desk1, desk2, desk3);
                    break;
                case 4:
                    currentQueueNumbers(app, desk1, desk2, desk3);
                    break;
                case 5:
                    Scanner sc1 = new Scanner(System.in);
                    System.out.print("Enter new queue number: ");
                    int number = sc1.nextInt();
                    app.resetQueueNumber(number);
                    desk1=desk2=desk3=0;
                    currentQueueNumbers(app, desk1, desk2, desk3);
                    break;
                case 6:
                    System.out.println("Shutting down.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

    public static void currentQueueNumbers(Application app, int desk1, int desk2, int desk3) {
        System.out.println("Current Queue Number: "+app.getQueueNumber());
        System.out.println("Desk 1: "+(desk1==0?"":desk1));
        System.out.println("Desk 2: "+(desk2==0?"":desk2));
        System.out.println("Desk 3: "+(desk3==0?"":desk3)+"\n");
    }
}//VINZ EULO A. SOLANO