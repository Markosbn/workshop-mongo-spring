package com.marcosschulz.workshopmongospring.api.resources.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

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
}
