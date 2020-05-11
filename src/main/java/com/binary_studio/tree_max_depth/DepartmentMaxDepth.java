package com.binary_studio.tree_max_depth;

import java.util.Comparator;

public final class DepartmentMaxDepth {

	private DepartmentMaxDepth() {
	}

	public static Integer calculateMaxDepth(Department rootDepartment) {

		if (rootDepartment == null) return 0;

		var localDepth = rootDepartment.subDepartments
				.stream()
				.map(DepartmentMaxDepth::calculateMaxDepth)
				.max(Comparator.naturalOrder())
				.orElse(0);
		return ++localDepth;
	}

}
