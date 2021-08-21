Feature: Assign Examiners to Canadian Applicant
		This will verify the Assign Examiner for Canada Applicant
		
		@regression
		Scenario Outline: Verify assign examiner for service
		Given I am logged into portal as <data>
		And I view order with <data>
		When I click assign examiner from hamburger menu against service with <data>
		Then I see examiner with <data>
		
		Examples:
		| data |
		|	DataFiles.US60554-caofficeadmin	|
		|	DataFiles.US60554-OrderToView	|
		|	DataFiles.US60554-ServicetoSelect	|
		|	DataFiles.US60554-ExaminerView	|
		
		@regression
		Scenario Outline: Verify Account Exclusion for assign examiner
		Given I am logged into portal as <data>
		And I exclude account for examiner with <data>
		When I view order with <data>
		And I click assign examiner for a service with <data>
		Then I do not see examiner in list
		
			Examples:
		| data |
		|	DataFiles.US60554-LoginUser_caofficeadmin	|
		|	DataFiles.US60554-AccountExclusionWithExaminer	|
		|	DataFiles.US60554-OrderToView	|
		|	DataFiles.US60554-ServiceToView	|
		
			@regression
		Scenario Outline: Verify Service Exclusion for assign examiner
		Given I am logged into portal as <data>
		And I exclude service for examiner with <data>
		When I view order with <data>
		And I click assign examiner for a service with <data>
		Then I do not see examiner in list
		
			Examples:
		| data |
		|	DataFiles.US60554-LoginUser_caofficeadmin	|
		|	DataFiles.US60554-ServiceExclusionWithExaminer	|
		|	DataFiles.US60554-OrderToView	|
		|	DataFiles.US60554-ServiceToView	|
		
			@regression
		Scenario Outline: Verify Gender Check for assign examiner
		Given I am logged into portal as <data>
		When I view order with <data>
		And I click assign examiner for a service with <data>
		Then I do see examiner<data> in list
		
			Examples:
		| data |
		|	DataFiles.US60554-LoginUser_caofficeadmin	|
		|	DataFiles.US60554-OrderToView	|
		|	DataFiles.US60554-ServiceToView	|
		|	DataFiles.US60554-ExaminerToView	|
		
				@regression
		Scenario Outline: Verify Zone scheduling doesn't work for canadian order
		Given I am logged into portal as <data>
		And I create zone schedul with <data>
		When I view order with <data>
		And I click assign examiner for a service with <data>
		Then I do see examiner<data> in list
		
			Examples:
		| data |
		|	DataFiles.US60554-LoginUser_caofficeadmin	|
		|	DataFiles.US60554-ZoneScheduling	|
		|	DataFiles.US60554-OrderToView	|
		|	DataFiles.US60554-ServiceToView	|
		|	DataFiles.US60554-ExaminerToView	|
		
			@regression
		Scenario Outline: Verify temporary scheduling doesn't work for canadian order
		Given I am logged into portal as <data>
		And I create temporary scheduling with <data>
		When I view order with <data>
		And I click assign examiner for a service with <data>
		Then I do see examiner<data> in list
		
			Examples:
		| data |
		|	DataFiles.US60554-LoginUser_caofficeadmin	|
		|	DataFiles.US60554-TempScheduling	|
		|	DataFiles.US60554-OrderToView	|
		|	DataFiles.US60554-ServiceToView	|
		|	DataFiles.US60554-ExaminerToView	|