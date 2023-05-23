@f1
Feature: verifying salary calculation functionality

Scenario Outline: calculating netsalary functionality 
Given user should navigate to calculation page
When user enter grosssalary "<GrossSalary>" 
And user enter "<IncomeTax>" and "<PF>" and "<ProfessionalTax>"
Then user should get NetSalary information "<NetSalary>"





Examples:
| GrossSalary | IncomeTax | PF | ProfessionalTax | NetSalary |
| 480000|0|43200|6000|430800|
| 800000|40000|30000|6000|724000|
