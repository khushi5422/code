package basic;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DATE {
    public static void main(String[] args) throws ParseException {
        String date = "09/12/2002";
        System.out.println("before formatting"+ date);
        SimpleDateFormat dateTimeFormatter_before =new  SimpleDateFormat("dd/mm/yyyy");
        Date before_date =  dateTimeFormatter_before.parse(date);
        SimpleDateFormat dateTimeFormatter = new SimpleDateFormat("EEE-dd-yyyy");
        String formateddate = dateTimeFormatter.format(dateTimeFormatter_before.parse(date));
        System.out.println("formatted date"+ formateddate);//Mon 09 2002



    }
}
