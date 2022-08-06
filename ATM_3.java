import java.util.*;

public class ATM_3 {
    private int id = 0;
    private int bal[] = { 300, 300, 300, 300, 300, 300, 300, 300, 300, 300 };
    private int withdraw;
    private int deposit;
    private int tra;
    private int tra_money;

    public ATM_3() {
        Date d = new Date();
        System.out.println("Date : " + d);
    }

    public ATM_3(int ID, int BAL) {
        id = ID;
        // bal[] = BAL;
    }

    public int withdrawn(int with) {
        bal[id] -= with;
        return bal[id];
    }

    public int deposit(int dep) {
        bal[id] += dep;
        return bal[id];
    }

    public int Balance(int Id) {
        return bal[id];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, p, q, x;
        boolean flag = true;
        ArrayList<ATM_3> acc = new ArrayList<ATM_3>();
        for (i = 0; i < 11; i++) {
            acc.add(new ATM_3(i + 1, 300));
        }
        System.out.print("Enter Account Number : ");
        int id = sc.nextInt();
        acc.add(new ATM_3(id, 300));
        while (flag) {
            menu();
            int key = sc.nextInt();
            switch (key) {
                case 1:
                    // System.out.println("\nEnter id you want to check bal. : ");
                    // p = sc.nextInt();
                    System.out.println("Balance : " + acc.get(id).Balance(id));
                    break;
                case 2:
                    System.out.print("\nEnter Amount : ");
                    p = sc.nextInt();
                    System.out.println("Remaining Balance : " +
                            acc.get(id).withdrawn(p));
                    break;
                case 3:
                    System.out.print("\nEnter Amount : ");
                    p = sc.nextInt();
                    System.out.println("Avilable Balance : " + acc.get(id).deposit(p));
                    break;
                case 4:
                    System.out.print("\nEnter Account number in which account you want to transfer money : ");
                    q = sc.nextInt();
                    System.out.print("Enter Amount : ");
                    p = sc.nextInt();
                    if ((acc.get(id).Balance(id)) >= p) {
                        System.out.println("Avilable Balance in : " + q + " is " +
                                acc.get(q).deposit(p));
                        System.out.println("Avilable Balance in : " + id + " is " +
                                acc.get(id).withdrawn(p));
                    } else {
                        System.out.println(
                                "Not sufficient Balance...\nYou can Deposit Money to complete Your Transfer...(Enter 1 to deposite and 0 for exit");
                        x = sc.nextInt();
                        if (x == 1) {
                            System.out.print("\nEnter Amount : ");
                            p = sc.nextInt();

                            System.out.println("Avilable Balance : " +
                                    acc.get(id).deposit(p));
                        } else {
                            break;
                        }
                    }
                    break;
                case 5:
                    acc.add(new ATM_3(i++, 300));
                    System.out.println("\nAccount is created successfully...\nId is " + i +
                            "\nBalance is " + 300);
                    break;
                case 6:
                    acc.remove(id);
                    System.out.println("\nAccount Deleted Successfully.");
                    flag = false;
                    break;
                case 7:
                    System.out.println(
                            "----------------------------THANKS FOR VISITING------------------------------------------");
                    flag = false;
                    break;
                default:
                    break;
            }
            if (key < 7) {
                System.out.print("Enter Account Number : ");
                id = sc.nextInt();
                System.out.println("\nBalance : " + acc.get(id).Balance(id));
            }
        }
    }

    public static void menu() {
        System.out.println("<------------------>Main Menu<------------------>");
        System.out.println("1: Balance Inqury");
        System.out.println("2: Withdraw Money");
        System.out.println("3: Deposit money");
        System.out.println("4: Transfer");
        System.out.println("5: Create Account");
        System.out.println("6: Deactivate Account");
        System.out.println("7: Exit");

    }
}
