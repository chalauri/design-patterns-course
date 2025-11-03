package ge.edu.sangu.chain;

import ge.edu.sangu.chain.handlers.BudgetRequestHandler;
import ge.edu.sangu.chain.handlers.DepartmentDirectorHandler;
import ge.edu.sangu.chain.handlers.FinancialManagerHandler;
import ge.edu.sangu.chain.handlers.LineManagerHandler;
import ge.edu.sangu.chain.request.BudgetRequest;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        BudgetRequest designPatternsCourseRequest =
                new BudgetRequest("I'd like to take new course of design patterns", new BigDecimal(60));

        BudgetRequestHandler financialManagerHandler = new FinancialManagerHandler(null);
        BudgetRequestHandler departmentDirectorHandler = new DepartmentDirectorHandler(financialManagerHandler);
        BudgetRequestHandler lineManagerHandler = new LineManagerHandler(departmentDirectorHandler);

        System.out.println("---------------------------------");
        System.out.println("New Request");
        System.out.println("---------------------------------");
        lineManagerHandler.processRequest(designPatternsCourseRequest);
        System.out.println("---------------------------------");
        System.out.println("New Request");
        System.out.println("---------------------------------");
        lineManagerHandler.processRequest(new BudgetRequest("WeAreDevelopers conference in Berlin", new BigDecimal(501)));
        System.out.println("---------------------------------");
        System.out.println("New Request");
        System.out.println("---------------------------------");
        lineManagerHandler.processRequest(new BudgetRequest("Business Trip in USA", new BigDecimal(2000)));
        System.out.println("---------------------------------");
        System.out.println("New Request");
        System.out.println("---------------------------------");
        lineManagerHandler.processRequest(new BudgetRequest(null, new BigDecimal(2000)));

    }
}
