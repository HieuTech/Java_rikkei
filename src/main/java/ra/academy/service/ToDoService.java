package ra.academy.service;
import ra.academy.model.ToDo;
import java.util.ArrayList;
public class ToDoService {
    //khai báo chức năng
    private List<ToDo> todoList = new ArrayList<>();

    private idMax int = 0;

    //in ra danh sach
    List<ToDo> findAll(){
        return todoList;
    }
    // trả về 1 đối tượng
    ToDo findById(int id){
        for (ToDo t: todoList){
            if(t.getId()==id){
                return t;
            }
        }return null;
    }
    //cập nhật
    void save(ToDo todo){
        if(findById(todo.getId()) ==null ){
            //chưa tồn tại, chức năng thêm
            todoList.add(todo);
        }else{
            //chức năng cập nhật
            todoList.set(todoList.indexOf(findById(todo.getId())),todo);
            Todo existingTodo = findById(todo.getId());

        //todoList.indexOf()-> trả về index của element đc tìm thấy trong danh sách
//            findById(todo.getId()) trả về đối tượng index

        }
    }
    // chức năng xoá
    void deleteById(int id){
        todoList.remove(findById(id));
    }

    int getNewId(){
        return idMax++;
    }
}