package ge.edu.sangu.chain.handlers;

import ge.edu.sangu.chain.request.BudgetRequest;

public interface BudgetRequestHandler {
    void processRequest(BudgetRequest request);
    void nextHandler(BudgetRequestHandler handler);
}
