package org.bravo.perfinance.controller;

import org.bravo.perfinance.domain.Transaction;
import org.bravo.perfinance.service.TransactionService;
import org.bravo.perfinance.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @RequestMapping(value = Constants.INSERT_TRANSACTION, method = RequestMethod.POST)
    public ResponseEntity<Transaction> insertTransaction(@RequestBody Transaction t){
        return new ResponseEntity<>(transactionService.save(t), HttpStatus.OK);
    }

}