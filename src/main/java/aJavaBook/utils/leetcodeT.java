package aJavaBook.utils;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by hanjiangyu on 2016/10/11.
 */
public class leetcodeT {

    private static final Logger LOG = LoggerFactory.getLogger(leetcodeT.class);

    public static void main(String[] args){
        LOG.info("111");
        String a="";
        System.out.println(StringUtils.isNotBlank(a));
        System.out.println(a.length()>0);
        System.out.println(a==null);
    }


}
