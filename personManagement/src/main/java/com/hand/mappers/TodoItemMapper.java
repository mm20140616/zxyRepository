package com.hand.mappers;

import com.hand.dto.BaseDTO;
import com.hand.dto.TodoItems;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

@Mapper
public interface TodoItemMapper {

    List<TodoItems> getTodoList(int showId);

    void saveTodo(Integer todoItemId, Integer userId1, String toDoItemTitle, String priority, String toDoItemContent, String comments);

    void deleteItem(int id);

    TodoItems findItemById(int id);
}
