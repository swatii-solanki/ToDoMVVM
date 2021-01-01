package com.todo.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.todo.R
import com.todo.databinding.FragmentTasksBinding

class TasksFragment : Fragment() {

    private lateinit var binding: FragmentTasksBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTasksBinding.inflate(layoutInflater)
        binding.fabAddTask.setOnClickListener {
            findNavController().navigate(R.id.goToAddEditTask)
        }
        return binding.root
    }
}