package com.hand.service.impl;

import com.hand.dto.BaseDTO;
import com.hand.dto.TodoItems;
import com.hand.dto.User;
import com.hand.mappers.TodoItemMapper;
import com.hand.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
@Transactional(rollbackFor = { RuntimeException.class, Exception.class })
public class TodoServiceImpl implements TodoService {
    @Autowired
    TodoItemMapper todoItemMapper;

    @Override
    public List<TodoItems> getTodoList(int showId) {
        List<TodoItems> list = todoItemMapper.getTodoList(showId);
        return list;
    }

    @Override
    public void saveTodo(Integer todoItemId, Integer userId1, String toDoItemTitle, String priority, String toDoItemContent, String comments) {
        todoItemMapper.saveTodo(todoItemId,userId1,toDoItemTitle,priority,
                toDoItemContent,comments);

    }

    @Override
    public BaseDTO deleteItem(int id) {
        todoItemMapper.deleteItem(id);
        BaseDTO baseDTO = new BaseDTO();
        baseDTO.set__status("success");
        baseDTO.setMessage("delete success");
        return baseDTO;
    }

    @Override
    public TodoItems findItemById(int id) {
        TodoItems todoItems = todoItemMapper.findItemById(id);
        if (!todoItems.equals("")) {
            todoItems.set__status("success");
            todoItems.setMessage("查到记录");
            return todoItems;
        } else {
            todoItems.set__status("error");
            todoItems.setMessage("没查到记录");
            return todoItems;
        }



    }

}
