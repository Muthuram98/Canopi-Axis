package commonMethods;

public interface Axis_Locators {
//LOGIN	
	    public static String Username="Username >//input[@id='login_email']";
	    public static String Password="Password >//input[@id='login_password']";
	    public static String Login="Login >//button[@type='submit']";
//CRM Module	    
	    public static String CRM="CRM >//span[text()='CRM']";
	    public static String Lead="Lead >(//span[text()='Lead'])[1]";
//Create Lead	    
	    public static String AddLead="AddLead >(//button[@class='btn btn-primary btn-sm primary-action'])";
	    public static String LeadType="LeadType >(//select[@type='text'])[2]";
	    public static String ORG="ORG >//option[@value='Organization']";
	    public static String RefNum ="RefNum >(//input[@class='input-with-feedback form-control bold'])[1]";
	    public static String InvalidCin="InvalidCin >//button[@class='btn btn-modal-close btn-link']";
	    public static String ORGName="ORGName >(//input[@class='input-with-feedback form-control bold'])[2]";
	    public static String Save="Save >(//button[@class='btn btn-primary btn-sm primary-action'])[2]";
	    public static String ClickArrow="ClickArrow >(//span[@class='ml-2 collapse-indicator mb-1'])[3]";
	    public static String AddAddress="AddAddress > //button[@class='btn btn-xs btn-default btn-address']";
	    public static String GSTIN="GSTIN >//input[@data-fieldname='_gstin']";
	    public static String AddressTitle="AddressTitle >//input[@data-fieldname='address_title']";
	    public static String Pincode="Pincode >//input[@data-fieldname='address_line1']/preceding::input[@data-fieldname='_pincode']";
	    public static String Addressline="Addressline >//input[@data-fieldname='address_line1']";
	    public static String City="City >(//input[@data-fieldname='city'])[2]";
	    public static String State="State >(//input[@data-fieldname='state'])[2]";
	    public static String TamilNadu="TamilNadu >//strong[text()='Tamil Nadu']";
	    public static String Save5="Save5 >//button[@class='btn btn-primary btn-sm btn-modal-primary']";
        public static String Connection="Connection >//a[@aria-controls='Connections']";
	    public static String Plus="Plus >//button[@data-doctype='Opportunity']";
//Create Opportunity	    
	    public static String Source="Source >(//input[@data-fieldname='source'])[2]";
	    public static String Chl="Chl >//p[@title='Channel Partner']";
	    public static String Product="Product >(//input[@data-fieldname='cnp_product'])[2]";
	    public static String DTE="DTE >//p[@title='DTE']";
	    public static String FacilityAmt="FacilityAmt >(//textarea[@type='text'])[2]";
	    public static String Currency="Currency >//input[@data-fieldname='custom_currency']";
	    public static String SelCurrency="SelCurrency >//p[@title='INR']";
	    public static String FacilityIssue="FacilityIssue >//input[@data-fieldname='cnp_issue_size']";
	    public static String AddRow="AddRow >(//button[@class='btn btn-xs btn-secondary grid-add-row'])[3]";
	    public static String Typesofsecurity="Typesofsecurity >//input[@class='input-with-feedback form-control input-sm']";
	    public static String Edit="Edit >(//*[@type='text']//following::div[text()='Edit'])[2]";
	    public static String Edit1="Edit1 >(//*[@type='text']//following::div[text()='Edit'])[2]";
	    public static String Insert="Insert >//button[@class='btn btn-secondary btn-sm pull-right grid-append-row']";
	    public static String Insert1="Insert1 >(//button[@class='btn btn-secondary btn-sm pull-right grid-append-row'])[2]";
	    public static String First="First >(//p[@title='Assignment of Rights'])[1]";
	    public static String Second="Second >(//p[@title='Current Asset'])[2]";
	    public static String Arrow="Arrow >//button[@class='btn btn-secondary btn-sm pull-right grid-collapse-row']";
	    public static String Arrow1="Arrow1 >(//button[@class='btn btn-secondary btn-sm pull-right grid-collapse-row'])[2]";
	    public static String Arrow2="Arrow2 >(//button[@class='btn btn-secondary btn-sm pull-right grid-collapse-row'])[3]";
	    public static String Year="Year >//input[@data-fieldname='cnp_tenor_years']";
	    public static String contact="contact >//*[@id='opportunity-contact_info-tab']";
	    public static String details="details >//*[@id='opportunity-__details-tab']";
	    public static String Save3="save3 >(//button[@data-label='Save'])[3]";
	    public static String NOI="NOI >(//select[@data-fieldtype='Select'])[12]";
	    public static String NC="NC >//option[@value='Non Convertible']";
	    public static String NOOfSecurity="NOOfSecurity >//input[@data-fieldname='no_of_securities']";
	    public static String immovable="immovable >//input[@data-fieldname='immovable_properties']";
	    public static String states="states >//input[@data-fieldname='states_immovable_properties']";
	    public static String Update="Update >(//button[@class='btn btn-primary btn-sm btn-modal-primary'])[2]";
	    public static String Initiate="Initiate >//button[@data-label='Initiate%20Ops%20Flow']";
	    public static String SelList="SelList >//select[@data-fieldname='cnp_listed_unlisted']";
	    public static String Listed="Listed >//option[@value='Listed']";
	    
	    //BCGRM Logout	   	    
	    public static String BCGRM="BCGRM >//span[@class='avatar avatar-medium']";
	    public static String Logout="Logout >//a[@onclick='return frappe.app.logout()']"; 
//BCGHead Approval	    
	  	public static String Dashboard="Dashboard >(//span[@class='sidebar-item-label'])[1]";
	  	public static String PFA="PFA >(//div[@class='status indicator-pill gray ellipsis'])[1]";
	  	public static String Opportunity="Opportunity >//span[@title='Opportunity']";
	  	public static String ClearFilter="ClearFilter >//button[@class='btn btn-default btn-sm filter-x-button']";
	  	public static String Id="Id > (//input[@class='input-with-feedback form-control input-xs'])[2]";
	  	public static String Select="Select > (//a[@class='ellipsis'])[1]";
	  	public static String Action="Action >(//button[@data-toggle='dropdown'])[10]";
		public static String Approve="Approve >(//span[@data-label='Approve'])[2]";
		public static String Reject="Reject >(//span[@data-label='Reject'])[1]";
//BCGHead Logout	    
	    public static String BCGHead="BCGHead >//span[@class='avatar avatar-medium']";
	    public static String Logout1="Logout1 >//a[@onclick='return frappe.app.logout()']";
//Quotation	    
	    public static String Connection1="Connection1 >(//span[@class='ml-2 collapse-indicator mb-1'])[4]";
	    public static String Quotation="Quotation >//button[@data-doctype='Quotation']";
	    public static String Error="Error >//button[@data-dismiss='modal']";
	    public static String CostCenter="CostCenter >(//*[contains(text(),'Cost Center')]/following::input)[1]";
	    public static String CostCenterList="CostCenterList >//p[@title='Axis bank - ATSL']";
	    public static String TypeOfFee="TypeOfFee >(//div[@data-fieldname='cnp_type_of_fee'])[2]";
	    public static String InitialFee="InitialFee >//option[@value='Initial Fee']";
	    public static String AnnualFee="AnnualFee >//option[@value='Annual Fee']";
	    public static String OneTimeFee="OneTimeFee >//option[@value='One Time Fee']";
	    public static String FeeINR="FeeINR > //input[@placeholder='Fees (INR)']";
	    public static String address_and_contact="address_and_contact >//a[@id='quotation-address_and_contact_tab-tab']";
	    public static String CORAddr="CORAddr > //input[@data-fieldname='cnp_corporate_address']";
	    public static String SelectCORAddr="SelectCORAddr >//p[@title='Delhi-Corporate Office']";
	    public static String CompanyAddress="CompanyAddress >//input[@data-fieldname='company_address']";
	    public static String SelectAdr="SelectAdr >//p[@title='Gift City-Billing']";
	    public static String SelectAdr1="SelectAdr1 >//p[@title='Delhi-Corporate Office']";
        public static String Offerletter="Offerletter >//a[@aria-controls='Offer and Proforma Invoice']";
	    public static String Arrow3="Arrow3 >//div[contains(text(),'Proforma Invoice Details')]//preceding::div[contains(text(),'Offer Letter') and @class='section-head collapsed']";
	    public static String LetterFrom="LetterFrom >//*[@type='text' and @data-fieldname='cnp_letter_from']";
	    public static String Axis="Axis >(//*[text()='AXIS' and @value='AXIS'])[1]";
	    public static String QuoDetail="QuoDetail >//*[@id='quotation-__details-tab']";
	    public static String Save4="Save4 >//button[@data-label='Save']";
	    public static String Submit="Submit >//span[@data-label='Submit']";
	    public static String Detail="Detail >//a[@id='quotation-__details-tab']";
	    public static String Attachment="Attachment >//*[text()='Attach Accepted Offer Letter']";
	    public static String Date="Date >//input[@data-fieldname='cnp_offer_acceptence_date']";
	    public static String Today="Today >(//span[@data-action='today'])[5]";
	    public static String OfferLetter="Offerletter >//*[text()='Upload Accepted Offer Letter']";
	    public static String Action2="Action2 >(//button[@class='btn btn-primary btn-sm'])[4]";
	    public static String Action6="Action6 >(//button[@class='btn btn-primary btn-sm'])";
	    public static String Action1="Action1 >(//button[@data-toggle='dropdown'])[13]";
	    public static String ABC="ABC >//span[@data-label='Accepted%20By%20Client']";
	    public static String Customer2="Customer2 >//a[@data-doctype='Customer']";
	    public static String Nameofoffice1="Nameofoffice1 >//*[contains(text(),'Name of Officer 1')]/following::input";
	    public static String Nameofofficer1="Nameofoffice1 >//*[contains(text(),'Divya')]";
	    public static String Nameofoffice2="Nameofoffice2 >//*[contains(text(),'Name of Officer 2')]/following::input";
	    public static String Nameofofficer2="Nameofofficer2 >(//*[contains(text(),'Test 1')])[2]";
	    public static String Accountmakerdashboard="Accountmaker >//span[contains(text(),'Accounts Maker Dashboard')]";
	    public static String viewlist="viewlist >(//*[text()='View List'])[1]";
   
	  
	    
	  
//Error Message	    
	    public static String JVError="JVError >//button[@data-dismiss='modal']";
//Refresh	    
	    public static String Menu="Menu >(//span[@class='menu-btn-group-label'])[3]";
	    public static String Reload="Reload >(//span[@data-label='Reload'])";
//Account Maker
	    public static String AM="AM >//span[@title='Accounts Maker']";
	    public static String AM_sta="AM_sta >//span[@title='account maker']";
//Sales Invoice	    
	    public static String Accounting="Accounting > //a[@title='Accounting']";
	    public static String SalesInvoice="SalesInvoice >//div[@shortcut_name='Sales Invoice']";
	    public static String AddSalesInvoice="AddSalesInvoice >//span[@data-label='Add%20Sales%20Invoice']";
	    public static String PasteCustomer="PasteCustomer >(//input[@data-fieldname='customer'])[2]";
	    public static String Quotation1="Quotation1 >//input[@data-target='Quotation']";
	    public static String SelectQuotation="SelectQuotation >(//li[@aria-selected='true'])[2]";
	    public static String Incomeaccount="incomeaccount >(//*[@data-fieldname='income_account'])[2]";
	    public static String selectaccount="incomeaccount >//*[@title='5000001050 - Other Allowances - ATSL']";
	    public static String Save6="Save6 >//button[@data-label='Save']";
	    public static String SelectCustomer="SelectCustomer >(//li[@aria-selected='true'])[1]";
	    public static String SFA2="SFA2 >(//span[@data-label='Send%20For%20Approval'])[2]";
	    public static String SFA="SFA >//span[@data-label='Send%20For%20Approval']";
	    public static String createsales="createsales >//button[@class='btn btn-new btn-secondary btn-xs icon-btn']";
	    public static String ction="createsales >(//span[text()='ctions'])[4]";
	    public static String SFA3="SFA3 >//*[text()='nd For Approval']";

	  
//Account Checker
	    public static String AC_sta="AC_sta >(//span[@title='account checker'])[1]";
	    public static String Action3="Action3 >(//span[@data-label='Actions'])[3]";
	    public static String Approve1="Approve1 >//span[@data-label='Approve']";
	    public static String ConfirmAppr="ConfirmAppr >//button[@class='btn btn-primary btn-sm btn-modal-primary']";
//Create Payment Entry	    
	    public static String Connection2="Connection2 >//a[@aria-controls='Connections']";
	    public static String PaymentEntry="PaymentEntry >//button[@data-doctype='Payment Entry']";
	    public static String MOP="MOP >//input[@data-fieldname='mode_of_payment']";
	    public static String SelMOP="SelMOP > //p[@title='Cash']";
	    public static String companyaddress="companyaddress >//input[@data-fieldname='company_address']";
	    public static String Selectaddress="Selectaddress >//input[@data-fieldname='company_address']/following::strong";
	    public static String customeraddress="customeraddress >//input[@data-fieldname='customer_address']";
	    public static String Selectaddress2="Selectaddress >//input[@data-fieldname='customer_address']/following::strong";

	    public static String GSTDetails="GSTDetails >(//*[contains(text(),'GST Details')])[2]";
   
	    
//Create CreditNote	    
	    public static String Create="Create >//button[@class='btn ellipsis btn-primary']";
	    public static String CreditNote="CreditNote >//a[@data-label='Return%20%2F%20Credit%20Note']";
	    public static String Account="Account >(//input[@data-target='Account'])[6]";
	    public static String AccountList="AccountList >//p[@title='Axis Trustee - ATSL']";
	    public static String AccountList_sta="AccountList_sta >//*[@title='09200000012908 - canopi - ATSL']";
	    public static String reference_no="reference_no >//input[@data-fieldname='reference_no']";
	    public static String Edit2="Edit2 >(//*[@type='text']//following::div[text()='Edit'])[2]";
	    public static String RevStart="RevStart >//input[@data-fieldname='cnp_reversal_start_date']";
	    public static String RevEnd="RevEnd >//input[@data-fieldname='cnp_reversal_end_date']";
	    public static String Edit_1="Edit_1 >//*[text()='Products']//following::div[text()='Edit'][1]";
	    public static String RevStart_date="RevStart_date >//*[@id='datepickers-container']/div[8]/div[2]/span";
	    public static String RevEnd_date="RevEnd_date >//*[@id='datepickers-container']/div[9]/div[1]/div/div[2]/div[33]";
	    public static String Arrow4="Arrow4 >(//button[@class='btn btn-secondary btn-sm pull-right grid-collapse-row'])[1]";
	    public static String Save7="Save7 >//span[text()='Not Saved']//following::button[@data-label='Save']";
	    public static String Action4="Action4 >(//span[@data-label='Actions'])[4]";
	    public static String PaymentEntry1="PaymentEntry1 >//div[@shortcut_name='Payment Entry']";
	    public static String Id1="Id1 >(//input[@class='input-with-feedback form-control input-xs'])[7]";
	    public static String ClearFilter1="ClearFilter1 >(//button[@class='btn btn-default btn-sm filter-x-button'])[2]";
	    public static String Select1="Select1 >(//a[@class='ellipsis'])[2]";
	    public static String Action5="Action5 >(//span[@data-label='Actions'])[5]";
	    public static String Save8="Save8 >(//button[@data-label='Save'])[1]";
	    public static String AC="AC >(//span[@title='Accounts Checker'])[4]";
	    public static String Connections="Connections >//*[@id='quotation-connections_tab-tab']"; 
	  
//Create DebtNote
	    public static String Series="Series >(//select[@data-fieldtype='Select'])[2]";
	    public static String DebtSeries="DebtSeries >//option[@value='AT-CO-.YY.-DN-.']";
	    public static String debtItemcode="debtItemcode >//input[@data-fieldname='item_code']";
	    public static String Debit_Note_Details="Debit_Note_Details >(//*[@class='ml-2 collapse-indicator mb-1'])[1]";
	    public static String Kind_attention="Kind_attention >//*[text()='Kind Attention to']//following::input[1]";
	    public static String costcenter="costcenter >(//input[@data-fieldname='cost_center'])[1]";
	    public static String selectcostcenter="selectcostcenter >//*[contains(text(),'Delhi - ATSL')]";
	    public static String SelectItemcode="SelectItemcode >//p[@title='DCHG']";
	    public static String detail="detail >//*[@id='sales-invoice-__details-tab']";
	    public static String connection="connection >//*[@id='sales-invoice-connections_tab-tab']";
	    public static String Rate="Rate >//input[@data-fieldname='rate']";
//Purchase invoice
	    public static String PurInvoice="SalesInvoice >//div[@shortcut_name='Purchase Invoice']";
	    public static String AddPurInvoice="AddSalesInvoice >//span[@data-label='Add%20Purchase%20Invoice']";
	    public static String Supplier="Supplier >(//input[@data-target='Supplier'])[2]";
	    public static String SelectSupplier="SelectSupplier >//p[@title='64-Supermart Private Ltimited']";
	    public static String PurItemcode="PurItemcode >(//div[@data-fieldname='item_code'])[2]";
	    public static String PurCostCenter="PurCostCenter>(//input[@class='input-with-feedback form-control bold'])[3]";
	    public static String PaidFrom="PaidFrom > //input[@data-fieldname='paid_from']";
	    public static String SelPaidFrom="SelPaidFrom > //p[@title='09200000012908 - canopi - ATSL']";
//	    public static String Amount="Amount > (//input[@data-fieldname='amount'])[1]";
//	    public static String Amount="Amount > (//input[@data-fieldname='amount'])[1]";
//	    public static String Amount="Amount > (//input[@data-fieldname='amount'])[1]";
//	    public static String Amount="Amount > (//input[@data-fieldname='amount'])[1]";
//	    public static String Amount="Amount > (//input[@data-fieldname='amount'])[1]";
//	    public static String Amount="Amount > (//input[@data-fieldname='amount'])[1]";
//Investment Module	    
	    public static String Investments="Investments >//a[@title='Investments']";
	    public static String FDO="FDO >//a[@title='Fixed Deposit Opening Entry']";
	    public static String AddFDO="AddFDO >//span[@data-label='Add%20Canopi%20Fixed%20Deposit%20Opening%20Entry']";
	    public static String ACNO="ACNO >//input[@data-fieldname='account_no']";
	    public static String SelectAC="SelectAC >//p[@title='ATSL Demo Account - Axis Bank']";
	    public static String EOD="EOD >//input[@data-fieldname='entered_on_date']";
	    public static String deposit_amount="deposit_amount >//input[@data-fieldname='deposit_amount']";
	    public static String interest_rate="interest_rate >//input[@data-fieldname='interest_rate']";
	    public static String effective_date="effective_date >//input[@data-fieldname='effective_date']";
	    public static String tenor_month="tenor_month >//input[@data-fieldname='tenor_month']";
	    public static String tenor_days="tenor_days >//input[@data-fieldname='tenor_days']";
	    public static String BAC="BAC >//input[@data-fieldname='amount_from_bank_account']";
	    public static String AR="AR >//button[@class='btn btn-xs btn-secondary grid-add-row']";
	    public static String ACNO1="ACNO1 >(//div[@data-fieldname='account_number'])[2]";
	    public static String ACNO2="ACNO2 >(//div[@data-fieldname='account_number'])[4]";
	    public static String SelectACNO1="SelectACNO1 >(//p[@title='ATSL Demo Account - Axis Bank'])[2]";
	    public static String SelectACNO2="SelectACNO2 >(//p[@title='ATSL Demo Account - Axis Bank'])[3]";
	    public static String Action9="Action9 >(//button[@class='btn btn-default ellipsis'])[2]";
	    public static String SFA1="SFA1 >//a[@data-label='Send%20For%20Approval']";
	    public static String EODToday="EODToday >(//span[text()='Today'])[1]";
	    public static String effective_dateToday="effective_dateToday >(//div[@class='datepicker--buttons'])[2]";
	    public static String Approve2="Approve2 >//a[@data-label='Approve']";
	    public static String JV="JV >(//button[@data-doctype='Journal Entry'])[1]";
	    public static String CFDM="CFDM >(//button[@data-doctype='Canopi Fixed Deposit Maturity'])[1]";
	    public static String account1="account1 >(//div[@data-fieldname='account'])[2]";
	    public static String account2="account2 >(//div[@data-fieldname='account'])[4]";
	    public static String debit2="debit2 >(//div[@data-fieldname='debit_in_account_currency'])[4]";
	    public static String credit1="credit1 >(//div[@data-fieldname='credit_in_account_currency'])[2]";
	    public static String Action10="Action10 >//button[@class='btn btn-default ellipsis']";
	    public static String Selectaccount1="Selectaccount1 >//p[@title='2020001001 - Cash - ATSL']";
	    public static String Selectaccount2="Selectaccount2 >(//p[@title='2020001001 - Cash - ATSL'])[2]";
	    public static String FCE="FCE >//button[@data-doctype='Canopi Fund Closure Entry']";
	    public static String AddRow1="AddRow1 >(//button[@class='btn btn-xs btn-secondary grid-add-row'])[2]";
	    public static String Amount="Amount > (//input[@data-fieldname='amount'])[1]";
	    public static String Amount1="Amount1 > (//input[@data-fieldname='amount'])[2]";
	    public static String SelectDC="SelectDC > (//Select[@data-fieldname='dc'])[2]";
	    public static String SelectCredit="SelectCredit > (//option[@value='Credit'])[2]";
	    public static String Action11="Action11 > (//button[@class='btn btn-default ellipsis'])[3]";
	    public static String FCE1="FCE1 > //a[@title='Fund Closure Entry']";
	    public static String ICU="ICU > //button[@data-label='Interest%20Certificate%20Upload']";
	    public static String investmentsheader="investmentsheader > //a[@href='/app/investments']";
//	    public static String Amount="Amount > (//input[@data-fieldname='amount'])[1]";
//	    public static String Amount="Amount > (//input[@data-fieldname='amount'])[1]";
//	    public static String Amount="Amount > (//input[@data-fieldname='amount'])[1]";
//	    public static String Amount="Amount > (//input[@data-fieldname='amount'])[1]";
//	    public static String Amount="Amount > (//input[@data-fieldname='amount'])[1]";
//	    public static String Amount="Amount > (//input[@data-fieldname='amount'])[1]";
//	    public static String Amount="Amount > (//input[@data-fieldname='amount'])[1]";
//	    public static String Amount="Amount > (//input[@data-fieldname='amount'])[1]";
//	    public static String Amount="Amount > (//input[@data-fieldname='amount'])[1]";
//	    public static String Amount="Amount > (//input[@data-fieldname='amount'])[1]";
//	    public static String Amount="Amount > (//input[@data-fieldname='amount'])[1]";
//	    public static String Amount="Amount > (//input[@data-fieldname='amount'])[1]";
//	    public static String Amount="Amount > (//input[@data-fieldname='amount'])[1]";
//	    public static String Amount="Amount > (//input[@data-fieldname='amount'])[1]";
//	    public static String Amount="Amount > (//input[@data-fieldname='amount'])[1]";
//	    public static String Amount="Amount > (//input[@data-fieldname='amount'])[1]";
//	    public static String Amount="Amount > (//input[@data-fieldname='amount'])[1]";
//	    public static String Amount="Amount > (//input[@data-fieldname='amount'])[1]";
//	    public static String Amount="Amount > (//input[@data-fieldname='amount'])[1]";
//	    public static String Amount="Amount > (//input[@data-fieldname='amount'])[1]";
//	    public static String Amount="Amount > (//input[@data-fieldname='amount'])[1]";
//	    public static String Amount="Amount > (//input[@data-fieldname='amount'])[1]";
//	    public static String Amount="Amount > (//input[@data-fieldname='amount'])[1]";
//	    public static String Amount="Amount > (//input[@data-fieldname='amount'])[1]";
	    
	    

	    
	    
	    
	    
	    
	    
}
