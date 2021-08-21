Feature: French Translation
		This will verify the OrderType icon translation
		
		@regression
		Scenario Outline: Verify OrderType icons are translated correctly
		Given I am logged into portal as <data>
		And I have fulfilled preconditions <data>
		And I have created a Case with <data>
		When  I click on Place Order
		Then I see OrderTpye label icons correctly translated to French as per attached sheet in US
		
		Examples:
		| data |
		|	DataFiles.US59421-LoginUser_solutioncenter	|
		|	DataFiles.US59421-User_preconditions	|
		|	DataFiles.US59421-Create Case	|
		
	