package be.ToDoList.model;

public class ToDoList {

    private int id;
    private String quotes;

    public ToDoList(int id, String quotes) {
        this.id = id;
        this.quotes = quotes;
    }

    public int getId() {
        return id;
    }

    public String getQuotes() {
        return quotes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToDoList toDoList = (ToDoList) o;
        return id == toDoList.id &&
                quotes.equals(toDoList.quotes);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
