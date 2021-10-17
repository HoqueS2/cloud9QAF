@googleSearch
Feature: google search

@googleSearch-Simple
Scenario Outline: simple search

Given I am on the google homepage
When I enter search "<term>"
And I click on google search button
Then I received related search result

Examples:
|term              |
|Quality Assurance |
|Software Testing  |
