Feature: Notifications - Agent / Agency - Daily Order Status emails
		This will verify the Agent / Agency notification emails
		
		@regression
		Scenario Outline: Verify Daily Status notification in Canadian French
		Given I am logged into portal as <data>
		When I create a case with <data>
		Then I receive email notification on <data> in canadian french
		
		Examples:
		| data |
		|	DataFiles.US59421-LoginUser_solutioncenter	|
		|	DataFiles.US59421-CreateCase	|
		|	DataFiles.US59421-Email	|
		
					@regression
		Scenario Outline: Verify Daily Status notification in Canadian English
		Given I am logged into portal as <data>
		When I create a case with <data>
		Then I receive email notification on <data> in canadian french
		
		Examples:
		| data |
		|	DataFiles.US59421-LoginUser_solutioncenter	|
		|	DataFiles.US59421-CreateCase	|
		|	DataFiles.US59421-Email	|
		
					@regression
		Scenario Outline: Verify Daily Status notification in US English
		Given I am logged into portal as <data>
		When I create a case with <data>
		Then I receive email notification on <data> in canadian french
		
		Examples:
		| data |
		|	DataFiles.US59421-LoginUser_solutioncenter	|
		|	DataFiles.US59421-CreateCase	|
		|	DataFiles.US59421-Email	|
		
	