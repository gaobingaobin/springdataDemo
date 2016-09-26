package cn.com.gaobin.springdemo.repository;

import cn.com.gaobin.springdemo.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by Administrator on 2016-08-15.
 */
public interface UserinfoRepository  extends JpaRepository<UserInfo, Integer>, JpaSpecificationExecutor<UserInfo>{
    UserInfo findByUsernameAndPassword(String username,String password);


}
