package org.bravo.perfinance.utils;

/**
 * Created by EBR3556 on 12/09/2017.
 */
public class Constants {

    public static final String APP_BASE = "/perfinance";
    //
    public static final String PERFINANCE_IS_RUNNING = APP_BASE + "/isRunning";
    // Transaction API constants
    public static final String TRANSACTIONS_BASE = APP_BASE + "/transactions";
    public static final String INSERT_TRANSACTION = TRANSACTIONS_BASE + "/insert";
    public static final String INSERT_FAKE_TRANSACTION = TRANSACTIONS_BASE + "/insertFake";
    public static final String FIND_ALL_TRANSACTIONS = TRANSACTIONS_BASE + "/findAll";

    // Transaction Loader API constants
    public static final String TRANSACTION_LOADER_BASE = APP_BASE + "/transactionLoader";
    public static final String TRANSACTION_LOADER_LOAD = TRANSACTION_LOADER_BASE + "/load/{format}";
}