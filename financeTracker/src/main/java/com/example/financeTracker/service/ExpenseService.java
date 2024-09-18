package com.example.financeTracker.service;

import com.example.financeTracker.model.Expense;

import java.util.List;

public interface ExpenseService {
    Expense createExpense(Expense expense);
    List<Expense> getAllExpenses();

}
