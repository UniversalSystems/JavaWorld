package com.mysystems.tree.domain;

public enum TranType {
DEBIT(1),CREDIT(-1);

private int numVal;

TranType(int numVal) {
    this.numVal = numVal;
}

public int getNumVal() {
    return numVal;
}
}
