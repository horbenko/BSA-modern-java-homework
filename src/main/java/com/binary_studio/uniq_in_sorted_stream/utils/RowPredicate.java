package com.binary_studio.uniq_in_sorted_stream.utils;

import com.binary_studio.uniq_in_sorted_stream.Row;

import java.util.function.Predicate;

public class RowPredicate implements Predicate<Row> {
    private long previousRowId = Long.MIN_VALUE;

    @Override
    public boolean test(Row row) {
        long currentRowId = row.getPrimaryId();

        if (currentRowId == previousRowId) {
            return false;
        } else {
            previousRowId = currentRowId;
            return true;
        }
    }
}