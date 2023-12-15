package userms.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * @author ZHZ
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Getter
@Setter
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class User extends PagingParam {
    private Integer id;
    private String userName;
    private String userNickname;
    private String userCreationTime;
    private String userPswd;


    public User(){
    }

    public User(int id,String userName,String userNickname,String userCreationTime,String userPswd){
        this.id = id;
        this.userName = userName;
        this.userNickname = userNickname;
        this.userCreationTime = userCreationTime;
        this.userPswd = userPswd;
    }

    @Override
    public String toString(){
        return "User{id = " + id + " , 姓名 = " + userName + " , 昵称 = " + userNickname +
                " , 注册时间 = " + userCreationTime + " , 密码 = " + userPswd + "}";
    }
}
