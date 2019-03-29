package com.example.aacstudy

import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders

class MainFragment2 : Fragment() {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val index = arguments!!.getInt("index")

        val viewModel3 = ViewModelProviders.of(requireActivity())
            .get(index.toString(), MainViewModel::class.java)

        println("viewModel3($index) : $viewModel3")
    }

    companion object {
        fun newInstance(index: Int) = MainFragment2().apply {
            arguments = bundleOf("index" to index)
        }
    }
}