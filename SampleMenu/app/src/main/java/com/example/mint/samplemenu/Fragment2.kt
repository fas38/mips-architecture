package com.example.mint.samplemenu


import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_fragment2.view.*


class Fragment2 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_fragment2, container, false)

        view.apply {
            button2.setOnClickListener{
                val intent = Intent(this@Fragment2.context,NewActivity::class.java)
                startActivity(intent)
            }
        }

        return view
    }


}
