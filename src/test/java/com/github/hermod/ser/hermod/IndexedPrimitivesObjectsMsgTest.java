package com.github.hermod.ser.hermod;

import com.github.hermod.ser.ByteBufferMsgSerializer;
import com.github.hermod.ser.BytesMsgSerializer;
import com.github.hermod.ser.Msg;
import com.github.hermod.ser.impl.AbstractMsgTest;

/**
 * KeyObjectMsgTest.
 * 
 * @author anavarro - Jan 20, 2013
 * 
 */
public final class IndexedPrimitivesObjectsMsgTest extends AbstractMsgTest {

    /**
     * Constructor.
     * 
     */
    public IndexedPrimitivesObjectsMsgTest() {
        super();
    }

    /**
     * (non-Javadoc)
     * 
     * @see com.github.hermod.ser.impl.AbstractMsgTest#newMsg()
     */
    @Override
    public Msg createMsg() {
        return IndexedPrimitivesObjectsHermodMsg.create();
    }

    /**
     * (non-Javadoc)
     * 
     * @see com.github.hermod.ser.impl.AbstractMsgTest#createBytesMsgSerializer()
     */
    @Override
    public BytesMsgSerializer createBytesMsgSerializer() {
        return new DefaultHermodMsgSerializer();
    }

    /**
     * (non-Javadoc)
     * 
     * @see com.github.hermod.ser.impl.AbstractMsgTest#createByteBufferMsgSerializer()
     */
    @Override
    public ByteBufferMsgSerializer createByteBufferMsgSerializer() {
        return new DefaultHermodMsgSerializer();
    }

}
