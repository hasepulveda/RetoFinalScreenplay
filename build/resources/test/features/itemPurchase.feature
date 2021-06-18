Feature: purchase of an electronic component
  As a registered buyer of blazemeter
  I want to do a search in the component catalog.
  buy an electronic component

  @Search
  Scenario Outline: Component search
    Given the buyer logs in
      |  userName  |  password  |
      | <userName> | <password> |
    And look for the component in the indicated category
      |  categories  |  component  |
      | <categories> | <component> |
    When added to the shopping cart
    Then see an added product message
    Examples:
      | userName | password | categories | component      |
      | alba     | alba    | Phones     | Sony xperia z5 |
      | alfonso  | alfonso | Laptops    | MacBook Pro    |
      | viviana  | viviana | Monitors   | ASUS Full HD   |
  @ToPay
  Scenario Outline: pay component
    Given that the buyer log in
      |  userName  |  password  |
      | <userName> | <password> |
    And The buyer wants to pay for the component added to the cart
    When the buyer enters the data to place the order
      |  name  |  country  |  city   | creditCard   | month   | year  |
      | <name> | <country> | <city>  | <creditCard> | <month> | <year>|
    Then the buyer should see a message of congratulations on the purchase
      | name   | creditCard   |
      | <name> | <creditCard> |
    Examples:
      | userName | password | name    | country  |  city   | creditCard   | month | year |
      | alba     | alba     | Alba    | Colombia | Bogota  | 555555555555 | Enero | 2022 |
      | alfonso  | alfonso  | Alfonso | Colombia | Bogota  | 555555555555 | Enero | 2022 |
      | viviana  | viviana  | Viviana | Colombia | Bogota  | 555555555555 | Enero | 2022 |


