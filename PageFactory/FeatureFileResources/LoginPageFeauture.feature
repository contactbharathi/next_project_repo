@LoginPageFeauture.feature

Feature:   Filter by
           As an end user
           I want to Login
           SO that i can access the site

          Scenario Outline: Login by Login Id and Password

             Given I open firefox and enter My account
             When I enter the valid  "<user_name>" and valid "<password>"

             Then I should  able to Login

             Examples:

             |        user_name           |  password  |
             |bharathicontact@yahoo.co.in |Kavitha12543|
             |bharathicontact2@yahoo.co.in|Kavitha12543|
