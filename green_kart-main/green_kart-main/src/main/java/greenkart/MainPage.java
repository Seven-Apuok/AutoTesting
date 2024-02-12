package greenkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;

public class MainPage extends BasePage{
    public MainPage(WebDriver driver) {

        super(driver);
    }
    @FindBy(xpath = "//select[@id='page-menu']")

    WebElement changePageSize;

    @FindBy(xpath = "//option[@value='20']")

    WebElement change20;

    @FindBy (xpath ="//th[1]/span[2]")

    WebElement nameDropDown;

    @FindBy(css = "td:nth-of-type(1)")
    List <WebElement> listOfTheProducts;

    @FindBy(css = "input#search-field")
    WebElement insertInput;

    public void clickPageSize(){

        changePageSize.click();
    }
    public void clickSize20(){
        change20.click();}

    void clickNameDropDown(){

        nameDropDown.click();
    }

    public List<String> listOfTheProductNames(){

        ArrayList<String> productNames = new ArrayList<>();

        for (WebElement faundedName: listOfTheProducts){
            productNames.add(faundedName.getText());
        }
//
        return productNames;
    }
    void enterThePartOfTheWord(String namePart){

        insertInput.sendKeys(namePart);
}


}
