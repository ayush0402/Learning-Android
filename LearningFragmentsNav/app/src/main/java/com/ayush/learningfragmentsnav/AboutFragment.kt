package com.ayush.learningfragmentsnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.ayush.learningfragmentsnav.databinding.FragmentAboutBinding
import com.ayush.learningfragmentsnav.databinding.FragmentHomeBinding

class AboutFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val binding: FragmentAboutBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_about,container,false
        )

        //your code here

        return binding.root
    }

}