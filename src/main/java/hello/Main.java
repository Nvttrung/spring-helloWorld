package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by rioka on 01-Jun-17.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Account account1 = (Account) context.getBean("account1");
        System.out.println("\n=>Account 1 data");
        System.out.println("ID: " + account1.getId());
        System.out.println("Name: " + account1.getOwerName());
        System.out.println("Balance: " + account1.getBalance());

        Account account2 = (Account) context.getBean("account2");
        System.out.println("\n=>Account 2 data");
        System.out.println("Id: " + account2.getId());
        System.out.println("Name: " + account2.getOwerName());
        System.out.println("Balance: " + account2.getBalance());
    }
}
