Feature: Verify country on Create Case screen
		This will verify the country value based on last created case by user
		
		Scenario Outline: Verify Country field is displayed above Insurance Information
		Given I am logged into portal as <data>
		When  I click on Create Case
		Then I see Country field above Insurance information on Create Case page
		
		Examples:
		| data |
		|	LoginUser_solutioncenter	|
		|	LoginUser_agentadmin	|
		|	LoginUser_officeadmin	|
		
		@regression
		Scenario Outline: Verify I see same country of previous case as default on new case creation
		Given I am on Create Case<data> 
		And I have created a case with <data>
		When  I click on Create Case
		Then I see same country<data> of previous case as default for new case creation
		
		Examples:
		| data |
		|	DataFiles.US59160-LoginUser_solutioncenter	|
		|	DataFiles.US59160-LoginUser_agentadmin	|
		|	DataFiles.US59160-LoginUser_officeadmin	|
		| DataFiles.US59160-Create_Case |
		
		Scenario Outline: Verify I see specified country as default for new case
		Given I am on Create Case<data> 
		And I have created a case with <data>
		When I logout from application and login again<data>
		And  I click on Create Case
		Then specified country<data> as default for new case
		
		Scenario Outline: Verify I see specified country as default on cookie clean
		Given I am on Create Case<data> 
		And I have created a case with <data>
		When I clean cookie
		And  I click on Create Case
		Then I see specified country<data> for new case
		
		Scenario Outline: Verify I see warning message on country change
		Given I am on Create Case<data> 
		And I have created a case with <data>
		When I change country<data>
		Then I see warning message<data>
		
		Scenario Outline: Verify I see specified policy type on country selection
		Given I am on Create Case<data> 
		When I select country<data>
		Then I see specified policy type on country selection<data>
		
		Scenario Outline: Verify I see specified policy type for unknown country
		Given I am on Create Case<data> 
		When I select country<data>
		Then I see specified policy type on country selection<data>
		
		
		
		