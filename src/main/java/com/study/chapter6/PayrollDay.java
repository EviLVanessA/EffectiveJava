package com.study.chapter6;

/**
 * @author jianghui
 * @date 2020-12-09 09:59
 */
public enum PayrollDay {
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
    private static final int MIN_PER_SHIFT = 8 * 60;
    int pay(int minuteWorked,int payRate){
        int basePay = minuteWorked * payRate;
        int overTimePay;
        switch (this){
            case SATURDAY:case SUNDAY:
                overTimePay = basePay / 2 ;break;
            default:
                overTimePay =
                    minuteWorked <= MIN_PER_SHIFT ? 0 : (minuteWorked - MIN_PER_SHIFT) * payRate / 2;
        }
        return basePay + overTimePay;
    }
}
