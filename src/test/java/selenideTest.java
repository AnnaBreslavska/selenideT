import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class selenideTest {

    @Test
    public void test (){
    open("https://demo.nopcommerce.com/build-your-own-computer");
    $("option[value='2']").click();
    $("option[value='5']").click();
    $("#product_attribute_3_6").click();
    $("#product_attribute_4_8").click();
    $("#add-to-cart-button-1").click();
    $(".ico-cart").click();
    $("td[class='product'] div[class='attributes']")
            .should(Condition.text("HDD: 320 GB"))
            .should(Condition.text("RAM: 8GB [+$60.00]"));
    }
}
