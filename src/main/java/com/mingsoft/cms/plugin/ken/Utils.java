package com.mingsoft.cms.plugin.ken;

import java.util.List;

import com.mingsoft.util.RegexUtil;

public class Utils {

	public static List<String> parseAll(String source, String regex, int find){
		
		return RegexUtil.parseAll(source, regex, find);
	}
	
}
