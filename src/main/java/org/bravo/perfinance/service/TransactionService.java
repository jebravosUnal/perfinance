package org.bravo.perfinance.service;


import org.bravo.perfinance.domain.Transaction;

public interface TransactionService {

    /**
     * It will save the transaction if it is different to null
     * @param t transaction to save. Couldn't be null
     * @return transaction saved
     */
    Transaction save(Transaction t);

}
