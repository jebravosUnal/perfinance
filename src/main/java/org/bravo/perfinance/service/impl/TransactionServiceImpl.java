package org.bravo.perfinance.service.impl;

import org.bravo.perfinance.domain.Transaction;
import org.bravo.perfinance.service.TransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService{

    private final static Logger LOGGER = LoggerFactory.getLogger(TransactionServiceImpl.class);

    @Override
    public Transaction save(Transaction t) {
        LOGGER.info("Loggin...");
        return t;
    }
}
