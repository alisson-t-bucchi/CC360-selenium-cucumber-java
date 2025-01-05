# BDD in a Page Object project of Full Search Automation Test on the Search 360 Page with Cucumber.
This project uses Cucumber, Selenium, and Java to automate the process of searching for information on the Search 360 page.

## Description
The goal of this project is to perform a complete search for information on the Search 360 page, covering data entry and interaction with various elements of the page interface, such as text fields, dropdown lists, and buttons.

## Test Functionality
The automated test performs a sequence of actions as described in the Feature File of Cucumber. The flow includes:
1. Opening the Search 360 page.
2. Filling in reference, agent, email, and phone fields.
3. Interacting with various page elements, such as service line, category, subcategory, reason, state, and period.
4. Performing a search using the Search button.
5. Interacting with additional elements such as Voice, Email, and Chat.
6. Closing the page after the process is complete.

## Prerequisites
Before running the tests, you need to set up your development environment. The required tools are:
    Java 11 or higher (The project is configured for Java 9, but can easily be adapted for newer versions).
    Maven (to manage dependencies and run the build).
    Selenium WebDriver (for browser interaction).
    Cucumber (to define and execute the tests).
    WebDriverManager (to automatically manage browser drivers).

## How to Run the Project
1. Clone the repository:
    git clone https://github.com/your-username/cucumber-automation.git
    cd cucumber-automation

2. Set up your environment:
    If you don’t have Maven or Java set up yet, follow these instructions:
    Maven: Official Maven Documentation
    Java: Official Java Documentation

3. Install dependencies: Run the following command to install the dependencies defined in the pom.xml file:
    mvn clean install

4. Run the tests: After installing the dependencies, run the tests with the command:
    mvn test

5. Results: The test results will be displayed in the terminal, and you can also check the execution report generated by Maven if you’ve set up a reporting plugin like Cucumber Reporting or Allure.

6. Project Structure
The project is organized as follows:

CC360-selenium-cucumber-java/
src
|── main
|   └── java
|       └── pages                                   # Page Object localization
|           ├── Search360Page.java                  # Include reusable methods for system searches iterations 
|       └── steps
|           ├── BaseTest.java                       # Manage WebDriver lifecicle
|           ├── DemoCC360AutomationCucumber.java    # Features steps described in .feature file
|── test
|   └── resources                                   # Gherkin scenarios tests
|       ├── features
|           ├── search360.feature
|       └── config
|           ├── cucumber.properties
|
├── pom.xml                                    # Maven configuration file
└── README.md                                  # This file

## Gherkin scenario example:
Feature: Search360 Test

  Scenario: Testar busca com filtros no Search360
    Given abrir a pagina
    When meto "1254", "Francisco Carneiro", "francisco.carneiro@gmail.com", "913478990"
    And clico em Linha de Atendimento e seleciono opção
    And clico em Categoria e seleciono opção
    And clico em Sub-categoria e seleciono opção
    And clico em Motivo e seleciono opção
    And clico em Estado e seleciono option
    And seleciono um periodo
    And clico em Procurar
    Then fecho a pagina

7. Execution Flow:
- Feature File (.feature):
    Describes the test scenarios in Gherkin, as shown in the example above.

- Step Definitions (DemoCC360AutomationCucumber.java):
    Implements the steps described in the .feature file using the actions defined in the Page Object.

- Page Object (Search360Page.java):
    Encapsulates the selectors and interaction methods for the page being tested.

- Driver Management (BaseTest.java):
    Configures and terminates the WebDriver.

## Important Files
- pom.xml: Manages Maven dependencies and plugins.
- search360.feature: The Gherkin file describing the feature and test scenarios.
- DemoCC360AutomationCucumber.java: Defines the steps for Cucumber (BDD).
- Search360Page.java: Contains the logic for interacting with the page interface.

## Example .feature File
The search360.feature file contains the test scenario for the full search on the Search 360 page:

Feature: Perform a full search on the Search 360 page

  Scenario Outline: Perform a full search on the Search 360 page
    Given open the page
    When I enter "<referencia>", "<agente>", "<email>", and "<telefone>"
    And click on Service Line and select option
    And click on Category and select option
    And click on Sub-category and select option
    And click on Reason and select option
    And click on State and select option
    And select a period
    And click on Search
    And click on Voice and close
    And click on Email and close
    And click on Chat and close
    Then close the page

    Examples:
      | referencia   | agente   | email   | telefone   |
      | "referencia" | "agente" | "email" | "telefone" |


## DemoCC360AutomationCucumber.java File
The Cucumber step definitions file (DemoCC360AutomationCucumber.java) implements the logic for each of the steps defined in the .feature file.

## Contribution
If you would like to contribute to the project, follow these steps:
1. Fork this repository.
2. Create a branch for your modifications (git checkout -b feature/new-feature).
3. Make the necessary changes.
4. Submit a pull request.

## License
This project is licensed under the MIT License - see the LICENSE file for details.