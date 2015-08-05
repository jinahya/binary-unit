/*
 * Copyright 2015 Jin Kwon &lt;onacit at ermind.co.kr&gt;.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.github.jinahya.util.concurrent;


import static com.github.jinahya.util.concurrent.MetricUnit.a;
import static com.github.jinahya.util.concurrent.MetricUnit.c;
import static com.github.jinahya.util.concurrent.MetricUnit.d;
import static com.github.jinahya.util.concurrent.MetricUnit.f;
import static com.github.jinahya.util.concurrent.MetricUnit.m;
import static com.github.jinahya.util.concurrent.MetricUnit.n;
import static com.github.jinahya.util.concurrent.MetricUnit.p;
import static com.github.jinahya.util.concurrent.MetricUnit.y;
import static com.github.jinahya.util.concurrent.MetricUnit.z;
import static com.github.jinahya.util.concurrent.MetricUnit.μ;
import static java.lang.invoke.MethodHandles.lookup;
import org.slf4j.Logger;
import static org.slf4j.LoggerFactory.getLogger;
import org.testng.annotations.Test;


/**
 *
 * @author Jin Kwon &lt;onacit at ermind.co.kr&gt;
 */
public class MetricUnitTest {


    private static final Logger logger = getLogger(lookup().lookupClass());


    @Test
    public static void test_d() {

        logger.debug("d: {}", d);
        logger.debug("c: {}", c);
        logger.debug("m: {}", m);
        logger.debug("μ: {}", μ);
        logger.debug("n: {}", n);
        logger.debug("p: {}", p);
        logger.debug("f: {}", f);
        logger.debug("a: {}", a);
        logger.debug("z: {}", z);
        logger.debug("y: {}", y);
    }


}

