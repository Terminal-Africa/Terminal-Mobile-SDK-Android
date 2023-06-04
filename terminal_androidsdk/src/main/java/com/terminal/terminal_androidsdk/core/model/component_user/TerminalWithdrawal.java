package com.terminal.terminal_androidsdk.core.model.component_user;

public class TerminalWithdrawal {
    public  String amount;
    public  String sourceId;
    public  String narration;
    public  String recipientId;

    public TerminalWithdrawal(){}

    public  TerminalWithdrawal(String amount, String sourceId, String narration, String recipientId){
        this.amount = amount; this.sourceId = sourceId;
        this.narration = narration; this.recipientId = recipientId;
    }
}
