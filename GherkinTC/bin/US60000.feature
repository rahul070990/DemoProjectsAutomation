Feature: Edit Walkin Location
		This will verify the Editing walkin location
		
		@regression
		Scenario Outline: Verify office code is displayed in Edit Walkin
		Given I am logged into portal as <data>
		When I click Administration & Select Walkin location
		And  I enter <data> in first name field & enter Search
		And Click Edit
		Then I see office code option displayed under phone
		
		Examples:
		| data |
		|	DataFiles.US59421-LoginUser_officedrt	|
		|	DataFiles.US59421-FirstName	|
		
			@regression
		Scenario Outline: Verify Alphanumeric code is supported in edit walkin field
		Given I am logged into portal as <data>
		When I click Administration & Select Walkin location
		And  I enter <data> in first name field & enter Search
		And I select country with <data> & enter search
		And Click Edit
		And I enter officecode with <data> & click save
		Then Walkin location is saved successfully
		
		Examples:
		| data |
		|	DataFiles.US59421-LoginUser_officedrt	|
		|	DataFiles.US59421-FirstName	|
		|	DataFiles.US59421-CountrySelection	|
		|	DataFiles.US59421-OfficeCode	|
		
					@regression
		Scenario Outline: Verify officecode,description,allowPSC scheduling code is editable
		Given I am logged into portal as <data>
		When I click Administration & Select Walkin location
		And  I enter <data> in officecode field & enter
		And Select 2nd record from result
		And Click Edit
		And Edit office code description allowPSC scheduling with <data> & save
		Then Walkin location is saved successfully
		
		Examples:
		| data |
		|	DataFiles.US59421-LoginUser_officedrt	|
		|	DataFiles.US59421-Officecode	|
		|	DataFiles.US59421-Editeddata	|
		
		
			@regression
		Scenario Outline: Verify country cannot change
			Given I am logged into portal as <data>
		When I click Administration & Select Walkin location
		And  I enter <data> in officecode field & enter
		And Select record with <data> from result
		And Click Edit
		Then country is displayed in readble format
		
		Examples:
		| data |
		|	DataFiles.US59421-LoginUser_officedrt	|
		|	DataFiles.US59421-OfficeCode	|
		|	DataFiles.US59421-RecordSelection	|
		
		@regression
		Scenario Outline: Verify warning message  for blank office code
		Given I am logged into portal as <data>
		When I click Administration & Select Walkin location
		And  I enter <data> in officecode field & enter
		And Select record with <data> from result & click edit
		And leave office code blank
		Then office code is displayed with message <data>
		Examples:
		| data |
		|	DataFiles.US59421-LoginUser_officedrt	|
		|	DataFiles.US59421-OfficeCode	|
		|	DataFiles.US59421-RecordSelection	|
		|	DataFiles.US59421-WArningMessage	|
		
		