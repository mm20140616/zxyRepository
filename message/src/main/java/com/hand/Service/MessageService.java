package com.hand.Service;

import com.hand.dto.MessageDTO;
import org.springframework.stereotype.Service;

/**
 * @ProjectName message
 * @ClassName MessageSave
 * @Description TODO
 * @Author 赵晓宇
 * @Date 2018/8/15 14:34
 * @Version 1.0
 **/

public interface MessageService {
    int messageSave(MessageDTO md);
}
