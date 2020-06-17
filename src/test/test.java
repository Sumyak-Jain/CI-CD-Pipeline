import org.openqa.selenium.By;  
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
  
public class example {  
  
    public static void main(String[] args) {  
        
    // declaration and instantiation of objects/variables  
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAURAV\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");  
    WebDriver driver=new ChromeDriver();  
      
// Launch website  
    driver.navigate().to("http://localhost:8081/jenkins_calci");  
          
    
          
    // Click on the male button  
    driver.findElement(By.id("txt1")).click(); 
     // you can do as many types of tests this is just a basic one  
    }      

      
    }  
