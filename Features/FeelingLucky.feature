Feature: google search - Feeling Lucky
Scenario Outline: feeling lucky- google search

Given I am on the google homepage 
When I enter search "<term>"
And I click on I am Feeling Lucky button 
Then I land on the first result homepage

Examples:
|term              |
|Oracle |
|Database  |
