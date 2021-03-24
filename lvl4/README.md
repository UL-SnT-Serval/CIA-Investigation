# Level 4
## Compiler's Wrath
* Programming Language: **C**
* Difficulty: Hard

## Context
You wrote a simple program in C on your mac, everything compile without warning and his executable.
But when trying to run it on Ubuntu, it doesn't compile anymore. This doesn't seems to be an operating system issue... 
After investigation, you realise that both system use different compiler by default, one Clang llvm the other gcc. But how come that a simple piece of code turns out so differently?


**Can you guess, what is the issue?**

**Can you modify the code to make run on both ?**
* there is a simple fix and one more sophisticated impacting a single line.

# CI/CD python example

The objective of this mini-project is to show the use of CI/CD.  
Your objective is to make the build and test succeed on the CI/CD integrated in github (see Actions tab of the github repo).


## How to...

### Run the program on my local machine

You will require a linux environment with gcc and clang installed.

```
cd <project_directory>
sh run_gcc.sh
sh run_llvm.sh
```


### Run the test on the CI/CD

Simply push to `main` branch, the code will automatically try to compile.
Click on the Actions tab of the github repo to review the results.