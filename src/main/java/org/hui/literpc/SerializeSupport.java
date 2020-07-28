package org.hui.literpc;

/**
 * @author zenghui
 * @date 2020/7/28
 */
public interface SerializeSupport<T> {

    /**
     * 反序列
     *
     * @param buffer
     * @param <T>
     * @return
     */
    default <T> T parse(byte[] buffer) {
        // TODO 默认实现
        return null;
    }

    /**
     * 序列化
     *
     * @param entry
     * @param <T>
     * @return
     */
    default <T> byte[] serialize(T entry) {
        // TODO
        return null;
    }
}
