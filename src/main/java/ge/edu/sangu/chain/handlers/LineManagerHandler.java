package ge.edu.sangu.chain.handlers;


 import ge.edu.sangu.chain.request.BudgetRequest;

import java.math.BigDecimal;

public class LineManagerHandler implements BudgetRequestHandler {

    private BudgetRequestHandler nextHandler;

    public LineManagerHandler(BudgetRequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void processRequest(BudgetRequest request) {
        BigDecimal amount = request.amount();
        if (amount.compareTo(new BigDecimal(500)) < 1) {
            System.out.println("Requested budget is less or equal to 500, so as a line manager I can approve your request");
        } else {
            System.out.println("As a line manager, I approve but requested budget requires additional approval");
            nextHandler.processRequest(request);
        }
    }

    @Override
    public void nextHandler(BudgetRequestHandler handler) {
        this.nextHandler = handler;
    }
}
