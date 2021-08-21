Feature: Enable ScheduleNow for Examiners
		This will verify the ScheduleNow for Examiners
		
		@regression
		Scenario Outline: Verify Scheduling all appointments
		Given I am logged into portal as <data>
		And I am on Case Center screen
		When I view open order with <data>
		And Schedule all apointment
		Then I schedule all appointments successfully
		
		Examples:
		| data |
		|	DataFiles.US60556-LoginUser_rahulsecond.x.examiner	|
		|	DataFiles.US60556-OrderToView	|
		
		@regression
		Scenario Outline: Verify Scheduling at order level
		Given I am logged into portal as <data>
		And I am on Case Center screen
		When I view open order with <data>
		And Schedule appointment for service with <data>
		Then I schedule appointment for service successfully
		
			Examples:
		| data |
		|	DataFiles.US60556-LoginUser_rahulsecond.x.examiner	|
		|	DataFiles.US60556-OrderToView	|
		|	DataFiles.US60556-ServiceToSchedule	|