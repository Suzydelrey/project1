package com.example.kotlin
fun main() {

    var s = ToDo()
    var task1 = Task("Mohammed",1 ,"Buy a Car")
    var task2 = Task("Abdulrahman",2 ,"Travel to NewYork")
    var task3 = Task("Maather",3 ,"Sell my Cat")

    s.addTask(task2)
    s.addTask(task1)
    s.PrintSpecificTask(2)
    s.removeTask(task2)
    s.changeTask(task3)
    s.addTask(task3)
    s.showTask()

}

data class Task (val name : String ,var id :Int , var note: String ,var  isCompleted : Boolean =false )

class ToDo {

    val tasks = arrayListOf<Task>()

    fun showTask(){
        println("All Tasks:")
        for (task in tasks) {
            println("Task: ${task.note}")
        }
    }

    fun PrintSpecificTask(id : Int){
        print("Task Details:")
        for (SId in tasks) {
            if (id == SId.id)
                println(" ID (${SId.id}), name (${SId.name}), Task (${SId.note}), Completed (${SId.isCompleted}) ")
        }
    }

    fun addTask(task :Task){
        println("Add Task: "+ task.note)
        tasks.add( task)
    }
    fun removeTask(task :Task){
        println("Remove Task:"+ task.note)
        tasks.remove(task)
    }
    fun changeTask (isComplete: Task ){
        //var isCompleted = true
        println("Task: ${isComplete.note}, Complete: ${!isComplete.isCompleted}")
    }


}


