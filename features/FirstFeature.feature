Feature: Guess the word

  # The first example has two steps
  Scenario: Maker starts a game
    When the Maker starts a game
    #Then the Maker waits for a Breaker to joinc

  Scenario: Correct non-zero number of books found by author
#    Given I have the following books in the store by list
#      | The Devil in the White City          | Erik Larson |
#      | The Lion, the Witch and the Wardrobe | C.S. Lewis  |
#      | In the Garden of Beasts              | Erik Larson |
    Given I have the following books in the store by map
      | title                                | author      |
      | The Devil in the White City          | Erik Larson |
      | The Lion, the Witch and the Wardrobe | C.S. Lewis  |
      | In the Garden of Beasts              | Erik Larson |
      | The Devil in the White City          | Erik Sir    |
    When I search for books by author Erik Larson
    Then I find 2 books
