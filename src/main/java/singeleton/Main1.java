package singeleton;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        DataBaseConnection db = DataBaseConnection.getInstance();
        DataBaseConnection db2 = DataBaseConnection.getInstance();

       Scanner scn = new Scanner(System.in);

        System.out.print("Get user name from user_UL: ");
       String user_url = scn.nextLine();

        System.out.print("Get user name from user_name: ");
       String user_name = scn.nextLine();

        System.out.print("Get user name from user_password: ");
       String user_password = scn.nextLine();

       db.setUrl(user_url);
       db.setUsername(user_name);
       db.setPassword(user_password);



        System.out.println(db);
        System.out.println(db2);

        System.out.println(db.geturl());
        System.out.println(db.getUsername());
        System.out.println(db2.getPassword());








    }
}
