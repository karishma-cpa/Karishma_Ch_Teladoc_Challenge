# Project Title
Teladoc Health QA Assessment

## Description
This project runs Selenium tests on [www.way2automation.com](http://www.way2automation.com/angularjs-protractor/webtables/)

Test cases automated are
1. Add and verify user
2. Delete and verify user

## Pre-Requisites
Please make sure you have Java 8+ and Maven 3+ installed

## Dependencies
All the dependencies are mentioned in pom.xml. Below table lists versions of important libraries
|Library    |Version    |
|-----------|-----------|
|Selenium   |4.0.0      |
|Junit      |4.13.1     |
|Cucumber   |6.9.1      |

## How to Run
1. Checkout code using git \
  `git clone git@github.com:karishma-cpa/Karishma_Ch_Teladoc_Challenge.git`
2. Change directory to the git repo home \
  `cd Karishma_Ch_Teladoc_Challenge`
3. Exec tests using maven \
  `mvn clean test`
4. Test reports will be generated under `target` directory in both HTML and JSON formats.
