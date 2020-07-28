package org.hui.literpc;

/**
 * @author zenghui
 * @date 2020/7/28
 */
public class SerializeSupport<E> {

    /**
     * 反序列化
     *
     * @param buffer
     * @param <E>
     * @return
     */
    public static <E> E parse(byte[] buffer) {
        return null;
    }

    /**
     * 序列化
     *
     * @param entry
     * @param <E>
     * @return
     */
    public static <E> byte[] serialize(E entry) {
        return null;
    }
}
