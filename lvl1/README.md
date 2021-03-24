# Level 1
## A tale of Legacy

* Programming Language: **Java**
* Difficulty: Easy

## Context

You wrote a niece piece of Java code  and your tests indicates that everything is fine, but when your partner test it on her old laptop,
the program is not even compiling. Surprise you configure a CI workflow simulating your partner's environment and realize that it is indeed failing.

**Can you guess, what is going on?**

**Can you modify the code to make it compile ?**


## Setting things

The objective of this mini-project is to show the use of CI/CD.  
Your objective is to make the build and test succeed on the CI/CD integrated in github (see Actions tab of the github repo).

It is recommended to clone the project on your local machine, work from there and push back the changes.

## How to...

### Build and test the program on my local machine

```
mvn install
```

### Clean maven

It is sometimes necessary to clean all results from previous maven command (such as compiled file). This allows you to start from a clean state, just as the CI/CD server would. Use the following command to clean:

```
mvn clean
```

### Run the test on the CI/CD

Simply push to `main` branch, the build and tests will be triggered automatically.
Click on the Actions tab of the github repo to review the results.