package com.example.myapplication

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {

            0 -> PageFirst()
            1 -> PageSecond()
            else ->  PageFirst()
        }
    }

    fun getPageTitle(position: Int): String {
        return when (position) {
            0 -> "profile"
            1 -> "shemdegi gverdi"
            else -> "profile"
        }
    }
}