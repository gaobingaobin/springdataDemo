package cn.com.gaobin.springdemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Administrator on 2016-08-12.
 */
@Entity
public class UserInfo {
    @Id
    @GeneratedValue
    Integer  id;

    @Column (length = 20, nullable = false)
    String username;

    @Column(length = 20, nullable = false)
    String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
