/**
The MIT License (MIT) * Copyright (c) 2018 铭飞科技(mingsoft.net)

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

package com.mingsoft.cms.util;

import java.util.Arrays;

import cn.hutool.core.util.ArrayUtil;


/**
 * 
 * @ClassName:  ArrysUtil   
 * @Description:TODO(数组工具类)   
 * @author: 铭飞开发团队
 * @date:   2018年4月20日 下午17:02:00   
 *     
 * @Copyright: 2018 www.mingsoft.net Inc. All rights reserved.
 */
public class ArrysUtil {
	/**
	 * 降序排序
	 * @param str
	 * @param delimiter
	 * 			分隔符
	 * @return
	 */
	public static String sort(String str,String delimiter){
		String[] articleTypeArrays = str.split(delimiter);
		Arrays.sort(articleTypeArrays);
		return ArrayUtil.join(articleTypeArrays, delimiter);
	}
}
