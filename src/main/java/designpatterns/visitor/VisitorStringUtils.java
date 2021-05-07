package designpatterns.visitor;

import org.apache.commons.lang.StringUtils;


public class VisitorStringUtils {

    public static VisitorStringUtils newInstance() {
        return new VisitorStringUtils();
    }

    private VisitorStringUtils() {
    }

    public String getEmptyString(int length) {
        return StringUtils.leftPad(StringUtils.EMPTY,length);
    }
}
