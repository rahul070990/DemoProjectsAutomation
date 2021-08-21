Feature: Shut off “Submit and Schedule” for Canadian Applicants
		This will verify Submit and Schedule button for Canada Applicants
		
		@regression
		Scenario Outline: Verify Submit button for Canada Applicants
		Given I am logged into portal as <data>
		When I create Case with <data>
		And  I select Order Type <data> & proceed
		Then I see only submit button for user
		
		Examples:
		| data |
		|	DataFiles.US59421-LoginUser_solutioncenter	|
		|	DataFiles.US59421-CreateCase	|
		|	DataFiles.US59421-OrderTypeSelection	|
		
		@regression
			Scenario Outline: Verify Submit and Schedule button for US Applicants
		Given I am logged into portal as <data>
		When I create Case with <data>
		And  I select Order Type <data> & proceed
		Then I see only submit & shcedule button for user
		
		Examples:
		| data |
		|	DataFiles.US59421-LoginUser_solutioncenter	|
		|	DataFiles.US59421-CreateCase	|
		|	DataFiles.US59421-OrderTypeSelection	|
		
		@regression
			Scenario Outline: Verify Submit and Schedule button for Unknown Applicants
		Given I am logged into portal as <data>
		When I create Case with <data>
		And  I select Order Type <data> & proceed
		Then I see only submit & shcedule button for user
		
		Examples:
		| data |
		|	DataFiles.US59421-LoginUser_solutioncenter	|
		|	DataFiles.US59421-CreateCase	|
		|	DataFiles.US59421-OrderTypeSelection	|
			