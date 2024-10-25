package org.example.strategy;

import org.example.enums.OptionsEnum;

public class StrategyFactory {
    public static AbstractCustomerStrategy getStrategyByOption(OptionsEnum optionsEnum) {
        return switch (optionsEnum) {
            case SHOW_ALL_CUSTOMERS_AND_CARDS -> new ShowCustomersAndCardsStrategy();
            case ADD_AND_DELETE_CUSTOMERS -> new AddDeleteCustomersStrategy();
            case BLOCK_AND_UNBLOCK_CARDS -> new CardBlockStrategy();
            case CREATE_NEW_CARD -> new CreateCardStrategy();
            case SHOW_MONEY_TRANSFER -> new ShowMoneyTransferStrategy();
        };
    }
}