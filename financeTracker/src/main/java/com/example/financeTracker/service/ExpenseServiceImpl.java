package com.example.financeTracker.service;

import com.example.financeTracker.entities.ExpenseEntity;
import com.example.financeTracker.model.Expense;
import com.example.financeTracker.repository.ExpenseRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExpenseServiceImpl implements ExpenseService {
   @Autowired
   private ExpenseRepository expenseRepository;

    @Override
    public Expense createExpense(Expense expense) {
       ExpenseEntity expenseEntity=new ExpenseEntity();
        BeanUtils.copyProperties(expense,expenseEntity);
        ExpenseEntity savedEntity = expenseRepository.save(expenseEntity);

        // Create a new Expense object to return as a response
        Expense responseExpense = new Expense();

        // Copy properties from the saved ExpenseEntity to the response Expense object
        BeanUtils.copyProperties(savedEntity, responseExpense);

        return responseExpense;

    }

    @Override
    public List<Expense> getAllExpenses() {
        List<ExpenseEntity> expenseEntities = expenseRepository.findAll();

        // Convert List<ExpenseEntity> to List<Expense> using Spring's BeanUtils
        return expenseEntities.stream().map(expenseEntity -> {
            Expense expense = new Expense();
            BeanUtils.copyProperties(expenseEntity, expense);
            return expense;
        }).collect(Collectors.toList());
    }
}
