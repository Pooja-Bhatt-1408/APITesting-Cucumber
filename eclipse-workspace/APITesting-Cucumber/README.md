##### API Automated with Cucumber

- Capabilities
  - run automated suites 
  - do REST API (GET/POST)calls to predefined endpoints
  - check response code, headers,response body using jsonPath
  - check number of items returned
  
- Structure
  - src/test/java/ - Test runners and Step definition files
  - /features - Feature files
- How to run:
  - Prerequisites: maven3, java8 or greater
  - JUnit:
    - go to **src/test/java/api/** and run class **CucumberTestSuite.java** (will run all testcases with @automated tag by default)
    - you can modify the tags you want to run from @CucumberOptions inside the class
  - Maven:
    - run command from base project: **mvn clean verify** (will run all testcases with @automated tag by default)
    - if you want to run different tags: ** mvn clean verify -Dcucumber.options="--tags @test"**
