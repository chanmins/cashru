package kr.ac.tukorea.jjinmak

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapFragment
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import kr.ac.tukorea.jjinmak.databinding.FragmentHBinding

@Suppress("depreciation")
class HFragment : Fragment() {

    //  , OnMapReadyCallback
    //  lateinit var gMap: GoogleMap
    //    lateinit var mapFrag: MapFragment
    //override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    //    mapFrag = requireFragmentManager().findFragmentById(R.id.map) as MapFragment
    //    mapFrag.getMapAsync(this)
    //}

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_h, container, false)
    }

    /*override fun onMapReady(map: GoogleMap) {
        gMap = map
        val marker = LatLng(37.568256, 126.897240)
        gMap.addMarker(MarkerOptions().position(marker).title("여기"))
        gMap.moveCamera(CameraUpdateFactory.newLatLng(marker))
        gMap.moveCamera(CameraUpdateFactory.zoomTo(15f))
    }
    override fun onStart() {
        super.onStart()
        mapFrag.onStart()
    }
    override fun onStop() {
        super.onStop()
        mapFrag.onStop()
    }
    override fun onResume() {
        super.onResume()
        mapFrag.onResume()
    }
    override fun onPause() {
        super.onPause()
        mapFrag.onPause()
    }
    override fun onLowMemory() {
        super.onLowMemory()
        mapFrag.onLowMemory()
    }
    override fun onDestroy() {
        super.onDestroy()
        mapFrag.onDestroy()
    }*/
}