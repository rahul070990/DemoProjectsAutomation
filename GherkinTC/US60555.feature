Feature: Enable Reserve Scheduling for Canadian ExamOne Office users
		This will verify the Reserve Scheduling for Canada Applicant
		
		@regression
		Scenario Outline: Verify reserve scheduling for canadian user
		Given I am logged into portal as <data>
		And I view order with <data>
		When I click reserve appointment from hamburger menu for service with <data>
		And I enter reserve appointment details with <data>
		Then I reserve schedule appointment successfully
		
		Examples:
		| data |
		|	DataFiles.US60555-caofficeadmin	|
		|	DataFiles.US60555-OrderToView	|
		|	DataFiles.US60555-ServicetoSelect	|
		|	DataFiles.US60555-ReserveAppointmentDetails	|
		
		@regression
		Scenario Outline: Verify Account Exclusion for assign examiner
		Given I am logged into portal as <data>
		And I exclude account for examiner with <data>
		When I view order with <data>
		And I click assign examiner for a service with <data>
		Then I do not see examiner in list
		
			Examples:
		| data |
		|	DataFiles.US60555-LoginUser_caofficeadmin	|
		|	DataFiles.US60555-AccountExclusionWithExaminer	|
		|	DataFiles.US60555-OrderToView	|
		|	DataFiles.US60555-ServiceToView	|
		
			@regression
		Scenario Outline: Verify Service Exclusion for assign examiner
		Given I am logged into portal as <data>
		And I exclude service for examiner with <data>
		When I view order with <data>
		And I click assign examiner for a service with <data>
		Then I do not see examiner in list
		
			Examples:
		| data |
		|	DataFiles.US60555-LoginUser_caofficeadmin	|
		|	DataFiles.US60555-ServiceExclusionWithExaminer	|
		|	DataFiles.US60555-OrderToView	|
		|	DataFiles.US60555-ServiceToView	|
		
			@regression
		Scenario Outline: Verify Gender Check for assign examiner
		Given I am logged into portal as <data>
		When I view order with <data>
		And I click assign examiner for a service with <data>
		Then I do see examiner<data> in list
		
			Examples:
		| data |
		|	DataFiles.US60555-LoginUser_caofficeadmin	|
		|	DataFiles.US60555-OrderToView	|
		|	DataFiles.US60555-ServiceToView	|
		|	DataFiles.US60555-ExaminerToView	|
		
				@regression
		Scenario Outline: Verify order scheduling for canadian user
		Given I am logged into portal as <data>
		And I view order with <data>
		And Schedule order with <data>
		Then I schedule order successfully
		
		Examples:
		| data |
		|	DataFiles.US56903-caofficeadmin	|
		|	DataFiles.US56903-OrderToView	|
		|	DataFiles.US56903-OrdersToSchedule	|
		
			