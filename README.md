# SauceDemo UI Automation Testing  

## Overview  
This repository contains automated tests for the SauceDemo website (https://www.saucedemo.com/). The test suite focuses on validating the shopping cart functionality, including adding products to the cart, verifying product details, and completing the checkout process. The framework is built using Selenium WebDriver, Java, TestNG, and the Page Object Model (POM) design pattern.  

## Project Repository  
`saucedemo-ui-automation`  

## Tech Stack  
- Java  
- Selenium WebDriver  
- TestNG  
- Maven  
- Allure Reporting Framework  

## Prerequisites  
- Java JDK 11 or higher  
- Maven 3.8.x or higher  
- Chrome/Firefox browser  
- Allure command line tool (for report generation)  

## Project Structure  
```  
src  
├── main  
│   └── java  
│       └── com  
│           └── saucedemo  
│               ├── pages  
│               │   └── [Page Objects]  
│               └── utils  
│                   └── [Utility Classes]  
└── test  
    └── java  
        └── com  
            └── saucedemo  
                └── test  
                    ├── AddToCartTest.java  
                    └── [Other Test Classes]  
```  

## Installation & Setup  
```bash  
# Clone the repository  
git clone https://github.com/your-username/saucedemo-ui-automation.git  

# Navigate to project directory  
cd saucedemo-ui-automation  

# Install dependencies and run tests  
mvn clean test  
```  

## Test Configuration  
```xml  
<?xml version="1.0" encoding="UTF-8"?>  
<suite name="SauceDemo" parallel="tests" thread-count="2">  
    <listeners>  
        <listener class-name="io.qameta.allure.testng.AllureTestNg"/>  
    </listeners>  
    <test name="Test Group 1">  
        <classes>  
            <class name="com.saucedemo.test.AddToCartTest" />  
            <!-- Add other test classes here -->  
        </classes>  
    </test>  
</suite>  
```  

## Test Cases  
### Shopping Cart Tests  
- Add items to the cart  
- Verify product details in the cart  
- Complete the checkout process  
- Validate order confirmation message  

## Running Tests  
```bash  
# Run all tests with default configuration  
mvn clean test  

# Run tests with Allure reporting  
mvn clean test allure:serve  

# Generate Allure report  
allure generate target/allure-results --clean -o target/allure-report  
```  

## Parallel Execution  
The test suite is configured to run in parallel with a thread count of 2. This is configured in the `testng.xml` file:  
- Parallel execution mode: `parallel="tests"`  
- Thread count: `thread-count="2"`  

## Reporting  
The project uses Allure for test reporting. To view the reports:  
1. Run tests with Allure:  
   ```bash  
   mvn clean test  
   ```  
2. Generate and open the report:  
   ```bash  
   allure serve target/allure-results  
   ```  

## Key Features  
- Page Object Model (POM) implementation  
- Parallel test execution  
- Allure reporting integration  
- Cross-browser testing support  
- Screenshot capture on test failure  

## Contributing  
1. Fork the repository.  
2. Create your feature branch:  
   ```bash  
   git checkout -b feature/AmazingFeature  
   ```  
3. Commit your changes:  
   ```bash  
   git commit -m 'Add some AmazingFeature'  
   ```  
4. Push to the branch:  
   ```bash  
   git push origin feature/AmazingFeature  
   ```  
5. Open a Pull Request.  

## Author  
   Mohammed Lukmanudhin - [redJavaMan](https://github.com/redJavaMan)
