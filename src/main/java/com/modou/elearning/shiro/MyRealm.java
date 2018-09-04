package com.modou.elearning.shiro;

import com.modou.elearning.pojo.AuthFunction;
import com.modou.elearning.pojo.AuthRole;
import com.modou.elearning.pojo.Users;
import com.modou.elearning.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MyRealm extends AuthorizingRealm {


    @Autowired
    UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

       Users user = (Users) principalCollection.getPrimaryPrincipal();

       SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

      List<AuthRole> roleList =  userService.findRoleListByUserId(user.getId());
      for(AuthRole role: roleList){
          info.addRole(role.getRoleName());
      }

      List<AuthFunction> functionList = userService.findFunctionListByUserId(user.getId());
      for(AuthFunction function: functionList){
          info.addStringPermission(function.getFunctionName());
      }

        return info;
    }


    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
       String username =  (String)authenticationToken.getPrincipal();
       Users users = userService.findByUserName(username);

       if(users!=null){
           SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(users,users.getUserPass(), ByteSource.Util.bytes("imodou"),getName());
            return info;
       }
        return null;
    }
}
