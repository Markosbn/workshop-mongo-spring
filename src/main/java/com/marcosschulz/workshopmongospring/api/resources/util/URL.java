package com.marcosschulz.workshopmongospring.api.resources.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

//classe utilitaria utilizada para fazer a decodificação de urls codificadas
// (URLs, são codificadas para impedir o uso de caracteres especiais)
public class URL {

    public static String decodeParam(String text){
        try{
            return URLDecoder.decode(text, "UTF-8");
        }
        catch (UnsupportedEncodingException e){
            return "";
        }
    }

    //conversão da data vindo do parametro, em caso de problema lança um valor default
    public static Date convertDate(String textDate, Date defaultValue) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        try {
            return sdf.parse(textDate);
        } catch (ParseException e) {
            return defaultValue;
        }
    }
}
