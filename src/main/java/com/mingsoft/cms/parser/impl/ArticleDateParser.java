/**
The MIT License (MIT) * Copyright (c) 2016 铭飞科技(mingsoft.net)

 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:

 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.

 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.mingsoft.cms.parser.impl;

import java.util.Date;

import com.mingsoft.parser.IParser;
import com.mingsoft.parser.IParserRegexConstant;
/**
 * 
 * @ClassName:  ArticleDateParser   
 * @Description:TODO(内容发布时间(单标签))   
 * @author: 铭飞开发团队
 * @date:   2018年1月31日 下午2:56:53   
 *     
 * @Copyright: 2018 www.mingsoft.net Inc. All rights reserved.
 */
public class ArticleDateParser extends IParser {
	
	/**
	 * 文章发布时间标签
	 */
	private final static String ARTICLE_DATE_FIELD="\\{ms:field.date\\s{0,}(fmt=(.*?))?/}";
	
	
	/**
	 * 构造标签的属性
	 * @param htmlContent原HTML代码
	 * @param newContent替换的内容
	 */
	public ArticleDateParser(String htmlContent,Date newContent){
		super.htmlCotent = htmlContent;
		super.newCotent = date(newContent, htmlContent);
	}
	
	@Override
	public String parse() {
		// TODO Auto-generated method stub
		return super.replaceAll(ARTICLE_DATE_FIELD);
	}
	
	/**
	 * 将时间格式转换成字符串型并改变时间的显示格式
	 * @param date 数据库中的时间
	 * @param htmlCotent 读取时间格式的HTML代码
	 * @return 时间
	 */
	private String date(Date date,String htmlCotent){
		//从HTML代码中取出时间的显示格式，默认为yyyy-MM-dd hh:mm:ss形式
		String typeDate = IParserRegexConstant.REGEX_DATE;
		String fmt = parseFirst(htmlCotent,ARTICLE_DATE_FIELD, 2);
		if(fmt!= null){
			typeDate = fmt;
		}
		//将时间转换成String型
		String srtDate = IParserRegexConstant.REGEX_DATE_ERRO;
		if(date != null){
			try{
				java.text.SimpleDateFormat forDate = new java.text.SimpleDateFormat(typeDate);
				srtDate = forDate.format(date);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		return srtDate;
	}

}