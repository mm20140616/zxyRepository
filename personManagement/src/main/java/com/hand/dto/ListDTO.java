package com.hand.dto;

import java.util.List;

public class ListDTO<T> extends BaseDTO {
    private List<T> data;

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
