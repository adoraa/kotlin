# Kotlin Fundamentals

This repository contains the fundamental concepts of the Kotlin programming language. It's intended for beginners who want to learn Kotlin from scratch, especially those who are interested in Android app development.

The content of this repository is based on "The complete Android 12 & Kotlin Development Masterclass" course by Denis Panjuta and Tutorials.eu on Udemy.

## Table of Contents

- [Getting Started](#)
- [Variables](#Section3_KotlinFundamentals)
- [Data Types](#Section3_KotlinFundamentals)
- [Arithmetic Operators](#Section3_KotlinFundamentals)
- [Comparison Operators](#Section3_KotlinFundamentals)
- [Control Structures](#Section3_KotlinFundamentals)
  - [IF Statements](#Section3_KotlinFundamentals)
  - [When Expression](#Section3_KotlinFundamentals)
  - [While Loop](#Section3_KotlinFundamentals)
  - [Do While Loop](#Section3_KotlinFundamentals)
  - [For Loops](#Section3_KotlinFundamentals)
  - [Break and Continue](#Section3_KotlinFundamentals)
- [Nullables](#Section3_KotlinFundamentals)
  - [Elvis Operator](#Section3_KotlinFundamentals)
- [Contributing](#Section3_KotlinFundamentals)

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