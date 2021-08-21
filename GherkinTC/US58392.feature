Feature: Notifications - Notifications - Contact Us from Web Confirmation Message
		This will verify the ContactUs notification emails
		
		@regression
		Scenario Outline: Verify ContactUs notification in Canadian French
		Given I am logged into portal as <data>
		When I search Case with <data>
		And I perform ContactUs on order
		Then I receive email notification on <data> in canadian french
		
		Examples:
		| data |
		|	DataFiles.US59421-LoginUser_solutioncenter	|
		|	DataFiles.US59421-SearchCase	|
		|	DataFiles.US59421-Email	|
		
	@regression
		Scenario Outline: Verify ContactUs notification in Canadian English
		Given I am logged into portal as <data>
		When I search Case with <data>
		And I perform ContactUs on order
		Then I receive email notification on <data> in Canadian English
		
		Examples:
		| data |
		|	DataFiles.US59421-LoginUser_solutioncenter	|
		|	DataFiles.US59421-SearchCase	|
		|	DataFiles.US59421-Email	|
		
	@regression
		Scenario Outline: Verify ContactUs notification in US English
		Given I am logged into portal as <data>
		When I search Case with <data>
		And I perform ContactUs on order
		Then I receive email notification on <data> in canadian french
		
		Examples:
		| data |
		|	DataFiles.US59421-LoginUser_solutioncenter	|
		|	DataFiles.US59421-SearchCase	|
		|	DataFiles.US59421-Email	|
		
	