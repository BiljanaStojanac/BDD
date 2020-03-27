Feature: Enter vehicle data

@EnterValidData
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
      When User enter StartTime data
      And User enter following data for product data tab
         |InsuranceSum   |MeritRating  |DamagteInsurance|CourtesyCar|
         |3000000        |Super Bonus  |Full Coverage   |Yes        |
      And User enter Optional products data
      Then go Select price option page
      And select option
      Then go to Select quote
      And User enter following data for Send quote
        |E-Mail              |Username  |Password   |Confirm Password|
        |test.test@gmail.com |TestName  |TestPass123|TestPass123     |
      Then User enter Send button








