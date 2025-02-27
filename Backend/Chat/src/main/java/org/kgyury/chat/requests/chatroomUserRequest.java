package org.kgyury.chat.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ChatroomUserRequest {

    private Long userId;
    private Long chatroomId;

}
