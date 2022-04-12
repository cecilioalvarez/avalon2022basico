package es.avalon.excepciones.Ejemplo3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Principal {
    public static void main(String[] args) {
        GestordeFechas gestor= new GestordeFechas();
        System.out.println(gestor.sumaDias("10/01/2022","11/01/2022","12/01/2022"));
    }



    }

