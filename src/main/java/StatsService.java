public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int amountSales(long[] sales) { // СУММА

        int amount = 0;
        for (long sale : sales) {
            amount += sale;
        }

        return amount;
    }

    public int averageAmountSales(long[] sales) { // СРЕДНЯЯ СУММА
        return amountSales(sales) / 12;
    }

    public int minAverageSales(long[] sales) { // ПРОДАЖИ НИЖЕ СРЕДНЕГО
        int average = averageAmountSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    public int maxAverageSales(long[] sales) { // ПРОДАЖИ ВЫШЕ СРЕДНЕГО
        int average = averageAmountSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }


}


