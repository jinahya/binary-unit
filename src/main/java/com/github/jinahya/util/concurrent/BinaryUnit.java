/*
 * Copyright 2015 Jin Kwon &lt;onacit at gmail.com&gt;.
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


import java.math.BigInteger;


/**
 *
 * @author Jin Kwon &lt;onacit at gmail.com&gt;
 */
public enum BinaryUnit {


    /**
     *
     */
    KIBI {

            @Override
            public BigInteger toKebis(final BigInteger amount) {

                return amount;
            }


            @Override
            public BigInteger toMebis(final BigInteger amount) {

                return amount.divide(Mi.divide(Ki));
            }


            @Override
            public BigInteger toGibis(final BigInteger amount) {

                return amount.divide(Gi.divide(Ki));
            }


            @Override
            public BigInteger toTebis(final BigInteger amount) {

                return amount.divide(Ti.divide(Ki));
            }


            @Override
            public BigInteger toPebis(final BigInteger amount) {

                return amount.divide(Pi.divide(Ki));
            }


            @Override
            public BigInteger toExbis(final BigInteger amount) {

                return amount.divide(Ei.divide(Ki));
            }


            @Override
            public BigInteger toZebis(final BigInteger amount) {

                return amount.divide(Zi.divide(Ki));
            }


            @Override
            public BigInteger toYobis(final BigInteger amount) {

                return amount.divide(Yi.divide(Ki));
            }


            @Override
            public BigInteger convert(final BigInteger sourceAmount,
                                      final BinaryUnit sourceUnit) {

                return sourceUnit.toKebis(sourceAmount);
            }

        },
    /**
     *
     */
    MEBI {

            @Override
            public BigInteger toKebis(final BigInteger amount) {

                System.out.println("MEBI.toKebis(" + amount + ")");

                return amount.multiply(Mi.divide(Ki));
            }


            @Override
            public BigInteger toMebis(final BigInteger amount) {

                return amount;
            }


            @Override
            public BigInteger toGibis(final BigInteger amount) {

                return amount.divide(Gi.divide(Mi));
            }


            @Override
            public BigInteger toTebis(final BigInteger amount) {

                return amount.divide(Ti.divide(Mi));
            }


            @Override
            public BigInteger toPebis(final BigInteger amount) {

                return amount.divide(Pi.divide(Mi));
            }


            @Override
            public BigInteger toExbis(final BigInteger amount) {

                return amount.divide(Ei.divide(Mi));
            }


            @Override
            public BigInteger toZebis(final BigInteger amount) {

                return amount.divide(Zi.divide(Mi));
            }


            @Override
            public BigInteger toYobis(final BigInteger amount) {

                return amount.divide(Yi.divide(Mi));
            }


            @Override
            public BigInteger convert(final BigInteger sourceAmount,
                                      final BinaryUnit sourceUnit) {

                return sourceUnit.toMebis(sourceAmount);
            }

        },
    GIBI {

            @Override
            public BigInteger toKebis(final BigInteger amount) {

                return amount.multiply(Gi.divide(Ki));
            }


            @Override
            public BigInteger toMebis(final BigInteger amount) {

                return amount.multiply(Gi.divide(Mi));
            }


            @Override
            public BigInteger toGibis(final BigInteger amount) {

                return amount;
            }


            @Override
            public BigInteger toTebis(final BigInteger amount) {

                return amount.divide(Ti.divide(Gi));
            }


            @Override
            public BigInteger toPebis(final BigInteger amount) {

                return amount.divide(Pi.divide(Gi));
            }


            @Override
            public BigInteger toExbis(final BigInteger amount) {

                return amount.divide(Ei.divide(Gi));
            }


            @Override
            public BigInteger toZebis(final BigInteger amount) {

                return amount.divide(Zi.divide(Gi));
            }


            @Override
            public BigInteger toYobis(final BigInteger amount) {

                return amount.divide(Yi.divide(Gi));
            }


            @Override
            public BigInteger convert(final BigInteger sourceAmount,
                                      final BinaryUnit sourceUnit) {

                return sourceUnit.toGibis(sourceAmount);
            }

        },
    TEBI {

            @Override
            public BigInteger toKebis(final BigInteger amount) {

                return amount.multiply(Ti.divide(Ki));
            }


            @Override
            public BigInteger toMebis(final BigInteger amount) {

                return amount.multiply(Ti.divide(Mi));
            }


            @Override
            public BigInteger toGibis(final BigInteger amount) {

                return amount.multiply(Ti.divide(Gi));
            }


            @Override
            public BigInteger toTebis(final BigInteger amount) {

                return amount;
            }


            @Override
            public BigInteger toPebis(final BigInteger amount) {

                return amount.divide(Pi.divide(Ti));
            }


            @Override
            public BigInteger toExbis(final BigInteger amount) {

                return amount.divide(Ei.divide(Ti));
            }


            @Override
            public BigInteger toZebis(final BigInteger amount) {

                return amount.divide(Zi.divide(Ti));
            }


            @Override
            public BigInteger toYobis(final BigInteger amount) {

                return amount.divide(Yi.divide(Ti));
            }


            @Override
            public BigInteger convert(final BigInteger sourceAmount,
                                      final BinaryUnit sourceUnit) {

                return sourceUnit.toTebis(sourceAmount);
            }

        },
    PEBI {

            @Override
            public BigInteger toKebis(final BigInteger amount) {

                return amount.multiply(Pi.divide(Ki));
            }


            @Override
            public BigInteger toMebis(final BigInteger amount) {

                return amount.multiply(Pi.divide(Mi));
            }


            @Override
            public BigInteger toGibis(final BigInteger amount) {

                return amount.multiply(Pi.divide(Gi));
            }


            @Override
            public BigInteger toTebis(final BigInteger amount) {

                return amount.multiply(Pi.divide(Ti));
            }


            @Override
            public BigInteger toPebis(final BigInteger amount) {

                return amount;
            }


            @Override
            public BigInteger toExbis(final BigInteger amount) {

                return amount.divide(Ei.divide(Pi));
            }


            @Override
            public BigInteger toZebis(final BigInteger amount) {

                return amount.divide(Zi.divide(Pi));

            }


            @Override
            public BigInteger toYobis(final BigInteger amount) {

                return amount.divide(Yi.divide(Pi));
            }


            @Override
            public BigInteger convert(final BigInteger sourceAmount,
                                      final BinaryUnit sourceUnit) {

                return sourceUnit.toPebis(sourceAmount);
            }

        },
    EXBI {

            @Override
            public BigInteger toKebis(final BigInteger amount) {

                return amount.multiply(Ei.divide(Ki));
            }


            @Override
            public BigInteger toMebis(final BigInteger amount) {

                return amount.multiply(Ei.divide(Mi));
            }


            @Override
            public BigInteger toGibis(final BigInteger amount) {

                return amount.multiply(Ei.divide(Gi));
            }


            @Override
            public BigInteger toTebis(final BigInteger amount) {

                return amount.multiply(Ei.divide(Ti));
            }


            @Override
            public BigInteger toPebis(final BigInteger amount) {

                return amount.multiply(Ei.divide(Pi));
            }


            @Override
            public BigInteger toExbis(final BigInteger amount) {

                return amount;
            }


            @Override
            public BigInteger toZebis(final BigInteger amount) {

                return amount.divide(Zi.divide(Ei));
            }


            @Override
            public BigInteger toYobis(final BigInteger amount) {

                return amount.divide(Yi.divide(Ei));
            }


            @Override
            public BigInteger convert(final BigInteger sourceAmount,
                                      final BinaryUnit sourceUnit) {

                return sourceUnit.toExbis(sourceAmount);
            }

        },
    ZEBI {

            @Override
            public BigInteger toKebis(final BigInteger amount) {

                return amount.multiply(Zi.divide(Ki));
            }


            @Override
            public BigInteger toMebis(final BigInteger amount) {

                return amount.multiply(Zi.divide(Mi));
            }


            @Override
            public BigInteger toGibis(final BigInteger amount) {

                return amount.multiply(Zi.divide(Gi));
            }


            @Override
            public BigInteger toTebis(final BigInteger amount) {

                return amount.multiply(Zi.divide(Ti));
            }


            @Override
            public BigInteger toPebis(final BigInteger amount) {

                return amount.multiply(Zi.divide(Pi));
            }


            @Override
            public BigInteger toExbis(final BigInteger amount) {

                return amount.multiply(Zi.divide(Ei));
            }


            @Override
            public BigInteger toZebis(final BigInteger amount) {

                return amount;
            }


            @Override
            public BigInteger toYobis(final BigInteger amount) {

                return amount.divide(Yi.divide(Zi));
            }


            @Override
            public BigInteger convert(final BigInteger sourceAmount,
                                      final BinaryUnit sourceUnit) {

                return sourceUnit.toZebis(sourceAmount);
            }

        },
    YOBI {

            @Override
            public BigInteger toKebis(final BigInteger amount) {

                return amount.multiply(Yi.divide(Ki));
            }


            @Override
            public BigInteger toMebis(final BigInteger amount) {

                return amount.multiply(Yi.divide(Mi));
            }


            @Override
            public BigInteger toGibis(final BigInteger amount) {

                return amount.multiply(Yi.divide(Gi));
            }


            @Override
            public BigInteger toTebis(final BigInteger amount) {

                return amount.multiply(Yi.divide(Ti));
            }


            @Override
            public BigInteger toPebis(final BigInteger amount) {

                return amount.multiply(Yi.divide(Pi));
            }


            @Override
            public BigInteger toExbis(final BigInteger amount) {

                return amount.multiply(Yi.divide(Ei));
            }


            @Override
            public BigInteger toZebis(final BigInteger amount) {

                return amount.multiply(Yi.divide(Zi));
            }


            @Override
            public BigInteger toYobis(final BigInteger amount) {

                return amount;
            }


            @Override
            public BigInteger convert(final BigInteger sourceAmount,
                                      final BinaryUnit sourceUnit) {

                return sourceUnit.toYobis(sourceAmount);
            }

        };


    static final BigInteger Ki = BigInteger.valueOf(1024L);


    static final BigInteger Mi = Ki.multiply(Ki);


    static final BigInteger Gi = Mi.multiply(Ki);


    static final BigInteger Ti = Gi.multiply(Ki);


    static final BigInteger Pi = Ti.multiply(Ki);


    static final BigInteger Ei = Pi.multiply(Ki);


    static final BigInteger Zi = Ei.multiply(Ki);


    static final BigInteger Yi = Zi.multiply(Ki);


    public abstract BigInteger toKebis(BigInteger amount);


    public abstract BigInteger toMebis(BigInteger amount);


    public abstract BigInteger toGibis(BigInteger amount);


    public abstract BigInteger toTebis(BigInteger amount);


    public abstract BigInteger toPebis(BigInteger amount);


    public abstract BigInteger toExbis(BigInteger amount);


    public abstract BigInteger toZebis(BigInteger amount);


    public abstract BigInteger toYobis(BigInteger amount);


    public abstract BigInteger convert(BigInteger sourceAmount,
                                       BinaryUnit sourceUnit);


}

