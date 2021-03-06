/*
 *  Copyright 1999-2019 Seata.io Group.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package io.seata.server;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * The type parameter parser test
 *
 * @author xingfudeshi@gmail.com
 * @date 2019/05/30
 */
public class ParameterParserTest {
    private static ParameterParser parameterParser = null;

    /**
     * init
     */
    @BeforeAll
    private static void init() {
        String[] args = new String[]{"-h", "127.0.0.1", "-p", "8088", "-m", "file"};
        parameterParser = new ParameterParser(args);
    }

    /**
     * test get host
     */
    @Test
    public void testGetHost() {
        Assertions.assertEquals("127.0.0.1", parameterParser.getHost());
    }

    /**
     * test get port
     */
    @Test
    public void testGetPort() {
        Assertions.assertEquals(8088, parameterParser.getPort());
    }

    /**
     * test get store mode
     */
    @Test
    public void testGetStoreMode() {
        Assertions.assertEquals("file", parameterParser.getStoreMode());
    }

    /**
     * clean up
     */
    @AfterAll
    public static void cleanUp() {
        parameterParser = null;
    }


}
