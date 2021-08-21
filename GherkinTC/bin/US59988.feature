Feature: Aphanumeric Office Code
		This will verify the Aplhanumeric code search in Walkin location
		
		@regression
		Scenario Outline: Verify Alphanumeric code are searched in office code field
		Given I am logged into portal as <data>
		When I click Administration & Select Walkin location
		And  I enter <data> in office code field
		And Click Search
		Then I see resulted walkin location results
		
		Examples:
		| data |
		|	DataFiles.US59421-LoginUser_officedrt	|
		|	DataFiles.US59421-OfficeCode	|
		
			@regression
		Scenario Outline: Verify Alphanumeric code are searched in office code field
		Given I am logged into portal as <data>
		When I click Administration & Select Walkin location
		And  I enter <data> in office code field
		And Click Search
		Then I see resulted walkin location results
		
		Examples:
		| data |
		|	DataFiles.US59421-LoginUser_officedrt	|
		|	DataFiles.US59421-OfficeCode	|
		
			@regression
		Scenario Outline: Verify Country is selectable before State/Province
		Given I am logged into portal as <data>
		When I click Administration & Select Walkin location
		Then I see Country is available for selection before State/Province
		
		Examples:
		| data |
		|	DataFiles.US59421-LoginUser_officedrt	|
		|	DataFiles.US59421-OfficeCode	|
		
			@regression
		Scenario Outline: Verify State/Province is displayed correctly
		Given I am logged into portal as <data>
		When I click Administration & Select Walkin location
		Then I see State/Province is displayed correctly with space
		
		Examples:
		| data |
		|	DataFiles.US59421-LoginUser_officedrt	|
		|	DataFiles.US59421-OfficeCode	|
		
		@regression
		Scenario Outline: Verify office code field is displayed wider
		Given I am logged into portal as <data>
		When I click Administration & Select Walkin location
		Then I see office code field is displayed wider correctly
		
		Examples:
		| data |
		|	DataFiles.US59421-LoginUser_officedrt	|
		|	DataFiles.US59421-OfficeCode	|
		
		@regression
		Scenario Outline: Verify Zip/Postal field is displayed correctly
		Given I am logged into portal as <data>
		When I click Administration & Select Walkin location
		And Select Country with <data> 
		And I enter <data> in Zip/Postal field
		Then I see Zip/Postal code is displayed correctly
		
		Examples:
		| data |
		|	DataFiles.US59421-LoginUser_officedrt	|
		|	DataFiles.US59421-Zip/PostalCode	|
		|	DataFiles.US59421-CountrySelection	|
		
		
	