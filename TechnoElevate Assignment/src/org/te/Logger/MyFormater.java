package org.te.Logger;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class MyFormater  extends Formatter{

	@Override
	public String format(LogRecord arg0) {
		return arg0.getLoggerName()+","+arg0.getMessage()+","+arg0.getMillis()+arg0.getSourceClassName();
	}

}
