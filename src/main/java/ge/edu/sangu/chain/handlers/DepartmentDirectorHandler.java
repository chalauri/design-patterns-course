package ge.edu.sangu.chain.handlers;


import ge.edu.sangu.chain.request.BudgetRequest;

import java.math.BigDecimal;

public class DepartmentDirectorHandler implements BudgetRequestHandler {

    private BudgetRequestHandler nextHandler;

    public DepartmentDirectorHandler(BudgetRequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void processRequest(BudgetRequest request) {
        BigDecimal amount = request.amount();
        if (amount.compareTo(new BigDecimal(500)) > 0 &&
                amount.compareTo(new BigDecimal(1000)) < 1) {
            System.out.println("Requested budget is less or equal to 1000, so as a department director" +
                    " I can approve your request");
        } else {
            System.out.println("As a department director, I approve but requested budget requires additional approval");
            nextHandler.processRequest(request);
        }
    }

    @Override
    public void nextHandler(BudgetRequestHandler handler) {
        this.nextHandler = handler;
    }
}
