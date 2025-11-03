package ge.edu.sangu.chain.handlers;


import ge.edu.sangu.chain.request.BudgetRequest;

public class FinancialManagerHandler implements BudgetRequestHandler {

    private BudgetRequestHandler nextHandler;

    public FinancialManagerHandler(BudgetRequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void processRequest(BudgetRequest request) {

        String description = request.description();
        if (description == null || description.isBlank()) {
            System.out.println("Your request is not explained well, so as a financial manager I reject it");
        } else {
            System.out.println("Congratulations! You have approval from Financial Manager");
        }
    }

    @Override
    public void nextHandler(BudgetRequestHandler handler) {
        this.nextHandler = handler;
    }
}
