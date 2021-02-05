package academy.learnprogramming.service;

import academy.learnprogramming.model.TodoItem;
import academy.learnprogramming.model.TodoData;

public interface TodoItemService {
    void addItem(TodoItem item);
    void removeItem(int id);
    TodoItem getItem(int id);
    void updateItem(TodoItem item);
    TodoData getData();
}
