package com.group4.habitpal.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.core.view.children
import com.group4.habitpal.R
import com.group4.habitpal.activities.MainActivity

class MyHabitsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_myhabits, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mainActivity = requireActivity() as MainActivity

        val habitListIterator = mainActivity
            .findViewById<LinearLayout>(R.id.habitlist)
            .children
            .iterator()

        habitListIterator.forEach { v ->
            v.setOnClickListener {
                mainActivity.replaceFragment(HabitDetailFragment(null))
            }
        }
    }


}