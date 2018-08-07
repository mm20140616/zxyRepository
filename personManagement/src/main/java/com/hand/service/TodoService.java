package com.hand.service;

import com.hand.dto.BaseDTO;
import com.hand.dto.TodoItems;
import com.hand.dto.User;

import java.util.Date;
import java.util.List;

public interface TodoService {

    List<TodoItems> getTodoList(int showId);

    void saveTodo(Integer todoItemId, Integer userId1,
                     String toDoItemTitle, String priority,
                     String toDoItemContent, String comments
    );
    BaseDTO deleteItem(int id);
    TodoItems findItemById(int id);
}
