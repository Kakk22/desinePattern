package com.cyf.designPattern.strategy;

import com.cyf.designPattern.strategy.impl.CashNormal;
import com.cyf.designPattern.strategy.impl.CashRebate;
import com.cyf.designPattern.strategy.impl.CashReturn;

import java.util.Scanner;

/**
 * @author by cyf
 * @date 2020/11/30.
 */
public class Client {

    public static void main(String[] args) {
        CashContext cashContext = null;
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入打折方式（1/2/3）：");
        int in = scanner.nextInt();
        String type = "";
        switch (in) {
            case 1:
                cashContext = new CashContext(new CashNormal());
                type += "正常收费";
                break;
            case 2:
                cashContext = new CashContext(new CashRebate(0.8));
                type += "打折";
                break;
            case 3:
                cashContext = new CashContext(new CashReturn(300, 100));
                type += "满减";
                break;
            default:
                System.out.println("请输入1/2/3");
                break;
        }

        double totalPrices = 0;

        System.out.println("请输入单价:");
        double price = scanner.nextDouble();
        System.out.println("请输入数量:");
        double num = scanner.nextDouble();
        totalPrices = cashContext.getResult(price * num);
        System.out.println("单价：" + price + "，数量：" + num + "，类型：" + type + "，合计：" + totalPrices);

        scanner.close();
    }
}
