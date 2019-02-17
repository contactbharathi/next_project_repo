
@SearchPageFeauture.feature


Feature:   Search by
           As an end user
           I want to Search
           SO that I can see the product details according to the search


           Scenario Outline:  Search by text provided
                               Given I open firefox
                               when I enter the "<text>" in the search box
                               Then I should  be able to see the products details
            Examples:

            |   text     |
            |   jeans    |
            |   tops     |







