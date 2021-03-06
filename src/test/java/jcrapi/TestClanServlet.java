/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jcrapi;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Michael Lieshoff
 */
public class TestClanServlet extends TestJsonFileServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String parameter = getRestTagParameter(req);
        String filename = null;
        if ("tracking".equals(parameter)) {
            filename = "src/test/java/jcrapi/clanTracking.json";
        } else if ("battles".equals(parameter)) {
            filename = "src/test/java/jcrapi/clanBattles.json";
        } else if ("history".equals(parameter)) {
            filename = "src/test/java/jcrapi/clanHistory.json";
        } else if ("2CCCP".equals(parameter)) {
            filename = "src/test/java/jcrapi/clan.json";
        } else if ("2CCCP,2U2GGQJ".equals(parameter)) {
            filename = "src/test/java/jcrapi/multiClans.json";
        }
        super.doGet(filename, req, resp);
    }

}
