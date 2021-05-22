package com.lesson.dto;

/**
 * BookInfo 新建一个类，是因为最佳实践是不要暴露你的域对象给外界，而是根据你的接口，封装一个接口输出这样的类
 * 比方我们现在做一个query 服务，这个服务需要的信息有可能和你表里的信息是有差异的，而当你数据库变化的时候，你对外服务
 * 暴露的对象也是要变化的，这是一个最大的不好的现象：即你的数据结构影响了你对外声明的schema，这是非常不好的！
 *
 * @author Alicia
 * @description
 * @date 2021/5/23
 */
public class BookInfo {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
