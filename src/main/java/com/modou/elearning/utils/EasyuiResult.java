package com.modou.elearning.utils;

import java.util.List;

public class EasyuiResult<T> {

    private List<T> rows;
    private int total;
    public EasyuiResult(List<T> rows,int total) {
        this.rows = rows;
        this.total=total;
    }

    public EasyuiResult(){}


    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }



    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
