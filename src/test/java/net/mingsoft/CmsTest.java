package net.mingsoft;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.mingsoft.base.test.BaseTest;
import com.mingsoft.util.RegexUtil;

public class CmsTest extends BaseTest {

	private final static String CHANNEL_PROPERTY = "\\{ms:channel(.*)?\\}";

	public static void main(String[] args) {

		int find = 1;

		String source = "{ms:channel num=1 if((1,==,3)?ok:no) if((1,==,3)?ok:no) isHot=true x=9 y=1}";

		String content = null;

		Pattern pattern = Pattern.compile(CHANNEL_PROPERTY);
		Matcher matcher = pattern.matcher(source);
		if (matcher.find()) {
			content = matcher.group(find);
		}

		System.out.println(content);
		System.out.println();

		List<String> listPropertyName = RegexUtil.parseAll(content, "(\\w+)\\s*=", 1);
		List<String> listPropertyValue = RegexUtil.parseAll(content, "=\\s*(\\w+)", 1);
		List<String> conditions = RegexUtil.parseAll(content, "if\\(.*?\\)", 0);

		System.out.println(conditions);
		
		for(int i=0;i<listPropertyName.size();i++) {
			
			System.out.println(listPropertyName.get(i)+":"+listPropertyValue.get(i));
		}
		
	}
}
