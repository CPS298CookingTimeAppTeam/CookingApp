package com.tomatow.cps298_cooking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tomatow.cps298_cooking.adapter.TaskAdapter
import com.tomatow.cps298_cooking.ui.main.MainFragment
import com.tomatow.cps298_cooking.ui.main.TaskModel
import com.tomatow.cps298_cooking.ui.main.TaskModel.Companion.task

class MainActivity : AppCompatActivity() {
    private lateinit var taskAdapter: TaskAdapter

    private lateinit var taskList: MutableList<TaskModel>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance1())
                .commitNow()
//            taskList = mutableListOf()
//            supportActionBar?.hide()
//            var taskRecycleView: RecyclerView = findViewById(R.id.recycleViewId)
//            taskRecycleView.layoutManager = LinearLayoutManager(this)
//            taskAdapter = TaskAdapter(this)
//            taskRecycleView.adapter = taskAdapter
//
//            val task : TaskModel = TaskModel()
//            task("test")
//            task.setStatus(0)
//            task.setId(1)
//            taskList.add(task)
//            taskList.add(task)
//            taskList.add(task)
//            taskList.add(task)
//            taskList.add(task)
//
//            taskAdapter.setTasks(taskList)
        }
    }

}