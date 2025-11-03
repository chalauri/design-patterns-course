package ge.edu.sangu.chain.request;

import java.math.BigDecimal;

public record BudgetRequest(String description, BigDecimal amount) {
}
