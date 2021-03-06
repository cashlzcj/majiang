package game.boss.handler;

import game.boss.model.User;
import game.boss.services.RoomService;
import mj.net.handler.login.ExitRoomHandler;
import mj.net.message.login.ExitRoom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author zuoge85@gmail.com on 2016/10/23.
 */
@Component
public class ExitRoomHandlerImpi implements ExitRoomHandler<User> {
    @Autowired
    private RoomService roomService;

    @Override
    public boolean handler(ExitRoom msg, User user) {
        roomService.exitRoom(user);
        return false;
    }
}
