# Hello World
This repository will allow you to build your first professional Java
project, including unit and acceptance tests, using Gradle as the
build tool.

## Building the Project
After you have cloned the repository, you should be able to navigate
to the directory containing the `gradle.build` file. There, you can
build the project by running the command

`gradlew build`

Then, you can run the unit test coverage report.

`gradlew jacocoTestReport`

Then, you can run the acceptance tests. 

`gradlew cucumberTest`

You can even do multiple things in one statement:

`gradlew build jacocoTestReport cucumberTest`

When you want to get rid of all of the temporary files (like compiled class files and such), you can say

`gradlew clean`

If you want to do a full build and reporting from a clean project, you can just string it all together:

`gradlew clean build jacocoTestReport cucumberTest`

If you want to create the generated documentation (based on your Javadoc comments), you can say

`gradlew javadoc`

And if you want to run the application you have created, you can say

`gradlew run`

If the application expects command-line arguments (as this example does), you can pass them as follows:

`gradlew run --args 'forward'`
`gradlew run --args 'backward'`
`gradlew run --args 'any arguments you need'`


## Structure
The directory structure that is assumed by Gradle (though it can be changed if you want) is as follows:

    project root  (root directory of project)
               |
                - build.gradle  (contains the instructions for the build tasks)
               |
                - src  (root directory of the source code; main, test, cucumberTest)
                    |
                     - cucumberTest  (root directory of Cucumber acceptance tests)
                    |             |
                    |              - java  (all packages go here)
                    |             |     |
                    |             |      - cucumber  (root package for Cucumber tests and hooks)
                    |             |               |
                    |             |                - hooks  (all source code for before/after hooks)
                    |             |               |
                    |             |                - steps  (all source code for feature steps)
                    |             |
                    |              - resources  (contains resources for Cucumber tests)
                    |                        |
                    |                         - features  (contains all feature files)
                     - main  (root directory of normal source code)
                    |     |
                    |      - java  (all packages go here)
                    |           |
                    |            - edu    
                    |                |
                    |                 - wofford  (source code goes here)
                    |            
                    |
                    |
                     - test  (root directory of unit test code)
                          |
                           - java  (all packages go here)
                                |
                                 - edu    
                                     |
                                      - wofford  (unit test code goes here)

After you run `gradlew build`, a new `build` directory will automatically be created. This will contain all of the generated files (compiled class files, JAR files, reports, etc.). The most important things here are as follows:

`build/reports/tests/index.html`
: This file holds the results of all of the unit tests.

`build/libs/<name>.jar`
: This file (where *name* is specified in the jar settings of `gradle.build`, 
  probably "COSC420-hello-world-1.0.jar" in this case) is the fully bundled code 
  for the project. You can run this by saying
  `java -jar build/libs/<name>.jar`
  from the project root.

After you run `gradlew cucumberTest`, a `reports/cucumberTest` directory will be created in the `build` directory. This will contain the reports for the Cucumber acceptance tests.

`build/reports/cucumberTest/overview-features.html`
: This file holds the Cucumber acceptance test results.

After you run `gradlew jacocoTestReport`, a `reports/jacoco/test/html` directory will be created in the `build` directory. This will contain the reports for the Jacoco code coverage.
  
`build/reports/jacoco/test/html/index.html`
: This file holds the unit test code coverage results from Jacoco.

After you run `gradlew javadoc`, a `docs` directory will be created in the project root. This will contain all of the generated Javadoc documentation for your source files.  

`docs/javadoc/index.html`
: This file is the index to the generated documentation.

