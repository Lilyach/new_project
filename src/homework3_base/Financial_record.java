package homework3_base;

public class Financial_record {
    private int incomes;
    private int outcomes;

    public Financial_record(int incomes, int outcomes) {
        this.incomes = incomes;
        this.outcomes = outcomes;
    }

    public int getIncomes() {
        return incomes;
    }

    public void setIncomes(int incomes) {
        this.incomes = incomes;
    }

    public int getOutcomes() {
        return outcomes;
    }

    public void setOutcomes(int outcomes) {
        this.outcomes = outcomes;
    }

    @Override
    public String toString() {
        return this.incomes + ";" + this.outcomes;
    }
}
