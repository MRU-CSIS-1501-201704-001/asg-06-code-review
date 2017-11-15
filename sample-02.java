
public static String accounting(double toAccounting, int fieldWidth) {
    String accountingFormatString = String.format("%,.2f", toAccounting);
    int modifiedFieldWidth = fieldWidth - 1;
    if (toAccounting > 0 && fieldWidth > accountingFormatString.length()) {
        accountingFormatString = getModifiedPaddedString(toAccounting, modifiedFieldWidth);
    } else {
        accountingFormatString = getPaddedString(toAccounting, fieldWidth);
    }
    return accountingFormatString;
}

private static String getPaddedString(double toAccounting, int fieldWidth) {
    String formatString = "%,("+fieldWidth+".2f";
    return String.format(formatString, toAccounting);
}

private static String getModifiedPaddedString(double toAccounting, int modifiedFieldWidth) {
    String formatString = "%,("+modifiedFieldWidth+".2f ";
    return String.format(formatString, toAccounting);
}

