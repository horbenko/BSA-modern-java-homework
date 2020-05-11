package com.binary_studio.uniq_in_sorted_stream;

import com.binary_studio.uniq_in_sorted_stream.utils.RowPredicate;

import java.util.stream.Stream;

public final class UniqueSortedStream {

	private UniqueSortedStream() {
	}

	public static <T> Stream<Row<T>> uniqueRowsSortedByPK(Stream<Row<T>> stream) {
		final RowPredicate predicate = new RowPredicate();

		return stream.filter(predicate);
	}
}