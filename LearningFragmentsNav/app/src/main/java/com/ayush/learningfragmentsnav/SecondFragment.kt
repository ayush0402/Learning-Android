package com.ayush.learningfragmentsnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.ayush.learningfragmentsnav.databinding.FragmentHomeBinding
import com.ayush.learningfragmentsnav.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding: FragmentSecondBinding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_second,container,false
        )





        return binding.root
    }

}