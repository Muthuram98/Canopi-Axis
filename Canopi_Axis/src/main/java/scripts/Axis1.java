package scripts;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

import org.openqa.selenium.support.ui.Select;

public class Axis1 extends Keywords {
	
	String URL = TestNgXml.getdatafromExecution().get("Axis1");
	String login_mail = Utils.getDataFromTestData("AxisLogin", "Username");
	String login_password = Utils.getDataFromTestData("AxisLogin", "Password");
	String login_mail1 = Utils.getDataFromTestData("AxisLogin", "Username1");
	String login_password1 = Utils.getDataFromTestData("AxisLogin", "Password1");
	String login_mail2 = Utils.getDataFromTestData("AxisLogin", "Username2");
	String login_password2 = Utils.getDataFromTestData("AxisLogin", "Password2");
	String login_mail3 = Utils.getDataFromTestData("AxisLogin", "Username3");
	String login_password3 = Utils.getDataFromTestData("AxisLogin", "Password3");
	String login_mail4 = Utils.getDataFromTestData("AxisLogin", "Username4");
	String login_password4 = Utils.getDataFromTestData("AxisLogin", "Password4");
	String login_mail5 = Utils.getDataFromTestData("AxisLogin", "Username5");
	String login_password5 = Utils.getDataFromTestData("AxisLogin", "Password5");
	String login_mail6 = Utils.getDataFromTestData("AxisLogin", "Username6");
	String login_password6 = Utils.getDataFromTestData("AxisLogin", "Password6");
	String Referance = Utils.getDataFromTestData("AxisLogin", "Reference_num");
	String Organization = Utils.getDataFromTestData("AxisLogin", "Organization_Name");
	String FacilityAmtdata = Utils.getDataFromTestData("AxisLogin", "FacilityAmt");
	String FacilityIssuedata = Utils.getDataFromTestData("AxisLogin", "FacilityIssue");
	String Yeardata = Utils.getDataFromTestData("AxisLogin", "Year");
	String NoOfSecuritydata = Utils.getDataFromTestData("AxisLogin", "NoOfSecurity");
	String immovabledata = Utils.getDataFromTestData("AxisLogin", "immovable");
	String statesdata = Utils.getDataFromTestData("AxisLogin", "states");
	String GSTINdata = Utils.getDataFromTestData("AxisLogin", "GSTIN");
	String AddressTitledata = Utils.getDataFromTestData("AxisLogin", "AddressTitle");
	String Pincodedata = Utils.getDataFromTestData("AxisLogin", "Pincode");
	String Addresslinedata = Utils.getDataFromTestData("AxisLogin", "Addressline");
	String Citydata = Utils.getDataFromTestData("AxisLogin", "City");
	String Ratedata = Utils.getDataFromTestData("AxisLogin", "Rate");

	public void canopi(WebDriver driver) {
		//URL		
				navigateUrl(driver, URL);
		//Login AM		
				sendKeys(driver, Username, login_mail2);
				sendKeys(driver, Password, login_password2);
				click(driver, Login);
				wait(driver, "5");		
				
		//Accounting Module		
				click(driver, Accounting);
				click(driver, PurInvoice);
		//Create Purchase invoice		
				click(driver, AddPurInvoice);
				click(driver, Supplier);
				click(driver, SelectSupplier);
				waitForElementWithLessWait(driver, PurCostCenter);
				click(driver, PurCostCenter);
				
				waitForElementWithLessWait(driver, CostCenterList);
				click(driver, CostCenterList);
				click(driver, PurItemcode);
				click(driver, SelectItemcode);
				click(driver, Rate);
				sendKeys(driver, Rate, Ratedata);
				JavascriptExecutor scroll6 = (JavascriptExecutor) driver;
			    scroll6.executeScript("window.scrollBy(0,-350)", "");
			    click(driver, Save7);
				click(driver, Action3);
				click(driver, SFA);	
				waitForElementWithLessWait(driver, JVError);
				click(driver, JVError);
		//Copy Purchase invoice
				WebElement copyPurInvoice=driver.findElement(By.xpath("//li[@style='cursor: copy;']"));
				String PurInvoice1=copyPurInvoice.getText();
				System.out.println("PurInvoice : "+ PurInvoice1);
		//Logout AM			
				waitForElementWithLessWait(driver, AM_sta);
				click(driver, AM_sta);
				
				waitForElementWithLessWait(driver, Logout);
				click(driver, Logout);
		//Login AC
				sendKeys(driver, Username, login_mail3);
				sendKeys(driver, Password, login_password3);
				click(driver, Login);
				wait(driver, "5");
		//Purchase invoice Approval
				click(driver, Accounting);
				click(driver, PurInvoice);
				click(driver, ClearFilter);
				sendKeys(driver, Id, PurInvoice1);
				click(driver, Select);
				click(driver, Action3);
				click(driver, Approve1);
				waitForElementWithLessWait(driver, ConfirmAppr);
				click(driver, ConfirmAppr);
				
		//Logout AC		
				waitForElementWithLessWait(driver, AC_sta);
				click(driver, AC_sta);
				
				waitForElementWithLessWait(driver, Logout1);
				click(driver, Logout1);
				//Login AM
				waitForElementWithLessWait(driver, Username);
				sendKeys(driver, Username, login_mail2);
				
				waitForElementWithLessWait(driver, Password);
				sendKeys(driver, Password, login_password2);
				
				waitForElementWithLessWait(driver, Login);
				click(driver, Login);
				
		//Create Payment Entry
				waitForElementWithLessWait(driver, Accounting);
				click(driver, Accounting);
				
				waitForElementWithLessWait(driver, PurInvoice);
				click(driver, PurInvoice);
				
				waitForElementWithLessWait(driver, ClearFilter);
				click(driver, ClearFilter);
				
				waitForElementWithLessWait(driver, Id);
				sendKeys(driver, Id, PurInvoice1);
				
				waitForElementWithLessWait(driver, Select);
				click(driver, Select);
				
				waitForElementWithLessWait(driver, Connection2);
				click(driver, Connection2);
				
				waitForElementWithLessWait(driver, PaymentEntry);
				click(driver, PaymentEntry);
				
				waitForElementWithLessWait(driver, PaidFrom);
				click(driver, PaidFrom);
				
				waitForElementWithLessWait(driver, SelPaidFrom);
				click(driver, SelPaidFrom);
				
				waitForElementWithLessWait(driver, reference_no);
				sendKeys(driver, reference_no, "45678");
				
				JavascriptExecutor scroll = (JavascriptExecutor) driver;
				scroll.executeScript("window.scrollBy(0,-350)", "");
				
				waitForElementWithLessWait(driver, Save7);
				click(driver, Save7);
				
				waitForElementWithLessWait(driver, Action4);
				click(driver, Action4);
				
				waitForElementWithLessWait(driver, SFA);
				click(driver, SFA);
				
				waitForElementWithLessWait(driver, JVError);
				click(driver, JVError);
		//Copy Payment Entry
				
				WebElement copyPaymentEntry = driver.findElement(By.xpath("//li[@style='cursor: copy;']"));
				String PaymentEntry = copyPaymentEntry.getText();
				System.out.println(PaymentEntry);
				add4(driver, "Payment Entry Number" ,PaymentEntry , true,"");
		//Logout AM

				waitForElementWithLessWait(driver, AM_sta);
				click(driver, AM_sta);
				
				waitForElementWithLessWait(driver, Logout);
				click(driver, Logout);
			
		//Login AC
				waitForElementWithLessWait(driver, Username);
				sendKeys(driver, Username, login_mail3);
				
				waitForElementWithLessWait(driver, Password);
				sendKeys(driver, Password, login_password3);
				
				waitForElementWithLessWait(driver, Login);
				click(driver, Login);
			
		//Payment Entry Approval
				waitForElementWithLessWait(driver, Accounting);
				click(driver, Accounting);
				
				waitForElementWithLessWait(driver, PaymentEntry1);
				click(driver, PaymentEntry1);
				
				waitForElementWithLessWait(driver, ClearFilter);
				click(driver, ClearFilter);
				
				waitForElementWithLessWait(driver, Id);
				sendKeys(driver, Id, PaymentEntry);
				
				waitForElementWithLessWait(driver, Select);
				click(driver, Select);
				
				waitForElementWithLessWait(driver, Action3);
				click(driver, Action3);
				
				waitForElementWithLessWait(driver, Approve1);
				click(driver, Approve1);
				
				waitForElementWithLessWait(driver, ConfirmAppr);
				click(driver, ConfirmAppr);
		//Logout AC

				waitForElementWithLessWait(driver, AC_sta);
				click(driver, AC_sta);
				
				waitForElementWithLessWait(driver, Logout1);
				click(driver, Logout1);
				
		//Login AM	
				waitForElementWithLessWait(driver, Username);
				sendKeys(driver, Username, login_mail2);
				
				waitForElementWithLessWait(driver, Password);
				sendKeys(driver, Password, login_password2);
				
				waitForElementWithLessWait(driver, Login);
				click(driver, Login);
				
	}

}
