package com.alezzgo.paginationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.alezzgo.paginationapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val vm by viewModels<MainViewModel>()
    private val binding : ActivityMainBinding by viewBinding()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding.searchView.setQuery(vm.get(),true)
    }


}