package com.zhangke.androidmvp.common;

/**
 * 获取到数据之后回调的接口
 * <p>
 * Created by ZhangKe at 2017/7/30
 */
public interface OnDataCallbackListener {
    /**
     * 数据获取成功
     *
     * @param o 获取到的数据
     */
    void onComplete(Object... o);

    /**
     * 获取失败
     *
     * @param code    错误码
     * @param message 错误描述
     */
    void onError(int code, String message);
}
