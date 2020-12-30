class ToDoItem(name: String, date: String ) {

  var Done: Boolean = false

  override def toString: String = {
    s" $name - till ${date} | DONE: ${Done}\n"

  }
}



class ToDoList() {
  var a: List[ToDoItem] = Nil
  def + (toDoItem: ToDoItem): Unit = {
    a = a :+ toDoItem
  }
  def markAsDone(number: Int): Unit ={
    a(number).Done = true
  }

  override def toString: String = {
    s"{$a}"
  }
  def del(){
    a=a.filter(!_.Done)
  }
}
object task_2 {

  def main(args: Array[String]) = {
    val toDoList = new ToDoList()

    toDoList + new ToDoItem("Clean carpet", "2020-11-01")
    toDoList + new ToDoItem("Wash dishes", "2020-11-02")
    toDoList + new ToDoItem("Learn Scala and be professional with it", "2020-10-28")

    println(toDoList)

    // Prints list of all three ToDoItems nicely formatted, each in separate line

    toDoList.markAsDone(0)
    toDoList.del()

    println(toDoList)

    // Prints list of two ToDoItems without the first one
  }
}