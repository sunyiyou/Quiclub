package hit.mapper;

import hit.po.UserCustom;

public interface UserCustomMapper {

	UserCustom selectUserByEmail(String email);
}
