# Sample Cucumber Project

- In addition to the Cucumber dependencies referenced in the POM.xml (junit, cucumber-java, cucumber-jvm-deps, cucumber-junit, cucumber-extentsreport, extentreports), need to have the Eclipse Cucumber plugin installed

- In Cucumber, a BDD (Given/When/Then format) example is called a scenario. Scenarios are defined in .feature files. In this project, .feature files are in /src/test/java/features package

- if you rigt-click on the .feature file and do run as 'Cucumber Feature', skeleton step definition code will be suggested. You can save that skeleton code to a StepDefinitions Class

- Step Definitions are the Java code that implements the scenario steps (sometimes called the "glue") is the code that implements the scenario steps. The parameters of the Given/When/Then steps has to match the wording of the features exactly. In this project, the step definition classes are in /src/test/java/stepDefinition package

- the Junit test runner class (in this case, CucumberTestRunner.java) is used to execute the test. In this project, the runner class is in the /src/test/java/testRunners package. Right-click on 'CucumberTestRunner.java' and run as Junit test

- you can perform selective execution by specifying a tagname. During the test execution, you can specify that you want to execute all the scenarios in a particular feature file or only those marked with a particular tagname eg: @smoke @regression

- you can pass parameters from your feature steps to your feature methods by ending the feature method parameter with `([^\"]*)` instead of `$`. By doing this, any text in the feature definition that follows the portion of the feature definition that is provided as a param to the method will be considered paramterized input.

- JUnit assertions are used for validation of results

- tagnames can be used for selective inclusion (eg: run for regression but not for smoke) at the feature, scenario, scenario outline and example level. For example, tag features with a specific tag (eg: regression) and then specify in the cucumberTestRunner.java which tags to run. ~@tagname in test runner means "everything except tagname"

- @Background can be used for pre-conditions. It indicates a pre-condition that needs to be run prior to each scenario listed in a feature file (eg: navigate to a URL that is the starting point)

- tagged hooks can be used to run a pre-condition step before only some scenarios with specific tags eg: @Before(@smoke, @regression)

- by including the cucumber-html dependency to your POM.xml and the Cucumber Options / Plugin to your test runner file, you can get HTML formatted reports (+ JSON & XML) 
