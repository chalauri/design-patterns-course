# Budget Approval Chain (Chain of Responsibility Pattern)

This project demonstrates the **Chain of Responsibility** design pattern using a budget approval workflow.  
Each handler in the chain is responsible for approving a budget request up to a certain limit or based on specific criteria.  
If a handler cannot fully process the request, it passes it along to the next handler in the chain.



## How It Works

Each **handler** implements the `BudgetRequestHandler` interface, which defines two methods:

```java
void processRequest(BudgetRequest request);
void nextHandler(BudgetRequestHandler handler);
```

## The Handlers

- LineManagerHandler
    - Approves requests up to 500.
    - For larger amounts, forwards the request to the next handler.

- DepartmentDirectorHandler
    - Approves requests between 501 and 1000.
    - For larger amounts, forwards the request further.

- FinancialManagerHandler
  - Final handler that verifies the description field.
  - Rejects requests without a valid description.


## Design Pattern Explanation

This example implements the Chain of Responsibility pattern.

### Intent:
Avoid coupling the sender of a request to its receiver by giving more than one object the chance to handle the request.
Chain the receiving objects and pass the request along the chain until one of them handles it.

### Benefits:

- Decouples request sender and receiver.
- Adds flexibility in assigning responsibilities.
- Makes it easy to add or remove approval layers.

### In this project:

- Each handler decides whether to handle the request or pass it forward.
- The Main class constructs the chain:
```
Line Manager → Department Director → Financial Manager
```

