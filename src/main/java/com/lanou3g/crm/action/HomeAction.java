package com.lanou3g.crm.action;

import com.lanou3g.crm.domain.Department;
import com.lanou3g.crm.domain.Post;
import com.lanou3g.crm.domain.Staff;
import com.lanou3g.crm.service.HomeService;
import com.lanou3g.crm.service.impl.HomeServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

/**
 * Created by dllo on 17/11/2.
 */
public class HomeAction extends ActionSupport {

    private HomeService service;

    //用来接收jsp传递过来的部门id
    private int deptId;
    private int postId;



    private List<Department> departments;
    private List<Post> posts;
    private List<Staff> staffs;

    public HomeAction() {
        service = new HomeServiceImpl();
    }

    public String home(){
        //获取所有部门信息
        departments = service.getDepartments();
        staffs = service.getStaffs();

        return SUCCESS;

    }

    public String getPostByDeptId(){
        //根据部门id获取对应的职位
        posts = service.getPostByDeptId(deptId);
        return SUCCESS;
    }

    public String getStaffByDeptIdAndPostId(){
        staffs = service.getStaffByDeptIdAndPostId(deptId,postId);
        return SUCCESS;
    }



    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public List<Staff> getStaffs() {
        return staffs;
    }

    public void setStaffs(List<Staff> staffs) {
        this.staffs = staffs;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }
}
