package com.pinker.convert;

import org.springframework.core.convert.converter.Converter;

import java.sql.Date;

public class DateConvert implements Converter<String,Date> {

    @Override
    public Date convert(String s) {
        try {

            return Date.valueOf(s);
        }catch (Exception e){

            return null;
        }
    }
}
