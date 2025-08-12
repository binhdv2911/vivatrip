package com.osp.vivatrip.mapper;

import com.osp.vivatrip.dto.request.UserCreationRequest;
import com.osp.vivatrip.dto.request.UserUpdateRequest;
import com.osp.vivatrip.dto.response.UserResponse;
import com.osp.vivatrip.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);
    UserResponse toUserResponse(User user);
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
