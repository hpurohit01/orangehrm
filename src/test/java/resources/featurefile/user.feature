Feature: Orange HRM
  As a user i can operate orange hrm website

  Background: User is om homepage

    @sanity,@smoke
  Scenario: admin should add user successfully
    When I enter username
    And  I enter password
    And  I click on login button
    And  I click on admin tab
    And I click on add button
    And  I select user role "Admin"
    And  I enter employee name "Karan Patel"
    And  I enter my username
    And  I select status "Disabled"
    And  I set password "prime@123"
    And  I set confirm password "prime@123"
    And  I click on save button

@sanity
  Scenario: Search the user created and verify it
    When I enter username
    And  I enter password
    And  I click on login button
    And  I click on admin tab
    And  I enter name in search field "Max"
    And  I enter status as "Enabled"
    And I click to search

@smoke,@sanity
  Scenario: verify that admin should delete the user successfully
    When I enter username
    And  I enter password
    And  I click on login button
    And  I click on admin tab
    And  I enter a user name "Andrew.paule"
    And  I set his role "ESS"
    And  I set his status "Enabled"
    And  I click to search
    And  I marked in check box
    And  I click on delete button
    And  I click on pop up

@regression
  Scenario: Search the deleted user and verify the message no record found
    When I enter username
    And  I enter password
    And  I click on login button
    And  I click on admin tab
    And  I enter a user name "Josh.Dave"
    And  I set his role "ESS"
    And  I set his status "Enabled"
    And  I click to search
    And  I can see no record found
