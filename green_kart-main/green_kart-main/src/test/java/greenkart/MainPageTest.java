package greenkart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Collections;
import java.util.List;

public class MainPageTest extends BasePageTest{
    MainPage mainPage;
    List<String> webSortedProducts;
    String namePart = "an";
    @Test
    public void sortKartByAbcTest(){
        mainPage = new MainPage(driver);
        mainPage.clickPageSize();
        mainPage.clickSize20();
        mainPage.clickNameDropDown();

        webSortedProducts = mainPage.listOfTheProductNames();
        Collections.sort(webSortedProducts);
    Assertions.assertEquals(webSortedProducts, mainPage.listOfTheProductNames());
        System.out.println(mainPage.listOfTheProductNames());
        System.out.println(webSortedProducts);
    }

    @Test
    public void searchProductByPartOfTheWord(){
        mainPage = new MainPage(driver);
        mainPage.enterThePartOfTheWord(namePart);
        
        List<String> names =mainPage.listOfTheProductNames();
        names.forEach(System.out::println);
        for(String name: names){
    Assertions.assertTrue(name.toLowerCase().contains(namePart.toLowerCase()));
        System.out.println(mainPage.listOfTheProductNames());
        }
    }
}
