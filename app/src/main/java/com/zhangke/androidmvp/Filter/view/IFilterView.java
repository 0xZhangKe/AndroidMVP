package com.zhangke.androidmvp.Filter.view;

import com.zhangke.androidmvp.Filter.entity.ProduceTypeEntity;

import java.util.List;

/**
 * 筛选模块 view 层接口，每个需要使用筛选功能的界面实现这个接口即可
 * <p>
 * Created by ZhangKe at 2017/7/30
 */
public interface IFilterView {

    /**
     * 设置界面筛选条件展示的列表
     *
     * @param list 筛选条件列表
     */
    void setProduceTypeList(List<ProduceTypeEntity> list);

    /**
     * 获取数据失败时回调的方法，界面上可以把错误信息展示出来
     *
     * @param code 错误码
     * @param msg  错误描述
     */
    void getFilterDataError(int code, String msg);
}
