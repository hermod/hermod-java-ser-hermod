package com.github.hermod.ser.hermod;

import com.github.hermod.ser.impl.DirectBytes;

/**
 * <p>DirectBytesHermodMsg.</p>
 * 
 * @author anavarro - Jan 6, 2014
 * 
 */
public class DirectBytesHermodMsg {

    // TODO to implement
    private DirectBytes directBytes = new DirectBytes();
    
    private int         limit       = 0;
    private int         lastKeyPut  = -1;

    
    
    /**
     * <p>getPosition.</p>
     *
     * @param aKey a key
     * @return the position
     */
    private final int getPosition(final int aKey)
    {
        // Caution, must be very performant (sorry for the lisibility of the code)
        int pos = 0;
        for (int currentKey = 0; currentKey < aKey && pos != this.limit; currentKey++)
        {
//           final int fieldSizeInType = this.bytes[pos] & SIZE_MASK;   
//           pos += (fieldSizeInType != MAX_SIZE_ENCODED_IN_TYPE) ? fieldSizeInType + 1
//                            : (this.bytes[pos++] >= 0) ? this.bytes[pos++]
//                                    : -(((this.bytes[pos++] & 0xFF) << 24) | ((this.bytes[pos++] & 0xFF) << 16) | ((this.bytes[pos++] & 0xFF) << 8) | ((this.bytes[pos++] & 0xFF)));
//                            
        }
        return pos;
    }
}
