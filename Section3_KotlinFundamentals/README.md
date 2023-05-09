# Kotlin Fundamentals

This repository contains the fundamental concepts of the Kotlin programming language. It's intended for beginners who want to learn Kotlin from scratch, especially those who are interested in Android app development.

The content of this repository is based on "The complete Android 12 & Kotlin Development Masterclass" course by Denis Panjuta and Tutorials.eu on Udemy.

## Table of Contents

- [Getting Started](#)
- [Variables](#app/src/main/java/edu/babcock/kotlinbasics)
- [Data Types](#app/src/main/java/edu/babcock/kotlinbasics)
- [Arithmetic Operators](#app/src/main/java/edu/babcock/kotlinbasics)
- [Comparison Operators](#app/src/main/java/edu/babcock/kotlinbasics)
- [Control Structures](#app/src/main/java/edu/babcock/kotlinbasics)
  - [IF Statements](#app/src/main/java/edu/babcock/kotlinbasics)
  - [When Expression](#app/src/main/java/edu/babcock/kotlinbasics)
  - [While Loop](#app/src/main/java/edu/babcock/kotlinbasics)
  - [Do While Loop](#app/src/main/java/edu/babcock/kotlinbasics)
  - [For Loops](#app/src/main/java/edu/babcock/kotlinbasics)
  - [Break and Continue](#app/src/main/java/edu/babcock/kotlinbasics)
- [Nullables](#app/src/main/java/edu/babcock/kotlinbasics)
  - [Elvis Operator](#app/src/main/java/edu/babcock/kotlinbasics)
- [Contributing](#app/src/main/java/edu/babcock/kotlinbasics)

## Getting Started

To get started with Kotlin, you'll need to have the following installed on your computer:

- The Java Development Kit (JDK) version 8 or higher
- An Integrated Development Environment (IDE) such as IntelliJ IDEA or Android Studio

Once you have those installed, you can clone this repository and open it in your IDE.

## Variables

In Kotlin, you can declare variables using the `val` or `var` keywords, depending on whether you want the variable to be immutable or mutable. 

```kotlin
val name: String = "John" // immutable
var age: Int = 25 // mutable