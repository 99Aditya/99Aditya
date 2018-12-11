package com.od.utill;

import java.util.Date;

public class DateUtill {
public static Date ConvertStringtoDate(String d)
{
	Date date=null;
	if(d!=null)
	{
		date=java.sql.Date.valueOf(d);
	}
	return date;
	}
}
