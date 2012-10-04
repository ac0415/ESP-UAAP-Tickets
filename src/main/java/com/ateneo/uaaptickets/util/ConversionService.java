package com.foo.tweeter.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.support.FormattingConversionServiceFactoryBean;
import org.springframework.stereotype.Component;

@Component("conversionService")
public class ConversionService extends FormattingConversionServiceFactoryBean 
{
	
	@Override
	public void installFormatters(FormatterRegistry registry) 
	{
		super.installFormatters(registry);
		registry.addConverter(getStringToDateConverter());
		registry.addConverter(getDateToStringConverter());
	}

	// Format: mm/dd/yyyy
	// Translates an incoming string to a given date
	public Converter<String, Date> getStringToDateConverter()
	{
		return new Converter<String, Date>() {
			@Override
			public Date convert(String source) {
				try {
					
					return new SimpleDateFormat("mm/dd/yyyy").parse(source);
				} catch(Exception e) {
					e.printStackTrace();
					
					return null;
				}
			}
		};
	}
	
	// Format: mm/dd/yyyy
	// Translates an incoming Date to a given String
	public Converter<Date, String> getDateToStringConverter()
	{
		return new Converter<Date, String>() {
			@Override
			public String convert(Date source) {
				try {
					
					return new SimpleDateFormat("mm/dd/yyyy").format(source);
				} catch(Exception e) {
					e.printStackTrace();
					
					return null;
				}
			}
		};
	}
}