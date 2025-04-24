package org.howard.edu.lspfinal.question3;

public abstract class Report {
    // Template Method
    public final void generateReport() {
        loadData();
        formatData();
        printReport();
    }

    protected abstract void loadData();
    protected abstract void formatData();
    protected abstract void printReport();
}
