package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }
    public void navigateTo(String tab) {
        String xpath = String.format("//a[.='%s']", tab);
        BrowserUtils.clickElement(xpath);
    }

}
