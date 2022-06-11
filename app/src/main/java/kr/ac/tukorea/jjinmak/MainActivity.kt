package kr.ac.tukorea.jjinmak

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import me.relex.circleindicator.CircleIndicator3

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val indicator: CircleIndicator3 = findViewById(R.id.indicator)
        val view_pager: ViewPager2 = findViewById(R.id.viewpager)
        val tabLayout: TabLayout = findViewById(R.id.tab_layout)
        val pagerAdapter = ParentFragmentPagerAdapter(this)

        view_pager.adapter = pagerAdapter
        view_pager.setAdapter(pagerAdapter)

        indicator.setViewPager(view_pager)
        indicator.createIndicators(5,0);
        indicator.animatePageSelected(2)

        TabLayoutMediator(tabLayout, view_pager) { tab, position ->
            val tabNames = listOf("홍보","축제","명소")
            tab.text = tabNames[position]
        }.attach()

    }
}


