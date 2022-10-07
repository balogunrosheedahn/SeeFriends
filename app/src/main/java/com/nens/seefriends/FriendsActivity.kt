package com.nens.seefriends

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nens.seefriends.databinding.ActivityFriendsBinding

class FriendsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFriendsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityFriendsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val phone = intent.getStringExtra("phone ")
        val imageId = intent.getIntExtra("name", R.drawable.pic1)

        binding.nameProfile.text =name
        binding.phoneProfile.text= phone
        binding.profileImage.setImageResource(imageId )

    }
}