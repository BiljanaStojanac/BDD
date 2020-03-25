Feature: Enter vehicle data


  Scenario:  Enter valid data
    Given Navigate to EnterVehicleData Page
    When User enter "Audi" data
    When User enter Engine Performance "1000" data
    When User enter DateofManufacture "01/18/1987" data
    When User enter NumberOfSeats "2" data
    When User enter FuelType "Diesel" data
    When User enter ListPrice "10000" data
    When User enter AnnualMileage "10000" data
    When NextPage
    When User enter First name "TestName" data
    When User enter Last name "TestLastName" data
    When User enter Date of birth "01/18/1987" data
    When User enter country "Serbia" data
    When User enter Zip code "21000" data
    When User enter "Employee" data for occupation
    When User enter Hobbies data
    Then go to next page


@Table
    Scenario: Enter validate data in table
      Given Navigate to EnterVehicleData Page
      And User enter following for vehicle data tab
          |Make|Engine|Date      |Seats|Fuel  |List |Mileage|
          |Audi|1000  |01/18/1987|2    |Diesel|10000|10000  |
      When NextPage
      And User enter following for insurant data tab
          |FirstName|LastName    |Birth     |Country|Zip  |Occupation|
          |TestName |TestLastName|01/18/1987|Serbia |21000|Employee  |
      And User enter Hobbies data
      When go to next page
      And User enter start time
      And User enter following data for product data tab
         |InsuranceSum   |MeritRating  |DamagteInsurance|CourtesyCar|
         |3000000        |Super Bonus  |Full Coverage   |Yes        |
      And User enter Optional products data
      Then go Select price option page






