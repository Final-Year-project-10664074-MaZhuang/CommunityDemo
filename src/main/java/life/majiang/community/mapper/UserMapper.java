package life.majiang.community.mapper;

import life.majiang.community.model.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {
    @Insert("insert into USER (name,account_id,token,gmt_create,gmt_modify,avatar_url) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModify},#{avatarUrl})")
    void insert(User user);

    @Select("select * from user where token = #{token}")
    User findByToken(@Param("token") String token);
    @Select("select * from user where account_id = #{id}")
    User findById(@Param("id") Integer id);
    @Select("select * from user where account_id = #{accountId}")
    User findByAccountId(@Param("accountId") String accountId);
    @Update("update user set name = '${name}', token = '${token}', gmt_modify = '${gmtModify}', avatar_url = '${avatarUrl}' where account_id = '${accountId}'")
    void update(User user);
}
