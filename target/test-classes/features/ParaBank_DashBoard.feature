Feature: verify DashBoardPage all functionalities

@Regression
Scenario:  verify TransferMoney Functionality in DashboardPage
Given user is in dashboard page
Then user should click on transfermoney link
Then user should enter accountno "sbi50001234445" and name as "BensoNeal"
And user should enter amount as 25000
And user should Branch name as "Sbi50085"

@Regression
Scenario:  verify Apply Loan Functionality in DashboardPage
Given user is in dashboard page
Then user should click on RequestLoan link
Then user should enter LoanAmount 50000 and DownPayment 10000
And user should select From which account he need loan 
 