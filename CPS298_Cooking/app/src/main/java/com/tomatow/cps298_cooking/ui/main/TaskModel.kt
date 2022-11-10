package com.tomatow.cps298_cooking.ui.main

class TaskModel(task: String, id: Int, status: Int){
    companion object{
        var id = 0
        var status = 0
        var task = ""

    }
    fun returnId(): Int {
        return id
    }
    fun returnTask() : String{
        return task
    }
    fun returnStatus(): Int{
        return status
    }


}