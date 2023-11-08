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

public class Investment_Module extends Keywords {
	
	String URL = TestNgXml.getdatafromExecution().get("Investment_Module");
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
				
		//Investments Module		
				click(driver, Investments);
				click(driver, FDO);
		//Create FDO		
				click(driver, AddFDO);
				click(driver, ACNO);
				click(driver, SelectAC);
				click(driver, EOD);
				click(driver, EODToday);
//				sendKeys(driver, EOD, "28-07-2023");
				sendKeys(driver, deposit_amount, "5000");
				sendKeys(driver, interest_rate, "5");
				click(driver, effective_date);
				click(driver, effective_dateToday);
//				sendKeys(driver, effective_date, "30-08-2023");
				sendKeys(driver, tenor_month, "7");
				sendKeys(driver, tenor_days, "2");
				sendKeys(driver, BAC, "6789");
				JavascriptExecutor scroll6 = (JavascriptExecutor) driver;
			    scroll6.executeScript("window.scrollBy(0,550)", "");
				click(driver, AR);
				click(driver, ACNO1);
				wait(driver, "5");
				click(driver, SelectACNO1);
				click(driver, AR);
				click(driver, ACNO2);
				wait(driver, "2");
				click(driver, SelectACNO2);
				JavascriptExecutor scroll7 = (JavascriptExecutor) driver;
			    scroll7.executeScript("window.scrollBy(0,-350)", "");
				click(driver, Save7);
				click(driver, Action9);
				click(driver, SFA1);
				click(driver, JVError);
        //Copy FDO
				WebElement copyFDO=driver.findElement(By.xpath("//li[@style='cursor: copy;']"));
				String FDO1=copyFDO.getText();
				System.out.println("FDO : "+ FDO1);
		//Logout AM			
				click(driver, AM);
				click(driver, Logout);
				wait(driver, "1");
		//Login AC
				sendKeys(driver, Username, login_mail3);
				sendKeys(driver, Password, login_password3);
				click(driver, Login);
				wait(driver, "5");
		//FDO Approval
				click(driver, Investments);
				click(driver, FDO);
				click(driver, ClearFilter);
				sendKeys(driver, Id, FDO1);
				click(driver, Select);
				click(driver, Action9);
				click(driver, Approve2);
				click(driver, JVError);
		//Logout AC		
				click(driver, AC);
			    click(driver, Logout1);
				wait(driver, "1");
				//Login AM		
				sendKeys(driver, Username, login_mail2);
				sendKeys(driver, Password, login_password2);
				click(driver, Login);
				wait(driver, "5");		
				
		//Investments Module		
				click(driver, Investments);
				click(driver, FDO);
				click(driver, ClearFilter);
				sendKeys(driver, Id, FDO1);
				click(driver, Select);
				click(driver, CFDM);
				click(driver, account1);
				click(driver, Selectaccount1);
				click(driver, credit1);
				click(driver, account2);
				click(driver, Selectaccount2);
				click(driver, Save7);
				click(driver, Action10);
				click(driver, SFA);
				click(driver, JVError);
		//Copy FDO
				WebElement copyCFDM=driver.findElement(By.xpath("//li[@style='cursor: copy;']"));
				String CFDM1=copyCFDM.getText();
				System.out.println("CFDM : "+ CFDM1);
		//Logout AM			
				click(driver, AM);
				click(driver, Logout);
				wait(driver, "1");
		//Login AC
				sendKeys(driver, Username, login_mail3);
				sendKeys(driver, Password, login_password3);
				click(driver, Login);
				wait(driver, "5");
		//FDO Approval
				click(driver, Investments);
				click(driver, CFDM);
				click(driver, ClearFilter);
				sendKeys(driver, Id, CFDM1);
				click(driver, Select);
				click(driver, Action9);
				click(driver, Approve2);
				click(driver, JVError);
		//Logout AC		
				click(driver, AC);
			    click(driver, Logout1);
				wait(driver, "1");
		//Login AM		
				sendKeys(driver, Username, login_mail2);
				sendKeys(driver, Password, login_password2);
				click(driver, Login);
				wait(driver, "5");		
				
		//Investments Module		
				click(driver, Investments);
				click(driver, CFDM);
				click(driver, ClearFilter);
				sendKeys(driver, Id, CFDM1);
				click(driver, FCE);
				click(driver, AddRow1);
				click(driver, Amount);
				sendKeys(driver, Amount, "3000");
				click(driver, AddRow1);
				click(driver, Amount1);
				sendKeys(driver, Amount1, "3000");
				click(driver, SelectDC);
				click(driver, SelectCredit);
				click(driver, Save7);			
				click(driver, Action11);
				click(driver, SFA1);
				click(driver, JVError);
				//Copy FDO
				WebElement copyFCE=driver.findElement(By.xpath("//li[@style='cursor: copy;']"));
				String FCE=copyFCE.getText();
				System.out.println("FCE : "+ FCE);
		//Logout AM			
				click(driver, AM);
				click(driver, Logout);
				wait(driver, "1");
		//Login AC
				sendKeys(driver, Username, login_mail3);
				sendKeys(driver, Password, login_password3);
				click(driver, Login);
				wait(driver, "5");
		//FDO Approval
				click(driver, Investments);
				click(driver, FCE1);
				click(driver, ClearFilter);
				sendKeys(driver, Id, FCE);
				click(driver, Select);
				click(driver, Action9);
				click(driver, Approve2);
				click(driver, JVError);
		//Logout AC		
				click(driver, AC);
			    click(driver, Logout1);
				wait(driver, "1");
				//Login AM		
				sendKeys(driver, Username, login_mail2);
				sendKeys(driver, Password, login_password2);
				click(driver, Login);
				wait(driver, "5");		
				
		//Investments Module		
				click(driver, Investments);
				click(driver, FCE1);
				click(driver, ClearFilter);
				sendKeys(driver, Id, FCE);
				click(driver, Select);
				click(driver, ICU);
				Upload_File1(driver, System.getProperty("user.dir")+"\\uploads\\SAL-QTN-2023-00236-signed.pdf");
				click(driver, investmentsheader);
				click(driver, FDO);
				click(driver, ClearFilter);
				sendKeys(driver, Id, FDO1);
				click(driver, Select);
				click(driver, JV);
//				click(driver, Select);
//				click(driver, Select);
//				click(driver, Select);
//				click(driver, Select);
//				click(driver, Select);
//				
//				click(driver, Select);
				
	}
}
