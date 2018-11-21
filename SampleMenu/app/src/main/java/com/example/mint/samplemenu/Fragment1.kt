package com.example.mint.samplemenu


import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_fragment1.*
import kotlinx.android.synthetic.main.fragment_fragment1.view.*


class Fragment1 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_fragment1, container, false)

//        button1.setOnClickListener{
//            val intent = Intent(this@Fragment1.context!!, NewActivity::class.java)
//            startActivity(intent)
//            Toast.makeText(getActivity(), "Your Text Here!", Toast.LENGTH_SHORT).show();
//            println("Working")

//        }


        view.apply {
            button1.setOnClickListener{
                val intent = Intent(this@Fragment1.context,NewActivity::class.java)
                startActivity(intent)
            }
        }

        return view
    }


//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        button1?.setOnClickListener{
//            var clickintent = Intent(this@Fragment1,New::class.java)
//            startActivity(clickintent)
//        }
//    }



}
