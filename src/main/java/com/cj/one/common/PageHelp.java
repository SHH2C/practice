package com.cj.one.common;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

/**
 * @Author: 陈晨
 * @Date: 2018/12/11 11:42
 */
public class PageHelp {
    private Integer page;
    private Integer limit;

    /**
     * 分页默认值
     * @param page
     * @param limit
     * @return
     */
    public  Page<Object> init(Integer page,Integer limit){
        if(page==null){
            this.page=1;
        }if(limit==null){
            this.limit=5;
        }else{
            this.page=page;
            this.limit=limit;
        }
        return PageHelper.startPage(this.page, this.limit);
    }
}
