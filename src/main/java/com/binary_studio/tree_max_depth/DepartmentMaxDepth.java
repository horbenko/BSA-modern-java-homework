package com.binary_studio.tree_max_depth;

import java.util.*;
import java.util.stream.Collectors;

public final class DepartmentMaxDepth {

	private DepartmentMaxDepth() {
	}

	public static Integer calculateMaxDepth(Department rootDepartment) {

		if (rootDepartment == null) return 0;

		Queue<Department> departments = new LinkedList<>();
		departments.add(rootDepartment);

		int depth = 0;

		while (true) {
			int departmentCount = departments.size();
			if (departmentCount == 0) return depth;

			++depth;

			while (departmentCount > 0) {
				Department currentDepartment = departments.remove();

				List subDepartment = currentDepartment.subDepartments
						.stream()
						.filter(Objects::nonNull)
						.collect(Collectors.toList());

				departments.addAll(subDepartment);

				--departmentCount;
			}
		}
	}

}
