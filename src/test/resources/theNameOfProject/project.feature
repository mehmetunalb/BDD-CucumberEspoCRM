Feature: Data Table Practice

  Background:
    Given  user navigates to  espocrm "url"

  Scenario: Type of Data Tables
    When  user logs in
    Then  user verifies function names
      | Home          |
      | Accounts      |
      | Contacts      |
      | Leads         |
      | Opportunities |
      | Reports       |
      | Quotes        |
      | Sales Orders  |
      | Invoices      |
      | Products      |
      | Emails        |
      | Cases         |
      | Calendar      |
      | Tasks         |

#    Scenario Outline:

