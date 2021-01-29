package com.example.bank

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.yandex.mapkit.Animation
import com.yandex.mapkit.MapKitFactory
import com.yandex.mapkit.geometry.Point
import com.yandex.mapkit.map.CameraPosition
import com.yandex.mapkit.mapview.MapView
import com.yandex.runtime.image.ImageProvider
import com.yandex.runtime.ui_view.ViewProvider
import kotlinx.android.synthetic.main.activity_bank.*


class BankActivity : AppCompatActivity() {
    val banks = mutableListOf(
        Bank("Москва,ул.Кого-то , д.7", "Банк", true, "11:00-20:00"),
        Bank("Москва,ул.Кого-то , д.7", "Банк", true, "11:00-20:00"),
        Bank("Москва,ул.Кого-то , д.7", "отделение", true, "11:00-22:00"),
        Bank("Москва,ул.Кого-то , д.12", "Банк", false, "11:00-13:00"),
        Bank("Москва,ул.Кого-то , д.9", "Банк", true, "11:00-20:00"),
        Bank("Москва,ул.Кого-то , д.7", "Банк", false, "11:00-20:00"),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        MapKitFactory.setApiKey("62b97222-0af9-40a7-9725-790b2d48f0e7")
        MapKitFactory.initialize(this)
        setContentView(R.layout.activity_bank)

        mapview.map.move(
            CameraPosition(Point(60.0, 40.0), 50.0f, 0.0f, 0.0f),
            Animation(Animation.Type.SMOOTH, 0f),
            null
        )

        mapview.map.mapObjects.addPlacemark(
                Point(60.0, 40.0),
        ImageProvider.fromResource(this,R.drawable.map_pin)
        )




        banksRv.layoutManager= LinearLayoutManager(this)
        banksRv.adapter=BanksAdapter(banks)

    }
    override  fun onStart(){
        super.onStart()
        mapview.onStart()
        MapKitFactory.getInstance().onStart()
    }
    override  fun onStop(){
        super.onStop()
        mapview.onStop()
        MapKitFactory.getInstance().onStart()
    }
}