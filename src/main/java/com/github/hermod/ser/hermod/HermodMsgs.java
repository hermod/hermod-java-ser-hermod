package com.github.hermod.ser.hermod;

import com.github.hermod.ser.impl.Msgs;

/**
 * IntMapConstants.
 * 
 * @author anavarro - Dec 15, 2011
 * 
 */
public final class HermodMsgs {
    /**
     * Constructor.
     * 
     */
    private HermodMsgs() {
    }

    // // byte / boolean
    // static final byte BYTE_TYPE = (byte) (Types.INTEGER_TYPE | ONE);
    //
    // // short
    // static final byte SHORT_TYPE = (byte) (Types.INTEGER_TYPE | TWO);
    //
    // // int
    // static final byte INT_TYPE = (byte) (Types.INTEGER_TYPE | FOUR);
    //
    // // long
    // static final byte LONG_TYPE = (byte) (Types.INTEGER_TYPE | EIGHT);
    //
    // // float / double or double encoded on 5 bits
    // static final byte TYPE_DECIMAL = Type.DECIMAL.getId();
    //
    // // float
    // static final byte FLOAT_TYPE = (byte) (Types.DECIMAL_TYPE | FOUR);
    //
    // // double
    // static final byte DOUBLE_TYPE = (byte) (Types.DECIMAL_TYPE | EIGHT);
    //
    // // double (encoded on 3 bits)
    // static final byte THREE_BITS_DECIMAL_TYPE = (byte) (Types.DECIMAL_TYPE | THREE);
    //
    // // double (encoded on 5 bits)
    // static final byte FIVE_BITS_DECIMAL_TYPE = (byte) (Types.DECIMAL_TYPE | FIVE);

    // Length is implemented as
    // 1-29, the length is in the last 5 bits of the type
    // 30, the length is on next bytes (as litte endian byte)
    // 31, the length is on next 4 bytes (as litte endian int)

    // Size = 0 on the last 5 bites of type, null value
    // Size = 0 on the next byte (Empty value like "" for String)

    /**
     * LENGTH_MASK.
     */
    static final byte LENGTH_MASK                        = (byte) 0x1F;

    /**
     * MAX_VALUE_FOR_UNSIGNED_BYTE.
     */
    // static final int MAX_VALUE_FOR_UNSIGNED_BYTE = 255;

    /**
     * LENGTH_ENCODED_IN_AN_UNSIGNED_BYTE.
     */
    static final int  LENGTH_ENCODED_IN_AN_UNSIGNED_BYTE = LENGTH_MASK - Msgs.ONE;

    /**
     * LENGTH_ENCODED_IN_AN_INT.
     */
    static final int  LENGTH_ENCODED_IN_AN_INT           = LENGTH_MASK;

}
