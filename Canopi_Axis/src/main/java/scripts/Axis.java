package scripts;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import atu.testng.reports.logging.LogAs;
import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class Axis extends Keywords {

	String URL = TestNgXml.getdatafromExecution().get("Axis");
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

	public void organisation (WebDriver driver) {
//URL		
		
		driver.manage().deleteAllCookies();
	    driver.get("chrome://settings/clearBrowserData");
	    driver.findElement(By.xpath("//settings-ui")).sendKeys(Keys.ENTER);
		
		navigateUrl(driver, URL);
//BCGRM Login		
		waitForElementWithLessWait(driver, Username);
		sendKeys(driver, Username, login_mail);
		
		waitForElementWithLessWait(driver, Password);
		sendKeys(driver, Password, login_password);
		
		waitForElementWithLessWait(driver, Login);
		click(driver, Login);
//CRM Module
		waitForElementWithLessWait(driver, CRM);
		click(driver, CRM);
//Create Lead Module
		waitForElementWithLessWait(driver, Lead);
		click(driver, Lead);

		waitForElementWithLessWait(driver, AddLead);
		click(driver, AddLead);
		
		waitForElementWithLessWait(driver, LeadType);
		click(driver, LeadType);
		
		waitForElementWithLessWait(driver, ORG);
		click(driver, ORG);
		
		waitForElementWithLessWait(driver, RefNum);
		sendKeys(driver, RefNum, "234");
		
		waitForElementWithLessWait(driver, Save);
		click(driver, Save);
//		
//		WebElement text = driver.findElement(By.xpath("//*[text()='Invalid CIN number..']"));
//		String msg = text.getText();
//		System.out.println(msg);
//		add4(driver, "Error message", msg , true, "");
//
		waitForElementWithLessWait(driver, InvalidCin);
		click(driver, InvalidCin);

		
		int max = 1010;
		int min = 1;
		int range = max - min + 1;
		for (int i = 0; i < 1; i++) {
			int rand = (int) (Math.random() * range) + min;

			waitForElementWithLessWait(driver, RefNum);
			clearAndType(driver, RefNum, Referance + rand);
//			waitForElementWithLessWait(driver, InvalidCin);
//			click(driver, InvalidCin);
//		        sendKeys(driver, RefNum, Referance+rand);
			
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollBy(0,350)", "");
			
			waitForElementWithLessWait(driver, ORGName);
			sendKeys(driver, ORGName, Organization + rand);

			wait(driver, "1");
		}
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,-350)", "");

			waitForElementWithLessWait(driver, Save);
			click(driver, Save);
	 	
		JavascriptExecutor scroll3 = (JavascriptExecutor) driver;
		scroll3.executeScript("window.scrollBy(0,550)", "");

		waitForElementWithLessWait(driver, ClickArrow);
		click(driver, ClickArrow);

		waitForElementWithLessWait(driver, AddAddress);
		click(driver, AddAddress);
		
		waitForElementWithLessWait(driver, GSTIN);
		sendKeys(driver, GSTIN, GSTINdata);
		
		waitForElementWithLessWait(driver, AddressTitle);
		sendKeys(driver, AddressTitle, AddressTitledata);
			

		waitForElementWithLessWait(driver, Addressline);
		sendKeys(driver, Addressline, Addresslinedata);
		
		waitForElementWithLessWait(driver, Pincode);
		click(driver,Pincode);
		wait(driver,"2");
		sendKeys(driver, Pincode, "600018");
		
		waitForElementWithLessWait(driver, City);
		sendKeys(driver, City, Citydata);
		
		waitForElementWithLessWait(driver, State);
		click(driver, State);
		
		waitForElementWithLessWait(driver, TamilNadu);
		click(driver, TamilNadu);
		
		waitForElementWithLessWait(driver, Save5);
		click(driver, Save5);
		wait(driver, "1");
		goBack(driver);
		
		
		waitForElementWithLessWait(driver, Connection);
		click(driver, Connection);
		
		waitForElementWithLessWait(driver, Plus);
		click(driver, Plus);
//Create Opportunity
		
		waitForElementWithLessWait(driver, Save3);
		click(driver, Save3);
		
		WebElement error = driver.findElement(By.xpath("//*[text()='Missing Fields']//following::div[4]"));
		String missing = error.getText();
		System.out.println(missing);
		add4(driver, "verified missing field " ,missing , true,"");
		
		waitForElementWithLessWait(driver, JVError);
		click(driver, JVError);
		
		waitForElementWithLessWait(driver, Source);
		click(driver, Source);
		
		waitForElementWithLessWait(driver, Chl);
		click(driver, Chl);
		
		waitForElementWithLessWait(driver, Product);
		click(driver, Product);
		
		waitForElementWithLessWait(driver, DTE);
		click(driver, DTE);
		
		waitForElementWithLessWait(driver, NOI);
		doubleClick(driver, NOI);
		
		waitForElementWithLessWait(driver, NC);
		click(driver, NC);
		
		waitForElementWithLessWait(driver, SelList);
		click(driver, SelList);
		
		waitForElementWithLessWait(driver, Listed);
		click(driver, Listed);
		
		
		waitForElementWithLessWait(driver, Currency);
		click(driver, Currency);
		
		waitForElementWithLessWait(driver, SelCurrency);
		click(driver, SelCurrency);
		
		waitForElementWithLessWait(driver, FacilityAmt);
		sendKeys(driver, FacilityAmt, FacilityAmtdata);
		
//		waitForElementWithLessWait(driver, FacilityIssue);
//		sendKeys(driver, FacilityIssue, FacilityIssuedata);
				
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0,350)", "");

		waitForElementWithLessWait(driver, AddRow);
		click(driver, AddRow);
		
		waitForElementWithLessWait(driver, Edit);
		click(driver, Edit);

		waitForElementWithLessWait(driver, First);

		Robot key;

		try {
			key = new Robot();
			key.keyPress(KeyEvent.VK_DOWN);
			key.keyRelease(KeyEvent.VK_DOWN);
			key.keyPress(KeyEvent.VK_DOWN);
			key.keyRelease(KeyEvent.VK_DOWN);
			key.keyPress(KeyEvent.VK_ENTER);
			waitForElementWithLessWait(driver, Insert);
			click(driver, Insert);
			wait(driver, "3");
			key.keyPress(KeyEvent.VK_DOWN);
			key.keyRelease(KeyEvent.VK_DOWN);
			key.keyPress(KeyEvent.VK_DOWN);
			key.keyRelease(KeyEvent.VK_DOWN);
			key.keyPress(KeyEvent.VK_DOWN);
			key.keyRelease(KeyEvent.VK_DOWN);
			key.keyPress(KeyEvent.VK_ENTER);
			click(driver, Insert1);
			wait(driver, "3");
			key.keyPress(KeyEvent.VK_ENTER);

		} catch (Exception e) {

			e.printStackTrace();
		}

		waitForElementWithLessWait(driver, Arrow2);
		click(driver, Arrow2);
		
		waitForElementWithLessWait(driver, Year);
		sendKeys(driver, Year, Yeardata);

		waitForElementWithLessWait(driver, contact);
		click(driver, contact);

		waitForElementWithLessWait(driver, details);
		click(driver, details);

		waitForElementWithLessWait(driver, Save3);
		click(driver, Save3);
		
		waitForElementWithLessWait(driver, NOOfSecurity);
		sendKeys(driver, NOOfSecurity, NoOfSecuritydata);
		
		waitForElementWithLessWait(driver, immovable);
		sendKeys(driver, immovable, immovabledata);
		
		waitForElementWithLessWait(driver, states);
		sendKeys(driver, states, statesdata);
		
		waitForElementWithLessWait(driver, Update);
		click(driver, Update);
		
//		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0,500)", "");
		
		WebElement Initi = driver.findElement(By.xpath("//*[text()='Initial Fee']//following::div[3]"));
		String fee = Initi.getText();
		System.out.println("Initiate fee : "+fee);
		add4(driver, "verified the two dates are equal " ,fee , true,"");
		
		waitForElementWithLessWait(driver, contact);
		click(driver, contact);

		waitForElementWithLessWait(driver, details);
		click(driver, details);
		
		scroll.executeScript("window.scrollBy(0,-250)", "");
		
		waitForElementWithLessWait(driver, Initiate);
		click(driver, Initiate);
		
		refreshPage(driver);
		
		WebElement copyopportunity = driver.findElement(By.xpath("//li[@style='cursor: copy;']"));
		String opportunity1 = copyopportunity.getText();
		System.out.println(opportunity1);
		add4(driver, "Copy ID", opportunity1 , true, "");
		
//BCGRM Logout		
		waitForElementWithLessWait(driver, BCGRM);
		click(driver, BCGRM);
		
		waitForElementWithLessWait(driver, Logout);
		click(driver, Logout);
	
//BCG HEAD Login
		waitForElementWithLessWait(driver, Username);
		sendKeys(driver, Username, login_mail1);
		
		waitForElementWithLessWait(driver, Password);
		sendKeys(driver, Password, login_password1);
		
		waitForElementWithLessWait(driver, Login);
		click(driver, Login);
		
//Initiate ops flow Approval	
		waitForElementWithLessWait(driver, CRM);
		click(driver, CRM);
		
		waitForElementWithLessWait(driver, Opportunity);
		click(driver, Opportunity);
		
		waitForElementWithLessWait(driver, ClearFilter);
		click(driver, ClearFilter);
		
		waitForElementWithLessWait(driver, Id);
		sendKeys(driver, Id, opportunity1);
		
		WebElement text1 =driver.findElement(By.xpath("//*[text()='ID']//following::a[4]"));
		String ID = text1.getText();
		System.out.println(ID);
		
		if (ID.equals(opportunity1)) {
			System.out.println("Equal");
			add4(driver, "verified the two dates are equal " ,ID , true,"");
			
		}else {
			System.out.println("Not Equal");
			add1(driver, "Not verified the two dates are equal " +opportunity1, LogAs.FAILED, true,"");
		}
		
		waitForElementWithLessWait(driver, Select);
		WebElement element = driver.findElement(By.xpath("(//a[@class='ellipsis'])[1]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
//		click(driver, Select);

		WebElement string = driver.findElement(By.xpath("//*[@id='cnp-approval-status']"));
		String approval = string.getText();
		System.out.println(approval);
		add4(driver, "verified Pending for approval " ,approval , true,"");
		
		waitForElementWithLessWait(driver, Action);
		click(driver, Action);
		
		waitForElementWithLessWait(driver, Approve);
		click(driver, Approve);
		
		WebElement str = driver.findElement(By.xpath("//*[@id='cnp-approval-status']"));
		String approved = str.getText();
		System.out.println(approved);
		add4(driver, "verified approved " ,approved , true,"");
		
//BCGHead Logout
		waitForElementWithLessWait(driver, BCGHead);
		click(driver, BCGHead);
		
		waitForElementWithLessWait(driver, Logout);
		click(driver, Logout);
//BCGRM Login	
		waitForElementWithLessWait(driver, Username);
		sendKeys(driver, Username, login_mail);
		
		waitForElementWithLessWait(driver, Password);
		sendKeys(driver, Password, login_password);
		
		waitForElementWithLessWait(driver, Login);
		click(driver, Login);
		
		waitForElementWithLessWait(driver, CRM);
		click(driver, CRM);
		
		waitForElementWithLessWait(driver, Opportunity);
		click(driver, Opportunity);
		
		waitForElementWithLessWait(driver, ClearFilter);
		click(driver, ClearFilter);
		
		waitForElementWithLessWait(driver, Id);
		sendKeys(driver, Id, opportunity1);
		
		waitForElementWithLessWait(driver, Select);
		click(driver, Select);
		
//Create Quotation
		waitForElementWithLessWait(driver, Connection1);
		doubleClick(driver, Connection1);
		
		waitForElementWithLessWait(driver, Quotation);
		click(driver, Quotation);
		
		JavascriptExecutor scroll1 = (JavascriptExecutor) driver;
		scroll1.executeScript("window.scrollBy(0,250)", "");
		
		waitForElementWithLessWait(driver, CostCenter);
		click(driver, CostCenter);
		
		waitForElementWithLessWait(driver, CostCenterList);
		click(driver, CostCenterList);
		
		JavascriptExecutor scroll2 = (JavascriptExecutor) driver;
		scroll2.executeScript("window.scrollBy(0,300)", "");
		
		waitForElementWithLessWait(driver, TypeOfFee);
		doubleClick(driver, TypeOfFee);
		
		waitForElementWithLessWait(driver, InitialFee);
		click(driver, InitialFee);
		
		waitForElementWithLessWait(driver, FeeINR);
		click(driver, FeeINR);
		
		waitForElementWithLessWait(driver, FeeINR);
		sendKeys(driver, FeeINR, "300000");
		
		JavascriptExecutor scroll4 = (JavascriptExecutor) driver;
		scroll4.executeScript("window.scrollBy(0,-550)", "");
		
		waitForElementWithLessWait(driver, address_and_contact);
		click(driver, address_and_contact);
		
		WebElement gst = driver.findElement(By.xpath("//*[text()='Billing Address GSTIN']//following::div[3]"));
		String id = gst.getText();
		System.out.println(id);
		add4(driver, "Company Address GST No " ,id , true,"");
		
		if (id.equals(GSTINdata)) {
			System.out.println("Equal");
			add4(driver, "verified the two dates are equal " ,id , true,"");
			
		}else {
			System.out.println("Not Equal");
			add1(driver, "Not verified the two dates are equal " + GSTINdata, LogAs.FAILED, true,"");
		}
		
		
//		waitForElementWithLessWait(driver, CompanyAddress);
//		click(driver, CompanyAddress);
//		
//		waitForElementWithLessWait(driver, CompanyAddress);
//		clearAndType(driver, CompanyAddress, "AXIS TRUSTEE SERVICES LIMITED-Billing");
//		
//	    click(driver, SelectAdr1);
//	    JavascriptExecutor scroll5 = (JavascriptExecutor) driver;s
//	    scroll5.executeScript("window.scrollBy(0,-550)", "");
		
		waitForElementWithLessWait(driver, Offerletter);
		click(driver, Offerletter);
		
//		waitForElementWithLessWait(driver, Arrow3);
//		click(driver, Arrow3);
		
		waitForElementWithLessWait(driver, LetterFrom);
		click(driver, LetterFrom);
		
		waitForElementWithLessWait(driver, Axis);
		click(driver, Axis);
		
		waitForElementWithLessWait(driver, CORAddr);
		click(driver, CORAddr);
		
		waitForElementWithLessWait(driver, SelectCORAddr);
		click(driver, SelectCORAddr);
		
		waitForElement(driver, Nameofoffice1);
		click(driver,Nameofoffice1);
		
		waitForElement(driver, Nameofofficer1);
		click(driver,Nameofofficer1);
		
		waitForElement(driver, Nameofoffice2);
		click(driver,Nameofoffice2);
		
		waitForElement(driver, Nameofofficer2);
		click(driver,Nameofofficer2);
		
		JavascriptExecutor scroll9 = (JavascriptExecutor) driver;
		scroll9.executeScript("window.scrollBy(0,-550)", "");
		
		waitForElementWithLessWait(driver, Save4);
		click(driver, Save4);
		
		waitForElementWithLessWait(driver, Action2);
		click(driver, Action2);
		
		waitForElementWithLessWait(driver, Submit);
		click(driver, Submit);
//		click(driver, JVError);
//		click(driver, Menu);
//		click(driver, Reload);
		
		waitForElementWithLessWait(driver, Detail);
		click(driver, Detail);
		
		waitForElementWithLessWait(driver, Attachment);
		click(driver, Attachment);
		
		Upload_File1(driver, System.getProperty("user.dir") + "\\uploads\\SAL-QTN-2023-00236-signed.pdf");
		
		waitForElementWithLessWait(driver, Date);
		click(driver, Date);
		
		waitForElementWithLessWait(driver, Today);
		click(driver, Today);
		
		waitForElementWithLessWait(driver, OfferLetter);
		click(driver, OfferLetter);
		
		waitForElementWithLessWait(driver, Action1);
		click(driver, Action1);
		
		waitForElementWithLessWait(driver, ABC);
		click(driver, ABC);
		
		WebElement copyquotation = driver.findElement(By.xpath("//li[@style='cursor: copy;']"));
		String quotation1 = copyquotation.getText();
		System.out.println(quotation1);
		add4(driver, "Copy ID", quotation1 , true, "");
		
//Copy Customer to create sales invoice
		waitForElementWithLessWait(driver, Customer2);
		doubleClick(driver, Customer2);
		
		WebElement copycustomer = driver.findElement(By.xpath("//a[@data-doctype='Customer']"));
		String customer1 = copycustomer.getText();
		System.out.println(customer1);
		add4(driver, "Copy ID", customer1 , true, "");
//Logout BCGRM 	
		
		waitForElementWithLessWait(driver, BCGRM);
		click(driver, BCGRM);
		
		waitForElementWithLessWait(driver, Logout);
		click(driver, Logout);
		
//Login AM
		waitForElementWithLessWait(driver, Username);
		sendKeys(driver, Username, login_mail2);
		
		waitForElementWithLessWait(driver, Password);
		sendKeys(driver, Password, login_password2);
		
		waitForElementWithLessWait(driver, Login);
		click(driver, Login);
//Accounting Module	
		waitForElementWithLessWait(driver, Accountmakerdashboard);
		click(driver, Accountmakerdashboard);
		waitForElementWithLessWait(driver, viewlist);
		click(driver, viewlist);
		
		waitForElementWithLessWait(driver, ClearFilter);
		click(driver, ClearFilter);
		
		waitForElementWithLessWait(driver, Id);
		sendKeys(driver, Id, quotation1);
		
		waitForElementWithLessWait(driver, Select);
		click(driver, Select);
		
//		
//		
//		waitForElementWithLessWait(driver, Accounting);
//		click(driver, Accounting);
//		
//		waitForElementWithLessWait(driver, SalesInvoice);
//		click(driver, SalesInvoice);
////Create Sales invoice		
//		waitForElementWithLessWait(driver, ClearFilter);
//		click(driver, ClearFilter);
//		
//		waitForElementWithLessWait(driver, AddSalesInvoice);
//		click(driver, AddSalesInvoice);
//		
//		waitForElementWithLessWait(driver, PasteCustomer);
//		sendKeys(driver, PasteCustomer, customer1);
//		
//		waitForElementWithLessWait(driver, SelectCustomer);
//		click(driver, SelectCustomer);
//		
//		waitForElementWithLessWait(driver, Quotation1);
//		doubleClick(driver, Quotation1);
//		
//		waitForElementWithLessWait(driver, SelectQuotation);
//		click(driver, SelectQuotation);
////		click(driver, JVError);
//		
//		waitForElementWithLessWait(driver, Incomeaccount);
//		doubleClick(driver, Incomeaccount);
//		
//		waitForElementWithLessWait(driver, selectaccount);
//		click(driver, selectaccount);
////		waitForElementWithLessWait(driver, moreinfo);
////		click(driver,moreinfo);
////		
////		waitForElementWithLessWait(driver, debitto);
////		click(driver, debitto);
////		
////		waitForElementWithLessWait(driver, selectdebitto);
////		click(driver, selectdebitto);
		
		waitForElementWithLessWait(driver, Connections);
		click(driver, Connections);
		
//		waitForElementWithLessWait(driver, detail);
//		click(driver, detail);
		waitForElementWithLessWait(driver, createsales);
		click(driver, createsales);
		
		waitForElementWithLessWait(driver, Save6);
		click(driver, Save6);
		
		waitForElementWithLessWait(driver, ction);
		click(driver, ction);
		
		waitForElementWithLessWait(driver, SFA3);
		click(driver, SFA3);
		
		waitForElementWithLessWait(driver, JVError);
		click(driver, JVError);
		
//		waitForElementWithLessWait(driver, Menu);
//		click(driver, Menu);
//		
//		waitForElementWithLessWait(driver, Reload);
//		click(driver, Reload);
//Copy Sales invoice id		
		
		WebElement copySalesInvoice1 = driver.findElement(By.xpath("//li[@style='cursor: copy;']"));
		String SalesInvoice1 = copySalesInvoice1.getText();
		System.out.println("ID "  + SalesInvoice1);
		add4(driver, "Copy ID", SalesInvoice1 , true, "");
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
		
//Sales invoice Approval
		waitForElementWithLessWait(driver, Accounting);
		click(driver, Accounting);
		
		waitForElementWithLessWait(driver, SalesInvoice);
		click(driver, SalesInvoice);
		
		waitForElementWithLessWait(driver, ClearFilter);
		click(driver, ClearFilter);
		
		waitForElementWithLessWait(driver, Id);
		sendKeys(driver, Id, SalesInvoice1);
		
		waitForElementWithLessWait(driver, Select);
		click(driver, Select);
		
		waitForElementWithLessWait(driver, Action3);
		click(driver, Action3);
		
		waitForElementWithLessWait(driver, Approve1);
		click(driver, Approve1);
		
		waitForElementWithLessWait(driver, ConfirmAppr);
		click(driver, ConfirmAppr);
			
		refreshPage(driver);
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
		
		waitForElementWithLessWait(driver, SalesInvoice);
		click(driver, SalesInvoice);
		
		waitForElementWithLessWait(driver, ClearFilter);
		click(driver, ClearFilter);
		
		waitForElementWithLessWait(driver, Id);
		sendKeys(driver, Id, SalesInvoice1);
		
		waitForElementWithLessWait(driver, Select);
		click(driver, Select);
		
		waitForElementWithLessWait(driver, Connection2);
		click(driver, Connection2);
		
		waitForElementWithLessWait(driver, PaymentEntry);
		click(driver, PaymentEntry);
		
		
		waitForElementWithLessWait(driver, MOP);
		click(driver, MOP);
		
//		waitForElementWithLessWait(driver, Account);
//		clearAndType(driver, Account, "09200000012908 - canopi - ATSL");
		
		waitForElementWithLessWait(driver, SelMOP);
		click(driver, SelMOP);
		
		waitForElementWithLessWait(driver, reference_no);
		sendKeys(driver, reference_no, "45678");
		
		waitForElementWithLessWait(driver, GSTDetails);
		click(driver, GSTDetails);
				
		waitForElementWithLessWait(driver, companyaddress);
		click(driver, companyaddress);
		
		waitForElementWithLessWait(driver, Selectaddress);
		click(driver, Selectaddress);
		
		waitForElementWithLessWait(driver, customeraddress);
		click(driver, customeraddress);
		
		waitForElementWithLessWait(driver, Selectaddress2);
		click(driver, Selectaddress2);
		JavascriptExecutor scroll6 = (JavascriptExecutor) driver;
		scroll6.executeScript("window.scrollBy(0,-350)", "");
		
		//input[@data-fieldname='company_address']
		waitForElementWithLessWait(driver, Save7);
		click(driver, Save7);
		
		waitForElementWithLessWait(driver, Action4);
		click(driver, Action4);
		
		waitForElementWithLessWait(driver, SFA2);
		click(driver, SFA2);
		
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
	
		/*
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
		
		waitForElementWithLessWait(driver, JVError);
		click(driver, JVError);
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
		
//Create Credit Note
		waitForElementWithLessWait(driver, Accounting);
		click(driver, Accounting);
		
		waitForElementWithLessWait(driver, SalesInvoice);
		click(driver, SalesInvoice);
		
		waitForElementWithLessWait(driver, ClearFilter);
		click(driver, ClearFilter);
		
		waitForElementWithLessWait(driver, Id);
		sendKeys(driver, Id, SalesInvoice1);
		
		waitForElementWithLessWait(driver, Select);
		click(driver, Select);
		
		waitForElementWithLessWait(driver, Create);
		click(driver, Create);
		
		waitForElementWithLessWait(driver, CreditNote);
		click(driver, CreditNote);
		
		waitForElementWithLessWait(driver, Edit_1);
		click(driver, Edit_1);
		
		waitForElementWithLessWait(driver, RevStart);
		click(driver, RevStart);
		
		waitForElementWithLessWait(driver, RevStart_date);
		click(driver, RevStart_date);
		
		waitForElementWithLessWait(driver, RevEnd);
		click(driver, RevEnd);
		
		waitForElementWithLessWait(driver, RevEnd_date);
		click(driver, RevEnd_date);
		
		waitForElementWithLessWait(driver, Arrow4);
		click(driver, Arrow4);
			
		waitForElementWithLessWait(driver, Save8);
		click(driver, Save8);
		
		waitForElementWithLessWait(driver, Action3);
		click(driver, Action3);
		
		waitForElementWithLessWait(driver, SFA2);
		click(driver, SFA2);
		
		waitForElementWithLessWait(driver, JVError);
		click(driver, JVError);
//Copy Credit note sales invoice
		WebElement copySalesInvoice2 = driver.findElement(By.xpath("//li[@style='cursor: copy;']"));
		String SalesInvoice2 = copySalesInvoice2.getText();
		System.out.println("Sales invoice : " + SalesInvoice2);
		add4(driver, "Sales invoice", SalesInvoice2 , true, "");
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
		
//Credit Note Approval
		waitForElementWithLessWait(driver, Accounting);
		click(driver, Accounting);
		
		waitForElementWithLessWait(driver, SalesInvoice);
		click(driver, SalesInvoice);
		
		waitForElementWithLessWait(driver, ClearFilter);
		click(driver, ClearFilter);
		
		waitForElementWithLessWait(driver, Id);
		sendKeys(driver, Id, SalesInvoice2);
		
		waitForElementWithLessWait(driver, Select);
		click(driver, Select);
		
		waitForElementWithLessWait(driver, Action3);
		click(driver, Action3);
		
		waitForElementWithLessWait(driver, Approve1);
		click(driver, Approve1);
		
		waitForElementWithLessWait(driver, ConfirmAppr);
		click(driver, ConfirmAppr);
		
		refreshPage(driver);
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
		
//Create Debt Note
		waitForElementWithLessWait(driver, Accounting);
		click(driver, Accounting);
		
		waitForElementWithLessWait(driver, SalesInvoice);
		click(driver, SalesInvoice);
		
		waitForElementWithLessWait(driver, AddSalesInvoice);
		click(driver, AddSalesInvoice);
		
		waitForElementWithLessWait(driver, Series);
		click(driver, Series);
		
		waitForElementWithLessWait(driver, DebtSeries);
		click(driver, DebtSeries);
		
		waitForElementWithLessWait(driver, PasteCustomer);
		sendKeys(driver, PasteCustomer, customer1);
		click(driver, SelectCustomer);
		
		waitForElementWithLessWait(driver, Debit_Note_Details);
		click(driver, Debit_Note_Details);
		
		waitForElementWithLessWait(driver, PasteCustomer);
		sendKeys(driver, Kind_attention, "Testing");
		
		JavascriptExecutor scroll7 = (JavascriptExecutor) driver;
		scroll7.executeScript("window.scrollBy(0,550)", "");
		
		waitForElementWithLessWait(driver, Edit_1);
		click(driver, Edit_1);
		
		waitForElementWithLessWait(driver, debtItemcode);
		click(driver, debtItemcode);
		
		waitForElementWithLessWait(driver, SelectItemcode);
		click(driver, SelectItemcode);
		
		waitForElementWithLessWait(driver, RevStart);
		click(driver, RevStart);
		
		waitForElementWithLessWait(driver, RevStart_date);
		click(driver, RevStart_date);
		
		waitForElementWithLessWait(driver, RevEnd);
		click(driver, RevEnd);
		
		waitForElementWithLessWait(driver, RevEnd_date);
		click(driver, RevEnd_date);
		
		waitForElementWithLessWait(driver, Arrow4);
		click(driver, Arrow4);
		
		waitForElementWithLessWait(driver, connection);
		click(driver, connection);
		
		waitForElementWithLessWait(driver, detail);
		click(driver, detail);
//		sendKeys(driver, Rate, "50000");
		waitForElementWithLessWait(driver, costcenter);
		click(driver,costcenter);
		
		waitForElementWithLessWait(driver, selectcostcenter);
		click(driver,selectcostcenter);
		
		waitForElementWithLessWait(driver, connection);
		click(driver, connection);
		
		waitForElementWithLessWait(driver, detail);
		click(driver, detail);
		
		waitForElementWithLessWait(driver, Save8);
		click(driver, Save8);
		
		waitForElementWithLessWait(driver, Action3);
		click(driver, Action3);
		
		waitForElementWithLessWait(driver, SFA2);
		click(driver, SFA2);
		
		waitForElementWithLessWait(driver, JVError);
		click(driver, JVError);
//Copy Debt note sales invoice
		WebElement copydebtnote = driver.findElement(By.xpath("//li[@style='cursor: copy;']"));
		String debtnote = copydebtnote.getText();
		System.out.println("Debtnote ID : " + debtnote);
		add4(driver, "Debtnote ID", debtnote , true, "");
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
		
//Debt Note Approval
		
		waitForElementWithLessWait(driver, Accounting);
		click(driver, Accounting);
		
		waitForElementWithLessWait(driver, SalesInvoice);
		click(driver, SalesInvoice);
		
		waitForElementWithLessWait(driver, ClearFilter);
		click(driver, ClearFilter);
		
		waitForElementWithLessWait(driver, Id);
		sendKeys(driver, Id, debtnote);
		
		waitForElementWithLessWait(driver, Select);
		click(driver, Select);
		
		waitForElementWithLessWait(driver, Action3);
		click(driver, Action3);
		
		waitForElementWithLessWait(driver, Approve1);
		click(driver, Approve1);
		
		waitForElementWithLessWait(driver, ConfirmAppr);
		click(driver, ConfirmAppr);
		refreshPage(driver);
//Logout AC		
		waitForElementWithLessWait(driver, AC_sta);
		click(driver, AC_sta);
		
		waitForElementWithLessWait(driver, Logout1);
		click(driver, Logout1);
*/
	}
}