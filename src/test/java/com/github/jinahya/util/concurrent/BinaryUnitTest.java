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


import static com.github.jinahya.util.concurrent.BinaryUnit.Ei;
import static com.github.jinahya.util.concurrent.BinaryUnit.Gi;
import static com.github.jinahya.util.concurrent.BinaryUnit.Ki;
import static com.github.jinahya.util.concurrent.BinaryUnit.Mi;
import static com.github.jinahya.util.concurrent.BinaryUnit.Pi;
import static com.github.jinahya.util.concurrent.BinaryUnit.Ti;
import static com.github.jinahya.util.concurrent.BinaryUnit.Yi;
import static com.github.jinahya.util.concurrent.BinaryUnit.Zi;
import static java.lang.invoke.MethodHandles.lookup;
import java.math.BigInteger;
import static java.util.concurrent.ThreadLocalRandom.current;
import org.slf4j.Logger;
import static org.slf4j.LoggerFactory.getLogger;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;


/**
 *
 * @author Jin Kwon &lt;onacit at ermind.co.kr&gt;
 */
public class BinaryUnitTest {


    private static transient Logger logger = getLogger(lookup().lookupClass());


    @Test
    public static void testKi() {

        logger.debug("Ki: {}", Ki);
        assertEquals(Ki.divide(Ki), BigInteger.ONE);
    }


    @Test
    public static void testMi() {

        logger.debug("Mi: {}", Mi);
        assertEquals(Mi.divide(Ki), Ki);
    }


    @Test
    public static void testGi() {

        logger.debug("Gi: {}", Gi);
        assertEquals(Gi.divide(Mi), Ki);
    }


    @Test
    public static void testTi() {

        logger.debug("Ti: {}", Ti);
        assertEquals(Ti.divide(Gi), Ki);
    }


    @Test
    public static void testPi() {

        logger.debug("Pi: {}", Pi);
        assertEquals(Pi.divide(Ti), Ki);
    }


    @Test
    public static void testEi() {

        logger.debug("Ei: {}", Ei);
        assertEquals(Ei.divide(Pi), Ki);
    }


    @Test
    public static void testZi() {

        logger.debug("Zi: {}", Zi);
        assertEquals(Zi.divide(Ei), Ki);
    }


    @Test
    public static void testYi() {

        logger.debug("Yi: {}", Yi);
        assertEquals(Yi.divide(Zi), Ki);
    }


    @Test(enabled = true)
    public void toKibis() {

        final BigInteger expected = BigInteger.valueOf(current().nextInt(128));
        logger.debug("expected: {}", expected);

        for (final BinaryUnit value : BinaryUnit.values()) {
            final BigInteger kibis = value.toKebis(expected);
            logger.debug("{}.toKibis: {}", value, kibis);
        }
    }


    @Test(enabled = true)
    public void toMebis() {

        final BigInteger expected = BigInteger.valueOf(current().nextInt(128));
        logger.debug("expected: {}", expected);

        for (final BinaryUnit value : BinaryUnit.values()) {
            final BigInteger mebis = value.toMebis(expected);
            logger.debug("{}.toMibis: {}", value, mebis);
        }
    }


    @Test(enabled = true)
    public void toGibis() {

        final BigInteger expected = BigInteger.valueOf(current().nextInt(128));
        logger.debug("expected: {}", expected);

        for (final BinaryUnit value : BinaryUnit.values()) {
            final BigInteger gibis = value.toGibis(expected);
            logger.debug("{}.toGibis: {}", value, gibis);
        }
    }


    @Test(enabled = true)
    public void toTebis() {

        final BigInteger expected = BigInteger.valueOf(current().nextInt(128));
        logger.debug("expected: {}", expected);

        for (final BinaryUnit value : BinaryUnit.values()) {
            final BigInteger tebis = value.toTebis(expected);
            logger.debug("{}.toTebis: {}", value, tebis);
        }
    }


    @Test(enabled = true)
    public void toPebis() {

        final BigInteger expected = BigInteger.valueOf(current().nextInt(128));
        logger.debug("expected: {}", expected);

        for (final BinaryUnit value : BinaryUnit.values()) {
            final BigInteger pebis = value.toPebis(expected);
            logger.debug("{}.toPebis: {}", value, pebis);
        }
    }


    @Test(enabled = true)
    public void toExbis() {

        final BigInteger expected = BigInteger.valueOf(current().nextInt(128));
        logger.debug("expected: {}", expected);

        for (final BinaryUnit value : BinaryUnit.values()) {
            final BigInteger exbis = value.toExbis(expected);
            logger.debug("{}.toExbis: {}", value, exbis);
        }
    }


    @Test(enabled = true)
    public void toZebis() {

        final BigInteger expected = BigInteger.valueOf(current().nextInt(128));
        logger.debug("expected: {}", expected);

        for (final BinaryUnit value : BinaryUnit.values()) {
            final BigInteger zebis = value.toZebis(expected);
            logger.debug("{}.toZebis: {}", value, zebis);
        }
    }


    @Test(enabled = true)
    public void toYobis() {

        final BigInteger expected = BigInteger.valueOf(current().nextInt(128));
        logger.debug("expected: {}", expected);

        for (final BinaryUnit value : BinaryUnit.values()) {
            final BigInteger yobis = value.toYobis(expected);
            logger.debug("{}.toYobis: {}", value, yobis);
        }
    }


}

