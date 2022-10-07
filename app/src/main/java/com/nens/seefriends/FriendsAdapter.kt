package com.nens.seefriends

import android.app.Activity
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class FriendsAdapter(private val context: Activity, private val arrayList: ArrayList<User>):ArrayAdapter<User>(context,
         R.layout.list_items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        Log.d("find",arrayList.toString())
        val inflater: LayoutInflater = LayoutInflater.from(context)
        val view: View = inflater.inflate(R.layout.list_items, null)

        val imageView: ImageView = view.findViewById(R.id.profile_pic)
        val username:TextView = view.findViewById(R.id.personName)
        val message: TextView = view.findViewById(R.id.lastMessage)
        val messageTime : TextView = view.findViewById(R.id.LastMsgTime)

        imageView.setImageResource(arrayList[position].imageId)
        username.text = arrayList[position].name
        message.text = arrayList[position].message
        messageTime.text = arrayList[position].lastMsgTime

        return view
    }

    override fun getCount(): Int = arrayList.size


}