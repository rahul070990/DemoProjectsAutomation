Feature: Submit & Schedule button removal
		This will verify the Submit & Schedule button is not displayed for Canadian Applicant on PMD order 
		
		@regression
		Scenario Outline: Verify Submit & Schedule button is not displayed for Canadian Applicant on PMD order 
		Given I am logged into portal as <data>
		And I have created a Case with <data>
		When  I click on Place Order
		And Select PMD option for Order Type
		Then I don't see Submit & Schedule button on screen
		
		Examples:
		| data |
		|	DataFiles.US60557-LoginUser_caofficeadmincredentials	|
		|	DataFiles.US60557-LoginUser_officeadmincredentials	|
		|	DataFiles.US60557-Create Case	|


		Scenario Outline: Verify Submit & Schedule button is displayed for non Canadian Applicant on PMD order 
		Given I am logged into portal as <data>
		And I have created a Case with <data>
		When  I click on Place Order
		And Select PMD option for Order Type
		Then I don't see Submit & Schedule button on screen
		When I creared a Case with <data>
		And I click on Place Order
		And Select PMD option for Order Type
		Then I don't see Submit & Schedule button on screen and logout from application
		
		Examples:
		| data |
		|	DataFiles.US60557-LoginUser_caofficeadmincredentials	|
		|	DataFiles.US60557-Create Case1	|
		|	DataFiles.US60557-Create Case2	|
		|	DataFiles.US60557-LoginUser_officeadmincredentials	|
		|	DataFiles.US60557-Create Case1	|
		|	DataFiles.US60557-Create Case2	|
		
	