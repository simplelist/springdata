package com.kun.util;

import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;

/**
 * Created by kun on 2017/4/21.
 */
public class JDBCUtilTest {
    @Test
    public void test() throws Exception {
        Connection connection=JDBCUtil.getConnection();
        Assert.assertNotNull(connection);
    }


}
