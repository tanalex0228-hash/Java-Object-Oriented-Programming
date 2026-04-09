/**
 * 題目：豪賭之神~進階骰子撲克對戰系統
 * 程式說明：玩家與電腦進行擲骰子對戰
 * 系統自動判定豹子、三對、兩對
 * 透過遞迴的費氏數列計算連勝獎金倍率
 * 運用技術點 (依講義內容設計)：
 * 1. 陣列處理 (Array)：骰子點數存儲 
 * 2. 隨機亂數 (ranInt)：模擬擲骰子 
 * 3. 排序算法 (mySort)：輔助點數計算
 * 4. 條件檢查 (checker)：判斷無點重新投擲
 * 5. 點數計算 (calcPoint)：判斷豹子、對子
 * 6. 遞迴呼叫 (fibr)：計算費氏數列獎金加成
 * 7. 防呆設計：Scanner 輸入型態驗證與下注金額範圍檢查
 */

import java.util.*;

public class DiceBattleGame {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("★☆★ 歡迎來到豪賭之神：進階骰子對戰系統 ★☆★");
        
        int playerMoney = 1000;
        int winStreak = 0;

        // 使用 do-while 迴圈處理遊戲主要流程
        do {
            System.out.println("\n目前餘額: " + playerMoney + " | 當前連勝: " + winStreak);
            System.out.print("請輸入本局下注金額 (輸入 0 結算退出): ");
            
            // 防災設計：驗證輸入是否為數字且在餘額範圍內
            int bet = validateInput(0, playerMoney);
            if (bet == 0) break;

            // 1. 玩家回合
            System.out.println("\n--- 玩家回合 ---");
            int[] playerDice = rollDiceWithCheck();
            int playerPoint = calcPoint(playerDice);
            displayDice("玩家", playerDice, playerPoint);

            // 2. 電腦回合
            System.out.println("\n--- 電腦回合 ---");
            int[] compDice = rollDiceWithCheck();
            int compPoint = calcPoint(compDice);
            displayDice("電腦", compDice, compPoint);

            // 3. 勝負判定邏輯
            if (playerPoint > compPoint) {
                winStreak++;
                // 運用遞迴：計算費氏數列加成～連勝越高，獎金加成越大
                int bonusMultiplier = fibr(winStreak); 
                int profit = bet * bonusMultiplier;
                playerMoney += profit;
                System.out.println(">>勝利！觸發 " + winStreak + " 連勝獎金 (倍率:" + bonusMultiplier + ")！贏得: " + profit);
            } else if (playerPoint < compPoint) {
                playerMoney -= bet;
                winStreak = 0;
                System.out.println(">>很遺憾，您輸掉了本局。");
            } else {
                System.out.println(">>本局平手，保留注金。");
            }

            if (playerMoney <= 0) {
                System.out.println("\n[系統] 您已破產！遊戲結束。");
                break;
            }

        } while (true);

        System.out.println("\n遊戲結束，您的最終資產: " + playerMoney);
        System.out.println("期待下次與您對弈！");
    }

    // 副程式 A：擲骰子並自動檢查「無點」重擲 [cite: 303, 333]
    public static int[] rollDiceWithCheck() {
        int[] d = new int[4];
        do {
            for (int i = 0; i < 4; i++) {
                d[i] = ranInt(1, 6); // 呼叫亂數副程式 [cite: 1287]
            }
            mySort(d); // 排序後方便判斷 [cite: 319]
        } while (checker(d)); // 若 checker 為 true 代表無點，必須重擲 [cite: 303, 333]
        return d;
    }

    // 副程式 B：萬用亂數產生器 [cite: 1147, 1287]
    public static int ranInt(int low, int up) {
        return (int) (Math.random() * (up - low + 1) + low);
    }

    // 副程式 C：氣泡排序法 [cite: 244, 319]
    public static void mySort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    // 副程式 D：檢查有無點數 (true 為沒點) [cite: 333]
    public static boolean checker(int[] ary) {
        // 規則：至少要有兩顆骰子點數一樣才算「有點數」
        // 如果四顆都不一樣，或三顆一樣另一顆不同，皆視為無點 (依照講義定義) [cite: 366]
        if (ary[0] != ary[1] && ary[1] != ary[2] && ary[2] != ary[3]) return true; // 四顆都不同
        if (ary[0] == ary[2] && ary[0] != ary[3]) return false; // 三顆一樣，剩下一顆有點
        if (ary[1] == ary[3] && ary[1] != ary[0]) return false; // 三顆一樣，剩下一顆有點
        if (ary[0] == ary[1] || ary[1] == ary[2] || ary[2] == ary[3]) return false; // 兩顆一樣
        return true;
    }

    // 副程式 E：點數計算邏輯 [cite: 346-367]
    public static int calcPoint(int[] a) {
        if (a[0] == a[3]) { // 豹子 [cite: 347-348]
            return 100 + a[0]; // 豹子點數極大
        } else if (a[0] == a[2] || a[1] == a[3]) { // 三顆一樣 [cite: 352-357]
            return (a[0] == a[2]) ? a[3] : a[0];
        } else if (a[0] == a[1] && a[2] == a[3]) { // 兩對 [cite: 359-365]
            return a[1] + a[3]; // 取兩對點數和
        } else if (a[0] == a[1]) {
            return a[2] + a[3];
        } else if (a[1] == a[2]) {
            return a[0] + a[3];
        } else if (a[2] == a[3]) {
            return a[0] + a[1];
        }
        return 0;
    }

    // 副程式 F：遞迴計算費氏數列 (獎金倍率) [cite: 438, 497]
    public static int fibr(int a) {
        if (a == 1) return 1;
        if (a == 2) return 2;
        return fibr(a - 1) + fibr(a - 2);
    }

    // 副程式 G：防災設計 (防呆輸入)
    public static int validateInput(int min, int max) {
        int input;
        while (true) {
            if (sc.hasNextInt()) {
                input = sc.nextInt();
                if (input >= min && input <= max) break;
                System.out.print("錯誤！請輸入有效範圍 (" + min + "-" + max + "): ");
            } else {
                System.out.print("無效輸入！請輸入數字: ");
                sc.next(); // 吸收掉錯誤字串
            }
        }
        return input;
    }

    public static void displayDice(String name, int[] dice, int point) {
        System.out.print(name + "骰子: ");
        for (int d : dice) System.out.print("[" + d + "] ");
        System.out.println("-> 點數: " + (point > 100 ? "豹子!" : point));
    }
}