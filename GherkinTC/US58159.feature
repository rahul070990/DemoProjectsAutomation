Feature: Notifications - Order - CancelOrder / Service Notification for Office / Examiner
		This will verify the Cancel order notification emails
		
		@regression
		Scenario Outline: Verify Cancel order notification in Canadian French
		Given I am logged into portal as <data>
		And I schedule appointment with <data>
		When I cancel the order
		Then I receive email notification on <data> in canadian french
		
		Examples:
		| data |
		|	DataFiles.US58159-LoginUser_caofficeadmin	|
		|	DataFiles.US58159-CaseWithExaminerScheduling	|
		|	DataFiles.US58159-Email	|
		
			@regression
		Scenario Outline: Verify Cancel order notification in Canadian English
		Given I am logged into portal as <data>
		And I schedule appointment with <data>
		When I cancel the order
		Then I receive email notification on <data> in canadian english
		
		Examples:
		| data |
		|	DataFiles.US58159-LoginUser_caofficeadmin	|
		|	DataFiles.US58159-CaseWithExaminerScheduling	|
		|	DataFiles.US58159-Email	|
		
			@regression
		Scenario Outline: Verify Cancel order notification in US English
		Given I am logged into portal as <data>
		And I schedule appointment with <data>
		When I cancel the order
		Then I receive email notification on <data> in US English
		
		Examples:
		| data |
		|	DataFiles.US58159-LoginUser_caofficeadmin	|
		|	DataFiles.US58159-CaseWithExaminerScheduling	|
		|	DataFiles.US58159-Email	|
		
	