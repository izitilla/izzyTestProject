package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath="//div[@class='n2-ss-slider-3']/div")
	public List<WebElement> threeSliders;
	
	@FindBy(xpath="//div[@class='themify_builder_sub_row clearfix gutter-default   sub_row_1-0-2']/div")
	public List<WebElement> threeArrivals;
}
