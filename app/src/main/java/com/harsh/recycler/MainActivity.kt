package com.harsh.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var todoList= mutableListOf(
            Todo("Harsh",true),
            Todo("More",true),
            Todo("learn recycler view",false),
            Todo("kotline",true),
            Todo("ide",false),
            Todo("college",false),
            Todo("school",true),
            Todo("friends",false),
            Todo("Mayuri",false),
            Todo("ide",false),
            Todo("college",false),
            Todo("school",true),
            Todo("friends",false),
            Todo("Mayuri",false),
            Todo("More",true),
            Todo("learn recycler view",true),


        )
        val adapter=TodoAdapter(todoList)
        rvTodos.adapter=adapter
        rvTodos.layoutManager=LinearLayoutManager(this)

        btnAddTodo.setOnClickListener {
            val title=etTodo.text.toString()
            val todo=Todo(title,false)
            todoList.add(todo)
            adapter.notifyItemInserted(todoList.size-1)
        }
    }
}