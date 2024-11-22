package Practice_JavaOOP3.Testcases;

import Practice_JavaOOP3.Common.BaseTest;

public class Testcases extends BaseTest {
   public void loginCRM(){
       System.out.println("Navigate to URL https://cms.anhtester.com/login");
       System.out.println("Set email valid: admin@example.com");
       System.out.println("Enter password valid: 123456");
       System.out.println("Click on Login button");
       System.out.println("Verify Login success and the Dashboard page displays");
   }
    public void testLoginSuccess(){
        createDriver();//Default sẽ là Chrome
        loginCRM();
        closeDriver();
    }
    public void addCategory(){
        createDriver("Edge");
        loginCRM();
        System.out.println("Click on Products menu");
        System.out.println("On the dropdown list, click on Category menu");
        System.out.println("On the All categories window, click on Add new Category button");
        System.out.println("Input all required Category Information");
        System.out.println("Click on Save button");
        System.out.println("Verify the newly created category is displayed on the All categories window");
        closeDriver("Edge");
    }

    public static void main(String[] args) {
        Testcases testcases = new Testcases();
        testcases.testLoginSuccess();
        System.out.println("==========================");
        testcases.addCategory();
    }
}
