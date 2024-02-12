package greenkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class APage {
    WebDriver driver;
    public APage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
}
