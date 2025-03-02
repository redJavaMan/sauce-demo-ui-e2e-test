# SauceDemo Test Automation Framework

This project is a Selenium-based test automation framework for [SauceDemo](https://www.saucedemo.com/), demonstrating automated end-to-end testing of an e-commerce website using the Page Object Model design pattern.

## 📋 Table of Contents
- [Overview](#overview)
- [Project Structure](#project-structure)
- [Technologies Used](#technologies-used)
- [Prerequisites](#prerequisites)
- [Setup and Installation](#setup-and-installation)
- [Running Tests](#running-tests)
- [Framework Architecture](#framework-architecture)
- [Test Scenarios](#test-scenarios)
- [Contributing](#contributing)

## 🔍 Overview

This test automation framework demonstrates automated testing of the SauceDemo e-commerce website, covering user journeys from login to checkout. It follows the Page Object Model pattern to create a maintainable and scalable test framework.

## 📁 Project Structure

```
saucedemo-automation/
├── src/
│   ├── main/java/com/saucedemo/pages/
│   │   ├── CartPage.java
│   │   ├── CheckOutPage.java
│   │   ├── ConfirmationPage.java
│   │   ├── LoginPage.java
│   │   ├── OrderStatusPage.java
│   │   └── ProductsPage.java
│   └── test/java/com/saucedemo/
│       ├── base/
│       │   └── BaseTest.java
│       └── test/
│           └── AddToCartTest.java
├── TestNG.xml
├── pom.xml
└── README.md
```

## 🛠️ Technologies Used

- Java 17
- Selenium WebDriver 4.18.1
- TestNG 7.9.0
- Maven

## ✅ Prerequisites

- Java JDK 17 or higher
- Maven 3.6 or higher
- Chrome browser
- ChromeDriver (compatible with your Chrome version)

## 🚀 Setup and Installation

1. Clone the repository:
   ```
   git clone https://github.com/yourusername/saucedemo-automation.git
   cd saucedemo-automation
   ```

2. Install dependencies:
   ```
   mvn clean install
   ```

## ▶️ Running Tests

### Using Maven

Run all tests:
```
mvn test
```

Run specific test class:
```
mvn test -Dtest=AddToCartTest
```

### Using TestNG XML

Run the TestNG suite:
```
mvn test -DsuiteXmlFile=TestNG.xml
```

## 🏗️ Framework Architecture

### Page Object Model (POM)

This framework implements the Page Object Model design pattern, where each web page is represented by a class that encapsulates the page's elements and interactions.

### Key Components:

1. **Page Classes**: Represent web pages with elements and methods to interact with them
2. **BaseTest**: Sets up and tears down the test environment
3. **Test Classes**: Contain test methods that use page objects to perform actions and assertions

## 📝 Test Scenarios

Currently, the framework covers the following test scenario:

### E2E Order Placement (successfullOrderValidation)

1. Login to SauceDemo with valid credentials
2. Add products to cart (Sauce Labs Backpack and Sauce Labs Bike Light)
3. Navigate to cart and verify products
4. Proceed to checkout and enter shipping information
5. Complete the order
6. Verify successful order confirmation message

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch: `git checkout -b feature/new-feature`
3. Commit your changes: `git commit -m 'Add some feature'`
4. Push to the branch: `git push origin feature/new-feature`
5. Submit a pull request

## Author
Mohammed Lukmanudin M - [GitHub Profile](https://github.com/redJavaMan)
