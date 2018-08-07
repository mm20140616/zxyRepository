package com.hand.controller;

import com.fasterxml.jackson.core.JsonGenerator;
import com.hand.dto.BaseDTO;
import com.hand.dto.ListDTO;
import com.hand.dto.TodoItems;
import com.hand.dto.User;
import com.hand.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TodoController {
    @Autowired
    TodoService todoService;

    @RequestMapping("/todoListShow")
    @ResponseBody
    public ListDTO<TodoItems> getTodoList (@RequestBody User user) {
        int showId = user.getUserId();
        List<TodoItems> list = todoService.getTodoList(showId);
        ListDTO<TodoItems> listChange = new ListDTO<>();
        listChange.set__status("success");
        listChange.setData(list);
        return listChange;
    }

    @RequestMapping("/saveTodo")
    @ResponseBody
    public BaseDTO saveTodo (@RequestBody TodoItems todoItems) {
        Integer userId1 =Integer.parseInt(todoItems.getUserId());
        Integer todoItemId = todoItems.getToDoItemId();
        String toDoItemTitle = todoItems.getToDoItemTitle();
        String priority = todoItems.getPriority();
        String toDoItemContent = todoItems.getToDoItemContent();
        String comments = todoItems.getComments();

        todoService.saveTodo(todoItemId,userId1,toDoItemTitle,priority,
                toDoItemContent,comments);
        BaseDTO baseDTO = new BaseDTO();
        baseDTO.set__status("success");
        baseDTO.setMessage("保存成功");
        return baseDTO;
    }

    @RequestMapping("/deleteItem")
    @ResponseBody
    public BaseDTO deleteItem (@RequestBody TodoItems todoItems) {
        int id = todoItems.getToDoItemId();
        System.out.println(id);
        BaseDTO baseDTO = todoService.deleteItem(id);
        return baseDTO;
    }

    @RequestMapping("/findItemById")
    @ResponseBody
    public TodoItems findItemById (@RequestBody TodoItems todoItems) {
        int id = todoItems.getToDoItemId();
        TodoItems todoItems1 = todoService.findItemById(id);
        return todoItems1;
    }
}
