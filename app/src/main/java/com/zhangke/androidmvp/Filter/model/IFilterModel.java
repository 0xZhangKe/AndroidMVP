package com.zhangke.androidmvp.Filter.model;

import com.zhangke.androidmvp.common.OnDataCallbackListener;

/**
 * 筛选模块 model 层接口
 *
 * Created by ZhangKe at 2017/7/30
 */
public interface IFilterModel {
    /**
     * 获取筛选内容数据
     *
     * @param listener 监听器
     */
    void getProduceTypeList(OnDataCallbackListener listener);
}
