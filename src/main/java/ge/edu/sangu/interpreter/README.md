# Interpreter Pattern Example

This project demonstrates the **Interpreter** design pattern using a simple arithmetic expression evaluator. The system builds an expression tree and evaluates it using composable expression objects.

## Overview

The Interpreter pattern defines a representation for a language grammar and provides an interpreter to evaluate sentences in the language. In this example, the language consists of basic arithmetic operations:

* Addition
* Subtraction
* Multiplication
* Division
* Numeric literals

Each operation is represented by a class implementing the `Expression` interface.



## How It Works

### 1. **Expression Tree Construction**

The `buildExpressionTree` method manually constructs an expression tree for the following arithmetic expression:

```
3 + 7 * 9 - 48 / 6
```

Operator precedence is encoded directly into the structure of the tree.

### 2. **Interpreter**

The `Interpreter` class takes a `Context` and evaluates the tree by recursively calling `interpret` on each subexpression.

### 3. **Context**

The `Context` class can hold global data needed by expression evaluation. In this simple example, it is empty.

## Benefits

* Clear separation of grammar rules
* Flexible and easy to extend with new expressions

## Drawbacks

* Number of classes grows quickly as grammar expands
* Manual tree construction can be complex without a parser
* Not optimal for large or complex grammars
