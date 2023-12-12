public class Main {
    public static void main(String[] args) {
        // РАСЧЕТ 1
        int initialAmount = 100;   // переменная для начального счёта
        int replenishmentAmount = 300;   // переменная для суммы пополнения
        int oneBonusCost = 100;   // переменная для суммы рублей для одного бонуса

        int bonus;   // переменная для количества бонусов
        if (replenishmentAmount >= 1000) {
            bonus = replenishmentAmount / oneBonusCost;
        } else {
            bonus = 0;
        }
        int totalAmount = initialAmount + replenishmentAmount + bonus;   // переменная для итоговой суммы на счету клиента
        System.out.println("РАСЧЕТ 1:");
        System.out.println("Начальная сумма " + initialAmount);
        System.out.println("Сумма пополнения " + replenishmentAmount);
        System.out.println("Начислено бонусов " + bonus);
        System.out.println("Итоговая сумма " + totalAmount);
        System.out.println();

        // РАСЧЕТ 2
        int initialAmount1 = 100;
        int replenishmentAmount1 = 1100;
        int oneBonusCost1 = 100;

        int bonus1;
        if (replenishmentAmount1 >= 1000) {
            bonus1 = replenishmentAmount1 / oneBonusCost1;
        } else {
            bonus1 = 0;
        }
        int totalAmount1 = initialAmount1 + replenishmentAmount1 + bonus1;
        System.out.println("РАСЧЕТ 2:");
        System.out.println("Начальная сумма " + initialAmount1);
        System.out.println("Сумма пополнения " + replenishmentAmount1);
        System.out.println("Начислено бонусов " + bonus1);
        System.out.println("Итоговая сумма " + totalAmount1);
    }
}
