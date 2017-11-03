package com.lanou3g.crm.service.impl;

import com.lanou3g.crm.dao.HomeDao;
import com.lanou3g.crm.dao.impl.HomeDaoImpl;
import com.lanou3g.crm.domain.Department;
import com.lanou3g.crm.domain.Post;
import com.lanou3g.crm.domain.Staff;
import com.lanou3g.crm.service.HomeService;

import java.util.List;

/**
 * Created by dllo on 17/11/2.
 */
public class HomeServiceImpl implements HomeService {

    private HomeDao dao;

    public HomeServiceImpl() {
        dao = new HomeDaoImpl();
    }

    public List<Department> getDepartments() {
        return dao.getDepartments();
    }

    public List<Post> getPostByDeptId(int deptId) {
        return dao.getPostByDeptId(deptId);
    }

    public List<Staff> getStaffByDeptIdAndPostId(int deptId, int postId) {
        if (deptId<0){
            return dao.getStaffs();
        }else if (deptId>0&&postId<0){
            return dao.getStaffByDeptId(deptId);
        }
        return dao.getStaffByDeptIdAndPostId(deptId,postId);
    }

    public List<Staff> getStaffByDeptId(int deptId) {
        if (deptId<0){
            return dao.getStaffs();
        }
        return dao.getStaffByDeptId(deptId);
    }

    public List<Staff> getStaffs() {
        return dao.getStaffs();
    }
}
