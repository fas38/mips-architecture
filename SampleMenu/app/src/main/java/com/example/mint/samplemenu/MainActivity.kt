package com.example.mint.samplemenu

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.design.widget.NavigationView
import android.support.v4.app.Fragment
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*
import android.R.attr.fragment
import android.support.v4.app.FragmentTransaction
import android.support.v4.widget.DrawerLayout
import android.view.View


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

//        fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                    .setAction("Action", null).show()
//        }

        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)

        replaceFragmenty(
                fragment = Fragment1(),
                allowStateLoss = true,
                containerViewId = R.id.mainContent
        )

//        displayItemSelected(-1)

//        //NOTE:  Checks first item in the navigation drawer initially
//        nav_view.setCheckedItem(R.id.nav_frag1)
//
//        //NOTE:  Open fragment1 initially.
//        val ft = supportFragmentManager.beginTransaction()
//        ft.replace(R.id.mainFrame, Fragment1())
//        ft.commit()
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

//    fun displayItemSelected(id: Int){
//        val fragment = when (id) {
//            R.id.nav_frag1 -> {
//                Fragment1()
//            }
//            R.id.nav_frag2 -> {
//                Fragment2()
//            }
//            R.id.nav_frag3 -> {
//                Fragment3()
//            }
//            else -> {
//                Fragment1()
//            }
//
//        }
//
//        supportFragmentManager.beginTransaction()
//                .replace(R.id.mainFrame, fragment)
//                .commit()
//    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.

        when (item.itemId) {
            R.id.nav_frag1 -> {
                // Handle the camera action
                replaceFragmenty(
                        fragment = Fragment1(),
                        allowStateLoss = true,
                        containerViewId = R.id.mainContent
                )
                setTitle("Import")
            }
            R.id.nav_frag2 -> {
                replaceFragmenty(
                        fragment = Fragment2(),
                        allowStateLoss = true,
                        containerViewId = R.id.mainContent
                )
                setTitle("Gallery")
            }
            R.id.nav_frag3 -> {
                replaceFragmenty(
                        fragment = Fragment3(),
                        allowStateLoss = true,
                        containerViewId = R.id.mainContent
                )
                setTitle("Slideshow")
            }

        }

//        displayItemSelected(item.itemId)

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

//    override fun onNavigationItemSelected(item: MenuItem): Boolean{
//        val id = item.itemId
//
//        //NOTE: creating fragment object
//        var fragment: Fragment? = null
//
//        if (id === R.id.nav_frag1) {
//            fragment = Fragment1()
//        } else if (id === R.id.nav_frag2) {
//            fragment = Fragment2()
//        } else if (id === R.id.nav_frag3) {
//            fragment = Fragment3()
//        }
//
//        //NOTE: Fragment changing code
//        if (fragment != null) {
//            val ft = supportFragmentManager.beginTransaction()
//            ft.replace(R.id.mainFrame, fragment);
//            ft.commit();
//        }
//
//        //NOTE:  Closing the drawer after selecting
//        val drawer = findViewById<View>(R.id.drawer_layout) as DrawerLayout
//            //Ya you can also globalize this variable :P
//        drawer.closeDrawer(GravityCompat.START)
//        return true
//    }

}
