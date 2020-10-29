package com.whl.pattern.flyweight.demo01;

/**
 * @Author: heling
 * @Date: 2020/10/29 21:35
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        ITicket ticket = TicketFactory.queryTicket("上海","北京");
        ticket.showInfo("硬座");
        ticket = TicketFactory.queryTicket("上海","北京");
        ticket.showInfo("软卧");
    }
}
