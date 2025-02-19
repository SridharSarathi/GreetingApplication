//package com.example.greeting
//
//import androidx.recyclerview.widget.DiffUtil
//import androidx.recyclerview.widget.RecyclerView
//import com.example.greeting.databinding.ItemTodoBindin
//
//class TodoAdapter :RecyclerView.Adapter<TodoAdapter.TodoViewHolder>(){
//
//    inner class TodoViewHolder(bindin:ItemTodoBinding):RecyclerView.ViewHolder(bindin.root)
//    private val difficult= object :DiffUtil.ItemCallback() {
//      fun areItemsTheSame(oldItem:Todo,newItem:Todo):Boolean{
//
//          return oldItem.id=newItem.id
//      }
//        override fun areItemsTheSame(oldItem:Todo,newItem:Todo):Boolean{
//            return  oldItem=newItem;
//        }
//    }
//
//}