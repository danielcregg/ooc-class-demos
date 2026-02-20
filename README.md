# OOC Class Demos

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg?style=flat-square)

Live coding demonstrations from the Object-Oriented Computing (OOC) lectures at Atlantic Technological University (ATU).

## Overview

This repository contains Java code examples created during OOC lectures to illustrate fundamental object-oriented programming concepts. Topics range from basic "Hello World" programs and data types through to classes, objects, methods, Scanner input, and control flow. These demos serve as a quick reference for students following along with the weekly lecture material.

## Features

- **Hello World** -- Basic program structure and console output
- **Data Types** -- Primitive types including `boolean`, `byte`, and `float`
- **Classes and Objects** -- Creating a `Car` class with instance variables and methods
- **Methods** -- Defining and calling static and instance methods
- **Scanner Input** -- Reading user input from the console
- **Control Flow** -- `for` loops and `if/else if/else` branching

## Prerequisites

- Java 8 or later
- A Java IDE or text editor (VS Code, IntelliJ IDEA, or Eclipse)
- Git

## Getting Started

### Installation

```bash
git clone https://github.com/danielcregg/ooc-class-demos.git
cd ooc-class-demos
```

### Usage

Compile and run any demo from the project root:

```bash
# Hello World example
javac -d bin src/ie/gmit/packagename/HelloWorld.java
java -cp bin ie.gmit.packagename.HelloWorld

# Car and DataTypes example (Week 3)
javac -d bin src/ie/gmit/lecw3/*.java
java -cp bin ie.gmit.lecw3.Main

# Scanner and control flow example
javac -d bin src/ie/gmit/scannerpack/ScanFlow.java
java -cp bin ie.gmit.scannerpack.ScanFlow
```

Or open the project in your IDE and run individual files directly.

## Tech Stack

- **Language:** Java

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
