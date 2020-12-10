package com.study.chapter6;

/**
 * @author jianghui
 * @date 2020-12-09 10:08
 */
public enum EnhancePayrollDay {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY(PayType.WEEDEND), SUNDAY(PayType.WEEDEND);
    private final PayType payType;

    EnhancePayrollDay(PayType payType) {
        this.payType = payType;
    }

    EnhancePayrollDay() {
        this(PayType.WEEKDAY);
    }

    private enum PayType {
        WEEKDAY {
            @Override
            int overtimePay(int minWorked, int payRate) {
                return minWorked <= MINS_PER_SHIFT ? 0 : (minWorked - MINS_PER_SHIFT) * payRate / 2;
            }
        },
        WEEDEND {
            @Override
            int overtimePay(int minWorked, int payRate) {
                return minWorked * payRate / 2;
            }
        };

        abstract int overtimePay(int mins, int payRate);

        private static final int MINS_PER_SHIFT = 8 * 60;

        int pay(int minWorked, int payRate) {
            int basePay = minWorked * payRate;
            return basePay + overtimePay(minWorked, payRate);
        }
    }
}
