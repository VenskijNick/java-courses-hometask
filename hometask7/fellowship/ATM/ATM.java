package hometask7.fellowship.ATM;

public class ATM {
    private int count20;
    private int count50;
    private int count100;

    public ATM(int count20, int count50, int count100) {
        this.count20 = count20;
        this.count50 = count50;
        this.count100 = count100;
    }

    public void addMoney(int count20, int count50, int count100) {
        this.count20 += count20;
        this.count50 += count50;
        this.count100 += count100;
    }

    public boolean moneyDrop(int amount) {
        int count20Needed = 0;
        int count50Needed = 0;
        int count100Needed = 0;

        if (amount % 10 != 0) {
            System.out.println("Сумма должна быть кратна 10");
            return false;
        }

        if (amount > count20 * 20 + count50 * 50 + count100 * 100) {
            System.out.println("Недостаточно денег в банкомате");
            return false;
        }

        int remainingAmount = amount;

        if (remainingAmount >= 100 && count100 > 0) {
            count100Needed = remainingAmount / 100;
            if (count100Needed > count100) {
                count100Needed = count100;
            }
            remainingAmount -= count100Needed * 100;
        }

        if (remainingAmount >= 50 && count50 > 0) {
            count50Needed = remainingAmount / 50;
            if (count50Needed > count50) {
                count50Needed = count50;
            }
            remainingAmount -= count50Needed * 50;
        }

        if (remainingAmount >= 20 && count20 > 0) {
            count20Needed = remainingAmount / 20;
            if (count20Needed > count20) {
                count20Needed = count20;
            }
            remainingAmount -= count20Needed * 20;
        }

        if (remainingAmount != 0) {
            System.out.println("Невозможно выдать указанную сумму");
            return false;
        }

        count20 -= count20Needed;
        count50 -= count50Needed;
        count100 -= count100Needed;

        System.out.println("Выдано купюр номиналом 20: " + count20Needed);
        System.out.println("Выдано купюр номиналом 50: " + count50Needed);
        System.out.println("Выдано купюр номиналом 100: " + count100Needed);
        System.out.println();

        return true;
    }

    public void getInfo() {
        System.out.println("Информация о банкомате:");
        System.out.println("Количество купюр номиналом 20: " + count20);
        System.out.println("Количество купюр номиналом 50: " + count50);
        System.out.println("Количество купюр номиналом 100: " + count100);
        System.out.println();
        System.out.println("Есть в наличии: " + (count20 * 20 + count50 * 50 + count100 * 100) + " руб.");
        System.out.println();

    }
}
