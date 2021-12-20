public class ATM {

    public int countBanknotes(int sum){
        int [] banknotes = new int []{500, 200, 100, 50, 20, 10 ,5,2,1};
        int qty=0;
        int i = 0;
        int currentQty = 0;
        while (i<9){
            if (sum < banknotes[i]){
                i++;
                continue;
            }
            currentQty =    sum / banknotes[i];
            qty += currentQty;
            sum = sum - banknotes[i] * currentQty;
        }
        return qty;
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        System.out.println(atm.countBanknotes(500)); // возвращает 1 (одна банкнота в 500)
        System.out.println(atm.countBanknotes(578)); // возвращает 6 (500 + 50 + 20 + 5 + 2 + 1)
    }
}
