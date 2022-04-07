##### API Automated with Cucumber, RestAssured

- Capabilities
  - run automated suites 
  - do REST API (GET/POST)calls to predefined endpoints
  - check response code, headers,response body 
  - check number of items returned
  
- Structure
  - src/test/java/ - Test runners and Step definition files
  - /features - Feature files
- How to run:
  - Prerequisites: maven3, java8 or greater
  - JUnit:
    - go to **src/test/java/testRunners/** and run class **TestRunner1.java** 
    - you can modify the tags you want to run from @CucumberOptions inside the class
  
