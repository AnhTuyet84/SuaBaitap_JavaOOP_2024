package Practice_JavaOOP3.Common;

public class BaseTest {
    public void createDriver(){
        System.out.println("Browser: " + Constants.browser);
        System.out.println("Report: " + Constants.report);
        System.out.println("Headless: " + Constants.headless);
    }
    //Tạo thêm hàm đa hình
    public void createDriver(String browser){
        System.out.println("Browser: " + Constants.browser);
        System.out.println("Report: " + Constants.report);
        System.out.println("Headless: " + Constants.headless);
    }
    public void closeDriver(){
        System.out.println("Close Driver: " + Constants.browser);
    }
    //Cần truyền tham số browser cụ thể vào hàm nên tạo ra thêm 1 hàm nữa -> tính đa hình
    public void closeDriver(String browser){
        System.out.println("Close Driver: " + Constants.browser);
    }
}
