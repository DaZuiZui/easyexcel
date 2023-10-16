package com.alibaba.excel.metadata.data;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * coordinate.
 *
 * @author Jiaju Zhuang
 */
@Getter
@Setter
@EqualsAndHashCode
public class CoordinateData {
    /**
     * First row index.Priority is higher than {@link #relativeFirstRowIndex}.
     */
    private Integer firstRowIndex;
    /**
     * First column index.Priority is higher than {@link #relativeFirstColumnIndex}.
     */
    private Integer firstColumnIndex;
    /**
     * Last row index.Priority is higher than {@link #relativeLastRowIndex}.
     */
    private Integer lastRowIndex;
    /**
     * Last column index.Priority is higher than {@link #relativeLastColumnIndex}.
     */
    private Integer lastColumnIndex;

    /**
     * Relative first row index
     */
    private Integer relativeFirstRowIndex;
    /**
     * Relative first column index
     */
    private Integer relativeFirstColumnIndex;
    /**
     * Relative last row index
     */
    private Integer relativeLastRowIndex;
    /**
     * Relative  last column index
     */
    private Integer relativeLastColumnIndex;
}
