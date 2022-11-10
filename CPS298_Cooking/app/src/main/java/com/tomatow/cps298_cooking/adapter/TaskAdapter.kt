package com.tomatow.cps298_cooking.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import androidx.recyclerview.widget.RecyclerView
import com.tomatow.cps298_cooking.MainActivity
import com.tomatow.cps298_cooking.R
import com.tomatow.cps298_cooking.ui.main.MainFragment
import com.tomatow.cps298_cooking.ui.main.TaskModel

class TaskAdapter(mainActivity: MainActivity) : RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {
    private lateinit var taskList:  MutableList<TaskModel>
    private val mainFrag : MainFragment = MainFragment()
    

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val itemView: View = LayoutInflater.from(parent.context).inflate(R.layout.new_task,parent, false)
        return TaskViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val item : TaskModel = taskList[position]
        holder.task.text = item.returnTask()
        holder.task.isChecked = toBoolean(item.returnStatus())

    }

    override fun getItemCount(): Int {
        return taskList.size
    }
    fun toBoolean(n:Int) : Boolean{
        return n!=0
    }

    public fun setTasks(task: MutableList<TaskModel>){
        this.taskList
    }

    class TaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val task: CheckBox = itemView.findViewById(R.id.newtask)
    }




//    fun RecyclerView.ViewHolder(parent: ViewGroup, viewType: Int) {
////        binding = NewTaskBinding.inflate(LayoutInflater)
//        return RecyclerView.ViewHolder(itemView)
//    }


}