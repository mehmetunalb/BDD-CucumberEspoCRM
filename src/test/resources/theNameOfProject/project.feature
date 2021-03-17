Feature: Data Table Practice

  Scenario: Verify Menu Options
    Given  user navigates to  espocrm "url"
    When  user logs in
    Then  user verifies function names
#      | Home          |
      | Accounts      |
      | Contacts      |
      | Leads         |
      | Opportunities |
      | Reports       |
      | Quotes        |
      | Sales Orders  |
      | Invoices      |
#      | Products      |
#      | Emails        |
#      | Cases         |
#      | Calendar      |
#      | Tasks         |

  Scenario Outline: Creating Accounts
    Given  user navigates to espocrm "url"
    When user is on accounts page
    And  user clicks on create account button
    And  user enter "<Name>", "<Website>","<Country>","<Type>"
    Then user verifies his, her info "<Name>", "<Website>","<Country>","<Type>"
    Examples:
      | Name     | Website                   | Country | Type     |
      | Armagann  | www.amazon.com           | Turkey  | Reseller |
  #    | Serhat   | www.techtorialacademy.com | Germany | Customer |
  #    | Mehmet   | www.ebay.com              | Nigeria | Customer |
  #    | AyhanAbi | www.buybuybaby.com        | Syria   | Customer |

  Scenario: Users Verification
    Given  user navigates  to  espocrm "url"
    When user clicks Users button
    Then user verifies usernames and emails
      | Admin           | espocrm.demo@gmail.com              |
      | Ben Parter      | ben.parter@example.com.ko           |
      | Bill Chan       | bill_chan@example-demo.so           |
      | Brendon Lewis   | brendon.lewis@re-example.org        |
      | Emma Bard       | emma_bard@rio.demo.su               |
      | Gabliel Brie    | gabrielbrie@exmpl.org.pi            |
      | Jake Forester   | jake_forester@example-espo.demo.com |
      | Jim Williams    | jim_williams@example.com.ca         |
      | Rebecca Maer    | rebecca.maer@demoexmpl.org          |
      | Richard Pan     | richard_pan@read.exmpl-dd.com       |
      | ThomasList Peterson | thomas.peterson@demo-user.exmpl.com |






