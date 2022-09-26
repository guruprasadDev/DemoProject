package com.guruthedev.demoproject.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.google.android.material.button.MaterialButton
import com.guruthedev.demoproject.R


class FragmentTow : Fragment() {

    private lateinit var btnNavigationFragmentOne : MaterialButton


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_tow, container, false)


        btnNavigationFragmentOne = view.findViewById(R.id.btnNavigateFragmentOne)

        btnNavigationFragmentOne.setOnClickListener {
          //  Navigation.findNavController(view).navigate(R.id.action_fragmentTow_to_fragmentOne)
        }
            return view

    }

}