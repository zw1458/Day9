package com.lanou3g.crm.dao.impl;

import com.lanou3g.crm.dao.HomeDao;
import com.lanou3g.crm.domain.Department;
import com.lanou3g.crm.domain.Post;
import com.lanou3g.crm.domain.Staff;
import com.lanou3g.crm.utils.QueryUtil;

import java.util.List;

/**
 * Created by dllo on 17/11/2.
 */
public class HomeDaoImpl implements HomeDao {
    public List<Department> getDepartments() {
        return QueryUtil.findAll(Department.class);
    }

    public List<Post> getPostByDeptId(int deptId) {
        return QueryUtil.queryByEqual(Post.class,"dept",deptId);
    }

    public List<Staff> getStaffByDeptIdAndPostId(int deptId, int postId) {
        String [] fields = {"dept","post"};
        Object [] values = {deptId,postId};
        return QueryUtil.queryByEquals(Staff.class,fields,values);
    }

    public List<Staff> getStaffByDeptId(int deptId) {
        return QueryUtil.queryByEqual(Staff.class,"dept",deptId);
    }

    public List<Staff> getStaffs() {
        return QueryUtil.findAll(Staff.class);
    }
}
