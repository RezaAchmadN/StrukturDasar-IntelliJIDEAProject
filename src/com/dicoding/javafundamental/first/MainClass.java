package com.dicoding.javafundamental.first;

import com.dicoding.javafundamental.first.kendaraan.BanBajay;
import com.dicoding.javafundamental.first.kendaraan.BanMobil;
import com.dicoding.javafundamental.first.kendaraan.BanMotor;
import com.dicoding.javafundamental.first.sound.SuaraGitar;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class MainClass {
    public static void main (String[] args){
        helloworld();
        bankendaraan();
        tanggal();

    }public static void helloworld(){
        System.out.println("Hello, World!");
        SuaraGitar.bunyi();
    }

    public static void bankendaraan(){
        BanBajay.jumlah();
        BanMotor.jumlah();
        BanMobil.jumlah();
    }

    public static void tanggal(){
        Date sekarang = new Date();
        System.out.println("Hari ini = "+sekarang);
        Date besok = DateUtils.addDays(sekarang,2);
        System.out.println("lusa = "+besok);
        Date duajamlagi = DateUtils.addHours(sekarang,2);
        System.out.println("2 jam lagi = "+duajamlagi);
    }

}
