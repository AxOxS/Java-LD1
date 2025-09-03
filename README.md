# ML Models Collection Management System

## Project Overview

This Java application demonstrates object-oriented programming principles through a Machine Learning models hierarchy. The program creates, manages, and sorts collections of different ML model types using inheritance, polymorphism, and collection sorting.

## Features

- **Abstract Class Hierarchy**: ML models with shared properties and polymorphic behavior
- **Multiple Model Types**: Neural Networks, Decision Trees, and Support Vector Machines
- **Collection Management**: Organize models into named collections
- **Dual Sorting**: Sort collections by overridden method sums or individual method sums
- **Random Data Generation**: Automatically populate collections with realistic test data

## Class Structure

### Core Model Classes
- **`MLModel`** (Abstract): Base class with `name`, `accuracy`, and abstract `evaluateScore()` method
- **`NeuralNetwork`**: Extends MLModel with `layers` and `complexity()` method
- **`DecisionTree`**: Extends MLModel with `depth` and `depthMeasure()` method
- **`SVM`**: Extends MLModel with `marginWidth` and `kernelStrength()` method

### Collection Classes
- **`MLModelCollection`**: Manages a named collection of ML models with sum calculations
- **`CollectionManager`**: Manages multiple collections and provides sorting functionality

### Utility Classes
- **`RandomGenerator`**: Creates random ML model instances for testing

## How to Run

1. Ensure Java 17+ is installed
2. Compile the project:
   ```bash
   javac -d bin src/**/*.java
   ```
3. Run the main class:
   ```bash
   java -cp bin Main
   ```

## Program Flow

1. **Initialization**: Creates 3 collections with 5 random models each
2. **Initial Display**: Shows all collections with their contents and sums
3. **Sort by EvaluateScore**: Sorts collections by total `evaluateScore()` values
4. **Sort by Individual Methods**: Sorts collections by total individual method values

## Sample Output

```
=== Initial Collections ===
Collection: Collection A
  Sum(evaluateScore) = 15.42
  Sum(individual)    = 287.65
  Models:
    NeuralNetwork { name='NN-23', accuracy=0.78, layers=12, evaluateScore=2.01, complexity=120.0 }
    DecisionTree { name='DT-45', accuracy=0.85, depth=8, evaluateScore=1.87, depthMeasure=8.0 }
    ...

=== Sorted by evaluateScore sum ===
[Collections sorted by total evaluateScore values]

=== Sorted by individual methods sum ===
[Collections sorted by total individual method values]
```

## Key OOP Concepts Demonstrated

- **Inheritance**: All model types inherit from `MLModel`
- **Polymorphism**: Different implementations of `evaluateScore()` method
- **Abstraction**: Abstract base class defines common interface
- **Encapsulation**: Private fields with public accessors
- **Composition**: Collections contain model objects

## Technical Details

- **Language**: Java 17+
- **Collections**: Uses `ArrayList` for dynamic storage
- **Sorting**: Utilizes `Comparator` with method references
- **Random Generation**: Realistic value ranges for each model type
- **Modern Java**: Pattern matching, streams, and switch expressions

## Project Structure

```
src/
├── Main.java                          # Main application entry point
├── collection/
│   ├── CollectionManager.java         # Manages multiple collections
│   └── MLModelCollection.java         # Single collection of models
├── model/
│   ├── MLModel.java                   # Abstract base class
│   ├── NeuralNetwork.java             # Neural network implementation
│   ├── DecisionTree.java              # Decision tree implementation
│   └── SVM.java                       # Support Vector Machine implementation
└── util/
    └── RandomGenerator.java           # Random model generation utility
```

## Educational Objectives

This project demonstrates:
- Object-oriented design principles
- Class hierarchy implementation
- Polymorphic method calls
- Collection management and sorting
- Clean code practices and documentation

## Author

Laboratory Work #1 - Class Hierarchy Collection Sorting
