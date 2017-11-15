

private static void displayEmptyLine(int msgLength, int paddingAmt) {
    for (int i = 0; i != bannerWidth(msgLength, paddingAmt); i++) {
        System.out.print(" ");
    }
}

private static int bannerWidth(int msgLength, int paddingAmt) {
    int width = msgLength+(2*paddingAmt);
    return width;
}
