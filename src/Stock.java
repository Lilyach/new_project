public class Stock {
    String vodka;
    public static int summ = 5;

    public void breakVodka(int countOfBreakVodka) {
        summ = summ - countOfBreakVodka;
    }

    public String getVodka() {
        return vodka;
    }

    public void setVodka(String vodka) {
        this.vodka = vodka;
    }

    public Stock() {
        this.vodka = vodka;
    }
}
