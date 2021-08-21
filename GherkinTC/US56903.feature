Feature: Add ability to link multiple Orders (QA Only)
		This will verify the order linking for Canada Applicant
		
		//Gherkin
		Scenario
		@regression
		Scenario Outline: Verify order linking for canadian user
		Given I am logged into portal as <data>	
		And I view order with <data>
		When I click link order & link order with <data>
		Then I link both orders successfully
		
		Examples:
		| data |
		|	DataFiles.US56903-caofficeadmin	|
		|	DataFiles.US56903-OrderToView	|
		|	DataFiles.US56903-OrderToLink	|
		|	DataFiles.US56903-ReserveAppointmentDetails	|
		
		@regression
		Scenario Outline: Verify order linking with different services for canadian user
		Given I am logged into portal as <data>
		And I view orders with <data>
		When I click link order & link order with <data>
		Then I link both orders successfully
		
		Examples:
		| data |
		|	DataFiles.US56903-caofficeadmin	|
		|	DataFiles.US56903-OrdersToView	|
		|	DataFiles.US56903-OrderToLink	|
		
		
		@regression
		Scenario Outline: Verify Account Exclusion for assign examiner
		Given I am logged into portal as <data>
		And I exclude account for examiner with <data>
		When I view order with <data>
		And I click assign examiner for a service with <data>
		Then I do not see examiner in list
		
			Examples:
		| data |
		|	DataFiles.US56903-LoginUser_caofficeadmin	|
		|	DataFiles.US56903-AccountExclusionWithExaminer	|
		|	DataFiles.US56903-OrderToView	|
		|	DataFiles.US56903-ServiceToView	|
		
			@regression
		Scenario Outline: Verify Service Exclusion for assign examiner
		Given I am logged into portal as <data>
		And I exclude service for examiner with <data>
		When I view order with <data>
		And I click assign examiner for a service with <data>
		Then I do not see examiner in list
		
			Examples:
		| data |
		|	DataFiles.US56903-LoginUser_caofficeadmin	|
		|	DataFiles.US56903-ServiceExclusionWithExaminer	|
		|	DataFiles.US56903-OrderToView	|
		|	DataFiles.US56903-ServiceToView	|
		
			@regression
		Scenario Outline: Verify Gender Check for assign examiner
		Given I am logged into portal as <data>
		When I view order with <data>
		And I click assign examiner for a service with <data>
		Then I do see examiner<data> in list
		
			Examples:
		| data |
		|	DataFiles.US56903-LoginUser_caofficeadmin	|
		|	DataFiles.US56903-OrderToView	|
		|	DataFiles.US56903-ServiceToView	|
		|	DataFiles.US56903-ExaminerToView	|
		
			@regression
		Scenario Outline: Verify order unlinking for canadian user
		Given I am logged into portal as <data>
		And I view order with <data>
		When I unlink orders
		Then I see orders with <data>
		
		Examples:
		| data |
		|	DataFiles.US56903-caofficeadmin	|
		|	DataFiles.US56903-OrderToView	|
		|	DataFiles.US56903-BothOrdersToView	|
		
		@regression
		Scenario Outline: Verify order scheduling for canadian user
		Given I am logged into portal as <data>
		And I view order with <data>
		When I unlink orders
		And Schedule order with <data>
		Then I sschedule order successfully
		
		Examples:
		| data |
		|	DataFiles.US56903-caofficeadmin	|
		|	DataFiles.US56903-OrderToView	|
		|	DataFiles.US56903-OrdersToSchedule	|


		
			