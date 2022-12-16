public class Main {

    public static void main(String[] args) {

        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        StatsService service = new StatsService();
        
        System.out.println("Мин. месяц по продажам " + service.minSales(sales));
        System.out.println("Макс. месяц по продажам " + service.maxSales(sales));
        System.out.println("Сумма по продажам " + service.amountSales(sales));
        System.out.println("Средняя сумма продаж " + service.averageAmountSales(sales));
        System.out.println("Кол-во месяцев ниже среднего " + service.minAverageSales(sales));
        System.out.println("Кол-во месяцев выше среднего " + service.maxAverageSales(sales));


    }
}
