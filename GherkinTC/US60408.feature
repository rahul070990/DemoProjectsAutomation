Feature: Complete Hourly Tech Service
		This will verify Hourly Tech Service
		
		@regression
		Scenario Outline: Verify Number of units field
		Given I am logged into portal as <data>
		When I search & view Case with <data>
		And I click billing option from Hamburger menu for service <data>
		Then I see Number of units field
		
		Examples:
		| data |
		|	DataFiles.US60408-LoginUser_caofficeadmin	|
		|	DataFiles.US60408-SearchCanadaCase	|
		|	DataFiles.US60408-MileageService	|
		
	@regression
		Scenario Outline: Verify whole number for Number of units field
		Given I am logged into portal as <data>
		When I search & view Case with <data>
		And I click billing option from Hamburger menu for service <data>
		And I enter <data> in number of field
		Then Number of fields is displayed with <data> 
		
		Examples:
		| data |
		|	DataFiles.US60408-LoginUser_caofficeadmin	|
		|	DataFiles.US60408-SearchCanadaCase	|
		|	DataFiles.US60408-MileageService	|
		|	DataFiles.US60408-ValueofNumberofField	|
		
	@regression
		Scenario Outline: Verify decimanl number for Number of units field
		Given I am logged into portal as <data>
		When I search & view Case with <data>
		And I click billing option from Hamburger menu for service <data>
		And I enter <data> in number of field
		Then Number of fields is displayed with <data> 
		
		Examples:
		| data |
		|	DataFiles.US60408-LoginUser_caofficeadmin	|
		|	DataFiles.US60408-SearchCanadaCase	|
		|	DataFiles.US60408-MileageService	|
		|	DataFiles.US60408-ValueofNumberofField	|
		
		@regression
		Scenario Outline: Verify mileage reimbursement fee
		Given I am logged into portal as <data>
		When I search & view Case with <data>
		And I click billing option from Hamburger menu for service <data>
		And I enter <data> in number of field
		And Number of fields is displayed with <data>
		Then Mileage reimbursement fee is displayed with <data> 
		
		Examples:
		| data |
		|	DataFiles.US60408-LoginUser_caofficeadmin	|
		|	DataFiles.US60408-SearchCanadaCase	|
		|	DataFiles.US60408-MileageService	|
		|	DataFiles.US60408-ValueofNumberofField	|
		|	DataFiles.US60408-Mileage reimbursement fee	|
		