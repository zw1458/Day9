package com.lanou3g.crm.action;

import com.lanou3g.crm.domain.Staff;
import com.lanou3g.crm.service.HomeService;
import com.lanou3g.crm.service.impl.HomeServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

/**
 * Created by dllo on 17/11/3.
 */
public class StaffsAction extends ActionSupport {

    //接收表单传递过来的数据

    private int deptId,postId;

    private HomeService homeService;
    private List<Staff> staffs;

    public StaffsAction() {
        homeService = new HomeServiceImpl();
    }

    public String staffs(){

        //查询所有结果
        staffs = homeService.getStaffByDeptIdAndPostId(deptId, postId);

        return SUCCESS;
    }


    public String staffsJson(){
        staffs = homeService.getStaffByDeptIdAndPostId(deptId, postId);

        return SUCCESS;
    }




    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public List<Staff> getStaffs() {
        return staffs;
    }

    public void setStaffs(List<Staff> staffs) {
        this.staffs = staffs;
    }
}
