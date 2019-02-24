package com.epam.lessons.les2;

public class Lesson2 {
    public static void main(String[] args) {
        int sec;
        sec = 60 * 60 * 24 * 7 * 3;
        System.out.println("Sec in 3 weeks:" + (60 * 60 * 24 * 7 * 3));
        System.out.println("Sec in 3 weeks:" + 60 * 60 * 24 * 7 * 3);
        System.out.println("Sec in 3 weeks:" + sec);
        // convert from milisec to sec
        long date = System.currentTimeMillis()/1000;
        // counts of passed sec from 00:00 1/01/1970
        int ss = (int)(date%60);
        date /= 60;
        // counts of min from 00:00 1/01/1970
        int min = (int)(date%60);
        date /= 60;
        // counts of hours from 00:00 1/01/1970
        int hour = (int)(date%24);
        // counts of days from 00:00 1/01/1970
        date /=24;
        System.out.println(date+":"+hour+":"+min+":"+ss);

    }
}
