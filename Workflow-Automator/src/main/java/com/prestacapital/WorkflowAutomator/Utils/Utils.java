package com.prestacapital.WorkflowAutomator.Utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.function.Function;

public  class Utils {

    public  static final String URL = "http://localhost:8090/approvals";
    public static Date getCurrentDateTime(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        return cal.getTime();

    }

   /* public static Function<Void, Date> getCurrentDateTime = date -> {
        Calendar cal = Calendar.getInstance();
        return cal.getTime();
    };*/

}
