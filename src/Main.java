public class Main {
    public static void main(String[] args) {
        int initialAmount = 100;   // переменная для начального счёта
        int replenishmentAmount = 1000;   // переменная для суммы пополнения
        int oneBonusCost = 100;   // переменная для суммы рублей для одного бонуса

        int bonus;   // переменная для количества бонусов
        if (replenishmentAmount > 1000) {
            bonus = replenishmentAmount / oneBonusCost;
        } else {
            bonus = 0;
        }
        int totalAmount = initialAmount + replenishmentAmount + bonus;   // переменная для итоговой суммы на счету клиента
        System.out.println("Начальная сумма " + initialAmount);
        System.out.println("Сумма пополнения " + replenishmentAmount);
        System.out.println("Начислено бонусов " + bonus);
        System.out.println("Итоговая сумма " + totalAmount);
    }
}
