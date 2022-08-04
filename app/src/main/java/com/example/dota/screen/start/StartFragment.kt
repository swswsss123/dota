package com.example.dota.screen.start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dota.MAIN
import com.example.dota.R
import com.example.dota.databinding.FragmentStartBinding

class StartFragment : Fragment() {

    private var mBinding: FragmentStartBinding?= null
    private val binding get() = mBinding !!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentStartBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }
    fun init(){

        binding.buttonStart.setOnClickListener {
            MAIN.navController.navigate(R.id.action_startFragment_to_mainFragment)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        mBinding = null
    }


}