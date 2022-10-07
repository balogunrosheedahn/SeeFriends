package com.nens.seefriends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.nens.seefriends.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var userArrayList: ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId = intArrayOf(

            R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4,
            R.drawable.pic5, R.drawable.pic6, R.drawable.pic6,
                    R.drawable.pic7, R.drawable.pic8, R.drawable.pic9, R.drawable.pic10
        )

        val name = arrayOf(
            "Ajoke",
            "Adesola",
            "Christiana",
            "Maryam",
            "FaiFai",
            "Bazzman",
            "Buubaa",
            "Toyosi",
            "Akin",
            "Tosin"
        )

        val messages = arrayOf(
            "Hello",
            "Hiii",
            "How Far",
            "How are you?",
            "Sup",
            "When are we meeting",
            "Are you still showing",
            "hahaaha",
            "Alright dear",
            "Omo mi"
        )

        val messageTime = arrayOf(
            "6:20 pm",
            "5:30 pm",
            "7:20 pm",
            "8:30 pm",
            "9:00 pm",
            "10:50 pm",
            "12:00 am",
            "6:50 am",
            "7:15 am",
            "9:00 am"
        )
        val phone = arrayOf(
            "+234 8123456789",
            "+234 8123456789",
            "+234 8123456789",
            "+234 8123456789",
            "+234 8123456789",
            "+234 8123456789",
            "+234 8123456789",
            "+234 8123456789",
            "+234 8123456789",
            "+234 8123456789"
        )

        userArrayList =ArrayList()
        for (i in name.indices){
            val user =User(name[i],messages[i],messageTime[i],phone[i],imageId[i])
            userArrayList.add(user)


        }
        Log.d("Hello", userArrayList.toString())
        binding.listView.isClickable =true
        binding.listView.adapter = FriendsAdapter(this,userArrayList)
        binding.listView.setOnItemClickListener{parent,view, position, id ->
            val name = name[position]
            val phone= phone[position]
            val imageId =imageId[position]

            val i = Intent(this,FriendsActivity::class.java)
            i.putExtra("name", name)
            i.putExtra("phone", phone)
            i.putExtra("imageId", imageId)
            startActivity(i)
        }
    }
}