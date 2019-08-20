@browser
Feature: google look up

  Scenario Outline: searching for a text <text> on Search Engine <searchEngine>
    Given I go to <searchEngine>
    When I enter text <text> into search bar of search engine <searchEngine>
    Then I land on correct page, and enter term <term> into searchbar
    Examples:
      | text      | searchEngine | term  |
      | wikipedia | Google       | prodigy |
#      | Zayaan Ahmad | Google       |
#      | Hello World  | Google       |
#      | Zayaan Ahmad | DuckDuckGo   |
#      | Hello World  | DuckDuckGo   |


