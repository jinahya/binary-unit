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
public enum MetricUnit {


    KILO {

            @Override
            public BigInteger toKilos(final BigInteger amount) {

                return amount;
            }


            @Override
            public BigInteger toMegas(final BigInteger amount) {

                return amount.divide(M.divide(k));
            }


            @Override
            public BigInteger toGigas(final BigInteger amount) {

                return amount.divide(G.divide(k));
            }


            @Override
            public BigInteger toTeras(final BigInteger amount) {

                return amount.divide(T.divide(k));
            }


            @Override
            public BigInteger toPetas(final BigInteger amount) {

                return amount.divide(P.divide(k));
            }


            @Override
            public BigInteger toExas(final BigInteger amount) {

                return amount.divide(E.divide(k));
            }


            @Override
            public BigInteger toZettas(final BigInteger amount) {

                return amount.divide(Z.divide(k));
            }


            @Override
            public BigInteger toYottas(final BigInteger amount) {

                return amount.divide(Y.divide(k));
            }


            @Override
            public BigInteger convert(final BigInteger sourceAmount,
                                      final MetricUnit sourceUnit) {

                return sourceUnit.toKilos(sourceAmount);
            }

        },
    /**
     *
     */
    MEGA {

            @Override
            public BigInteger toKilos(final BigInteger amount) {

                return amount.multiply(M.divide(k));
            }


            @Override
            public BigInteger toMegas(final BigInteger amount) {

                return amount;
            }


            @Override
            public BigInteger toGigas(final BigInteger amount) {

                return amount.divide(G.divide(M));
            }


            @Override
            public BigInteger toTeras(final BigInteger amount) {

                return amount.divide(T.divide(M));
            }


            @Override
            public BigInteger toPetas(final BigInteger amount) {

                return amount.divide(P.divide(M));
            }


            @Override
            public BigInteger toExas(final BigInteger amount) {

                return amount.divide(E.divide(M));
            }


            @Override
            public BigInteger toZettas(final BigInteger amount) {

                return amount.divide(Z.divide(M));
            }


            @Override
            public BigInteger toYottas(final BigInteger amount) {

                return amount.divide(Y.divide(M));
            }


            @Override
            public BigInteger convert(final BigInteger sourceAmount,
                                      final MetricUnit sourceUnit) {

                return sourceUnit.toMegas(sourceAmount);
            }

        },
    GIGA {

            @Override
            public BigInteger toKilos(final BigInteger amount) {

                return amount.multiply(G.divide(k));
            }


            @Override
            public BigInteger toMegas(final BigInteger amount) {

                return amount.multiply(G.divide(M));
            }


            @Override
            public BigInteger toGigas(final BigInteger amount) {

                return amount;
            }


            @Override
            public BigInteger toTeras(final BigInteger amount) {

                return amount.divide(T.divide(G));
            }


            @Override
            public BigInteger toPetas(final BigInteger amount) {

                return amount.divide(P.divide(G));
            }


            @Override
            public BigInteger toExas(final BigInteger amount) {

                return amount.divide(E.divide(G));
            }


            @Override
            public BigInteger toZettas(final BigInteger amount) {

                return amount.divide(Z.divide(G));
            }


            @Override
            public BigInteger toYottas(final BigInteger amount) {

                return amount.divide(Y.divide(G));
            }


            @Override
            public BigInteger convert(final BigInteger sourceAmount,
                                      final MetricUnit sourceUnit) {

                return sourceUnit.toGigas(sourceAmount);
            }

        },
    TERA {

            @Override
            public BigInteger toKilos(final BigInteger amount) {

                return amount.multiply(T.divide(k));
            }


            @Override
            public BigInteger toMegas(final BigInteger amount) {

                return amount.multiply(T.divide(M));
            }


            @Override
            public BigInteger toGigas(final BigInteger amount) {

                return amount.multiply(T.divide(G));
            }


            @Override
            public BigInteger toTeras(final BigInteger amount) {

                return amount;
            }


            @Override
            public BigInteger toPetas(final BigInteger amount) {

                return amount.divide(P.divide(T));
            }


            @Override
            public BigInteger toExas(final BigInteger amount) {

                return amount.divide(E.divide(T));
            }


            @Override
            public BigInteger toZettas(final BigInteger amount) {

                return amount.divide(Z.divide(T));
            }


            @Override
            public BigInteger toYottas(final BigInteger amount) {

                return amount.divide(Y.divide(T));
            }


            @Override
            public BigInteger convert(final BigInteger sourceAmount,
                                      final MetricUnit sourceUnit) {

                return sourceUnit.toTeras(sourceAmount);
            }

        },
    PETA {

            @Override
            public BigInteger toKilos(final BigInteger amount) {

                return amount.multiply(P.divide(k));
            }


            @Override
            public BigInteger toMegas(final BigInteger amount) {

                return amount.multiply(P.divide(M));
            }


            @Override
            public BigInteger toGigas(final BigInteger amount) {

                return amount.multiply(P.divide(G));
            }


            @Override
            public BigInteger toTeras(final BigInteger amount) {

                return amount.multiply(P.divide(T));
            }


            @Override
            public BigInteger toPetas(final BigInteger amount) {

                return amount;
            }


            @Override
            public BigInteger toExas(final BigInteger amount) {

                return amount.divide(E.divide(P));
            }


            @Override
            public BigInteger toZettas(final BigInteger amount) {

                return amount.divide(Z.divide(P));

            }


            @Override
            public BigInteger toYottas(final BigInteger amount) {

                return amount.divide(Y.divide(P));
            }


            @Override
            public BigInteger convert(final BigInteger sourceAmount,
                                      final MetricUnit sourceUnit) {

                return sourceUnit.toPetas(sourceAmount);
            }

        },
    EXA {

            @Override
            public BigInteger toKilos(final BigInteger amount) {

                return amount.multiply(E.divide(k));
            }


            @Override
            public BigInteger toMegas(final BigInteger amount) {

                return amount.multiply(E.divide(M));
            }


            @Override
            public BigInteger toGigas(final BigInteger amount) {

                return amount.multiply(E.divide(G));
            }


            @Override
            public BigInteger toTeras(final BigInteger amount) {

                return amount.multiply(E.divide(T));
            }


            @Override
            public BigInteger toPetas(final BigInteger amount) {

                return amount.multiply(E.divide(P));
            }


            @Override
            public BigInteger toExas(final BigInteger amount) {

                return amount;
            }


            @Override
            public BigInteger toZettas(final BigInteger amount) {

                return amount.divide(Z.divide(E));
            }


            @Override
            public BigInteger toYottas(final BigInteger amount) {

                return amount.divide(Y.divide(E));
            }


            @Override
            public BigInteger convert(final BigInteger sourceAmount,
                                      final MetricUnit sourceUnit) {

                return sourceUnit.toExas(sourceAmount);
            }

        },
    ZETTA {

            @Override
            public BigInteger toKilos(final BigInteger amount) {

                return amount.multiply(Z.divide(k));
            }


            @Override
            public BigInteger toMegas(final BigInteger amount) {

                return amount.multiply(Z.divide(M));
            }


            @Override
            public BigInteger toGigas(final BigInteger amount) {

                return amount.multiply(Z.divide(G));
            }


            @Override
            public BigInteger toTeras(final BigInteger amount) {

                return amount.multiply(Z.divide(T));
            }


            @Override
            public BigInteger toPetas(final BigInteger amount) {

                return amount.multiply(Z.divide(P));
            }


            @Override
            public BigInteger toExas(final BigInteger amount) {

                return amount.multiply(Z.divide(E));
            }


            @Override
            public BigInteger toZettas(final BigInteger amount) {

                return amount;
            }


            @Override
            public BigInteger toYottas(final BigInteger amount) {

                return amount.divide(Y.divide(Z));
            }


            @Override
            public BigInteger convert(final BigInteger sourceAmount,
                                      final MetricUnit sourceUnit) {

                return sourceUnit.toZettas(sourceAmount);
            }

        },
    YOTTA {

            @Override
            public BigInteger toKilos(final BigInteger amount) {

                return amount.multiply(Y.divide(k));
            }


            @Override
            public BigInteger toMegas(final BigInteger amount) {

                return amount.multiply(Y.divide(M));
            }


            @Override
            public BigInteger toGigas(final BigInteger amount) {

                return amount.multiply(Y.divide(G));
            }


            @Override
            public BigInteger toTeras(final BigInteger amount) {

                return amount.multiply(Y.divide(T));
            }


            @Override
            public BigInteger toPetas(final BigInteger amount) {

                return amount.multiply(Y.divide(P));
            }


            @Override
            public BigInteger toExas(final BigInteger amount) {

                return amount.multiply(Y.divide(E));
            }


            @Override
            public BigInteger toZettas(final BigInteger amount) {

                return amount.multiply(Y.divide(Z));
            }


            @Override
            public BigInteger toYottas(final BigInteger amount) {

                return amount;
            }


            @Override
            public BigInteger convert(final BigInteger sourceAmount,
                                      final MetricUnit sourceUnit) {

                return sourceUnit.toYottas(sourceAmount);
            }

        };


    static final BigInteger k = BigInteger.valueOf(1000L);


    static final BigInteger M = k.multiply(k);


    static final BigInteger G = M.multiply(k);


    static final BigInteger T = G.multiply(k);


    static final BigInteger P = T.multiply(k);


    static final BigInteger E = P.multiply(k);


    static final BigInteger Z = E.multiply(k);


    static final BigInteger Y = Z.multiply(k);


    public abstract BigInteger toKilos(BigInteger amount);


    public abstract BigInteger toMegas(BigInteger amount);


    public abstract BigInteger toGigas(BigInteger amount);


    public abstract BigInteger toTeras(BigInteger amount);


    public abstract BigInteger toPetas(BigInteger amount);


    public abstract BigInteger toExas(BigInteger amount);


    public abstract BigInteger toZettas(BigInteger amount);


    public abstract BigInteger toYottas(BigInteger amount);


    public abstract BigInteger convert(BigInteger sourceAmount,
                                       MetricUnit sourceUnit);


}

